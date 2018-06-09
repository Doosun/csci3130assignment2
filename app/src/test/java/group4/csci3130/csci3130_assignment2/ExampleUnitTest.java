package group4.csci3130.csci3130_assignment2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    // Not needed right now
    /*
    @Before
    public void beforeEachTest() {
        Validator password1 = new Validator();
    }*/


    @Test
    public void passwordTest1() {
        // space is a special character so it will pass that test
        System.out.println("Testing hello World");
        Validator password1 = new Validator("hello world");
        assertEquals(3, password1.validatePassword());
    }

    @Test
    public void password7CharacterTest() {
        System.out.println("Testing 6chars");
        Validator password1 = new Validator("6chars");
        assertEquals(2, password1.validatePassword());
    }

    @Test
    public void passwordIsNotPasswordCaseInsensitiveTest() {
        System.out.println("Testing password");
        Validator password1 = new Validator("password");
        assertEquals(1, password1.validatePassword());
    }

    @Test
    public void passwordContainsSpecialCharacters() {
        System.out.println("Testing specialChar!");
        Validator password1 = new Validator("specialChar!");
        assertEquals(4, password1.validatePassword());
    }

    @Test
    public void verySecurePassword() {
        System.out.println("Testing VerySecurePassword123@@@");
        Validator password1 = new Validator("VerySecurePassword123@@@");
        assertEquals(5, password1.validatePassword());
    }

}