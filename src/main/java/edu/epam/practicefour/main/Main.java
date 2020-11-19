package edu.epam.practicefour.main;

import edu.epam.practicefour.entity.NumberArray;
import edu.epam.practicefour.reader.InputReader;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        NumberArray numbers = inputReader.numbersFromConsole();
        System.out.println(numbers);
        numbers = inputReader.numbersFromFile("C://wat/test.txt");
        System.out.println(numbers);
    }
}
