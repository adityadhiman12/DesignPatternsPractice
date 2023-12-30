package logger;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel==ERROR) {
            System.out.print("ERROR: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
