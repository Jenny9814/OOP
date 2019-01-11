/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class QuanLiCD {
    ArrayList<CD> listCD = new ArrayList<>();
    
    public CD nhapMotCD(){
        Scanner cd = new Scanner (System.in);
        System.out.println("Nhập thông tin của CD \n");
        System.out.println("Nhập Mã CD: \n");
        int maCD = cd.nextInt();
        for(int i = 0;i<listCD.size();i++){
            if(listCD.get(i).getMaCD() != maCD ){
                maCD = cd.nextInt();
            }
            else System.out.println("Thêm không thành công");
        }
        System.out.println("Nhập Tựa CD : \n");
        String tuaCD = cd.next();
        System.out.println("Nhập tên Ca sỹ: \n");
        String caSy = cd.next();
        System.out.println("Nhập Số bài hát: \n");
        int soBH = cd.nextInt();
        System.out.println("Nhập Gía thành: \n");
        float gia = cd.nextFloat();
        
        CD c = new CD(maCD,tuaCD,caSy,soBH,gia);
        return c;
    }
    public void nhapDSCD(){
        Scanner in = new Scanner(System.in);
            String traloi;
            do{
                listCD.add(this.nhapMotCD());
                System.out.println("Bạn có tiếp tục không <c/k>?");
                traloi = in.next();
            }
            while (traloi.equals("c"));
    }
    public void xuatDSCD(){
         for(int i = 0;i<listCD.size();i++){
                System.out.println(listCD.get(i).toString());
            }
    }
    public void soLuongCD(){
        int dem = 0;
        for(int i = 0;i<listCD.size();i++){
            dem ++;
        }
        System.out.println("Số lượng CD trong mảng: " +dem);
    }
    public void tongGiaThanh(){
        int s = 0;
        for(int i = 0;i<listCD.size();i++){
            s += listCD.get(i).getGia();
        }
        System.out.println("Tổng giá thành của các CD: " +s);
    }
    public void sapXepTheoGiaThanh(){
            Collections.sort(listCD, new sapXepTheoGiaThanh());
        }
    public void sapXepTheoTuaCD(){
            Collections.sort(listCD, new sapXepTheoTuaCD());
    }    
    public void show(){
            Collections.sort(listCD, new sapXepTheoGiaThanh());
            System.out.printf("CD \t\t Mã CD \t\t Tựa CD \t\t Ca sỹ \t\t Số Bài hát \t\t Gía thành");
            for (CD cd : listCD){
                System.out.format("%d: \t\t %s: \t\t %s: \t\t %d:",cd.getMaCD(),cd.getTuaCD(),cd.getCaSy(),cd.getSoBH(), cd.getGia());
                
            }
            Collections.sort(listCD, new sapXepTheoTuaCD());
            System.out.printf("CD \t\t Mã CD \t\t Tựa CD \t\t Ca sỹ \t\t Số Bài hát \t\t Gía thành");
            for (CD cd : listCD){
                System.out.format("%d: \t\t %s: \t\t %s: \t\t %d:",cd.getMaCD(),cd.getTuaCD(),cd.getCaSy(),cd.getSoBH(), cd.getGia());
                
            }
        }
   
}
