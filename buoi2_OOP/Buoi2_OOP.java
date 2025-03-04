/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_OOP;

/**
 *
 * @author hanly
 */
public class Buoi2_OOP {
    public static void main(String[] args) {
        // hiện tại đã có một cái khung/ class, tên Dog dùng để tạo ra nhiều đối tượng chó
        int a = 10;
        Dog chiHua = new Dog("Đen","Gà");
        // chó chiHua có 2 đặc điêm: màu lông đen, món ăn ưa thích là gà
        Dog doge = new Dog("Trắng", "Cá hồi");
        System.out.println("Trước khi thay đổi: "+chiHua.getMauLong());
        chiHua.setMauLong("Vàng hung");
        System.out.println("Sau khi thảy đổi: "+chiHua.getMauLong());
    }
}
