package com.enhancement;

import java.util.Optional;

public class OptionalAPIChanges {
    public static void main(String[] args) {
      var student = getStudentName("Ganesh");
      if(student !=null){
          System.out.println(student.getFirstName());
      }else{
          System.out.println("No Student with the given name");
      }

      Optional.ofNullable(getStudentName("Ganesh")).orElseThrow(() -> new RuntimeException("Student is not found"));
    }

    public static Student getStudentName(String name){
        if(name.equals("Ganesh") || name.equals("Kumar")){
            return new Student(111, "Ganesh", "Kumar");
        }else{
            return null;
        }
    }
}

class Student {
   private Integer id;
   private String firstName;
   private String lastName;

   public Student(Integer id, String firstName, String lastName){
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
