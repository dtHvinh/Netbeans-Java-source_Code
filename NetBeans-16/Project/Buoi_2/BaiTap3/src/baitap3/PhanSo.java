/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhanSo {
    // Scanner
    Scanner sc = new Scanner(System.in);
    
    // Properies
    public int _tuSo,_mauSo = 0;
    public float dmc ;
    
    // Constructor.
    public PhanSo(){};
    public PhanSo(int tuSo ,int mauSo){
        this._tuSo = tuSo;
        this._mauSo = mauSo;
    }
    
    // read method.
    public void nhap(){
        System.out.println("Nhap tu so: ");
        int tuSo = sc.nextInt();
        System.out.println("Nhap mau so: ");
        int mauSo = sc.nextInt();
        if(mauSo == 0){
            System.out.println("Error: Gia tri cua mau so bang 0.");
            nhap();
        }
        else{
            this._tuSo = tuSo;
            this._mauSo = mauSo;
        }
        this.dmc = (float)tuSo / mauSo;
    }
    
    // print Methods
    public void in(){
        System.out.print("Phan So: ");
        if(this._mauSo == 1){
            System.out.println(this._tuSo);
            return;
        }
        System.out.println(this._tuSo + "/" + this._mauSo);
    }
    
    //print method overloads
    public static void in(PhanSo a){
        System.out.println("Phan So: ");
        if(a._mauSo == 1){
            System.out.println(a._tuSo);
            return;
        }
        System.out.println(a._tuSo + "/" + a._mauSo);
    }
    
    // in so thuc
    public void ind(){
        System.out.println(this.dmc);
    }
    
    //in nghich dao
    public void nghichDao(){
        if(this._tuSo == 0){
            System.out.println("Error: Sau nghich dao mau so bang 0.");
            return ;
        }
        System.out.println("Nghich dao: ");
        System.out.println(this._mauSo + "/" + this._tuSo);
    }
    // end print Methods
    
    // return reverse Fraction.
    public PhanSo giaTriNghichDao(){
        PhanSo res = new PhanSo(this._mauSo,this._tuSo);
        return res;
    }
    
    
    public boolean lonhon(PhanSo p2){
        PhanSo p1 = new PhanSo(this._tuSo,this._mauSo);
        return math.p1_is_Greater_than_p2(p1, p2);
    }
    
//    public cong()
}
