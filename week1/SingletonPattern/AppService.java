public class AppService {
    private final ILogger logger;

    public AppService(ILogger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.log("Application is running...");
        logger.log("Performing some business logic.");
    }
}
