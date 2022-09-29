import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "src/data.txt";
        new NumberExtractorReport().prepareAndSendReport(path);
        System.out.println();
        new EmailExtractorReport().prepareAndSendReport(path);
    }

}