import urllib

from flask import Flask, render_template, request
from pip._vendor import requests
from wtforms import Form, StringField, PasswordField, validators, SubmitField
from bs4 import BeautifulSoup
import operator

app = Flask(__name__)
skorsirasi= {}

class Frekans(Form):
    url = StringField("URL Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
    submit = SubmitField("Kayıt")

class Benzerlik(Form):
    url1 = StringField("URL1 Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
    url2= StringField("URL2 Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
    submit = SubmitField("Kayıt")

class Indexing(Form):
    url3 = StringField("URL Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
    url4= StringField("Web Sitesi Kümesi Giriniz Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
    submit = SubmitField("Kayıt")

class Semantik(Form):
        url5 = StringField("URL Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
        url6 = StringField("URL Giriniz:", validators=[validators.DataRequired("Lütfen web sitesi giriniz.")])
        submit = SubmitField("Kayıt")

@app.route('/')
def index():
    return render_template("index.html")

@app.route("/page1")
def page1():
    form = Frekans()
    return render_template("page1.html", form=form)


@app.route("/page1sonuc", methods=['POST', 'GET'])
def page1sonuc():
    try:
        if request.method == 'POST':
            url = request.form.get('url')
            frekanslar=kelimefrekansanalizi(url)
            print(kelimefrekansanalizi(url))

            return render_template("page1sonuc.html", url=url,frekanslar=frekanslar)

    except:
        return render_template("page1sonuc.html", hata="hata oluştu")



@app.route("/page2_3")
def page2_3():
    form = Benzerlik()
    return render_template("page2_3.html",form=form)


@app.route("/page2_3sonuc", methods=['POST', 'GET'])
def page2_3sonuc():
    try:
        if request.method == 'POST':
            url1 = request.form.get('url1')
            url2 = request.form.get('url2')
            anahtarPage1=anahtarKelime(url1)
            print(anahtarPage1)
            anahtarPage2 = anahtarKelime(url2)
            print(anahtarPage2)
            benzerlik=kelimeBenzerlik(url1,url2)
            print(benzerlik)
            return render_template("page2_3sonuc.html",url1=url1,url2=url2,anahtarPage1=anahtarPage1,anahtarPage2=anahtarPage2,benzerlik=benzerlik)
    except:
        return render_template("page2_3sonuc.html", hata="hata oluştu")

@app.route("/page4")
def page4():
    form = Indexing()
    return render_template("page4.html",form=form)

@app.route("/page4sonuc",methods=['POST', 'GET'])
def page4sonuc():
    try:
        if request.method == 'POST':
            url3 = request.form.get('url3')
            url4 = request.form.get('url4')
            links = urlcikar(url4)
            ilkurl = anahtarKelime(url4)
            anaurl = anahtarKelime(url3)
            skorhesaplama(ilkurl, anaurl, url4)
            for x in urlcikar(url4):
                skorhesaplama(anahtarKelime(x), anaurl, x)

            return render_template("page4sonuc.html",url3=url3 , url4=url4 )
    except:
        return render_template("page4sonuc.html", hata="hata oluştu")
@app.route("/page5")
def page5():
    form = Semantik()
    return render_template("page5.html", form=form)


@app.route("/page5sonuc", methods=['POST', 'GET'])
def page5sonuc():
    try:
        if request.method == 'POST':
            url5 = request.form.get('url5')
            url6 = request.form.get('url6')

            return render_template("page5sonuc.html", url5=url5, url6=url6)
    except:
        return render_template("page5sonuc.html", hata="hata oluştu")
def kelimefrekansanalizi(url):
    def sozlukOlustur(tumkelimeler):
        kelimesayisi = {}

        for kelime in tumkelimeler:
            if kelime in kelimesayisi:
                kelimesayisi[kelime] += 1
            else:
                kelimesayisi[kelime] = 1
        return kelimesayisi

    def sembolTemizle(tumkelimeler):
        sembolsuzkelimeler = []

        semboller = "!@$#%^*()_+{}\"<>?,./;'[]-=:" + chr(775)

        for kelime in tumkelimeler:
            for sembol in semboller:
                if sembol in kelime:
                    kelime = kelime.replace(sembol, "")

            if (len(kelime) > 0):
                sembolsuzkelimeler.append(kelime)
        return sembolsuzkelimeler

    tumkelimeler = []
    titleData = []
    descriptionsData = []
    r = requests.get(url)

    soup = BeautifulSoup(r.content, "html.parser")

    for kelimegruplari in soup.find_all("p"):

        icerik = kelimegruplari.text
        kelimeler = icerik.lower().split()

        for kelime in kelimeler:
            tumkelimeler.append(kelime)
            # print(kelime)

    for titleGroups in soup.find_all("title"):

        titleIcerik = titleGroups.text
        titleKelimeler = titleIcerik.lower().split()

        for titleKelime in titleKelimeler:
            titleData.append(titleKelime)
            # print(kelime)

    for descriptionsGroups in soup.find_all("description"):

        descriptionsIcerik = descriptionsGroups.text
        descriptionsKelimeler = descriptionsIcerik.lower().split()

        for descriptionsKelime in descriptionsKelimeler:
            descriptionsData.append(descriptionsKelime)
            # print(kelime)

    tumkelimeler = sembolTemizle(tumkelimeler)
    titleData = sembolTemizle(titleData)
    descriptionsData = sembolTemizle(descriptionsData)

    kelimesayisiTumkelimeler = sozlukOlustur(tumkelimeler)
    kelimesayisiTitle = sozlukOlustur(titleData)
    kelimesayisidDescriptions = sozlukOlustur(descriptionsData)

    for anahtar, deger in sorted(kelimesayisiTumkelimeler.items(), key=operator.itemgetter(1)):
        print(anahtar, deger)

    #print("\n")

    # for anahtar, deger in sorted(kelimesayisiTitle.items(), key=operator.itemgetter(1)):
        # print(anahtar, deger)


    #for aranan in kelimesayisiTumkelimeler:
        #if aranan in (titleData or descriptionsData):
         # if kelimesayisiTumkelimeler.get(aranan) > 2:
                #  print("\n" + aranan)

    return kelimesayisiTumkelimeler
def anahtarKelime(url):
    def sozlukOlustur(tumkelimeler):

        kelimesayisi = {}
        for kelime in tumkelimeler:
            if kelime in kelimesayisi:
                kelimesayisi[kelime] += 1
            else:
                kelimesayisi[kelime] = 1
        return kelimesayisi

    def sembolTemizle(tumkelimeler):
        sembolsuzkelimeler = []

        semboller = "!@$#%^*()_+{}\"<>?,./;'[]-=:" + chr(775)

        for kelime in tumkelimeler:
            for sembol in semboller:
                if sembol in kelime:
                    kelime = kelime.replace(sembol, "")

            if (len(kelime) > 0):
                sembolsuzkelimeler.append(kelime)
        return sembolsuzkelimeler

    url = url

    tumkelimeler = []
    titleData = []
    descriptionsData = []
    r = requests.get(url)

    soup = BeautifulSoup(r.content, "html.parser")

    for kelimegruplari in soup.find_all("p"):

        icerik = kelimegruplari.text
        kelimeler = icerik.lower().split()

        for kelime in kelimeler:
            tumkelimeler.append(kelime)
            # print(kelime)

    for titleGroups in soup.find_all("title"):

        titleIcerik = titleGroups.text
        titleKelimeler = titleIcerik.lower().split()

        for titleKelime in titleKelimeler:
            titleData.append(titleKelime)
            # print(kelime)

    for descriptionsGroups in soup.find_all("description"):

        descriptionsIcerik = descriptionsGroups.text
        descriptionsKelimeler = descriptionsIcerik.lower().split()

        for descriptionsKelime in descriptionsKelimeler:
            descriptionsData.append(descriptionsKelime)
            # print(kelime)

    tumkelimeler = sembolTemizle(tumkelimeler)
    titleData = sembolTemizle(titleData)
    descriptionsData = sembolTemizle(descriptionsData)

    kelimesayisiTumkelimeler = sozlukOlustur(tumkelimeler)
    kelimesayisiTitle = sozlukOlustur(titleData)
    kelimesayisidDescriptions = sozlukOlustur(descriptionsData)
    anahtarkelimeler = {}
    #print("URL1'in Anahtar Kelimeleri ve Frekansı")
    for aranan in kelimesayisiTumkelimeler:
        if aranan in (titleData or descriptionsData):
            if kelimesayisiTumkelimeler.get(aranan) > 2:
                anahtarkelimeler[aranan] = kelimesayisiTumkelimeler.get(aranan)
                #print("\n" + aranan, kelimesayisiTumkelimeler.get(aranan))
    #print("\n")
    return anahtarkelimeler


def kelimeBenzerlik(url1,url2):

        def sozlukOlustur(tumkelimeler):

            kelimesayisi = {}
            for kelime in tumkelimeler:
                if kelime in kelimesayisi:
                    kelimesayisi[kelime] += 1
                else:
                    kelimesayisi[kelime] = 1
            return kelimesayisi

        def sembolTemizle(tumkelimeler):
            sembolsuzkelimeler = []

            semboller = "!@$#%^*()_+{}\"<>?,./;'[]-=:" + chr(775)

            for kelime in tumkelimeler:
                for sembol in semboller:
                    if sembol in kelime:
                        kelime = kelime.replace(sembol, "")

                if (len(kelime) > 0):
                    sembolsuzkelimeler.append(kelime)
            return sembolsuzkelimeler

        url = url1

        tumkelimeler = []
        titleData = []
        descriptionsData = []
        r = requests.get(url)

        soup = BeautifulSoup(r.content, "html.parser")

        for kelimegruplari in soup.find_all("p"):

            icerik = kelimegruplari.text
            kelimeler = icerik.lower().split()

            for kelime in kelimeler:
                tumkelimeler.append(kelime)
                # print(kelime)

        for titleGroups in soup.find_all("title"):

            titleIcerik = titleGroups.text
            titleKelimeler = titleIcerik.lower().split()

            for titleKelime in titleKelimeler:
                titleData.append(titleKelime)
                # print(kelime)

        for descriptionsGroups in soup.find_all("description"):

            descriptionsIcerik = descriptionsGroups.text
            descriptionsKelimeler = descriptionsIcerik.lower().split()

            for descriptionsKelime in descriptionsKelimeler:
                descriptionsData.append(descriptionsKelime)
                # print(kelime)

        tumkelimeler = sembolTemizle(tumkelimeler)
        titleData = sembolTemizle(titleData)
        descriptionsData = sembolTemizle(descriptionsData)

        kelimesayisiTumkelimeler = sozlukOlustur(tumkelimeler)
        kelimesayisiTitle = sozlukOlustur(titleData)
        kelimesayisidDescriptions = sozlukOlustur(descriptionsData)
        anahtarkelimeler = {}
        print("URL1'in Anahtar Kelimeleri ve Frekansı")
        for aranan in kelimesayisiTumkelimeler:
            if aranan in (titleData or descriptionsData):
                if kelimesayisiTumkelimeler.get(aranan) > 2:
                    anahtarkelimeler[aranan] = kelimesayisiTumkelimeler.get(aranan)
                    print("\n" + aranan, kelimesayisiTumkelimeler.get(aranan))
        print("\n")


        # ----------------------------------
        # URL 2 İÇİN İŞLEMLER
        # ----------------------------------
        def sozlukOlustur(tumkelimeler2):

            kelimesayisi = {}
            for kelime in tumkelimeler2:
                if kelime in kelimesayisi:
                    kelimesayisi[kelime] += 1
                else:
                    kelimesayisi[kelime] = 1
            return kelimesayisi

        def sembolTemizle(tumkelimeler2):
            sembolsuzkelimeler = []

            semboller = "!@$#%^*()_+{}\"<>?,./;'[]-=:" + chr(775)

            for kelime in tumkelimeler2:
                for sembol in semboller:
                    if sembol in kelime:
                        kelime = kelime.replace(sembol, "")

                if (len(kelime) > 0):
                    sembolsuzkelimeler.append(kelime)
            return sembolsuzkelimeler

        url = url2

        tumkelimeler2 = []
        titleData2 = []
        descriptionsData2 = []
        r = requests.get(url)

        soup = BeautifulSoup(r.content, "html.parser")

        for kelimegruplari in soup.find_all("p"):

            icerik = kelimegruplari.text
            kelimeler = icerik.lower().split()

            for kelime in kelimeler:
                tumkelimeler2.append(kelime)
                # print(kelime)

        for titleGroups in soup.find_all("title"):

            titleIcerik = titleGroups.text
            titleKelimeler2 = titleIcerik.lower().split()

            for titleKelime in titleKelimeler2:
                titleData2.append(titleKelime)
                # print(kelime)

        for descriptionsGroups in soup.find_all("description"):

            descriptionsIcerik = descriptionsGroups.text
            descriptionsKelimeler = descriptionsIcerik.lower().split()

            for descriptionsKelime in descriptionsKelimeler:
                descriptionsData2.append(descriptionsKelime)
                # print(kelime)

        tumkelimeler2 = sembolTemizle(tumkelimeler2)
        titleData2 = sembolTemizle(titleData2)
        descriptionsData2 = sembolTemizle(descriptionsData2)

        kelimesayisiTumkelimeler2 = sozlukOlustur(tumkelimeler2)
        kelimesayisiTitle = sozlukOlustur(titleData)
        kelimesayisidDescriptions = sozlukOlustur(descriptionsData)
        anahtarkelimeler2 = {}
        print("URL2'nin Anahtar Kelimeleri ve Frekansı")
        for aranan2 in kelimesayisiTumkelimeler2:
            if aranan2 in (titleData2 or descriptionsData2):
                if kelimesayisiTumkelimeler2.get(aranan2) > 2:
                    anahtarkelimeler2[aranan2] = kelimesayisiTumkelimeler2.get(aranan2)
                    print("\n" + aranan2, kelimesayisiTumkelimeler2.get(aranan2))
        print("\n")
        print(anahtarkelimeler2)
        print(anahtarkelimeler)

        kontrol = 0
        skor = 0
        sayi = 0

        for skorkelime in anahtarkelimeler:
            if skorkelime in (anahtarkelimeler2):
                sayi+=1

        if len(anahtarkelimeler2) >len(anahtarkelimeler) :
            skor = len(anahtarkelimeler2)
        else:
            skor = len(anahtarkelimeler)


        benzerlik_skoru = (100/skor)*sayi
        print("\n")
        print("İKİ URL ARASINDAKİ BENZERLİK SKORU: ", benzerlik_skoru)
        print("\n")
        print("\n")

        return benzerlik_skoru

def urlcikar(url):
    reqs = requests.get(url)
    soup = BeautifulSoup(reqs.text, 'html.parser')
    urls2= []
    urls = []
    for link in soup.find_all('a'):
        urls.append(link.get('href'))
    #print(urls)
    sayac=0
    for x in urls:
        if x.startswith('h'):
            sayac+=1
            urls2.append(x)

        #print(x)

    #print(sayac)
    for x in urls2:
        print(x)
        print('\n')
    return urls2
def skorhesaplama(sozluk1,sozluk2,url):
    sayac=0
    skor=0
    uzunluk=len(sozluk2)+len(sozluk1)
    for x in sozluk1:
        if x in sozluk2:
            sayac+=1
            if sozluk1.get(x) > sozluk2.get(x):
                skor+=sozluk2.get(x)

    sonuc=(skor*sayac)/(uzunluk-sayac)
    skorsirasi[url] = [sonuc]
    return skorsirasi

if __name__ == '__main__':
    app.run(debug=True)
