/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauval091222;

/**
 *
 * @author Nauval
 */
public class Student extends Person {
    
    public Student(){
        super("Nopal","Padang");
        System.out.println("Inside Student:Constructor");
    }
    
    public static void main(String[]args){
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAddress());
    }
}
