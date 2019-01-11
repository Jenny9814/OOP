/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De03;

import De02.*;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class NhanVien extends Person {
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private float luongCoBan;
    Scanner scanner = new Scanner(System.in);
    
    // Constructor không chứa tham số

    public NhanVien() {
        super();
        phongBan = "";
        heSoLuong = 0.0f;
        thamNien = 0;
        luongCoBan = 0.0f;
    }
    // Constructor chứa tham số

    public NhanVien(String phongBan, float heSoLuong, int thamNien, float luongCoBan) {
        super();
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, float luongCoBan, String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }
    // Các phương thức set và get

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        switch (this.phongBan) {
            case "Thiết bị":
                this.phongBan = phongBan;
                break;
            case "Nhân sự":
                this.phongBan = phongBan;
                break;
            case "R&D":
                this.phongBan = phongBan;
                break;
            case "Kinh doanh":
                this.phongBan = phongBan;
                break;
            default:
                break;
        }
        
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public double luongThucLinh(){
        if(this.luongCoBan >0 && this.thamNien >0 ){
            return this.luongCoBan * (1+ this.thamNien/100) ;
        }
        else return 0;
    }
    // Phòng Ban không được trùng
    @Override
    public boolean equals(Object obj){
        return this.phongBan.equalsIgnoreCase(((NhanVien)obj).phongBan) ;
    }
    /*public void nhapTTNV(){
        super.nhapTT();
        System.out.print("Nhập Phòng Ban: ");
        this.phongBan = scanner.nextLine();
        System.out.print("Nhập Hệ số lương: ");
        this.heSoLuong = scanner.nextFloat();
        System.out.print("Nhập số Thâm niên: ");
        this.thamNien = scanner.nextInt();
        System.out.print("Nhập mức lương cơ bản: ");
        this.luongCoBan = scanner.nextFloat();
    }
    // ToString */
    @Override
    public String toString() {
        String st = "";
        st += super.toString();
        st += "Phòng ban: " +phongBan + "\t";
        st += "Hệ số lương: " +heSoLuong + "\t";
        st += "Thâm niên: " +thamNien + "\t";
        st += "Lương cơ bản: " +luongCoBan + "\t";
        return st;
    }
    
}
