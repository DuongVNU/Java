package Tuan_4;

public class maxArrayInt {

    public static int maxArrayInt(int[] arr) {
        int size = arr.length, temp = arr[0];

        for (int i = 1; i < size; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }


}
