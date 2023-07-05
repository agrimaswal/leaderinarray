//leaders in an array

// Given an array A of positive integers. 
// Your task is to find the leaders in the array. 
// An element of array is leader if it is greater than or equal to all the elements to its right side.
//  The rightmost element is always a leader. 


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class leader {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        // The rightmost element is always a leader.
        int maxRight = 0;
        // Traverse the array from right to left and find the leaders.
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        // Reverse the result to get the leaders in the original order.
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] A = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leadersList = leaders(A, n);
        System.out.println("Leaders in the array:");

        for (int leader : leadersList) {
            System.out.print(leader + " ");
        }
    }
}
