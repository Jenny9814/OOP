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
public class GiaoDichNha extends GiaoDichNhaDat{
    private String loaiNha,diaChi;
    Scanner scan = new Scanner(System.in);

    public GiaoDichNha() {
        super();
        loaiNha = "";
        diaChi = "";
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public double thanhTien(){
        if(null == this.loaiNha)return 0;
        else switch (this.loaiNha) {
            case "Cao cấp":
                return this.dienTich * this.donGia;
            case "Thường":
                return this.dienTich * this.donGia *0.9;
            default:
                return 0;
        }
    }
    public void nhapThongTinND(){
        super.nhapThongTinNhaDat();
        System.out.print("Nhập Loại nhà (Cao cấp/Thường): ");
        loaiNha = scan.nextLine();
        System.out.print("Nhập Địa chỉ: ");
        diaChi = scan.nextLine();
    }

    @Override
    public String toString() {
        String st ="" ;
        st+= super.toString();
        st+= "Loại nhà: " +loaiNha + "\t";
        st+= "Địa chỉ: " +diaChi + "\t";
        st+= "Thành tiền: " +thanhTien() + "\t";
        return st;
    }
    
}
