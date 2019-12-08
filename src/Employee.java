/*******************************************************
 * Name:        Simarpaul Singh
 * Class:       CS30S
 * 
 * Assignment:  December Exam Employee Payroll
 * 
 * Description: 
 **********************************************************************/

// import libraries as needed here

public class Employee {
    
    // *** Class Variables **
    
    public static int nextID = 1000;           // starts employee id at 0
    
    //*** Instance Variables **
    
    double employWage = 0.0;        // employee wage
    private double hoursWorked = 0;       // hours worked
    private int ID = 0;                      // employee id
    private double regPay = 0.0;            // regular pay
    private double otPay = 0.0;             // overtime pay
    private double grossPay = 0.0;          // gross pay
    
    //*** Constructors ***
    /*****************************************
    * Description: Creates employee object
    * 
    * @param
    * 
    * @return no return   
    * ****************************************/
    public Employee(){

        ID = nextID++;
        hoursWorked = 0;
        employWage = 0.0;
       
    }
    
     /*****************************************
     /*****************************************
    * Description: initializes Employee
    * 
    * @param w
    * @param hW
    * 
    * ****************************************/
    public Employee(double hW, double w){
       
        ID = nextID++;          // specialized employ id
        hoursWorked = hW;       // hours worked
        employWage = w;         // employ wage

    }
    
    /*****************************************
    * //*** Getters ***
    * /*****************************************
    * Description: 
    * 
    * @return ID
    * ****************************************/
    public int getID(){
        
        return this.ID;
    }
            
     /*****************************************
    * Description: 
    * 
    * @return employWage
    * ****************************************/
    public double getEmployWage(){
        
        return this.employWage;
    }
    
    
    /*****************************************
    * Description:
    * 
    * @param 
    * 
    * @return hoursWorked
    * ****************************************/
    public double getHoursWorked(){
    
        return this.hoursWorked;
    
    }
       
     /*****************************************
    * Description: Calculate regular pay
    * 
    * @return regPay
    * ****************************************/
    public double calculateRegHours(){
       
        if (hoursWorked <= 40){ // start if
            regPay = hoursWorked * employWage;
        }  // end if
        else
            regPay = ((hoursWorked - (hoursWorked - 40)) * employWage);
        
        return this.regPay; // return regular pay
        } // end 
    
    /*****************************************
    * Description: Calculate overtime pay
    * 
    * @return otPay
    * ****************************************/
    public double calculateOTPay(){
      
        if (hoursWorked > 40){ // start if
            
        otPay = (hoursWorked - 40) * (employWage * 1.5);
 
        } // end if
        return this.otPay;
    
                } // end
    /*****************************************
    * Description: Calculate gross pay
    * 
    * Interface:
    * 
    * @return grossPay
    * ****************************************/
    public double calculateGrossPay(){
        
        grossPay = regPay + otPay;
        
        return this.grossPay;
    }
    /*****************************************
    * Description: 
    * 
    * Interface:
    * 
    * @return output -> data; including calculations and data from data file along with id
    * ****************************************/
    public String toString(){
         
        String output = "";
        
        output += String.format("%5s          $%-10.2f %5s         $%-10.2f      $%-10.2f     $%-10.2f", 
                getID(), getEmployWage(),getHoursWorked(), calculateRegHours(), calculateOTPay(), 
                calculateGrossPay()); 
        
        return output;
    }
    
    //*** Setters ***
    /*****************************************
    * Description: 
    * 
    * @param eW
    * 
    * @return  
    * ****************************************/
    public void employWage(double eW){
       
        employWage += eW;
    }
    
    /*****************************************
    * Description: 
    * 
    * @param  
    * 
    * ****************************************/
    public void hoursWorked(double hW){
        
        hoursWorked += hW;
    }
} // end of public class