package com.company;

public class Main {

    public static void main(String[] args) {
        Dog[] arr = new Dog[3];
        arr[0] = new Dog ("Dog1", "red", 12);
        arr[1] = new Dog ("Dog2", "black", 1);
        arr[2] = new Dog ("Dog3", "white", 10);
        for(int i = 0; i < 3; i++)
        {
            System.out.println(arr[i]);
        }
    }
}