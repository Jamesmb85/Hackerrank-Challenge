import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
//@Override
class MyCalculator implements AdvancedArithmetic{    
    //need to find the Divisors of the number
    //need to store those numbers into a list
    //then need to add the numbers in that list
    int divisors = 0; //start sum of the divisors to be 0
    public int divisor_sum(int n) {
       for(int i = 1; i <= n; i++){
           if(n % i == 0){
               //during first iteration if n%1 == 0, then add i to divisors
               divisors += i;
           }
       }
        return divisors;
    }
}


class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}