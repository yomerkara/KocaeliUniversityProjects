package songsfile;

public class Arama {

    private int albumid;
    private String albumName;
    private String albumAuthor;
    private String albumSong;
    private String albumDate;
    private String albumType;
    private int albumCount;

    public Arama(int albumid,String albumName, String albumAuthor, String albumSong, String albumType, String albumDate,int albumCount) {
        this.albumid=albumid;
        this.albumName = albumName;
        this.albumAuthor = albumAuthor;
        this.albumSong = albumSong;
        this.albumDate = albumDate;
        this.albumType = albumType;
        this.albumCount= albumCount;
    }

    public int getAlbumCount() {
        return albumCount;
    }
    

    /**
     * @return the albumName
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * @return the albumAuthor
     */
    public String getAlbumAuthor() {
        return albumAuthor;
    }

    /**
     * @return the albumSong
     */
    public String getAlbumSong() {
        return albumSong;
    }

    /**
     * @return the albumDate
     */
    public String getAlbumDate() {
        return albumDate;
    }

    /**
     * @return the albumType
     */
    public String getAlbumType() {
        return albumType;
    }

    /**
     * @return the albumID
     */
    public int getAlbumid() {
        return albumid;
    }

}
