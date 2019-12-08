/*******************************************************
 * Name:        Simarpaul Singh
 * Class:       CS30S
 * 
 * Assignment:  December Exam Employee Payroll
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
    
        final int MAXSIZE = 10; // maxsize of array
        
    // ********** declaration of variables **********

        String strin;               // string data input from keyboard
        String strout;              // processed info string to be output
        String bannerOut;		// string to print banner to message dialogs
        String aInfo = "December Exam";  // name of assignment to be printed in banners

        String prompt;              // prompt for use in input dialogs

        String delim = "[ :]+";     // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();     // new line character for file writing
        
        Employee employees[] = new Employee[MAXSIZE]; // array with objects of employee        
        int actualSize = 0;
       
    // ***** create objects *******
        
        DecimalFormat df = new DecimalFormat("0.000");
        
        Employee e1 = new Employee();	   
    
        programInfo Programclass= new programInfo();    // creates an object for output banners and closing messages
        
        BufferedReader fin = new BufferedReader(new FileReader("employeeDecemberExamData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        programInfo.printBanner(aInfo);     // print banner
      
        programInfo.windowBanner(aInfo);   // print banner
        
        programInfo.fileBanner(fout,aInfo);    // print banner to output file
	    	
       // ************************ processing ***************************
                    
            strin = fin.readLine();             // reads line from data file
            //System.out.println(strin);
            while (strin != null){              // start while loop
      
            tokens = strin.split(delim);     
            
            //System.out.println("Employee " + Employee.nextID);
            
            employees[actualSize] = new Employee(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));    // data is parsed from data file into array
            
            System.out.println(employees[actualSize].toString());
            
            actualSize++;                                          // counts numbers
           
            //System.out.println(employees[actualSize].toString);
            
            strin = fin.readLine();                               //update statement
           
            }
       
            //e1.EmployWage(w);
            //e1.hoursWorked(hW);
            //System.out.println(Arrays.toString(employees));
         
           
            
            //System.out.println("Employee " + Employee.nextID);
            //System.out.println(Employee);

    // ************************ print output ****************************
    
    // ******** closing message *********
    
        programInfo.printEnd();             // print closing messages to console window
        programInfo.printEndFile(fout);     // print closing messages to output file
        
    // ***** close streams *****
    
        fout.close();               // close output stream
        
       // ********************** static methods **************************
      
        
    }  // end main
}  // end class