package com.company;

public class Main {

    public static void main(String[] args) {
	String[] sArray  = new String [7];
	sArray[0] = "Monday";
	sArray[1] = "Вторник";
    sArray[2] = "Среда";
    sArray[3] = "Четверг";
    sArray[4] = "Пятница";
    sArray[5] = "Суббота";
    sArray[6] = "Восскресение";
        for (int i = 0; i < 7; i++) {
            System.out.println(sArray[i]);
        }
    }
}
