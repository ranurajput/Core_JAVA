package com.knoldus.kup.CoreJava.Question2;
import com.knoldus.kup.CoreJava.Main;
public class SortBinaryArray {
    public static void sortArray(int[] b_nums) {
        System.out.println("Sort Binary array of b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 } : ");
        int[] output = new int[b_nums.length];
        int i = 0;
        int j = output.length - 1;
        for (int k = 0; k < b_nums.length; k++) {
            if (b_nums[k] == 0) {
                output[i] = b_nums[k];
                i++;
            } else {
                output[j] = b_nums[k];
                j--;

            }

        }
        for (int k = 0; k < output.length; k++) {
            System.out.print(output[k] + " ");
        }

    }
public static void main (String... args){
    int[] b_nums = {0, 1, 1, 0, 1, 1};
    SortBinaryArray.sortArray(b_nums);

}
}
