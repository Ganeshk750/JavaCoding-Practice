package com.dp;

public class ImmutableDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("GANABC06");
        String s1 = emp.getPanCardNo();
        System.out.println("PanCard No: "+ s1);
    }
}

final class Employee {
    final String panCardNo;
    public Employee(String panCardNo){
        this.panCardNo = panCardNo;
    }
    public String getPanCardNo(){
        return panCardNo;
    }
}
