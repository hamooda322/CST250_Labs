public class Main {

        public static int mySearch ( int[] inputArray, int n){
            int[] myArray = {3, 22, 26, 48};
            int sum = 0;

            int key = 0;

            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == key) {
                    return i;
                }
            }
            return -1;

        }
    }