import java.util.Arrays;
public class Algorithm {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {5,3,7,1,4,9,2,8,6};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
       
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
       
    }
    public static void quickSort(int[] numbers, int start, int end){
            if (start >= end) {
                 return;
        }
            int pivot = numbers[end];
            int partitionIndex = partition(numbers, start, end, pivot);
            
             quickSort(numbers, start, partitionIndex - 1);
             quickSort(numbers, partitionIndex + 1, end);
    }
     public static int partition(int[] numbers, int start, int end, int pivot){
            int i = start;
            int j = end - 1;
             
            while (i <= j) {
                while (i <= j && numbers[i] < pivot) {
                    i++;
                }
                while (i <= j && numbers[j] >= pivot) {
            j--;
      }
                if (i <= j) {
                    int temp = numbers[i];
                   numbers[i] = numbers[j];
                  numbers[j] = temp;
                   i++;
                   j--;
                   
                  }
            }
                 numbers[end] = numbers[i];
                    numbers[i] = pivot;
        return i;
        }
}
