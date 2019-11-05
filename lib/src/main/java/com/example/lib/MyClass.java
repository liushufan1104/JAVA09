package com.example.lib;
public class MyClass {
    public static void main ( String[] args ) {
        for(int i=1;i<10;i++){
            for(int j=2;j<10;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j );
            }
            System.out.println("");
        }
    }
}