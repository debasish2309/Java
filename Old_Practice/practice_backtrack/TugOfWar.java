package Java.practice_backtrack;

import java.util.ArrayList;

public class TugOfWar {

    static int midiff = Integer.MAX_VALUE;
    static String ans = "";

    public static void solve(int arr[], int vidz,ArrayList<Integer> set1,ArrayList<Integer> set2,int soset1,int soset2) {

        if(vidz == arr.length){
            int delta = Math.abs(soset1 -soset2);
            if(delta < midiff) {
                midiff = delta;
                ans = set1 + " "+ set2;
            }
            return;
        }

        if(set1.size() < (arr.length + 1) /2) {
            set1.add(arr[vidz]);
            solve(arr, vidz + 1, set1, set2, soset1 + arr[vidz] , soset2);
            set1.remove(set1.size() -1);
        }

        if(set2.size() < (arr.length + 1) / 2) {
            set2.add(arr[vidz]);
            solve(arr, vidz + 1, set1, set2, soset1, soset2 + arr[vidz]);
             set2.remove(set2.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
        System.out.println(ans);
    }
    
}
