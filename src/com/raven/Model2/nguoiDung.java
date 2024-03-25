/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.Model2;

/**
 *
 * @author PC
 */
public class nguoiDung {
    private String id;
    private String username;
    private String password;
    private String ten_nv;
    private String hinh_anh;
    private String email;
    private String cccd;
    private String ngay_dangki;
    private int gioi_tinh;
    private String sdt;
    private String ngay_sinh;
    private int id_vaitro;
    private String trang_thai;

    public nguoiDung() {
    }

    public nguoiDung(String id, String username, String password, String ten_nv, String hinh_anh, String email, String cccd, String ngay_dangki, int gioi_tinh, String sdt, String ngay_sinh, int id_vaitro, String trang_thai) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ten_nv = ten_nv;
        this.hinh_anh = hinh_anh;
        this.email = email;
        this.cccd = cccd;
        this.ngay_dangki = ngay_dangki;
        this.gioi_tinh = gioi_tinh;
        this.sdt = sdt;
        this.ngay_sinh = ngay_sinh;
        this.id_vaitro = id_vaitro;
        this.trang_thai = trang_thai;
    }
    public nguoiDung( String username, String password, String ten_nv, String hinh_anh, String email, String cccd, String ngay_dangki, int gioi_tinh, String sdt, String ngay_sinh, int id_vaitro, String trang_thai) {
        this.username = username;
        this.password = password;
        this.ten_nv = ten_nv;
        this.hinh_anh = hinh_anh;
        this.email = email;
        this.cccd = cccd;
        this.ngay_dangki = ngay_dangki;
        this.gioi_tinh = gioi_tinh;
        this.sdt = sdt;
        this.ngay_sinh = ngay_sinh;
        this.id_vaitro = id_vaitro;
        this.trang_thai = trang_thai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTen_nv() {
        return ten_nv;
    }

    public void setTen_nv(String ten_nv) {
        this.ten_nv = ten_nv;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getNgay_dangki() {
        return ngay_dangki;
    }

    public void setNgay_dangki(String ngay_dangki) {
        this.ngay_dangki = ngay_dangki;
    }

    public int getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(int gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public int getId_vaitro() {
        return id_vaitro;
    }

    public void setId_vaitro(int id_vaitro) {
        this.id_vaitro = id_vaitro;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    @Override
    public String toString() {
        return "nguoiDung{" + "id=" + id + ", username=" + username + ", password=" + password + ", ten_nv=" + ten_nv + ", hinh_anh=" + hinh_anh + ", email=" + email + ", cccd=" + cccd + ", ngay_dangki=" + ngay_dangki + ", gioi_tinh=" + gioi_tinh + ", sdt=" + sdt + ", ngay_sinh=" + ngay_sinh + ", id_vaitro=" + id_vaitro + ", trang_thai=" + trang_thai + '}';
    }
    
}
