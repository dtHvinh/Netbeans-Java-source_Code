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
public class DanhSach {
    Scanner sc = new Scanner(System.in);
    private PhanSo[] arr = new PhanSo[100];
    private int topIndex = 0;
    
    public void push(PhanSo x){
        this.arr[topIndex] = x;
        this.topIndex++;
    }
    
    public void readList(){
        var count = 1;
        var state = 1;
        while (state == 1) {  
            System.out.println("Nhap phan so thu: "+ count++);
            PhanSo temp = new PhanSo();
            temp.nhap();
            // push
            this.arr[topIndex] = temp;
            this.topIndex++;
            // /push
            System.out.print("Tiep tuc ? Y/N "); 
            char t = sc.nextLine().charAt(0);
            if(t == 'n' ||t == 'N') state = 0;
        }
    }
    
    public float List_sum(){
        float res = 0;
        for(int i = 0 ; i < this.topIndex ; i++){
            res += this.arr[i].dmc;
        }
        return res;
    }
    
    public PhanSo max(){
       PhanSo res = this.arr[0];
       for(int i = 1; i < this.topIndex ; i++){
           if(this.arr[i].dmc > res.dmc) res = this.arr[i];
       }
       return res;
    }
    
    public void in(){
        int n = this.topIndex;
        for(int i = 0 ; i < n ; i++){
            this.arr[i].in();
        }
    }
    
    public void sort(){
        int n = this.topIndex;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i + 1; j < n; j++){
                if(this.arr[i].dmc > this.arr[j].dmc) math.swap(this.arr[i], this.arr[j]);
            }
        }
    }
}
