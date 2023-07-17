package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double kilo,boy;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        System.out.print("Boyunuzu Giriniz : ");
        boy = input.nextDouble();

        double kitleEndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + kitleEndeksi);

    }
}