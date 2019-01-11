/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI1;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
    Scanner sca = new Scanner(System.in);

    public ChuyenXeNgoaiThanh() {
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSC, String hoTen, String soXe, float doanhThu) {
        super(maSC, hoTen, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public void nhapTTinChuyenXe() {
        super.nhapThongTinChuyenXe();
        System.out.print("Nhập nơi đến: ");
        noiDen = sca.nextLine();
        System.out.print("Nhập số ngày đi được: ");
        soNgayDiDuoc = sca.nextInt();
    }

    @Override
    public String toString() {
        String st = "";
        st+=super.toString();
        st+="Nơi đến: "+noiDen + "\t";
        st+="Số ngày đi được:  "+soNgayDiDuoc + "\t";
        
        return st;
    }
    
}
