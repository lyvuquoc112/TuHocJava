/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.Student;
import dto.*; // như trên nhưng là tất cả trong package đó 
import java.util.ArrayList;

/**
 *
 * @author hanly
 */
public class StudentManagement extends ArrayList<Student> {
    // Thùng => Lưu dạng danh sách mảng 
    // C1: ArrayList<Student> thung = new ArrayList<>();
    
    public void addStudent(Student student){
        // B1: Kiểm tra id đã tồn tại hay chưa 
        // chưa: => thêm 
        Student s = getStudentById(student.getMssv());
        if(s == null){
            this.add(student);
            System.out.println("Add Success");
        }
        // rồi => ko làm
    }
    
    public Student getStudentById(int id){
        for(Student i : this){
            if(i.getMssv() == id){
                return i;
            }
        }
        return null;
    }
    
    public ArrayList<Student> getListStudent(){
        return this;
    }
    
    public void updateStudent(Student newStudent){
        // muốn update student phải tồn tại 
        Student oldStudent = getStudentById(newStudent.getMssv());
        if(oldStudent != null){
            oldStudent.setFirstName(newStudent.getFirstName());
            oldStudent.setLastName(newStudent.getLastName());
            oldStudent.setDob(newStudent.getDob());
            oldStudent.setGender(newStudent.isGender());  
            System.out.println("Upadate Success");
        }
    }
    
    public void remoteStudent(int id){
         Student s = getStudentById(id);
         if(s!=null)
             this.remove(s);
    }
}
