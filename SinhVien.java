
import java.util.*;

public class SinhVien {
    public String nganhhoc;
    private String hoTen;
    private int tuoi;
    private float diemtoan;
    private float diemOOP;
    private float diemhocki;
    private String hocluchocki;

    public SinhVien() {
    }

    public SinhVien(String nganhhoc, String hoTen,int tuoi) {
        this.nganhhoc = nganhhoc;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void nhapDiemhocki(float diemhocki) {
        this.diemhocki = diemhocki;
    }

    public float xuatDiemhocki() {
        return diemhocki;
    }

    public void nhapDiemMonHoc(Scanner input) {
        System.out.println("Nhap diem mon toan");
        this.diemtoan = input.nextFloat();
        System.out.println("Nhap diem mon OOP");
        this.diemOOP = input.nextFloat();
    }

    public void xuatDiemMonHoc() {
        System.out.println("Diem toan" + this.diemtoan);
        System.out.println("Diem OOP" + this.diemOOP);
    }

    public void tinhDiemTrungBinhHocKi() {
        this.diemhocki = (this.diemtoan + this.diemOOP)/2;
        System.out.println("Diem trung binh hoc ki : " + this.diemhocki);
    }

    public String xeploaihocluc() {
        if (diemhocki > 8) this.hocluchocki = "Hoc luc Tot";
        else if (diemhocki > 5 ) {
            this.hocluchocki = "Hoc luc kha";
        } else this.hocluchocki = "Hoc luc Yeu";
        return this.hocluchocki;
    }


}

