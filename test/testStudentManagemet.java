/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dto.Student;
import controller.*;

/**
 *
 * @author hanly
 */
public class testStudentManagemet {
    public static void main(String[] args) {
        // test quản lí học sinh
        StudentManagement studentManagement = new StudentManagement();
        
        // thêm dữ liệu 
        Student s = new Student(1,true,"Huy","Lý","16_02_2005");
        Student s2 = new Student(2,true,"Huy","Lý","16_02_2005");
        Student s3 = new Student(1,true,"Huy","Lý","16_02_2005");
        Student s4 = new Student(1,true,"Huy","Lý","16_02_2005");
        Student s5 = new Student(1,true,"Huy","Lý","16_02_2005");
        
        studentManagement.addStudent(s);
        studentManagement.addStudent(s2);
        
        Student newStudent = new Student(2,true,"Huy","Lý B","16_02_2005");
        studentManagement.updateStudent(newStudent);
         
        for(Student student:studentManagement){
            System.out.println(student); 
        }
        
       
    }
}
