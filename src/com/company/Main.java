package com.company;

public class Main {

    public static void main(String[] args) {
	// it can parse only integer but not any other data type together
        // parse will take string and give premitive data type
        String number = "234";
        int i = Integer.parseInt(number);
        System.out.println(i);
        double v = Double.parseDouble(number);
        System.out.println(v);
        Integer integer = Integer.valueOf(i);
        System.out.println(i);
        //parse return premitive type
        //value of method return the relevant Number Object holding the value of the argument passed.


    }
}
