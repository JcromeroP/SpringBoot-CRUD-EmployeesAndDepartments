package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidName;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNameValidador implements ConstraintValidator<ValidName,String>{

    @Override
    public void initialize(ValidName constraintAnotation){
        ConstraintValidator.super.initialize(constraintAnotation);
    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        
        //Value cannot be null
        if (value == null) {
            return false;
        }

        //Value cannot be empty
        if (value.isEmpty()) {
            return false;
        }

        //Value cannot be greater than 15
        if (value.length() > 15) {
            return false; 
        }

        //Value cannot be less than 15
        if (value.length() < 3) {
            return false; 
        }

        //Value should have first character in uppercase
        if (!Character.isUpperCase(value.charAt(0))) {
            return false;
        }

        //Value should not contain numbers
        if (value.matches(".*\\d.*")) {
            return false;
        }


        return true;
    }

}
