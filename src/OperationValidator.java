public class OperationValidator {
    public static void validate(String działanie) {
        if (działanie.trim().length()>1 &&
        !działanie.trim().matches("/[+,-,*/]/g"))
         // jeżeli warunek jest spełniony rzucamy wyjątek
        throw new UnsupportedOperationException(
                "To nie jest znak działania matematycznego!");
    }

    // ctrl + k        commit
}
