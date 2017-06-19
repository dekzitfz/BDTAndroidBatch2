package id.dekz.mylayoutapp.pojo;

/**
 * Created by DEKZ on 6/19/2017.
 */

public class Orang {
    private String nama;
    private String pekerjaan;

    public Orang (String nama, String pekerjaan){
        this.nama = nama;
        this.pekerjaan = pekerjaan;
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
