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

        //create variables to track highest and lowest
        double max = 0;
        double min = 0;

        //Add trackers to calculate avg
        double total = 0;
        int count = 0;
        try(java.util.Scanner tempScan = new Scanner(tempFile)){
            while(tempScan.hasNextDouble()){
                double temp = tempScan.nextDouble();
                //set trackers to current if at default value
                if(max == 0){
                    max = temp;
                }
                if(min == 0){
                    min = temp;
                }
                //compare values and update trackers
                if(temp>max){
                    max = temp;
                }
                if(temp<min){
                    min = temp;
                }
                //Add current value to toal and increment count for calculations
                total += temp;
                count++;
            }
        } catch(FileNotFoundException e){
            System.out.println("Error.");
        }
        double avg= total/count;
        //Print results
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Avg: "+avg);
    }
}
