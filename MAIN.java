/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class MAIN {
    public static void main(String[] args){
        int maSV;
        String hoTEN;
        float diemLT;
        float diemTH;
        Scanner scanner = new Scanner(System.in);
        SINHVIEN sv1 = new SINHVIEN(01,"Thư",8,8);
        SINHVIEN sv2 = new SINHVIEN(02,"Linh",9,10);
        // Constructor mặc định không có tham số vào
        System.out.println("Nhap thong tin cho sinh vien 3");
        SINHVIEN sv3 = new SINHVIEN(); 
        System.out.println("Nhap MASV");
        maSV = scanner.nextInt();
        sv3.setMaSV(maSV);
        // C2: sv3.setMaSV(scanner.nextInt()); Ngắn gọn hơn - đỡ tốn bộ nhớ và tốn tham số
        System.out.println("Nhap HOTEN"); // Chỉ nhập chữ không dấu - Không nhận khoảng trắng
        hoTEN = scanner.next();
        sv3.setHoTEN(hoTEN);
        // C2: sv3.setHoTEN(scanner.nextLine());
        System.out.println("Nhap DIEMLT");
        diemLT = scanner.nextFloat();
        sv3.setDiemLT(diemLT);
        // C2: sv3.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap DIEMTH");
        diemTH = scanner.nextFloat();
        sv3.setDiemTH(diemTH);
        // C2: sv3.setDiemTH(scanner.nextFloat());
        System.out.println("Thong tin cua SINH VIEN \n ");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}
