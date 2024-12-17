package com.benedict.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperations {

    public static List<Integer[]> readData( String filename){
        List<Integer[]> reports = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine()) !=null){
                String[] arr = line.split(" ");
                Integer[] levels = new Integer[arr.length];
                for(int i = 0; i < arr.length; i++){
                    levels[i] = Integer.parseInt(arr[i]);
                }
                reports.add(levels);
                //System.out.println(Arrays.toString(levels));
            }
        }catch(IOException e){
            System.err.println("error reading file " + e.getMessage());
        }
        return  reports;
    }
}
