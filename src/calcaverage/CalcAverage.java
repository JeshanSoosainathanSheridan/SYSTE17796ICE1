/*
 * Jeshan Soosainathan
 * Student ID: 991589846
 * Software Design
 */
package calcaverage;

/**
 *
 * @author Jesha
 */
public class CalcAverage {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Double[] grades = {1.25,-5.25,5.0,5.4,5.5,3.3,2.1,4.2,-1.2,3.2};
       
       for (Double grade : grades) {
           
           
       }
       
       
    }
    
    
    public double calcAvg(Double[] grades) {
        double result = 0;
        
        for (Double grade : grades) {
            
            if (grade >=0) {
                
                result+=grade;
            }
          
        }
         
            result/=grades.length;
        return result;
    }
}
