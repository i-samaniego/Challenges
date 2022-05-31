package Level0.ArraySum;
/*
task: return the sum of all values in int array.
 */


public class ArraySum {
    public int sum(int[] arr) {

        int sum = 0;
        int i;

        for( i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

}