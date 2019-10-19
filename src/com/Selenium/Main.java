package com.Selenium;

public class Main {

    public static void main(String[] args) {
        System.out.println("sddwwwdfds");

        Zwierze zwierze = FabrykaZwierzat.getZwierze("Miau");

        System.out.println(zwierze.getClass().toString());
    }
}

interface Zwierze{
    String dajGlos();
}

class Kot implements Zwierze{

    @Override
    public String dajGlos() {
        return "Miau";
    }
}

class Pies implements Zwierze{

    @Override
    public String dajGlos() {
        return "Hau";
    }
}

class Kon implements Zwierze{

    @Override
    public String dajGlos() {
        return "Ihaha";
    }
}

class FabrykaZwierzat{

    public static Zwierze getZwierze(String glos){
        Zwierze zwierze = null;
        switch (glos){
            case "Miau":
                zwierze = new Kot();
                break;
            case "Hau":
                zwierze = new Pies();
                break;
            case "Ihaha":
                zwierze=new Kon();
                break;
        }
        return zwierze;
    }








}