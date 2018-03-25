import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ReportMaker {
    public static void makeReportPDF(String str) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("Z:/1.txt");
        pw.println(str);
        pw.close();
    }
}
