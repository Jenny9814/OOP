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
public class SachGiaoKhoa extends QuanLiSach {
    private String tinhTrang;
    
    Scanner scanner = new Scanner(System.in);

    public SachGiaoKhoa() {
        super();
        tinhTrang = "";
    }

    public SachGiaoKhoa(String tinhTrang) {
        super();
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(String tinhTrang, String maSach, String ngayNhap, float donGia, int soLuong, String NXB) {
        super(maSach, ngayNhap, donGia, soLuong, NXB);
        this.tinhTrang = tinhTrang;
    }
    

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public void nhapTTSach(){
        super.nhapThongTinSach();
        System.out.print("Nhập tình trạng sách (mới/cũ): ");
        tinhTrang = scanner.nextLine();
    }
    public double thanhTien(){
        if(null == this.tinhTrang)return 0;
        else switch (this.tinhTrang) {
            case "Mới":
                return this.soLuong * this.donGia;
            case "Cũ":
                return (this.soLuong * this.donGia) * 0.5;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" + super.toString() + "tinhTrang=" + tinhTrang + '}' + "Thanh tien: " +thanhTien();
    }
    
    
}
