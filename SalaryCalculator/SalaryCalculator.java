/**
  * This class contains methods that perform various calculations about 
  * an individual's salary.
**/
public class SalaryCalculator {                         
   
   private int workingWeeksPerYear;
   private int monthsPerYear;

   public SalaryCalculator (){
       //TODO: initialize workingWeeksPerYear to 50, monthsPerYear to 12.
   workingWeeksPerYear = 50;
   monthsPerYear = 12;
   }
   
   /* TODO: Implement this method.
    * This method calculates and returns the annual (yearly) salary based on an hourly wage
    * and the hours worked per week.
    */
   public double calculateAnnualSalary(double hourlyWage, double hoursPerWeek){
        return hourlyWage * hoursPerWeek * workingWeeksPerYear;
   }

   /* TODO: Implement this method.
    * This method calculates and returns the monthly salary based on an hourly wage
    * and the hours worked per week.
    */   
   public double calculateMonthlySalary(double hourlyWage, double hoursPerWeek){
        return hourlyWage * hoursPerWeek * workingWeeksPerYear / monthsPerYear;
   }
   
}

