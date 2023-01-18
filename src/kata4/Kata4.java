package kata4;

import java.io.File;
import java.util.List;
import kata4.Histogram;

public class Kata4 {

    public static void main(String[] args) {
        Loader loader = new EmailLoader(new FileLoader(new File("emails.txt")));
        Histogram<String> histogram = new Histogram<String>();
        List<String> emails = loader.load();
        for (String email : emails) {
            histogram.increment(email);
            
        }

        HistogramDisplay histogramDisplay = new HistogramDisplay("Histograma",
                histogram);
        histogramDisplay.execute();
    }
    
}
