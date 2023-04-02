package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TestEmailValidator {

    @Test
    public void testValidEmail() {
        assertTrue(EmailValidator.checkEmail("john.doe123@example.com"));
    }

    @Test
    public void testInvalidEmailNoUsername() {
        assertFalse(EmailValidator.checkEmail("@example.com"));
    }

    @Test
    public void testInvalidEmailNoDomain() {
        assertFalse(EmailValidator.checkEmail("john.doe123@"));
    }

    @Test
    public void testInvalidEmailSingleDomainLevel() {
        assertFalse(EmailValidator.checkEmail("john.doe123@example"));
    }

    @Test
    public void testInvalidEmailInvalidCharacters() {
        assertFalse(EmailValidator.checkEmail("john.doe123@example#com"));
    }

    @Test
    public void testInvalidEmailSingleLetterTopLevelDomain() {
        assertFalse(EmailValidator.checkEmail("john.doe123@example.a"));
    }

    @Test
    public void testInvalidEmailFirstNotLetter() {
        assertFalse(EmailValidator.checkEmail("1john.doe123@example.com"));
    }
}