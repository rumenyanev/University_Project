package validators;

import constants.ErrorsConstants;

public class Validator {
    public static void invalidName(String string) {
        if (string == null || string.trim().isEmpty() || string.length() < 2) {
            throw new IllegalArgumentException(ErrorsConstants.INVALID_NAME);
        }
    }

    public static void invalidAge(int age) {
        if (age < 18 || age > 99) {
            throw new IllegalArgumentException(ErrorsConstants.INVALID_AGE);
        }
    }
}




