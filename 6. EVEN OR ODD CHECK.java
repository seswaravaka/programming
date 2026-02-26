/**
EVEN OR ODD CHECK
----------------------------------------------------------------
DEFINITION:
   Given an integer 'n', determine whether the number is "Even" 
   or "Odd".

MATHEMATICAL LOGIC:
   - Even Number: Any integer that is exactly divisible by 2.
   - Odd Number: Any integer that has a remainder of 1 when 
     divided by 2.

COMPUTATIONAL LOGIC:
   - Use the Modulo Operator (%). 
   - If (n % 2 == 0), then the number is EVEN.
   - Else, the number is ODD.

EXAMPLE (n=7):
   - Calculation: 7 / 2 = 3 with a remainder of 1.
   - Condition: (7 % 2 == 1)
   - Result: ODD

**/
public class Main {
  public static void main(String[] arg){
    Main m = new Main();
    System.out.println(m.isEven(5));
    System.out.println(m.isEven(10));
  }
  public boolean isEven(int n){
      
  }
}
