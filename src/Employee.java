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
    public Employee(double w, double hW){
       
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
    public double calculateGrossPay(double regPay, double otPay){
        
        grossPay = regPay + otPay;
        
        return this.grossPay;
    }
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
                        ID +
                        regPay +
                        otPay +
                        grossPay; 
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
    public void employWage(double eW){
       
        employWage += eW;
    }
    
    /*****************************************
    * Description: takes on value of new fuel economy
    * 
    * @param  
    * 
    * ****************************************/
    public void hoursWorked(double hW){
        
        hoursWorked += hW;
    }
} // end of public class