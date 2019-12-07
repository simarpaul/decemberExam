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
    
    double employWage = 0.0;        // employee wage
    private double hoursWorked = 0.0;       // hours worked
    private double grossPay = 0.0;          // gross pay
    public int ID = 0;                      // employee id
    private double otPay = 0.0;
    private double regPay = 0.0;
    
    //*** Constructors ***
    /*****************************************
    * Description: default constructor for employee
    * 
    * @param ID -> double, assigns employ id number 
    * 
    * @return no return   
    * ****************************************/
    public Employee(){

        nextID = 1000;
        employWage = 0.0;
        hoursWorked = 0.0;

    }
     /*****************************************
     /*****************************************
    * Description: initializes Employee
    * 
    * ****************************************/
    
    public Employee(double hW, double w){
       
        ID = nextID++;          // specialized employ id
        employWage = w;         // employ wage
        hoursWorked = hW;       // hours worked

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
    public double calculateRegHours(double hoursWorked, double employWage){
       
        if(hoursWorked % 40 == hoursWorked)
            regPay = hoursWorked * employWage;
        
          //  else
            
           // regPay = hoursWorked - (hoursWorked - 40) * 1.5;
          
        return this.regPay;
    } // end
    /*****************************************
    * Description:
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public double calculateOTPay(double hoursWorked, double employWage){
      
        if (hoursWorked % 40 != hoursWorked)
        otPay = hoursWorked % 40 * (employWage * 1.5);
        
        return this.otPay;
    
                } // end
    /*****************************************
    * Description: 
    * 
    * Interface:
    * 
    * @return
    * ****************************************/
    public double toString(double calculatePay){
         
        double output = employWage +
                        hoursWorked +
                        grossPay +
                        ID +
                        regPay +
                        otPay;
        return output;
    }
    
    //*** Setters ***
    /*****************************************
    * Description: 
    * 
    * @param employWage  
    * 
    * @return  
    * ****************************************/
    public void EmployWage(double eW){
       
        employWage += eW;
    }
    
    /*****************************************
    * Description: takes on value of new fuel economy
    * 
    * @param  
    * 
    * ****************************************/
    public void hoursWorked(){
        
    }
} // end of public class