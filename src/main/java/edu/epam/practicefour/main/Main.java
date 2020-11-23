package edu.epam.practicefour.main;

import edu.epam.practicefour.entity.NumberArray;
import edu.epam.practicefour.reader.InputReader;
import edu.epam.practicefour.service.NumberRandom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        NumberRandom numberRandom = new NumberRandom();
        NumberArray numbers = inputReader.numbersFromFile("C://wat/test.txt");
        logger.info( "From file : {}",numbers);
        numbers = numberRandom.randomArray(5);
        logger.info("Random : {}",numbers);
    }
}
