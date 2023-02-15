/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap3;

/**
 *
 * @author admin
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhanSo a = new PhanSo(4,6);
        a.in();
//        PhanSo b = new PhanSo(2,3);
//        b.in();
//        math.fractions_sum(a, b);
        
        PhanSo b = a.giaTriNghichDao();
        b.in();
        
    }
    
}
