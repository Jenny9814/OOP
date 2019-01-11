/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class QuanLiGiaoDich {
    protected String maGD,ngayGD;
    protected float donGia;
    protected int soLuong;
    
    Scanner sc = new Scanner(System.in);

    public QuanLiGiaoDich() {
        maGD = "";
        ngayGD = "";
        donGia = 0.0f;
        soLuong = 0;
    }

    public QuanLiGiaoDich(String maGD, String ngayGD, float donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
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

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void nhapThongTinGiaoDich(){
        System.out.print("Nhập mã giao dịch: ");
        maGD = sc.nextLine();
        System.out.print("Nhập ngày giao dịch (dd/MM/yyyy): ");
        ngayGD = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextFloat();
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return "QuanLiGiaoDich{" + "maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }
    
    
}
