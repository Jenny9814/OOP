/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class LTHDT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chieuDAI, chieuRONG;
        System.out.println("NHAP CHIEU DAI VA CHIEU RONG CUA HINH CHU NHAT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        chieuDAI = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        chieuRONG = scanner.nextInt();
        HINHCHUNHAT hcn = new HINHCHUNHAT(chieuDAI,chieuRONG);
        System.out.println(hcn);
    }
    
}
