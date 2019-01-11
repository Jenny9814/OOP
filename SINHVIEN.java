/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class SINHVIEN {
    private int MSSV;
    private String Name;
    private String Address;
    private int phoneNumber;

    public SINHVIEN() {
        this.MSSV = 0;
        this.Name = "";
        this.Address = "";
        this.phoneNumber = 0;
    }

    public SINHVIEN(int MSSV, String Name, String Address, int phoneNumber) {
        this.MSSV = MSSV;
        this.Name = Name;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }
    

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhoneNumber(int phoneNumber) {
        if(this.phoneNumber == 7 ){
            this.phoneNumber = phoneNumber;
        }
        else
            this.phoneNumber = 0;
    }

    public int getMSSV() {
        return MSSV;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "SINHVIEN{" + "MSSV=" + MSSV + ", Name=" + Name + ", Address=" + Address + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
