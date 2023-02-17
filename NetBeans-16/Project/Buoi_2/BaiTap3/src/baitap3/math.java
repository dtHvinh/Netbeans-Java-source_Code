/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap3;


/**
 *
 * @author admin
 */
public class math {
    // '+'
    static PhanSo fractions_sum(PhanSo p1, PhanSo p2){
        int tuSo =p1._tuSo * p2._mauSo + p1._mauSo * p2._tuSo;
        int mauSo = p1._mauSo * p2._mauSo;
        
        PhanSo create = new PhanSo(tuSo,mauSo);
        create = inside.rutGon(create);
        return create;
    }
    // '-'
    static PhanSo fractions_subtract(PhanSo p1, PhanSo p2){
        int tuSo =p1._tuSo * p2._mauSo - p1._mauSo * p2._tuSo;
        int mauSo = p1._mauSo * p2._mauSo;
        
        PhanSo create = new PhanSo(tuSo,mauSo);
        create = inside.rutGon(create);
        return create; 
    }
    // '*'
    static PhanSo fractions_multiple(PhanSo p1, PhanSo p2){
        PhanSo res = new PhanSo(p1._tuSo * p2._tuSo, p1._mauSo * p2._mauSo);
        return res;
    }
    // '/'
    static PhanSo fractions_divine(PhanSo p1, PhanSo p2){
        PhanSo p3 = new PhanSo(p2._mauSo , p2._tuSo);
        return fractions_multiple(p1, p3);
    }
    // '>'
    static boolean p1_is_Greater_than_p2(PhanSo p1,PhanSo p2){
        float k = p1.dmc - p2.dmc;
        return (k > 0);
    }
    // 'swap'
    static void swap(PhanSo p1,PhanSo p2){
        PhanSo temp = new PhanSo(p2._tuSo,p2._mauSo);
        p2._tuSo  = p1._tuSo;
        p2._mauSo = p1._mauSo;
        p1._tuSo  = temp._tuSo;
        p1._mauSo = temp._mauSo;
    }
}
