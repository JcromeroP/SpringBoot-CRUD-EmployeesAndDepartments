package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidLastName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidLastNameValidador implements ConstraintValidator<ValidLastName, String> {

    @Override
    public void initialize(ValidLastName constraintAnotation) {
        ConstraintValidator.super.initialize(constraintAnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        // Value cannot be null
        if (value == null) {
            return false;
        }

        // Value cannot be empty
        if (value.isEmpty()) {
            return false;
        }

        // Value cannot be greater than 15
        if (value.length() > 15) {
            return false;
        }

        // Value cannot be less than 15
        if (value.length() < 3) {
            return false;
        }

        // Value should have first character in uppercase
        if (!Character.isUpperCase(value.charAt(0))) {
            return false;
        }

        // Value should not contain numbers
        if (value.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }

}
