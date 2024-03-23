package com.ilkiz.repository.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOku {

    public static void main(String[] args) throws IOException {
        BufferedReader MyBR = new BufferedReader(new FileReader("E:\\personel.json"));

        StringBuilder MySB = new StringBuilder();
        String line;
        while ((line = MyBR.readLine()) != null) {
            MySB.append(line + '\n');
        }

        JSONObject MyJsonObject = new JSONObject(MySB.toString());
        String ad;
        String soyad;
        String rol;

        ad = MyJsonObject.getString("name");
        soyad = MyJsonObject.getString("surname");
        rol = MyJsonObject.getString("role");
    }


}
