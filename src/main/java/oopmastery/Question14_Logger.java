package oopmastery;

public class Question14_Logger {

    private static Question14_Logger instance;

    private Question14_Logger() {
        // TODO:
        // Prevent external instantiation
    }

    public static Question14_Logger getInstance() {
        // TODO:
        // Create the instance if it
        // does not exist yet
        //
        // Return the same instance
        // every time
        return null;
    }

    public String log(
            String message
    ) {
        // TODO:
        // Return:
        // "LOG: " + message
        return "";
    }
}