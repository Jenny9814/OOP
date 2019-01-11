// VEHICLE
package BAI3;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class Vehicle {
    String hoTEN;
    String loaiXE;
    int dungTICH;
    float triGia;

    public Vehicle() {
        System.out.println("Vehicle");
    }

    public Vehicle(String hoTEN, String loaiXE, int dungTICH, float triGia) {
        this.hoTEN = hoTEN;
        this.loaiXE = loaiXE;
        this.dungTICH = dungTICH;
        this.triGia = triGia;
    }

    public String getHoTEN() {
        return hoTEN;
    }

    public void setHoTEN(String hoTEN) {
        this.hoTEN = hoTEN;
    }

    public String getLoaiXE() {
        return loaiXE;
    }

    public void setLoaiXE(String loaiXE) {
        this.loaiXE = loaiXE;
    }

    public int getDungTICH() {
        return dungTICH;
    }

    public void setDungTICH(int dungTICH) {
        this.dungTICH = dungTICH;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }
    
    public float thue(){
        if(this.dungTICH <= 100){
            return (float) (this.triGia*0.01);
        }
        else if (this.dungTICH > 100 && this.dungTICH <= 200){
            return (float) ((this.triGia)*0.03);
        }
        else return (float) ((this.triGia)*0.05);
    }

    @Override
    public String toString() {
        return   hoTEN + "\t\t" + loaiXE + "\t\t" + dungTICH + "\t\t" + triGia + "\t\t" + thue();
    }
    
}
