/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI5;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class KhachHangVietNam extends QuanLiHoaDonTienDien {
    private String doiTuong;
    private int  dinhMuc;
    
    Scanner scanner = new Scanner(System.in);

    public KhachHangVietNam() {
        super();
        doiTuong = "";
        dinhMuc = 0;
    }

    public KhachHangVietNam(String doiTuong, int dinhMuc) {
        super();
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        if(null == this.doiTuong)this.doiTuong = ""; else switch (this.doiTuong) {
            case "Kinh doanh":
            case "Sản xuất":
                this.doiTuong = doiTuong;
                break;
            case "Sinh hoạt":
                this.doiTuong = doiTuong;
                break;
            default:
                this.doiTuong = "";
                break;
        }
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public double thanhTien(){
        if(this.soLuong <= this.dinhMuc){
            return  (this.soLuong*this.donGia);
        }
        else{
            return this.soLuong*this.dinhMuc*this.donGia + (this.soLuong - this.dinhMuc)*this.donGia*2.5;
        }
    }
    public void nhapTTKH(){
        super.nhapThongTinKH();
        System.out.print("Nhập Đối tượng khách hàng (Sinh hoạt/Kinh doanh/Sản xuất) : ");
        doiTuong = scanner.nextLine();
        System.out.print("Nhập Định mức: ");
        dinhMuc = scanner.nextInt();
    }

    @Override
    public String toString() {
        String st = "";
        st+= super.toString();
        st+= "Đối tượng khách hàng: " +doiTuong + "\t";
        st+= "Định mức sử dụng điện: " +dinhMuc + "\t";
        st+= "Thành tiền: " +thanhTien() + "\t";
        return st;
    }
    
    
}
