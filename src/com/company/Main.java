package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kg;
        double m, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        m=scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = scanner.nextInt();
        sonuc = kg/(m*m);
        System.out.print("Vücut Kitle İndeksiniz : " + sonuc);



    }
}
