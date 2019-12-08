/*******************************************************
 * Name:        Simarpaul Singh
 * Class:       CS30S
 * 
 * Assignment:  December Exam Employee Payroll
 * 
 * Description: Class file which creates and manages employee object
 **********************************************************************/

// import libraries as needed here

public class Employee {
    
    // *** Class Variables **
    
    public static int nextID = 1000;       // starts employee id at 1000
    
    //*** Instance Variables **
    
    double employWage = 0.0;                // employee wage
    private double hoursWorked = 0;         // hours worked
    private int ID = 0;                     // employee id
    private double regPay = 0.0;            // regular pay
    private double otPay = 0.0;             // overtime pay
    private double grossPay = 0.0;          // gross pay
    
    //*** Constructors ***
    /*****************************************
    * Description: Creates employee object, default constructor
    * 
    * @return no return   
    * ****************************************/
    public Employee(){ // start

        ID = nextID++;
        hoursWorked = 0;
        employWage = 0.0;
       
    } // end
    
     /*****************************************
     /*****************************************
    * Description: Creates employee object, initializing constructor
    * 
    * @param hW -> hours worked
    * @param w -> wage
    * 
    * ****************************************/
    public Employee(double hW, double w){ // start
       
        ID = nextID++;          // specialized employ id
        hoursWorked = hW;       // hours worked
        employWage = w;         // employ wage

    } // end
    
    /*****************************************
    * //*** Getters ***
    * /*****************************************
    * Description: Gets employee id
    * 
    * @return ID -> employees id
    * ****************************************/
    public int getID(){ // start
        
        return this.ID;
    } // end
            
     /*****************************************
    * Description: Gets employee wage
    * 
    * @return employWage -> employees wage per hour
    * ****************************************/
    public double getEmployWage(){ // start
        
        return this.employWage;
    } // end
   
    /*****************************************
    * Description: Gets employees hours worked
    * 
    * @return hoursWorked -> total hours worked by employee
    * ****************************************/
    public double getHoursWorked(){ // start
    
        return this.hoursWorked;
    
    } // end
       
     /*****************************************
    * Description: Calculate regular pay
    * 
    * @return regPay -> employees total pay for hours less than or equal to 40
    * ****************************************/
    public double calculateRegHours(){ // start
       
        if (hoursWorked <= 40){ // start if
            
            regPay = hoursWorked * employWage;
        }  // end if
        
        else { // start else
            
            regPay = ((hoursWorked - (hoursWorked - 40)) * employWage);
            
        } // end else
        return this.regPay; // return regular pay
        } // end 
    
    /*****************************************
    * Description: Calculate overtime pay
    * 
    * @return otPay -> employees pay for hours over 40
    * ****************************************/
    public double calculateOTPay(){ // start
      
        if (hoursWorked > 40){ // start if
            
        otPay = (hoursWorked - 40) * (employWage * 1.5);
 
        } // end if
        return this.otPay;
        
        } // end
    
    /*****************************************
    * Description: Calculate gross pay
    * 
    * @return grossPay -> employees gross pay, regular and overtime pay added together
    * ****************************************/
    public double calculateGrossPay(){ // start
        
        grossPay = regPay + otPay;
        
        return this.grossPay;
    } // end
    
    /*****************************************
    * Description: Output data using toString
    * 
    * @return output -> data, including calculations and data from data file along with id
    * ****************************************/
    public String toString(){ // start
         
        String output = "";
        
        output += String.format("%5s          $%-10.2f %5s         $%-10.2f      $%-10.2f     $%-10.2f", 
                getID(), getEmployWage(),getHoursWorked(), calculateRegHours(), calculateOTPay(), 
                calculateGrossPay()); // formats data for output
        
        return output;
    } // end
    
    //*** Setters ***
    /*****************************************
    * Description: sets new value for employee wage
    * 
    * @param eW -> employWage
    * 
    * ****************************************/
    public void setEmployWage(double eW){ // start
       
        employWage += eW;
    } // end
    
    /*****************************************
    * Description: sets new value for hours worked by each individual employee
    * 
    * @param hW -> hoursWorked
    * 
    * ****************************************/
    public void setHoursWorked(double hW){ // start
        
        hoursWorked += hW;
    } // end
    
} // end of public class