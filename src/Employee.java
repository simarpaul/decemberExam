/*******************************************************
 * Name:        Simarpaul Singh
 * Class:       CS30S
 * 
 * Assignment:  December Exam Employee
 * 
 * Description: 
 **********************************************************************/

// import statements go here
import java.util.Scanner;
import javax.swing.JOptionPane;

// import libraries as needed here

public class Employee {
    
    // *** Class Variables **
    
    public static int nextID = 1000;           // starts employee id at 0
    
    //*** Instance Variables **
    
    private double employWage = 0.0;        // employee wage
    private double hoursWorked = 0.0;       // hours worked
    private double grossPay = 0.0;          // gross pay
    public int ID = 0;                      // employee id
    private double otPay = 0.0;
    private double regPay = 0.0;
    
    //*** Constructors ***
    /*****************************************
    * Description: Creates a ID for employee
    * 
    * @param ID -> double, assigns employ id number 
    * 
    * @return no return   
    * ****************************************/
    public Employee(){

        employWage = 0.0;
        hoursWorked = 0.0;
        grossPay = 0.0;
        nextID = 0;
    }
     /*****************************************
     /*****************************************
    * Description:
    * 
    * ****************************************/
    
    public Employee(double w, double hW, double gP, int nextID){
        ID = nextID++;          // specialized employ id
        employWage = w;         // employ wage
        hoursWorked = hW;       // hours worked
        grossPay = gP;          // gross pay

    }
    
    /*****************************************
    * //*** Getters ***
    * /*****************************************
    * Description: 
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public int getID(){
        
        return this.nextID;
    }
            
     /*****************************************
    * Description: 
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public double getEmployWage(double employWage){
        return this.employWage;
    }
    
    
    /*****************************************
    * Description:
    * 
    * @param 
    * 
    * @return   
    * ****************************************/
    public double getHoursWorked(){
    
        return this.hoursWorked;
    
    }
       
    /*****************************************
    * Description:
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public double getGrossPay(){
        return this.grossPay;
    }
     /*****************************************
    * Description:
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public double calculateRegHours(double hoursWorked, double employWage){
        
        return this.hoursWorked * employWage;
    }
    /*****************************************
    * Description:
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public double calculatePay(double hoursWorked, double employWage){
      
        if(hoursWorked <= 40)
            regPay = hoursWorked * employWage;
        
            else
            otPay = hoursWorked - (hoursWorked - 40) * 1.5;
            
        return this.otPay + regPay;
    }
    
    //*** Setters ***
    /*****************************************
    * Description: 
    * 
    * @param employWage  
    * 
    * @return  
    * ****************************************/
    public void EmployWage(double employWage){
       
        //return this.employWage;
    }
    
    /*****************************************
    * Description: takes on value of new fuel economy
    * 
    * @param  
    * 
    * ****************************************/
    public void hoursWorked(){
        
    }
     /*****************************************
    * Description:
    * 
    * @param 
    *  
    * ****************************************/
    public void grossPay(){
         
    }
      
  
} // end of public class