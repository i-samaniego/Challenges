package Level0.IsSorted;
//true if array sorted, false otherwise.
public class IsSorted {
    public boolean checkSort(int[] arr){
        boolean result = true;
        for (int i =0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                result = false;
            }
        }
        return result;
    }
}
