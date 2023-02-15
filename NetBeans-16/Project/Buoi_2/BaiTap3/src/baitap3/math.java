/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap3;

import java.text.NumberFormat;

/**
 *
 * @author admin
 */
public class math {
    // '+'
    static void fractions_sum(PhanSo p1, PhanSo p2){
        System.out.println("Tong cua 2 phan so: ");
        
        int tuSo =p1._tuSo * p2._mauSo + p1._mauSo * p2._tuSo;
        int mauSo = p1._mauSo * p2._mauSo;
        
        PhanSo create = new PhanSo(tuSo,mauSo);
        create = inside.rutGon(create);
        create.in();
    }
    // '-'
    static void fractions_multiple(){
        
    }
    // '*'
    static void fractions_divine(){
        
    }
    // '/'
    static void fractions_minus(){
        
    }
    static boolean p1_is_Greater_than_p2(PhanSo p1,PhanSo p2){
        float k = p1.dmc - p2.dmc;
        return (k > 0);
    }
}
