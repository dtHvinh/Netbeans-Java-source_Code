/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author admin
 */
class Diem{
    int x,y;
    public Diem(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public void in(){
        System.out.print("(" + this.x + "," + this.y + ")");
    }
}

public class DoanThang {
    Scanner sc = new Scanner(System.in);
    private Diem x1;
    private Diem x2;

    /**
     *
     * @param x1
     * @param x2
     */
    public DoanThang(Diem x1, Diem x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public  DoanThang(int ax, int ay, int bx, int by){
        this.x1 = new Diem(ax,ay);
        this.x2 = new Diem(bx,by);
    }
    
    public void move(int x){
        // A
        this.x1.x += x;
        this.x1.y += x;
        // B
        this.x2.x += x;
        this.x2.y += x;
    }
    
    public void nhap(){
        int ax,ay,bx,by;
        System.err.println("Nhap A(x): ");
        ax = sc.nextInt();
        System.err.println("Nhap A(y): ");
        ay = sc.nextInt();
        System.err.println("Nhap B(x): ");
        bx = sc.nextInt();
        System.err.println("Nhap B(y): ");
        by = sc.nextInt();
        DoanThang temp = new DoanThang(ax,ay,bx,by);
        this.x1 = temp.x1;
        this.x2 = temp.x2;
    }
    
    public void in(){
        System.out.print("A");
        this.x1.in();
        System.out.print("--------------->");
        System.out.print("B");
        this.x2.in();
        System.out.println();
    }
    // do dai
    public float dodai(){
        
    }
    // goc (xO,AB)
    public float goc(){
        
    }
    
    
}