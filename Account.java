/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class Account {
    long soTK;
    String tenTK;
    double tienTK;
    final double laiSuat = 0.035;
 
    public Account() {
       soTK = 0;                                                               
       tenTK = "";
       tienTK= 50.0;
    }
    public Account(long soTK, String tenTK, double tienTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTK = tienTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getTienTK() {
        return tienTK;
    }

    public void setTienTK(double tienTK) {
        this.tienTK = tienTK;
    }
    
    public String napTienTK(double napTien){
        if(napTien > 0 ){
            return "Nạp tiền thành công";}
        else return "Nạp tiền không thành công";
    }
    
    public String rutTienTK(double tienRut, double phi){
        if(tienRut < this.tienTK){
            return "Rút tiền thành công" ;}
        else return "Rút tiền không thành công" ; //Với 1 là rút tiền ok, -1 là rút tiền không ok
    } 
    
    public String daoHan(){
        return "Đáo hạn thành công" ;
    }
    public String chuyenTien(double tienChuyen){
        if(this.tienTK > tienChuyen){
            return "Chuyển tiền thành công";
        }
        else return "Chuyển tiền không thành công";
    }

    @Override
    public String toString() {
        return "Account{" + "soTK=" + soTK + ", tenTK=" + tenTK + ", tienTK=" + tienTK + ", laiSuat=" + laiSuat + '}' ;
    }
    
}