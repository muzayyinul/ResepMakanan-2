package com.yful_coding.resepmakanan;

/**
 * Created by Aldy
 */

public class PolaItem {
    private int img;
    private String judul;
    private String desc;
    private String cara;
    private String bahan;


    public PolaItem(int img, String judul, String desc,String bahan,String cara) {
        this.img = img;
        this.judul = judul;
        this.desc = desc;
        this.bahan = bahan;
        this.cara = cara;
    }

    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getDesc() {
        return desc;
    }

    public String getCara() {return cara;}

    public String getBahan() {return  bahan;}
}
