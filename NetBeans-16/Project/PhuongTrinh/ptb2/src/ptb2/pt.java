/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptb2;

/**
 *
 * @author admin
 */
public class pt {
        private float a; // ax^2
        private float b; // bx
        private float c; // c
        public pt(int a,int b,int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public pt(String pt){
            
        }
        public void in(){
            String out = "";
            out += this.a == 0 ? "" : (this.a) +"x^2 ";
            out += this.b == 0 ? "" : (this.b) +"x ";
            out += this.c == 0 ? "" : (this.c) ;
            System.out.println(out);
        }
}
