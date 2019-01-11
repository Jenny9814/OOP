/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class SachThamKhao extends QuanLiSach {
    private float thue;
    
    Scanner in = new Scanner(System.in);

    public SachThamKhao() {
        super();
        thue = 0.0f;
    }

    public SachThamKhao(float thue) {
        super();
        this.thue = thue;
    }

    public SachThamKhao(float thue, String maSach, String ngayNhap, float donGia, int soLuong, String NXB) {
        super(maSach, ngayNhap, donGia, soLuong, NXB);
        this.thue = thue;
    }
    
    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }
    
    public void nhapThongTSach(){
        super.nhapThongTinSach();
        System.out.println("Nhập thuế: ");
        thue = in.nextFloat();
    }
    public double thanhTienn(){
         return (this.soLuong * this.donGia) + this.thue;
     }

    @Override
    public String toString() {
        return "SachThamKhao{" + super.toString()+ "thue=" + thue + '}'+"Thanh tien: " +thanhTienn();
    }
    
    
    
}
