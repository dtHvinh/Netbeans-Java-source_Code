/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap1;

/**
 *
 * @author admin
 */
public class Gach {
    Scanner sc = new Scanner(System.in);
    String id, color;
    int NoBrick_per_box;
    int d_gach;
    int r_gach;
    int price_per_box;

    public Gach() {
    }
     
    public void nhapThongTin(){
        System.out.println("Nhap ID: ");
        this.id = sc.nextLine();
        System.out.println("Nhap mau: ");
        this.color = sc.nextLine();
        System.out.println("Nhap so luong vien gach: ");
        this.NoBrick_per_box = sc.nextInt();
        System.out.println("Nhap chieu dai vien gach: ");
        this.d_gach = sc.nextInt();
        System.out.println("Nhap chieu rong vien gach: ");
        this.r_gach = sc.nextInt();
        System.out.println("Nhap so luong vien gach: ");
        this.price_per_box = sc.nextInt();
    }
    public void info(){
        System.out.println("ID: "+ this.id + "Mau: " + this.color);
        System.out.println("Chieu dai: "+ this.d_gach + "Chieu rong: " + this.r_gach);
        System.out.println("Gia: " + this.price_per_box +"/hop");    
    }
    public float giaBanLe(){
        float res = this.price_per_box/this.NoBrick_per_box;
        return res + 20*res/100;
    }
    
    public float dienTichNenLotDuoc(){
        return this.d_gach*this.r_gach*this.NoBrick_per_box;
    }
    
    int soLuongHop(int D, int N){
        float s1 = (float)D * N;
        float s2 = dienTichNenLotDuoc();
        float number = s1/s2;
        if(number <= 1) return 1;
        else return (int)number;
    }
}
