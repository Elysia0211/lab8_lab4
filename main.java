/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8_4;

/**
 *
 * @author Admin
 */
public class Lab8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sanpham sp1 = new Sanpham("1",5000,500);
        Sanpham sp2 = new Sanpham("1",15000,2000);
//        sp1.Nhap();
//        sp2.Nhap();
        sp1.Xuat();
        sp2.Xuat();
        Sanpham sp3 = new Sanpham("1",5000);
    }
    
    
}
