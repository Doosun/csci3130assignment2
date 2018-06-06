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
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void passwordTest1() {
        Validator password1 = new Validator("hello world");
    }

    @Test
    public void password7CharacterTest() {
        Validator password1 = new Validator("passwor");
    }

    @Test
    public void passwordIsNotPasswordCaseInsensitiveTest() {
        Validator password1 = new Validator("password");
    }

}