package group4.csci3130.csci3130_assignment2;

public class Validator {
    public String password;

    public Validator(String inPassword) {
        password = inPassword;
    }

    public int validatePassword() {
        int testPassed = 0;
        if (atLeast8Chars(password)) {
            System.out.println("[" + password + "] it is at least 8 chars, incrementing testPassed");
            testPassed++;
        }

        if (checkIfNotPassword(password)) {
            System.out.println("[" + password + "] is not password, incrementing testPassed");
            testPassed++;
        }
        return testPassed;
    }

    private boolean atLeast8Chars(String inPassword) {
        if (inPassword.length() >= 8 ) {
            return true;
        }
        return false;
    }

    private boolean checkIfNotPassword(String inPassword) {
        if (inPassword.equals("password")) {
            return false;
        }
        return true;
    }
}
