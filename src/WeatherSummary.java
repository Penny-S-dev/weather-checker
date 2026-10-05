import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!

        //import temps file and set up scanner to read through each double
        File tempFile = new File("temps");
        try(java.util.Scanner tempScan = new Scanner(tempFile)){
            while(tempScan.hasNextDouble()){
                double temp = tempScan.nextDouble();
                System.out.println(temp);
            }
        } catch(FileNotFoundException e){
            System.out.println("Error.");
        }
    }
}
