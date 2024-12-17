package com.benedict;

import com.benedict.utilities.FileOperations;
import java.util.List;

public class Main {
    public static String checkReport(Integer[] report){
        if (report.length < 2) {
            return "Not Safe";
        }
        boolean isIncreasing = report[1] > report[0];

        for (int i = 0; i < report.length - 1; i++) {
            int levelDiff = Math.abs(report[i + 1] - report[i]);

            if (levelDiff < 1 || levelDiff > 3) {
                return "Not Safe";
            }


            if ((isIncreasing && report[i + 1] <= report[i]) ||
                    (!isIncreasing && report[i + 1] >= report[i])) {
                return "Not Safe";
            }
        }


        return "Safe";
    }


    public static void main(String[] args) {
        List<Integer[]> data = FileOperations.readData("data.txt");

        for (Integer[] array : data) {
            System.out.println(checkReport(array));
        }
    }
}
