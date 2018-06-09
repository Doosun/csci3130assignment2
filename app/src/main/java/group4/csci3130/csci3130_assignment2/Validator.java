package group4.csci3130.csci3130_assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private String password;

    public Validator(String inPassword) {
        password = inPassword;
    }

    public int validatePassword() {

        int testPassed = 0;

        if (atLeast8Chars()) {
            System.out.println("[" + password + "] it is at least 8 chars, incrementing testPassed");
            testPassed++;
        }

        if (checkIfNotPassword()) {
            System.out.println("[" + password + "] is not password, incrementing testPassed");
            testPassed++;
        }

        if (containsNumbers()) {
            System.out.println("[" + password + "] contains numbers, incrementing testPassed");
            testPassed++;
        }

        if (containsSpecialCharacters()) {
            System.out.println("[" + password + "] contains special characters, incrementing testPassed");
            testPassed++;
        }

        if (containsUpperAndLowerCase()) {
            System.out.println("[" + password + "] contains UPPER and lower case, incrementing testPassed");
            testPassed++;
        }

        return testPassed;
    }

    private boolean atLeast8Chars() {
        return (password.length() >= 8 );
    }

    private boolean checkIfNotPassword() {
        return (! password.equals("password"));
    }

    private boolean containsNumbers() {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(password);
        // return true if number is found
        return m.find();
    }

    private boolean containsSpecialCharacters() {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);
        // return true if special character is found
        return m.find();
    }

    private boolean containsUpperAndLowerCase() {
        return (containsLowerCase() && containsUpperCase());
    }

    private boolean containsUpperCase() {
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(password);
        // return true if upper case is found
        return m.find();
    }

    private boolean containsLowerCase() {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(password);
        // return true if lower case is found
        return m.find();
    }

}
