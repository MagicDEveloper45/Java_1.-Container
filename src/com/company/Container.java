/*
* Upd1
* Create constructor, method arrayDown
* Update method set, delete
* Add Unit tests
* */


package com.company;

public class Container
{
    int counter;
    int lengthOfMass;
    int[] mass;

    public Container(int [] arr)
    {
        this.counter = arr.length; // counter of used fields in the array
        this.lengthOfMass = arr.length; // Basic size of array
        this.mass = new int[arr.length];
        mass = arr;
    }

    /*
     * Summary
     * This method expand the array
     * Creating a buffer array "bufferMass" with a size of 1 more then "Mass", in which the values of the array "Mass" are placed,
     * After the pointer to MassUp is assigned to the pointer to the array Mass and size(length) of array Mass increases by 1
     */
    public void arrayUp()    {
        int [] bufferMass = new int [lengthOfMass + 1];

        for (int i = 0; i < lengthOfMass; i++)        {
            bufferMass[i] = mass[i];
        }
        mass = bufferMass;
        lengthOfMass += 1;
    }


    public void arrayDown()    {
        int [] bufferMass = new int [lengthOfMass - 1];

        for (int i = 0; i < lengthOfMass - 1; i++)        {
            bufferMass[i] = mass[i];
        }
        mass = bufferMass;
        lengthOfMass -= 1;
    }

    /*
     * Summary
     * This method add number into array.
     * Actually we have 2 case:
     * The array has empty field for value, then we'll put him into.
     * All fields in the array are employed, then we'll expand the array, and put value into empty field.  *
     */
    public void add(int value)
    {
        if (counter == lengthOfMass){
            arrayUp();
        }

        mass[counter] = value;
        counter++;

    }

    /*
     * Summary
     * This method inserts the passed value into the passed index, shifting all the numbers after the index to the
     * Or allocates enough memory to put the value in the specified index (the index value can be greater than the value of the array length )
     * Exp_1 1 2 3 4 5 -> New value = 0 into index = 2 then result 1 2 0 3 4 5
     * Exp_1 5 4 3 2 1 -> New value = 6 into index = 6 then result 5 4 3 2 1 0 6
     */
    public void set(int index, int value)
    {
        if ( index < 0 )        {
            System.out.println("The specified index is out of bounds ");
            return;
        }

        if (index < lengthOfMass - 1)
        {
            for (int i = lengthOfMass - 1; i > index; i--)        {
                mass[i] = mass[i-1];
            }
        }
        else
        {
            int diff = Math.abs(index - (lengthOfMass - 1) );
            for (int i = 0; i < diff; i++)
            {
                arrayUp();
            }
        }
        mass[index] = value;
    }

    /*
     * Summary
     * This method return value from array     *
     */
    public int get(int index)
    {
        if (index < 0 || index > lengthOfMass)        {
            System.out.println("The specified index is out of bounds ");
            return -1;
        }
        return mass[index];
    }

    /*
     * Summary
     * This method deletes the selected item
     * Deletion happens by shifting the array to the place of the selected element.
     * After that, the free memory is released
     */
    public void delete(int index)
    {
        if (index < 0 || index > lengthOfMass)        {
            System.out.println("The specified index is out of bounds ");
            return;
        }


        for (int i = index; i < lengthOfMass - 1; i++)        {
            mass[i] = mass[i+1];
        }
        arrayDown();

    }

}
