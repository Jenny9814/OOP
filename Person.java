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
public class Person {
    protected String hoTen, ngaySinh, gioiTinh, diaChi;
    Scanner sc = new Scanner(System.in);
    // Constructor không chứa tham số

    public Person() {
        hoTen = "";
        ngaySinh = "";
        gioiTinh = "";
        diaChi = "";
    }
    // Constructor chứa tham số
    public Person(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    // Các phương thức set và get

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    /*public void nhapTT(){
        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
    }    */
    // ToString
    
    @Override
    public String toString() {
        String st = "";
        st+= "Họ và Tên: " +hoTen + "\t";
        st+= "Ngày sinh: " +ngaySinh + "\t";
        st+= "Giới tính: " +gioiTinh + "\t";
        st+= "Địa chỉ:   " +diaChi + "\t";
        return st;
    }
    
}
