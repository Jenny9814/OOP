/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI4;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class GiaoDichNhaDat {
    protected String maGD, ngayGD;
    protected double donGia, dienTich;
    
    Scanner sc = new Scanner(System.in);

    public GiaoDichNhaDat() {
        maGD = "";
        ngayGD ="";
        donGia = 0.0;
        dienTich = 0.0;
    }

    public GiaoDichNhaDat(String maGD, String ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    
    public void nhapThongTinNhaDat(){
        System.out.print("Nhập Mã giao dịch: ");
        maGD = sc.nextLine();
        System.out.print("Nhập Ngày giao dịch: ");
        ngayGD = sc.nextLine();
        System.out.print("Nhập Đơn giá: ");
        donGia =sc.nextDouble();
        System.out.print("Nhập Diện tích: ");
        dienTich = sc.nextDouble();
    }

    @Override
    public String toString() {
        String st = "";
        st+= "Mã giao dịch: " +maGD + "\t";
        st+= "Ngày giao dịch: " +ngayGD + "\t";
        st+= "Đơn giá: " +donGia + "\t";
        st+= "Diện tích: " +dienTich + "\t";
        
        return st;
    }
    
    
}
