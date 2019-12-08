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
    private double grossPay = 0.0;          // gross pay
    private int ID = 0;                      // employee id
    private double otPay = 0.0;
    private double regPay = 0.0;
    
    //*** Constructors ***
    /*****************************************
    * Description: default constructor for employee
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
    * Interface:
    * 
    * @return
    * ****************************************/
    public int getID(){
        
        return this.ID;
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
    * Description: Calculate over time pay
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
    * Description: Calculate grossPay
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
        
        output += (employWage , hoursWorked , ID ,calculateRegHours() 
                , calculateOTPay() , calculateGrossPay()); 
        
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