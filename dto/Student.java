/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author hanly
 */
public class Student extends Person {
    private int mssv ;
    boolean gender; // true: nam / flase: nữ

    public Student(String firstName, String lastName, String dob) {
        super(firstName, lastName, dob);
    }

    public Student(int mssv, boolean gender, String firstName, String lastName, String dob) {
        super(firstName, lastName, dob);
        this.mssv = mssv;
        this.gender = gender;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: "+super.firstName+ " "+super.lastName+" - "+mssv;
    }
}
