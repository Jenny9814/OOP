/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class Main {
    public static void main(String args[]){
        ArrayList<HoaDonTheoNgay> listNgay = new ArrayList<>();
        ArrayList<HoaDonTheoGio> listGio = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng Khách hàng thuê phòng theo giờ:");
        int n = sc.nextInt();
        System.out.println("Nhập số lượng Khách hàng thuê phòng theo ngày: ");
        int m = sc.nextInt();
        System.out.println("*****************************");
        System.out.println("Nhập thông tin khách hàng thuê phòng theo giờ");
        for(int i = 0;i<n ; i++){
            System.out.println("Thông tin khách hàng thứ " +(i+1) + ":");
            HoaDonTheoGio hdg = new HoaDonTheoGio();
            hdg.nhapTTKH();
            listGio.add(hdg);
        }
        System.out.println("*****************************");
        System.out.println("Nhập thông tin khách hàng thuê phòng theo ngày");
        for(int i = 0;i<m ; i++){
            System.out.println("Thông tin khách hàng thứ " +(i+1) + ":");
            HoaDonTheoNgay hdn = new HoaDonTheoNgay();
            hdn.nhapTTKhachHang();
            listNgay.add(hdn);
        }
        System.out.println("*****************************");
        System.out.println("Thông tin khách hàng thuê phòng theo giờ: ");
        for(int i = 0;i<n;i++){
            System.out.println(listGio.get(i).toString());
        }
        System.out.println("*****************************");
        System.out.println("Thông tin khách hàng thuê phòng theo ngày: ");
        for(int i = 0;i<m;i++){
            System.out.println(listNgay.get(i).toString());
        }
        System.out.println("*****************************");
        System.out.println("Tổng số lượng thuê phòng theo giờ:");
        int dem = 0;
        for(int i = 0;i<n;i++){
            dem ++;
        }
        System.out.println(dem);
        System.out.println("*****************************");
        System.out.println("Tổng số lượng thuê phòng theo ngày:");
        int dem2= 0;
        for(int i = 0;i<m;i++){
            dem2++;
        }
        System.out.println(dem2);
        System.out.println("****************************");
        double tongTien1 = 0.0, tbt1 = 0.0;
        int dem3 = 0;
        for(int i = 0; i<n;i++){
            String[] ngayHD = listGio.get(i).getNgayHD().split("/");
            if(ngayHD[1].equals("09") && ngayHD[2].equals("2013")){
                System.out.println(listGio.get(i).toString());
                dem3++;
                tongTien1 += listGio.get(i).thanhTien();
                tbt1 = tongTien1/dem3;
            }
        }
        System.out.println("Tổng thành tiền của hóa đơn thuê phòng theo giờ trong tháng 9/2013:" +tbt1);
        double tongTien = 0.0, tbt = 0.0;
        int dem4 = 0;
        System.out.println("****************************");
        for(int i = 0; i<m;i++){
            String[] ngayHD = listNgay.get(i).getNgayHD().split("/");
            if(ngayHD[1].equals("09") && ngayHD[2].equals("2013")){
                System.out.println(listNgay.get(i).toString());
                dem4 ++;
                tongTien += listNgay.get(i).thanhTien();
                tbt = tongTien/dem4;
            }
        }
        System.out.println("Tổng thành tiền của hóa đơn thuê phòng theo ngày trong tháng 9/2013:" +tbt);
    }
    
}
