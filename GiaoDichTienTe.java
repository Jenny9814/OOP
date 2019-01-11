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
public class GiaoDichTienTe extends QuanLiGiaoDich {
    private double tiGia;
    private String loaiTienTe;
    
    Scanner in = new Scanner(System.in);

    public GiaoDichTienTe() {
        super();
        tiGia = 0.0f;
        loaiTienTe = "";
    }

    public GiaoDichTienTe(double tiGia, String loaiTienTe) {
        super();
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public GiaoDichTienTe(double tiGia, String loaiTienTe, String maGD, String ngayGD, float donGia, int soLuong) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }
    

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    
    public void nhapTTinGiaoDich(){
        super.nhapThongTinGiaoDich();
        System.out.print("Nhập tỉ giá: ");
        tiGia = in.nextDouble();
        System.out.print("Nhập loại tiền tệ (VN/USD/EURO) :");
        loaiTienTe = in.next();
    }
    
    public double thanhTien(){
        if("VN".equals(this.loaiTienTe)){
            return this.soLuong * this.donGia;
        }
        else {
            return this.soLuong * this.donGia * this.tiGia ;
        }
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +super.toString() + "tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + '}' +"Thành tiền: " +thanhTien();
    }
    
    
}
