package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Statham";
        switch (name){
            case "Kianu":
                System.out.println("Hi Kianu");
                break;
            case "Statham":
                System.out.println("Hi Statham");
                break;
        }
        int age = 27;
        int temp = +24;
        if (age < 45 && temp > +30 && temp > -20) ;
        {
            System.out.println("Можно идти гулять!");
        }
        if (age < 20 && temp > 0 && temp < 28) ;
        {
            System.out.println("Можно идти гулять, точно!");
        }
        if (age > 45 && temp > -10 && temp < 25) ;
        {
            System.out.println("Можно идти гулять, точно точно!");
        }

    }

}

