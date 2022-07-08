package Level0.Average;
//Task: return the average of an array of ints as a double.
public class Average {
    public double getAvg(int[] nums){

        double sum = 0;


        int i = 0;

        while(i < nums.length){
            sum += nums[i];
            i++;
        }

        double avg = (sum/nums.length);

        return avg;
    }


}
