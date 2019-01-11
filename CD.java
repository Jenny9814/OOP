/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI8;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class CD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBH;
    private float gia;

    public CD() {
        maCD = 0;
        tuaCD = "";
        caSy = "";
        soBH = 0;
        gia = 0;
    }

    public CD(int maCD, String tuaCD, String caSy, int soBH, float gia) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.gia = gia;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        if(this.soBH > 0){
        this.soBH = soBH;
        }
        else this.soBH = 0;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        if(this.gia >0){
            this.gia = gia;
        }
        else this.gia = 0;
    }

    @Override
    public String toString() {
        String st = "";
        st+="Mã CD: " + maCD +"\t";
        st+="Tựa CD: " + tuaCD + "\t";
        st+="Ca sỹ: " + caSy + "\t";
        st+="Số bài hát: " + soBH + "\t";
        st+="Gía thành: " +gia;
        
        return st;
    }
    
    
}
