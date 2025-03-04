/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1_gt__java;
// packagae tên viết thường
// class viết hoa chữ cái đầu
// tên biến hằng viết theo kiểu lạc đà

/**
 *
 * @author hanly
 */
public class Buoi1_gt_JAVA {
    
    // biểu hiện quyền riêng tư của 1 file
    // trong th này, class Buoi1 được xem là class công cộng -> bất kỳ ai cũng dùng được
    public static void main(String[] args) {
    // public trong th này hiển thị rằng hàm main là hàm công cộng, được sử dụng thoải mái
    //C: println ("Hello World");
    //Java
        System.out.println("Hello World"); // in ra xuống hàng 
        System.out.println("Goodnight");
        
        System.out.print("Apple "); // in ra nhưng ko xuống hàng
        System.out.print("Orange ");
        
        System.out.printf("\nHello "); // in ra như printf bên c
        // như bên c
        int a = 5;
        int b = 5;
        System.out.println("\nBiến a có giá trị: "+a+" và biến b có giá trị: "+b);
        System.out.print("\nBiến a có giá trị: "+a+" và biến b có giá trị: "+b);
        System.out.printf("\nBiến a có giá trị: %d và biến b có giá tri: %2d\n",a,b);
        
        int[] numbers= {1,2,3,4,5}; // độ dài là 5, index cuối là 4
        // fori
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: "+i+"\tElement: "+numbers[i]);
            
        }
        
        // fore 
        System.out.println("--------------------------------------------------");
        for(int tay: numbers){
            System.out.println("Element: "+tay);
        }
        
        // ép kiểu  từ string  --> kiểu dữ liệu khác: parse
       String abc="5";
       int c = Integer.parseInt(abc);
        System.out.println(c);
       double d = Double.parseDouble(abc);
        System.out.println(d);
        
        System.out.println("--------------------------------------------------");
        double dtb = tinhDiemTrungBinh(10,10);
        System.out.println("Điểm trung bình là: "+dtb);
        System.out.println("--------------------------------------------------");
        tinhDienTichHCN(-5, 2);
        
        
        int[]ds = {1,2,3,4,5};
        for(int i = 0; i <5;i++){
            if(soChan(ds[i])!=0){
                System.out.println((i+1)+" là số chẵn");
            }
        }
        
    }
    
    
    public static double tinhDiemTrungBinh(double math, double physics){
        return (math+physics)/2;
    }
    
    public static void tinhDienTichHCN(int a, int b){
        if(a<=0||b<=0)
            return;
        int dienTich = a*b;
        System.out.println("Diện tích hình chữ nhật: "+dienTich+" (ha)");
    }
    
    public static int soChan(int numbers){
        if(numbers%2==0)
           return numbers;
         return 0;
    }
}
