package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(agetemp(28,2));
        System.out.println(agetemp(11,-4));
        System.out.println(agetemp(61,5));
        System.out.println(agetemp(22,-10));
        System.out.println(generaterandomAge() + agetemp(generaterandomAge(),5));
    }

    public static String agetemp(int age, int temperature) {
        String result = "можно входит на улицу";
        String result_2 = "нельзя входит на улицу";
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return result;
        }
        if (age > 20 && temperature > 0 && temperature < 20) {
            return result;
        } else {
            return age > 45 && temperature > -10 && temperature < 25 ? result : result_2;
        }
    }
public static int generaterandomAge(){
    Random random =  new Random();
    int age = random.nextInt(80);
    return age;
}
}
