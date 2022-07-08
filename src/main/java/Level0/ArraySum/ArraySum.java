package Level0.ArraySum;
/*
task: return the sum of all values in int array.
 */


public class ArraySum {
<<<<<<< HEAD
    public int sum(int[] arr){

        int result =0;

        for(int i=0; i< arr.length; i++){
            result = result +arr[i];
        }

        return result;
=======
    public int sum(int[] arr) {

        int sum = 0;
        int i;

        for( i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
>>>>>>> d3396f2d5f2610a6d9026a38e3d364bbc9ab3ec9
    }

}