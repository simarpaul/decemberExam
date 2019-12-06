/*******************************************************
 * Name:        Simarpaul Singh
 * Class:       CS30S
 * 
 * Assignment:  December Exam
 * 
 * Description: 
 * 
 **********************************************************************/

// import statements go here
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class decemberExam {
    public static void main(String[] args) throws IOException{
    // ********** declaration of constants **********
    
        final int employeeNum = 10;
        
    // ********** declaration of variables **********

        String strin;               // string data input from keyboard
        String strout;              // processed info string to be output
        String bannerOut;		// string to print banner to message dialogs
        String aInfo = "December Exam";  // name of assignment to be printed in banners

        String prompt;              // prompt for use in input dialogs

        String delim = "[ :]+";     // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        
        int[] employees = new int[employeeNum];
        
        int actualSize = 0;
        
        int i = 0;
        
        // new line character for file writing
    	
    // ***** create objects *******
        
        DecimalFormat df = new DecimalFormat("0.000");
        
        Employee = new Employee();

        //Employee employee2 = new Employee();	   
    
        programInfo Programclass= new programInfo();    // creates an object for output banners and closing messages
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        programInfo.printBanner(aInfo);     // print banner
      
        programInfo.windowBanner(aInfo);   // print banner
        
        programInfo.fileBanner(fout,aInfo);    // print banner to output file
	    	
       // ************************ processing ***************************
            
            strin = fin.readLine();             // reads line from data file
        
            while (strin != null){              // start while loop
      
            tokens = strin.split(delim);     
               
            employees[employeeNum] = Integer.parseInt(tokens[i]);     // data is parsed from data file into array
            actualSize ++;                                          // counts numbers
           
            //System.out.println(tokens[i]);                        // test to see if numbers are read
            }
         
            strin = fin.readLine();  //update statement
         
        System.out.println("Employee" + Employee.ID);
        System.out.println("Car 1 fuel level: " + df.format(Employee.employWage) + " litres");

        System.out.println("\n\nCar 2");
        /*
        System.out.println("Car 2 fuel Level: " + df.format(car2.getFuelLevel()) + " litres");
        
        System.out.println("Car 2 fuel economy: " + df.format(car2.getKPL()) + " km per 100l");
        System.out.println("Car 2 distance to empty: " + df.format(car2.getDistance()) + " kilometers");

        // *** change the state of car 1 ***

        car1.gasUp(28);
        car1.setKPL(10.5);

        System.out.println("\n\nCar 1");
        System.out.println("Car 1 fuel level: " + df.format(car1.getFuelLevel()) + " litres");
        System.out.println("Car 1 fuel economy: " + df.format(car1.getKPL()) + " km per 100l");
        System.out.println("Car 1 distance to empty: " + df.format(car1.getDistance()) + " kilometers");

        car1.drive(100);		// drive 100km in car 1

        System.out.println("\n\nCar 1 after driving 100km");
        System.out.println("Car 1 fuel level: " + df.format(car1.getFuelLevel()) + " litres");
        System.out.println("Car 1 distance to empty: " + df.format(car1.getDistance()) + " kilometers");

*/
    // ************************ print output ****************************
    
    // ******** closing message *********
    
        programInfo.printEnd();             // print closing messages to console window
        programInfo.printEndFile(fout);     // print closing messages to output file
        
    // ***** close streams *****
    
        fout.close();               // close output stream
        
       // ********************** static methods **************************
      
        
    }  // end main
}  // end class