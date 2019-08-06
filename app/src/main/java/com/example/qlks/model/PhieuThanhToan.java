package com.example.qlks.model;

public class PhieuThanhToan {
    String MaPTT;
    String MaNV;
    String SoNgay;
    String NgayThanhToan;
    String TongPhaiTra;
    String TongTien;

    public PhieuThanhToan(String maPTT, String maNV, String soNgay, String ngayThanhToan, String tongPhaiTra, String tongTien) {
        MaPTT = maPTT;
        MaNV = maNV;
        SoNgay = soNgay;
        NgayThanhToan = ngayThanhToan;
        TongPhaiTra = tongPhaiTra;
        TongTien = tongTien;
    }

    public PhieuThanhToan() {

    }

    public String getMaPTT() {
        return MaPTT;
    }

    public void setMaPTT(String maPTT) {
        MaPTT = maPTT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(String soNgay) {
        SoNgay = soNgay;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        NgayThanhToan = ngayThanhToan;
    }

    public String getTongPhaiTra() {
        return TongPhaiTra;
    }

    public void setTongPhaiTra(String tongPhaiTra) {
        TongPhaiTra = tongPhaiTra;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String tongTien) {
        TongTien = tongTien;
    }
}
