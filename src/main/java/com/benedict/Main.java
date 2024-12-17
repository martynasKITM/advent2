package com.benedict;

import com.benedict.utilities.FileOperations;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer[]> data = FileOperations.readData("data.txt");

        for (Integer[] array : data) {
            System.out.println(Arrays.toString(array));
        }
    }
}
