package com.company;

public class Main {

    public static void main(String[] args) {

        int[]array = new int[] {1,2,3,4,5,6,7,8,9,10};

        Container container = new Container(array);

        for (int i = 0; i < 10; i++)
        {
            container.add(array[i]);
        }


    }
}
