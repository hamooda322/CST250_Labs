public class Main {

    public static int mySort ( int[] inputArray, int n){
        int[] myArray = {3, 22, 26, 48};
        int sum= 0;

        int arraySize = inputArray.length;
        for (int i = 0; i < arraySize - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (inputArray[j] < inputArray[index]){
                    index = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[index];
            inputArray[index] = temp;
        }

    return 0;}
}