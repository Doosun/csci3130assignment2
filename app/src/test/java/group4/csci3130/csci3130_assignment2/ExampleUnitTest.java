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
        System.out.println("Testing hello World");
        Validator password1 = new Validator("hello world");
        assertEquals(2, password1.validatePassword());
    }

    @Test
    public void password7CharacterTest() {
        System.out.println("Testing 6chars");
        Validator password1 = new Validator("6chars");
        assertEquals(1, password1.validatePassword());
    }

    @Test
    public void passwordIsNotPasswordCaseInsensitiveTest() {
        System.out.println("Testing password");
        Validator password1 = new Validator("password");
        assertEquals(1, password1.validatePassword());
    }

}