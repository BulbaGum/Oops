package com.company;

public class Test3 {
    public static void main(String[] args){
        String[][] sArray = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if(i==0){
                    int k = j+1;
                    sArray[i][j] = "a" + k;
                    System.out.print(sArray[i][j] +"\t");
                }
                if(i==1){
                    int k = j+1;
                    sArray[i][j] = "b" + k;
                    System.out.print(sArray[i][j] +"\t");
                }
                if(i==2){
                    int k = j+1;
                    sArray[i][j] = "c" + k;
                    System.out.print(sArray[i][j] +"\t");
                }

            }
            System.out.println("");
        }
    }
}
