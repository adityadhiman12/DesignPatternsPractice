import logger.DebugLogProcessor;
import logger.ErrorLogProcessor;
import logger.InfoLogProcessor;
import logger.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "Exception happened");
        logObject.log(LogProcessor.DEBUG, "Need to debug this");
        logObject.log(LogProcessor.INFO, "Just for ino");
    }
}
