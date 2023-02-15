/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SDDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3]; // a[0] = ngay a[1] = thang a[2]=nam
        int ngay= 0,thang= 0,nam= 0;
        for(int i = 0 ; i <= 2 ; i++)
        {
            switch(i)
            {
                case 0 -> 
                {
                    System.out.print("Nhap ngay: ");
                    ngay = sc.nextInt();
                    while(ngay <= 0 || ngay > 31){
                        System.out.println("Gia Tri 'Ngay' khong hop le.");
                        System.out.print("Nhap ngay: ");
                        ngay = sc.nextInt();
                    }
                }
                case 1 -> 
                {
                    System.out.print("Nhap thang: ");
                    thang = sc.nextInt();
                    while( thang == 2 && ngay > 29|| thang < 0 || thang > 12){
                        System.out.println("Gia tri thang khong hop le.");
                        System.out.print("Nhap thang: ");
                        thang = sc.nextInt();                        
                    }
                }
                case 2 ->
                {
                    System.out.print("Nhap nam: ");
                    nam = sc.nextInt();
                }
            }
        }
        Date a = new Date(ngay,thang,nam);
        System.out.print("Hom nay la ngay: "); a.dateDisplay();
        
        System.out.println();
        System.out.print("Nhap k: ");
        int k = sc.nextInt();
        Date hs;
        hs = a.congNgay(k);
        System.out.println("Sau "+k+" ngay: ");hs.dateDisplay();
    }
    
}
