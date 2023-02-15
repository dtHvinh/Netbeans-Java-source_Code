/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Diem {
    int x,y;
    Scanner sc = new Scanner(System.in);
    public Diem(){}
    public Diem(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void nhapDiem(){
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        this.x = a;
        this.y = b;
    }
    public void hienThi(){
        System.out.println("A(" + this.x + ',' + this.y + ")");
    }
    public void doiDiem(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }
    public int giaTriX(){
        return this.x;
    }
    public int giaTriY(){
        return this.y;
    }
    public float khoangCach(){
        return (float)Math.sqrt(this.x*this.x + this.y*this.y);
    }
    public float khoangCach(Diem B){
        int ox = this.x - B.x;
        int oy = this.y - B.y;
        return (float)Math.sqrt(ox*ox + oy*oy);
    }
    public Diem doiXung(){
        Diem c = new Diem();
        c.x = -1 * this.x;
        c.y = -1 * this.y;
        return c;
    }
}
