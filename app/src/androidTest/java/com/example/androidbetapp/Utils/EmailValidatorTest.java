package com.example.androidbetapp.Utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {

    @Test
    public void emailValidator_EmailSimpleCorrecto_ReturnTrue() {
        assertTrue(EmailValidator.isValidEmail("legomarth@gmail.com"));
    }

    @Test
    public void emailValidator_SubdominioEmailCorrecto_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("carlos.perez@compunet.co.uk"));
    }

    @Test
    public void emailValidator_EmailSinDominioNoValido_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("legomarth@gmail"));
    }

    @Test
    public void emailValidator_EmailInvalidoDosPuntos_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("legomarth@hotmail..com"));
    }

    @Test
    public void emailValidator_EmailInvalidoSinUsuario_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@gmail.com"));
    }

    @Test
    public void emailValidator_StringVacio_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    public void emailValidator_EmailNulo_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null));
    }

    @Test
    public void isValid() {
    }

    @Test
    public void isValidEmail() {
    }

    @Test
    public void afterTextChanged() {
    }
}