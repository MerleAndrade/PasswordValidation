import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void passwordLength(){
        //Given
        String password= "neuefische";
        //When
        int result = PasswordValidation.PasswordLength(password);
        //Then
        Assertions.assertEquals(10,result);
    }

    @Test
    void numbersIncludedNo(){
        //Given
        String password= "neueFische";
        //When
        boolean result = PasswordValidation.NumbersIncluded(password);
        //Then
        Assertions.assertEquals(false,result);
    }

    @Test
    void numbersIncludedYes(){
        //Given
        String password= "neueFische1";
        //When
        boolean result = PasswordValidation.NumbersIncluded(password);
        //Then
        Assertions.assertEquals(true,result);
    }

    @Test
    void containUpperCasesNo(){
        //Given
        String password= "neuefische";
        //When
        boolean result = PasswordValidation.ContainUpperCase(password);
        //Then
        Assertions.assertEquals(false,result);
    }

    @Test
    void containUpperCasesYes(){
        //Given
        String password= "neueFische";
        //When
        boolean result = PasswordValidation.ContainUpperCase(password);
        //Then
        Assertions.assertEquals(true, result);
    }

    @Test
    void passCheck1(){
        //Given
        String password= "neu";
        //When
        boolean result = PasswordValidation.PassCheck(password);
        //Then
        Assertions.assertEquals(false, result);
    }

    @Test
    void passCheck2(){
        //Given
        String password= "12345";
        //When
        boolean result = PasswordValidation.PassCheck(password);
        //Then
        Assertions.assertEquals(false, result);
    }
    @Test
    void passCheck3(){
        //Given
        String password= "n1";
        //When
        boolean result = PasswordValidation.PassCheck(password);
        //Then
        Assertions.assertEquals(false, result);
    }
    @Test
    void passCheck4(){
        //Given
        String password= "neueFische1911";
        //When
        boolean result = PasswordValidation.PassCheck(password);
        //Then
        Assertions.assertEquals(true, result);
    }
}