package Level0.FizzBuzz;
/*
task: if a number is divisible by 3, return 'Fizz'.
if a number is divisible by 5, return 'Buzz'.
If divisible by both, return 'FizzBuzz'.
 */
public class FizzBuzz {
    public String FizzBuzzGen(int n) {

        String f = "Fizz";
        String b = "Buzz";

        if ((n % 3 == 0) && (n % 5 == 0)){
            return f + b;
        }

        if (n % 3 == 0){
            return f;
        }

        if (n % 5 == 0){
            return b;
        }

        return "";
    }

}
