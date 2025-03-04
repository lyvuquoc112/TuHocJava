/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_OOP;

import java.util.Scanner;

/**
 *
 * @author hanly
 */
public class scanner {
    public static void main(String[] args) {
        // quets loaij duwx lieuej naof
        Scanner sc = new Scanner(System.in); // quet qua console de lay du lieu dua cho doi tuong sc
        //1. quan console: system.in
        //2. qua file
        
        // user : 123
        //sc.nextInt(); // cho phep user nhap vao mot day so int
        System.out.println("Enter the number");
        int a = Integer.parseInt(sc.nextLine()); // cho phep user nhap vao int
        System.out.println("result: "+a);
//        
//        if(sc.hasNextLine())
//            sc.nextLine();
//        System.out.println("Enter the string");
//        String b = sc.nextLine(); // cho phep user nhap vao string
//        System.out.println("result: "+b);
        
        //nextDouble()
        
        // loi hay gap trong scanner
        // loi troi lenh
        // khi nhap int va enter thi enter se roi xuong nextLine() nen ko nhap dc
        // 1. them dong sc,nextLine giua sc,nextInt() va sc.nextLine()
        
        // 2. parse: la cach chuyen doi mot kieu du lieu stirng sang mot kieu bat ky(int,double)
        //loai kieu du lieu nguyen thuy:int, double,float
        //loai kieu du lieu class:interger,Double, boolean
//        String number ="10110101"; // chuyen cai nay sang int
//        int a = Integer.parseInt(number);
//        System.out.println(a);
//        double b = Double.parseDouble(number);
//        System.out.println(b);
    }
}
