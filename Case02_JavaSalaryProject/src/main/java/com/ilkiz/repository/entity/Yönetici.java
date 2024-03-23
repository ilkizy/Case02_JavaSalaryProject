package com.ilkiz.repository.entity;

import java.util.Scanner;

public class Y�netici extends Personel {
    public Y�netici(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    public void maasHesapla() {
        Scanner sc =new Scanner(System.in);
        System.out.print("�al��ma saatini girin: ");
        int calismaSaati = sc.nextInt();
        System.out.print("Saatlik �creti girin: ");
        int saatlikucret = sc.nextInt();
        System.out.print("Y�netici bonus �demesini girin: ");
        int bonus = sc.nextInt();

        if (saatlikucret < 500) {
            System.out.println("Y�netici saatlik �creti 500'den k���k olamaz.");
            return;
        } else {
            int maas = (calismaSaati * saatlikucret) + bonus;
            System.out.println(ad + soyad + "maa��: " + maas);
            return;
        }
    }
}
