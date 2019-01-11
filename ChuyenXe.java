/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
// Xây dựng class ChuyenXe chứa những thuộc tính chung của 2 loại chuyến xe nội thành và ngoại thành
// Các thuộc tính chung gồm: maSC, hoTen, soXe, doanhThu
public class ChuyenXe implements Serializable{
    protected String maSC;
    protected String hoTen;
    protected String soXe;
    protected float doanhThu;
    
    Scanner sc = new Scanner(System.in);
    // Khai báo constructor không chứa tham số, khởi tạo giá trị mặc định cho các thuộc tính
    public ChuyenXe() {
        maSC = "";
        hoTen = "";
        soXe = "";
        doanhThu = 0.0f;
    }
    
    // Khai báo constructor chứa tham số
    public ChuyenXe(String maSC, String hoTen, String soXe, float doanhThu) {
        this.maSC = maSC;
        this.hoTen = hoTen;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    // Thực hiện câu lệnh get và set  các thuộc tính

    public String getMaSC() {
        return maSC;
    }

    public void setMaSC(String maSC) {
        this.maSC = maSC;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }
    public void nhapThongTinChuyenXe(){
        System.out.print("Nhập mã số chuyến: ");
        maSC = sc.nextLine();
        System.out.print("Nhập họ và tên tài xế: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập số xe: ");
        soXe = sc.nextLine();
        System.out.print("Nhập doanh thu: ");
        doanhThu = sc.nextFloat();
    }
    // Xây dựng lớp toString trả về giá trị

    @Override
    public String toString() {
        String st = "";
        st+="Mã chuyến: " +maSC + "\t";
        st+="Họ và tên tài xế: " +hoTen + "\t";
        st+="Số xe: "+soXe + "\t";
        st+="Doanh thu: "+doanhThu + "\t";
        
        return st;
    }
    
    
}
