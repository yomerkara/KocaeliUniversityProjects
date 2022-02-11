package altintoplama;

import java.io.IOException;
import java.util.Scanner;


public class AltinToplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç karede altin olmasini istiyorsunuz: ");
        int a3=scan.nextInt();   
        System.out.println("Kaç karede gizli altin olmasini istiyorsunuz:");
        int a4=scan.nextInt();  
        System.out.println("Her oyuncunun baslangicta kac altina sahip olmasini istiyosunuz: ");
        int a5=scan.nextInt();
        System.out.println("A'nin hedef belirleme maliyeti: ");
        int a6=scan.nextInt();
         System.out.println("A'nin hamle maliyeti: ");
        int a7=scan.nextInt();
        System.out.println("B'nin hedef belirleme maliyeti: ");
        int a8=scan.nextInt();
         System.out.println("B'nin hamle maliyeti: ");
        int a9=scan.nextInt();
        System.out.println("C'nin hedef belirleme maliyeti: ");
        int a10=scan.nextInt();
         System.out.println("C'nin hamle maliyeti: ");
        int a11=scan.nextInt();
        System.out.println("D'nin hedef belirleme maliyeti: ");
        int a12=scan.nextInt();
         System.out.println("D'nin hamle maliyeti: ");
        int a13=scan.nextInt();
        
        
        Masa game = new Masa(a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a12);
        
        
        
        A a =new A(200,5);
        B b=new B(200,5,5);
        C c= new C(200,5,10);
        D d=new D(200,5,20);
        game.CizdirmeA(a,b,c,d);
        
        
        
       
}
}
