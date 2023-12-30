package logger;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel==DEBUG) {
            System.out.print("DEBUG: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
