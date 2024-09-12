package com.etiya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        // Değişken isimleri camelCase tipinde yazılır
        String ortamMetin ="İlginizi çekebilir";
        String altMetin ="Vade süresi";

        // integer,double...
        int vade = 12;

        double dolarDun = 18.20;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if(dolarBugun<dolarDun){
            okYonu="down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu="up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu="equal.svg";
            System.out.println(okYonu);
        }

        /*
        String kredi1="Hızlı Kredi";
        String kredi2="Hızlı Kredi X";
        String kredi3="Hızlı Kredi Y";
        */

        //Array
        String[] krediler = {"Hızlı Kredi","Sana Özel Kredi","Emekli Kredi"};
        for (int i=0;i<krediler.length;i++){
            System.out.println(krediler[i]);
        }
    }
}