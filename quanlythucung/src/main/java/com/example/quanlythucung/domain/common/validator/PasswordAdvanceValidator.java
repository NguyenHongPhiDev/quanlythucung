/**
 * 
 */
package com.example.quanlythucung.domain.common.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Password Advance Validator
 * 
 * @author admin
 *
 */
public class PasswordAdvanceValidator implements ConstraintValidator<PasswordAdvanceConstraint, String> {
    @Override
    public void initialize( PasswordAdvanceConstraint password ) {
    }

    @Override
    public boolean isValid( String passwordField, ConstraintValidatorContext cxt ) {
        return passwordField != null && Constants.REGEX_PASSWORD.matcher(passwordField).matches();
    }
}
