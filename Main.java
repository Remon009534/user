package com.company;

public class Main {


    public static void main(String[] args) {
        User u1 = new User("Remon", "raadshahmatremon@gmail.com", "Remon123", "remon12");

        u1.passwordLengthChecker("remon12190u04");
        u1.showinfo();
    }
}
