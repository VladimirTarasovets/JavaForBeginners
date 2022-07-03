package findMinElemInArr;

public class FindMinElemInArr {
    public static void main(String[] args) {

        int [] array = new int[] {3, 15, 8, 20, 0, -6, 241, 55, 45, 11, 99};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Min value = " + minValue);
        System.out.println("Min index = " + minIndex);

    }

}
