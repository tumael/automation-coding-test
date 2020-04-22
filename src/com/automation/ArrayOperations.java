package com.automation;

public class ArrayOperations {

    /**
     * Method that verify if two consecutive numbers are equals to another number passed as parameter.
     *
     * @param array
     * @param n
     * @return true if adds the consecutive numbers equals to number, otherwise false.
     */
    public static boolean isEqualsTo(int[] array, int n) {
        boolean result = false;

        if (array.length != 0) {
            int index = 0;
            while (index < array.length - 1 && !result) {
                if (array[index] + array [index + 1] == n) {
                    result = true;
                }

                index ++;
            }
        }

        return result;
    }
}
