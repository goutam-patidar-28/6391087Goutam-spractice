public class ConsoleLogger implements ILogger {

    private static ConsoleLogger instance;

    private ConsoleLogger() {
        System.out.println("ConsoleLogger instance created.");
    }

    public static ConsoleLogger getInstance() {
        if (instance == null) {
            instance = new ConsoleLogger();
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
