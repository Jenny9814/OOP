/* HINH CHU NHAT
*/
package BAI1;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class HINHCHUNHAT {
    int chieuDAI;
    int chieuRONG;

    public HINHCHUNHAT() {
        System.out.println("DAY LA HINH CHU NHAT");
    }

    public HINHCHUNHAT(int chieuDAI, int chieuRONG){
        this.chieuDAI = chieuDAI;
        this.chieuRONG = chieuRONG;
    }
    public int getChieuDAI() {
        return chieuDAI;
    }

    public void setChieuDAI(int chieuDAI) {
        this.chieuDAI = chieuDAI;
    }
    
    
    public int getChieuRONG() {
        return chieuRONG;
    }

    public void setChieuRONG(int chieuRONG) {
        this.chieuRONG = chieuRONG;
    }
    
    public int chuVI(){
        return (this.chieuDAI + this.chieuRONG)/2;
    }
    
    public int dienTICH(){
        return (this.chieuDAI * this.chieuRONG);
    }

    @Override
    public String toString() {
        String s =  "HINHCHUNHAT{" + "chieuDAI=" + chieuDAI + ", chieuRONG=" + chieuRONG + '}';
        return s + ", CHUVI=" +chuVI() + ", DIENTICH=" +dienTICH();
    }
    
}
