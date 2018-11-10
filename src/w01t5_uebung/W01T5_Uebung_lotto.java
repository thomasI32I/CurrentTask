package w01t5_uebung;

public class W01T5_Uebung_lotto {

    public static void main(String[] args) {

        //generate array
        int[] array = fillArray();

        //sort array
        array = sortArray(array);
        //print array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Value of array with index %d: %d%n", i, array[i]);
        }
    }

    public static int[] fillArray() {
        int[] numberArray = new int[6];

        for (int i = 0; i < numberArray.length; i++) {

            boolean generateNumber;
            int randomNumber;
            do {
                generateNumber = false;
                randomNumber = (int) (Math.random() * 49 + 1);

                for (int j = 0; j < i; j++) {
                    if (numberArray[j] == randomNumber) { //random number already exists
                        generateNumber = true;
                        break;
                    }
                }
            } while (generateNumber);

            numberArray[i] = randomNumber; // fill array
        }

        return numberArray;
    }

    /**
     * Sorting with bubble sort.
     *
     * @param array
     * @return
     */
    public static int[] sortArray(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int temp;
                if (array[j] < array[j+1]) {
                    //change values
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        return array;
    }
}
