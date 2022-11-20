package org.example;

public class Main {
    public static void main(String[] args) {
        Personal[] array = new Personal[5];
        array[0] = new Personal("Ivan","head of department","ivan@mail.ru","8915-555-55-55",200000,35);
        array[1] = new Personal("Katya", "accountant","Katya@mail.ru","8-915-555-55-54",80000,39);
        array[2] = new Personal("Masha", "HR officer", "Masha@mail.ru", "8-915-555-55-53",75000,41);
        array[3] = new Personal("Vasya", "sysadmin", "Vasya@mail.ru","8-915-555-55-52", 135000, 30);
        array[4] = new Personal("Varvara", "economist", "Varvara@mail.ru", "8-915-555-55-51", 85000, 44);

        for (int i = 0; i < array.length; i++) {
            if (array[i].age >40) {
                array[i].printInfo();
            }
        }
    }
}