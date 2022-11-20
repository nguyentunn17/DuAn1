/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

import java.util.Date;

/**
 *
 * @author Hung
 */
public class KhuyenMai {

    private String id;
    private String ma;
    private String ten;
    private String hinhThuc;
    private String giaTri;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int trangThai;
    private Double donGiaKhiGiam;

    public KhuyenMai() {
    }

    public KhuyenMai(String id, String ma, String ten, String hinhThuc, String giaTri, Date ngayBatDau, Date ngayKetThuc, int trangThai, Double donGiaKhiGiam) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
        this.giaTri = giaTri;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    public KhuyenMai(String ma, String ten, String hinhThuc, String giaTri, Date ngayBatDau, Date ngayKetThuc, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
        this.giaTri = giaTri;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Double getDonGiaKhiGiam() {
        return donGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(Double donGiaKhiGiam) {
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

}
