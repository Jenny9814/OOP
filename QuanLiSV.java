/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class QuanLiSV {
    // Dùng ArrayList
    ArrayList<SINHVIEN> listSV = new ArrayList<>(); //Khai báo ngoài hàm main ( Tao 1 class qlsv)
        
        public SINHVIEN nhapMotSV(){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Nhập thông tin sinh viên: ");
            System.out.println("\n Nhập Mã số sinh viên: ");
            int MSSV = sc.nextInt();
            System.out.println("\n Nhập Họ tên sinh viên: ");
            String Name = sc.next();
            System.out.println("\n Nhập Địa chỉ sinh viên: ");
            String Address = sc.next();
            System.out.println("\n Nhập Số điện thoại của sinh viên: ");
            int phoneNumber = sc.nextInt();
        
            SINHVIEN sv = new SINHVIEN(MSSV,Name,Address,phoneNumber);
            return sv;
        }
        
        public void nhapDSSV(){
            Scanner in = new Scanner(System.in);
            String traloi;
            do{
                listSV.add(this.nhapMotSV());
                System.out.println("Bạn có tiếp tục không <c/k>?");
                traloi = in.next();
            }
            while (traloi.equals("c"));
        }
        public void xuatDSSV(){
            for(int i = 0;i<listSV.size();i++){
                System.out.println(listSV.get(i).toString());
            }
        }
        public void sapXepTheoMSSV(){
            Collections.sort(listSV, new sapXepTheoMSSV());
        }
        
        public void show(){
            Collections.sort(listSV, new sapXepTheoMSSV());
            System.out.printf("MSSV \t\t Name \t\t Address \t\t phoneNumber");
            for(SINHVIEN sv : listSV){
                System.out.format("%d \t\t %s \t\t %s \t\t %d",sv.getMSSV(),sv.getName(),sv.getAddress(),sv.getPhoneNumber());
                
            }
        }
        
}
