/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songsfile;

/**
 *
 * @author Arthas
 */
public class AramaSarki {
    private int songsid;
    private String songsName;
    private String songsDate;
    private String songsAuthor;
    private String songsAlbum;
    private String songsType;
    private int songsTime;
    private int songsCount;
    
    public AramaSarki(int songsid,String songsName,String songsDate,String songsAuthor,String songsAlbum,String songsType,int songsTime,int songsCount){
        
        this.songsid=songsid;
        this.songsName=songsName;
        this.songsDate=songsDate;
        this.songsAuthor=songsAuthor;
        this.songsAlbum=songsAlbum;
        this.songsType=songsType;
        this.songsTime=songsTime;
        this.songsCount=songsCount;
 
    }

    /**
     * @return the songsid
     */
    public int getSongsid() {
        return songsid;
    }

    /**
     * @return the songsName
     */
    public String getSongsName() {
        return songsName;
    }

    /**
     * @return the songsDate
     */
    public String getSongsDate() {
        return songsDate;
    }

    /**
     * @return the songsAuthor
     */
    public String getSongsAuthor() {
        return songsAuthor;
    }

    /**
     * @return the songsAlbum
     */
    public String getSongsAlbum() {
        return songsAlbum;
    }

    /**
     * @return the songsType
     */
    public String getSongsType() {
        return songsType;
    }

    /**
     * @return the songsTime
     */
    public int getSongsTime() {
        return songsTime;
    }

    /**
     * @return the songsCount
     */
    public int getSongsCount() {
        return songsCount;
    }
}
