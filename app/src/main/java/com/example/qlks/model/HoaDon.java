package com.example.qlks.model;

public class HoaDon {
    String MaHD;
    String MaPTT;
    String SoTien;
    String TongTien;

    public HoaDon(String maHD, String maPTT, String soTien, String tongTien) {
        MaHD = maHD;
        MaPTT = maPTT;
        SoTien = soTien;
        TongTien = tongTien;
    }

    public HoaDon() {

    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }

    public String getMaPTT() {
        return MaPTT;
    }

    public void setMaPTT(String maPTT) {
        MaPTT = maPTT;
    }

    public String getSoTien() {
        return SoTien;
    }

    public void setSoTien(String soTien) {
        SoTien = soTien;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String tongTien) {
        TongTien = tongTien;
    }
}
