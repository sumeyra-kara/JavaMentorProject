package day41_javaExirce;

import java.util.*;

public class C01_SumOfThree {
    public static void main(String[] args) {

        int [] array = {-1, 0, 1, 2, -1, -4, 2 , 3 , 4 , -3};

        System.out.println(threeSum(array));

    }
    // Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
    // Find all unique triplets in the array which gives the sum of zero.

    // Note: The solution set must not contain duplicate triplets.

    // For example, given array S = [-1, 0, 1, 2, -1, -4],

    // A solution set is:
    // [
    //   [-1, 0, 1]
    //   [-1, -1, 2]
    // ]

    public static Set<List<Integer>> threeSum(int [] nums){

        Set<List<Integer>> resultSet = new HashSet<>();
        if (nums.length<3){
            return resultSet;
        }
        int length = nums.length;
        for (int i = 0; i <length-2 ; i++) {
            for (int j = i+1; j < length-1; j++) {
                for (int k = j+1; k < length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0){
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);
                        Collections.sort(tempList);
                        resultSet.add(tempList);
                    }
                }
            }
        }

        return resultSet;
    }


}
