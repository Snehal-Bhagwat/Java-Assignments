package com.employee;

public class Main {

    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "Snehal";
        emp.age = 21;
        emp.city = "Pune";
        emp.display();

        employee e = new employee();
        e.name = "Shweta";
        e.age = 22;
        e.city = "Pune";
        e.display();
    }
}