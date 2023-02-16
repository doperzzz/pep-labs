
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int start = arr1.length;
        int end = arr2.length;

        int[] bigArray = new int[start + end];
        System.arraycopy(arr1, 0, bigArray, 0, start);  
        System.arraycopy(arr2, 0, bigArray, start, end);  

        return bigArray;
    }
}
