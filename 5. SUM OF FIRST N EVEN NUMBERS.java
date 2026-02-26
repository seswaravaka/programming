/**
PROBLEM: SUM OF FIRST N EVEN NUMBERS
----------------------------------------------------------------
DEFINITION:
   Given a positive integer 'n', calculate the total sum of the 
   first 'n' even natural numbers (starting from 2).

MATHEMATICAL LOGIC:
   - Sequence: 2, 4, 6, 8, ..., 2n
   - Iterative Approach: 
     Initialize sum = 0. 
     Loop from i = 1 to n: 
        sum = sum + (2 * i)
   
   - Formulaic Approach:
     Sum = n * (n + 1)

EXAMPLE (n=4):
   - First 4 even numbers: 2, 4, 6, 8
   - Calculation: 2 + 4 + 6 + 8 = 20
   - Verification (Formula): 4 * (4 + 1) = 20

CONSTRAINTS:
   - Input: Non-negative integer n.
   - For n = 0, the sum is 0.
   - For very large n, the sum may exceed the 32-bit integer
     limit (2,147,483,647), so use a 64-bit 'long'.
**/
public class Main {
  public static void main(String[] arg){
    Main m = new Main();
    System.out.println(m.sum(5));
    System.out.println(m.sum(10));
  }
  public int sum(int n){
      
  }
}
