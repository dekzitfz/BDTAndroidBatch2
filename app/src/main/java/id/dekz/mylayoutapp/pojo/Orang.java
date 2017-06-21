package id.dekz.mylayoutapp.pojo;

import java.io.Serializable;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class Orang implements Serializable{
    private String nama;
    private String pekerjaan;
    private String imageURL;

    public Orang (String nama, String pekerjaan, String imageURL){
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.imageURL = imageURL;
    }

    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }
    public String getImageURL(){
        return imageURL;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
