package com.ilkiz.repository.entity;

import java.util.Scanner;

public class Yönetici extends Personel {
    public Yönetici(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    public void maasHesapla() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Çalýþma saatini girin: ");
        int calismaSaati = sc.nextInt();
        System.out.print("Saatlik ücreti girin: ");
        int saatlikucret = sc.nextInt();
        System.out.print("Yönetici bonus ödemesini girin: ");
        int bonus = sc.nextInt();

        if (saatlikucret < 500) {
            System.out.println("Yönetici saatlik ücreti 500'den küçük olamaz.");
            return;
        } else {
            int maas = (calismaSaati * saatlikucret) + bonus;
            System.out.println(ad + soyad + "maaþý: " + maas);
            return;
        }
    }
}
