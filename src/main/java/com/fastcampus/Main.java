package com.fastcampus;

import com.fastcampus.logic.BubleSort;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BubleSort<String> sort = new BubleSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}