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
public class Dog { // cái khung này có thể sỉnh ra cả chục dog, cả chục cái obj
    // để phân biệt dog A,B
    // chúng ta khởi tạo các thuộc tính bản đầu cho class Dog
    // màu lông
    // món ăn ưa thích
    private String mauLong;
    private String monAnUaThich;
    
    // tạo phiễu hứng dữ liệu

    public Dog() {
    }

    public Dog(String mauLong, String monAnUaThich) {
        this.mauLong = mauLong;
        this.monAnUaThich = monAnUaThich;
    }
     // Getter/setter = hành động/method

    public String getMauLong() { // get là lấy giá trị hiện tại của thuộc tính đó
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getMonAnUaThich() { // set là thay đổi giá trị hiện tại của thuộc tính đó
        return monAnUaThich;
    }

    public void setMonAnUaThich(String monAnUaThich) {
        this.monAnUaThich = monAnUaThich;
    }
    
    
}
