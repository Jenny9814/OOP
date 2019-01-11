/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI6;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class HoaDonTheoGio extends QuanLiHoaDonThuePhong {
    private double soGioThue;
    Scanner scanner = new Scanner(System.in);

    public HoaDonTheoGio() {
        super();
        soGioThue = 0.0;
    }

    public HoaDonTheoGio(double soGioThue) {
        super();
        this.soGioThue = soGioThue;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    public double thanhTien(){
        if(this.soGioThue >= 1 && this.soGioThue < 24){
            return this.donGia * this.soGioThue;
        }
        else if(this.soGioThue >= 24 && this.soGioThue <= 30){
            return this.donGia * 24;
        }
        else return 0;
    }
    public void nhapTTKH(){
        super.nhapThongTinKhachHang();
        System.out.print("Nhập số giờ cho thuê: ");
        soGioThue = scanner.nextDouble();
    }

    @Override
    public String toString() {
        String st = "";
        st+=super.toString();
        st+= "Số giờ cho thuê: " +soGioThue + "\t";
        st+= "Thành tiền: " +thanhTien() + "\t";
        return st;
    }
    
}
