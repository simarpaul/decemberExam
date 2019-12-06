
import java.io.PrintWriter;
/*******************************************************
 * Name:        Simarpaul Singh
 * Class:       CS30S
 * 
 * Assignment:  ProgramInfo
 * 
 * Description: program to print output banners and closing messages to console
 *              window and output file
 **********************************************************************/
public class programInfo {
           
/***********************************************************
    *   Purpose: Create a banner string that can be used to 
    *           print the banner to a message dialog or the console
    *           window
    *   @param aInfo
    *   Returns:    no return
    * **************************************************************/
    public static String windowBanner(String aInfo){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		Simarpaul Singh\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	" + aInfo;
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end bannerOut

    /***********************************************************
    *   Purpose: print a banner to the console window
    *   @param aInfo
    *   Returns:    no return
    * **************************************************************/    
    public static void printBanner(String aInfo){
    	System.out.println("*******************************************");
    	System.out.println("Name:		Simarpaul Singh");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:	" + aInfo);
    	System.out.println("*******************************************");        
    } // end print banner
 
    /***********************************************************
    *   Purpose: prints a banner to the output file
    *   Interface:  print writer fout
    *   @param fout
    *   @param aInfo
    *   Returns:    no return
    * **************************************************************/
    public static void fileBanner(PrintWriter fout, String aInfo){
     	fout.println("*******************************************");
    	fout.println("Name:		Simarpaul Singh");
    	fout.println("Class:		CS30S");
    	fout.println("Assignment:	" + aInfo);
    	fout.println("*******************************************");       
    } // end bannerOut
    
    /***********************************************************
    *   Purpose: output closing messages

    *   Returns:    no return
    * **************************************************************/
    public static void printEnd(){
        System.out.println("End of Processing");
    }
    
    /***********************************************************
    *   Purpose: output closing messages to output file
    *   Interface print writer fout
    *   @param PrintWriter
    *   @param fout
    *   Returns:    no return
    * **************************************************************/
    public static void printEndFile(PrintWriter fout){
        fout.println("End of Processing");
    }
} // end of public class
