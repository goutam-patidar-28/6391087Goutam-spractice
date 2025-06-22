public class Main {
    public static void main(String[] args) {
        ILogger logger = ConsoleLogger.getInstance();
        AppService app = new AppService(logger);
        app.run();

        ILogger anotherLogger = ConsoleLogger.getInstance();
        if (logger == anotherLogger) {
            System.out.println("Both logger instances are the same (Singleton) ");
        } else {
            System.out.println("Different instances ");
        }
    }
}
