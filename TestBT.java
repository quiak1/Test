/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.bài.b4;
import java.util.Scanner;
public class TestBàiB4 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bài 1");
        System.out.println("Nhap so tu nhien n bat ki >2, Kiem tra xem n co phai so nguyen to ko ");
        isPrime();
        System.out.println("Bài 2");
        System.out.println("In ra 1 hang ngang cac so nguyen to trong khoang tu 1-1000");
        motNganSoTuNhien();
    }
    public static void isPrime(){
        Scanner nhapSo = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = nhapSo.nextInt();     
        int count = 0; 
        if(n<=2){
             System.out.println("n nho hon hoac bang 2 ko dc");
         }
         else{
            for (int i=1; i<= Math.sqrt(n);i++){
             if (n %i !=0){
                 count ++;
             }
         }
        }
         if (count==1){
             System.out.println("n la so nguyen to");
         }
         else{
             System.out.println("n khong phai so nguyen to");
         }
    }
    public static void motNganSoTuNhien(){
       int count = 0;
        for (int i=0;i <=1000 ;i++){
            for (int t=2; t <= Math.sqrt(i); t++){
                if(i % t ==0){
                    count = 0;
                    break;
                }
                else{
                    count ++;
                }
                }
            if (count>0){
                    System.out.println(i+ " ");
            }
        }
    }
}
