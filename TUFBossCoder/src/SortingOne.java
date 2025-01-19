public class SortingOne {

    public int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            boolean isSwapped = false;
            for(int j =0; j< n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swaping.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false) return arr;
        }
        return arr;
    }


    
}
