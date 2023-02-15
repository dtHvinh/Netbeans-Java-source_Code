/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap1;

/**
 *
 * @author admin
 */
public class SDDiem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Diem A;
        Diem a = new Diem(3,4);
       a.hienThi();
       // Diem B;
       Diem b = new Diem();
       b.nhapDiem();
       b.hienThi();
       // Diem C;
       Diem c = new Diem();
       c = b.doiXung();
       c.hienThi();
       // Khoang Cach tu B den O;
       System.out.println("Khoang Cach Tu B den O:"+ b.khoangCach());
       // KC tu A den B;
       System.out.println("Khoang Cach Tu A den B:"+ a.khoangCach(b));
    }
    
}
