package edu.epam.practicefour.reader;
import edu.epam.practicefour.constants.Constants;
import edu.epam.practicefour.entity.NumberArray;
import edu.epam.practicefour.validator.InputValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {

    private String [] readLine(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
         return line.split("\\s+");
    }

    public NumberArray numbersFromConsole(){
        String [] numbers = readLine();
        InputValidator inputValidator = new InputValidator();
        NumberArray numberArray = new NumberArray();
        for (String number: numbers ) {
            if(inputValidator.isNumber(number)) {
                int num = Integer.parseInt(number);
                numberArray.add(num);
            }
        }
        return numberArray;
    }

    private List<String> readFromFile(String path){
        ArrayList<String> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                numbers.add(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public NumberArray numbersFromFile(String path){
        NumberArray numberArray = new NumberArray();
        ArrayList<String> data = (ArrayList<String>) readFromFile(path);
        for (String line: data) {
            String [] numbers = line.split("\\s+");
            for (String number: numbers) {
                if (number.matches(Constants.NUMBER_REGEX)){
                    int num = Integer.parseInt(number);
                    numberArray.add(num);
                }
            }
        }
        return numberArray;
    }

}
