package com.anderscore.sort;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CsvSorter {

    public static void main(String[] args) throws IOException {
        readCSVFile();
        // System.out.println(Arrays.toString(args));
    }

    public static void writeCSVFile(List<Integer> numbers) throws IOException {
        try (FileWriter file = new FileWriter("outputFile.csv");
             BufferedWriter writer = new BufferedWriter(file);) {

            for (Integer number : numbers) {
                writer.write(number + System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readCSVFile() throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (FileReader file = new FileReader("inputFile.csv");
             BufferedReader buffer = new BufferedReader(file);) {

            String str;

            while ((str = buffer.readLine()) != null) {
                numbers.add(Integer.parseInt(str));
            }
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(numbers);
        // numbers nicht richtig sortiert.

        System.out.println(numbers);

        writeCSVFile(numbers);

    }
}
