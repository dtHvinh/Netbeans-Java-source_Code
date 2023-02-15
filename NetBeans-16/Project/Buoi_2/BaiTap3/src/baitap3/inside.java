/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap3;

/**
 *
 * @author admin
 */
public class inside {
    private static int UCLN(int A, int B) {
    if (A == 0 || B == 0)
        return A + B;
    while(A != B) {
        if (A > B) {
            A -= B;
        }else{
            B -= A;
        }
    }
    return A;
}
    
    // rut gon phan so
    static PhanSo rutGon(PhanSo p1){
        int tuSo = p1._tuSo;
        int mauSo = p1._mauSo;
        int temp = inside.UCLN(tuSo,mauSo);
        // Khong can rut gon.
        if(temp == 1) return p1;
        // Rut gon.
        while(tuSo % temp == 0 && mauSo % temp == 0){
            tuSo /= temp;
            mauSo /= temp;
        }
        PhanSo res = new PhanSo(tuSo,mauSo);
        return res;
    }

}
