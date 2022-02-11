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
public class AramaSanatci {
    private int authorid;
    private String authorName;
    private String authorCountry;
    
    public AramaSanatci(int authorid,String authorName,String authorCountry){
        this.authorid=authorid;
        this.authorName=authorName;
        this.authorCountry=authorCountry;
    }

    /**
     * @return the authorid
     */
    public int getAuthorid() {
        return authorid;
    }

    /**
     * @return the authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @return the authorCountry
     */
    public String getAuthorCountry() {
        return authorCountry;
    }
}
