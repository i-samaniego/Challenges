package Level0.FizzBuzz;
/*
task: if a number is divisible by 3, return 'Fizz'.
if a number is divisible by 5, return 'Buzz'.
If divisible by both, return 'FizzBuzz'.
 */
public class FizzBuzz {
    public String FizzBuzzGen(int n) {
<<<<<<< HEAD
        int result = 0;
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else {
            return "";
        }
    }
=======

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

>>>>>>> d3396f2d5f2610a6d9026a38e3d364bbc9ab3ec9
}
