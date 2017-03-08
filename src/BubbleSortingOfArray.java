

public class BubbleSortingOfArray {
    public static void main(String[] args) {

        arr = new int[10];


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > arr [i + 1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            break;
            }
        }

        }
    }
}
