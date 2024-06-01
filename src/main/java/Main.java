// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    System.out.println("These are the available options, select the number to use the math function, \n0 = power, \n1 = square root, \n2 = absolute value, \n3 = round, \n4 = minimum, \n5 = approxMagnitudeCalculator, \n6 = meanCalculator,");
    int switchExpression = keyedInput.nextInt();
    double output = 0;
    switch (switchExpression) {
          case 0:
          {
            System.out.println("You have selected option 0, please enter the base number");
            float base = keyedInput.nextFloat();
            System.out.println("Please enter the exponent number");
            float exponent = keyedInput.nextFloat();
            output = Math.pow(base, exponent);
            break;
            //This is the case for the power function
            // The user is asked to input the base and exponent, and the output is calculated using the Math.pow function
          }
     case 1:
          {
            System.out.println("You have selected option 1, please enter the number you would like to square root");
            float x = keyedInput.nextFloat();
            output = Math.sqrt(x);
            break;
            //This is the case for the square root function
            // The user is asked to input the number they would like to square root, and the output is calculated using the Math.sqrt
          }
     case 2:
          {
            System.out.println("You have selected option 2, please enter the number you would like to find the absolute value of");
            float x = keyedInput.nextFloat();
            output = Math.abs(x);
            break;
            //This is the case for the absolute value function
            //The user is asked to input the number they would like to find the absolute value of, and the output is calculated using the Math.abs
          }
      case 3: 
          {
            System.out.println("You have selected option 3, please enter the number you would like to round");
            float x = keyedInput.nextFloat();
            output = Math.round(x);
            break;
            //This is the case for the round function
            //The user is asked to input the number they would like to round, and the output is calculated using the Math.round
          }
      case 4:
          {
            System.out.println("You have selected option 4, please enter the first number");
            float x = keyedInput.nextFloat();
            System.out.println("Please enter the second number");
            float y = keyedInput.nextFloat();
            output = Math.min(x,y);
            break;
            //This is the case for the minimum function
            //The user is asked to input the first and second number, and the output is calculated using the Math.min
          }
      case 5:
          {
            System.out.println("You have selected option 5, please enter the x component for the magnitudeCalculator");
            float inputXVector = keyedInput.nextFloat(); 
            System.out.println("Enter your y component of the vector: ");
            float inputYVector = keyedInput.nextFloat();
            output = approxMagnitudeCalculator(inputXVector,inputYVector);
            break;
            //This is the case for the approxMagnitudeCalculator function
            //The user is asked to input the x and y components of the vector, and the output is calculated using the approxMagnitudeCalculator
          }
      case 6:
        {
          System.out.println("You have selected option 6, please enter the number you would like to use the mean calculator");
          System.out.println("Enter your a value: ");
          float inputA = keyedInput.nextFloat();
          System.out.println("Enter your b value: ");
          float inputB = keyedInput.nextFloat();
          System.out.println("Enter your c value: ");
          float inputC = keyedInput.nextFloat();
          output = (inputA + inputB + inputC)/3;
          break;
          //This is the case for the meanCalculator function
          //The user is asked to input the a, b, and c values, and the output is calculated using the meanCalculator
          
  
        }
     default:
        System.out.println("Please try again");
        return;
    }
      
    System.out.println("The result is: " + output); 
  }
  //The magnitudeCalculator will calculate the approximate magnitude of a vector which has an x and y component.
  //@param x - the x component of the vector
  //@param y - the y component of the vector
  public static double approxMagnitudeCalculator(float x, float y) {
    return Math.round(Math.sqrt(Math.pow(x,2) + Math.pow(y,2))); 
  }
  public static float approxMin(float x, float y){
    return Math.min(Math.round(x),Math.round(y));
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}