package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {


    /*
    * Summary */
    @org.junit.jupiter.api.Test
    void arrayUp() {

        int[] arr = new int[] {1,2,3};
        Container container = new Container(arr);

        //arrange
        int expected = 4;

        //action
        container.arrayUp();
        int action = container.mass.length;

        //assert
        assertEquals(expected, action);
    }


    @org.junit.jupiter.api.Test
    void add() {

        int[] arr = new int[] {3,2,7};
        Container container = new Container(arr);

        //arrange
        int expected = 8;

        //action
        container.add(8);

        int action = container.mass[container.counter - 1];

        //assert
        assertEquals(expected, action);
    }

    @org.junit.jupiter.api.Test
    void set_1() {

        int[] arr = new int[] {1,2,3,4,5};
        Container container = new Container(arr);

        //arrange
         int expected = 5;

        //action
        int index = 2; int value = 5;
        container.set(index, value);
        int action = container.mass[index];

        //assert
        assertEquals(expected, action);
    }

    @org.junit.jupiter.api.Test
    void set_2() {

        int[] arr = new int[] {1,2,3};
        Container container = new Container(arr);

        //arrange
        int expected = 5;

        //action
        int index = 7; int value = 5;
        container.set(index, value);
        int action = container.mass[index];

        //assert
        assertEquals(expected, action);
    }


    @org.junit.jupiter.api.Test
    void get() {

        int[] arr = new int[] {1,666,3};
        Container container = new Container(arr);

        //arrange
        int expected = 666;

        //action
        int action = container.get(1);

        //assert
        assertEquals(expected, action);
    }

    @org.junit.jupiter.api.Test
    void delete() {

        //arrange
        int[] arr_1 = new int[] {5,3};
        Container container_1 = new Container(arr_1);
        int expected = container_1.mass[1];

        //action
        int[] arr_2 = new int[] {5,666,3};
        Container container_2 = new Container(arr_2);
        container_2.delete(1);
        int action = container_2.mass[1];

        //assert
        assertEquals(expected, action);

    }
}