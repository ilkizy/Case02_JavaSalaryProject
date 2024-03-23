package com.ilkiz.repository.entity;

import java.util.Scanner;

import static com.ilkiz.repository.entity.ELevel.*;

public class Memur extends Personel{

    ELevel level;

    public Memur(String ad, String soyad, ELevel level) {
        super(ad, soyad);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Memur{" +
                "level=" + level +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

    public ELevel getLevel() {
        return level;
    }

    public void setLevel(ELevel level) {
        this.level = level;
    }


    @Override
    public void maasHesapla() {

        double maas;
        int saatlikUcret = 0;
        if(level == JUNIOR){
            saatlikUcret = 500;
        } else if (level == MID) {
            saatlikUcret = 600;
        } else if (level == SENIOR) {
            saatlikUcret = 700;
        }
        Scanner sc =new Scanner(System.in);
        System.out.print("Çalýþma saatini girin: ");
        int calismaSaati = sc.nextInt();

        if (calismaSaati > 180) {
            int ekCalisma = calismaSaati - 180;
            calismaSaati = 180 - ekCalisma;
            maas = (calismaSaati + (ekCalisma * 1.5)) * saatlikUcret;
            System.out.println(ad + soyad + "maaþý: " + maas);
        } else {
            maas = (calismaSaati * saatlikUcret);
            System.out.println(ad + soyad + "maaþý: " + maas);
        }
    }
}
