/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap2;

/**
 *
 * @author admin
 */
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diem x1 = new Diem(2,5);
        Diem x2 = new Diem(20,35);
        DoanThang a = new DoanThang(x1.x,x1.y,x2.x,x2.y);
        a.in();
        
        a.move(2);
        a.in();
    }
    
    
}
