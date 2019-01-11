/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class PHANSO {
    int ts, ms;
    PHANSO(){
    }
    PHANSO(int n, int d){
        this.ts = n;
        this.ms = d;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }
    // Tìm ước chung lớn nhất để thỏa mãn phân số tối giản. Tức là 2 phân số tối giản khi chúng là nguyên tố cùng nhau. Thức là USCLN = 1
    public int UCLN(int n, int d){
        if(n ==0 || d == 0){
            return n + d;
        }
        while(n!=d){ 
            if(n>d){
                n = n-d;
            }
            else{
                d=d-n;
            }
        }
        return n;
    }
    // Tối giản phân số
    public void reduce(){
        /*this.setTs(this.getTs()/UCLN(this.getTs(), this.getMs()));
        this.setMs(this.getMs()/UCLN(this.getTs(), this.getMs()));*/ 
        int i , t=0;
        for(i=1;i<ts;i++){
            if(ts%i == 0 && ms%i==0){
                t=i;
            }
        }
        if(t!=0){
            ts/=t;
            ms/=t;
        }
    }
    // Tính cộng 2 phân số
    public void add(PHANSO ps){
        int tu = this.getTs() * ps.getMs() + ps.getTs() * this.getMs();
        int mau = this.getMs() * ps.getMs();
        PHANSO tong = new PHANSO(tu,mau);
        tong.reduce();
        System.out.println("Tong 2 phan so = " + tong.ts + "/" + tong.ms);
    }
    // Tính trừ 2 phân số
    public void subtract(PHANSO ps){
        int tu = this.getTs() * ps.getMs() - ps.getTs() * this.getMs();
        int mau = this.getMs() * ps.getMs();
        PHANSO hieu = new PHANSO(tu,mau);
        hieu.reduce();
        System.out.println("Hieu 2 phan so = " + hieu.ts + "/" + hieu.ms);
    }
    // Tính nhân 2 phân số
    public void multiply(PHANSO ps){
        int tu = this.getTs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PHANSO tich = new PHANSO(tu,mau);
        tich.reduce();
        System.out.println("Tich 2 phan so = " + tich.ts + "/" + tich.ms);
    }
    // Tính chia 2 phân số
    public void divide(PHANSO ps){
        int tu = this.getTs() * ps.getMs();
        int mau = this.getMs() * ps.getTs();
        PHANSO chia = new PHANSO(tu,mau);
        chia.reduce();
        System.out.println("Hieu 2 phan so = " + chia.ts + "/" + chia.ms);
    }
    // Nghịch đảo phân số
    public void reciprocal(){
       ts+=ms;
       ms=ts-ms;
       ts-=ms;
       System.out.printf("\n Nghịch đảo 2 phân số =%d/%d ",ts,ms );
    }
    public double Round(double n){
        n*=Math.pow(10,4);
        return Math.floor(n+0.5)/Math.pow(10,4);
    }
    //So sánh 2 phân số
    public void tolerance(int a, int b){
        if(a == ms){
            if(ts>a){
                System.out.printf("\n Phân số %d/%d lớn hơn %d/%d",ts,ms,a,b);
            }
            if(ts<a){
                System.out.printf("\n Phân số %d/%d nhỏ hơn %d/%d",ts,ms,a,b);
            }
            if(ts==a){
                System.out.printf("\n Phân số %d/%d bằng %d/%d",ts,ms,a,b);
            }
        }
        else {
            double x = Round(ts/ms);
            double y = Round(a/b);
            if(x>y){
                System.out.printf("\n Phân số %d/%d lớn hơn %d/%d",ts,ms,a,b);
            }
            if(x<y){
                System.out.printf("\n Phân số %d/%d nhỏ hơn %d/%d",ts,ms,a,b);
            }
            if(x==y){
                System.out.printf("\n Phân số %d/%d bằng %d/%d",ts,ms,a,b);
            }
        }
    }

    @Override
    public String toString() {
        return "PHANSO{" + "ts=" + ts + "/ ms=" + ms + '}';
    }
    
}