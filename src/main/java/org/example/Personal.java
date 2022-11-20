package org.example;

public class Personal {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Personal(String name,String position, String email, String phone,int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Имя: %s; Должность: %s; Почта: %s; Телефон: %s; Зарплата: %d; Возраст: %d\n", name, position, email, phone, salary, age);
    }
}
