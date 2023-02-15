/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Currency;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class BaiTap3 {
    public static void main(String[] args) {
        //Khoi tao List;
        List a = new List();
        //Nhap so luong phan tu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        //Nhap cac phan tu vao List
        for(int i = 1; i <= n ; i++){
            float cur = 0;
            try{
                cur = sc.nextFloat();
            }
            catch(InputMismatchException e){
                System.out.println("Input is not a number.");
                System.exit(0);
            }
            a.insertList(cur);
        }
        a.printList();
        System.out.println(a.max());
        System.err.println(a.sum());
    }   
}
