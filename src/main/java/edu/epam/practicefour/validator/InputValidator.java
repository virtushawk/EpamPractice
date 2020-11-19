package edu.epam.practicefour.validator;

import edu.epam.practicefour.constants.Constants;

public class InputValidator {

    public boolean isNumber(String number) {
        return number.matches(Constants.NUMBER_REGEX);
    }
}
