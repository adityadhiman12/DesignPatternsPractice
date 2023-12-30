package logger;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel==INFO) {
            System.out.print("INFO: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
