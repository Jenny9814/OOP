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
public class GiaoDichDat extends GiaoDichNhaDat {
    private String loaiDat;
    Scanner scanner = new Scanner(System.in);

    public GiaoDichDat() {
        super();
        loaiDat = "";
    }

    public GiaoDichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public double thanhTien(){
        if(null == this.loaiDat){
            return 0;
        }
        else switch (this.loaiDat) {
            case "A":
                return this.dienTich * this.donGia * 1.5;
            case "B":
            case "C":
                return this.dienTich * this.donGia;
            default:
                return 0;
        }
    }
    public void nhapTTND(){
        super.nhapThongTinNhaDat();
        System.out.print("Nhập Loại đất (A/B/C): ");
        loaiDat = scanner.nextLine();
    }

    @Override
    public String toString() {
        String st = "";
        st+= super.toString();
        st+= "Loại Đất: " +loaiDat + "\t";
        st+= "Thành tiền: " +thanhTien() +"\t";
        return st;
    }
    
}
