/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2;
/**
 *
 * @author admin
 */
public class Date {
    int ngay,thang,nam;
    public Date(int ngay,int thang,int nam){
        this.ngay = ngay;
        this.thang= thang;
        this.nam  = nam;
    }
    
    // viet ham nhap bao ko hop le
    // ham kiem tra xem ngay co hop le
    
    public void dateDisplay(){
        System.out.println(this.ngay + "/" + this.thang+ "/" +this.nam);
    }
    public Date ngayHomSau(){
        Date hs = new Date(this.ngay,this.thang,this.nam);
        int v = hs.ngay + 1;
        //2
        switch (this.thang) {
            case 2 -> {
                hs.ngay = v>29 ? v%29 : v;
                hs.thang += v>29 ? 1 : 0;

            }
            case 12 -> {
                hs.ngay = v>31 ? v%31 : v;
                hs.thang += v>31 ? 1 : 0;
                hs.thang = hs.thang>12 ? hs.thang%12 : hs.thang;
                hs.nam += v>31 ? 1 : 0;     
            }
            case 1,3,5,7,8,10 -> {
                hs.ngay = v>31 ? v%31 : v;
                hs.thang += v>31 ? 1 : 0;
            }
            default ->{
                hs.ngay = v>30 ? v%30 : v;
                hs.thang += v>30 ? 1 : 0;
            }
                
        }
        return hs;
    }
    public Date congNgay(int n){
        Date cn = new Date(this.ngay,this.thang,this.nam);
        while(n >= 1){
            cn = cn.ngayHomSau();
            n--;
        }
        return cn;
    }
}
