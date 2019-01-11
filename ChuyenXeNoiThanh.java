/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class ChuyenXeNoiThanh extends ChuyenXe implements Serializable {
     private String soTuyen;
     private float soKm;
     Scanner scanner = new Scanner(System.in);
    public ChuyenXeNoiThanh() {
        super();
    }

    public ChuyenXeNoiThanh(String soTuyen, float soKm) {
        super();
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public ChuyenXeNoiThanh(String soTuyen, float soKm, String maSC, String hoTen, String soXe, float doanhThu) {
        super(maSC, hoTen, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKm() {
        return soKm;
    }

    public void setSoKm(float soKm) {
        this.soKm = soKm;
    }
    
    public void nhapTTChuyenXe(){
        super.nhapThongTinChuyenXe();
        System.out.print("Nhập số tuyến: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhập số km đi được: ");
        soKm = scanner.nextFloat();
    }
    @Override
    public boolean equals(Object obj){
        return this.maSC.equalsIgnoreCase(((ChuyenXeNoiThanh)obj).maSC);
    }
    @Override
    public String toString() {
        String st= "";
        st+=super.toString();
        st+="Số tuyến: " +soTuyen + "\t";
        st+="Số km: " +soKm + "\t";
        
        return st;
    }
    
}
