package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidAge;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidAgeValidator implements ConstraintValidator<ValidAge, Byte> {

    @Override
    public void initialize(ValidAge constraintAnotation) {
        ConstraintValidator.super.initialize(constraintAnotation);
    }

    @Override
    public boolean isValid(Byte value, ConstraintValidatorContext context) {

        
        if (value == null) {
            return false;
        }

        if (value <= 18) {
            return false;
        }
        
        return true;
    }

}
