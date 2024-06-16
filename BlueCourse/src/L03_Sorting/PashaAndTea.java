/**
 * https://codeforces.com/problemset/problem/557/B
 * */
package L03_Sorting;

import java.util.*;

public class PashaAndTea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfFriends = scanner.nextInt();
        int potCapacity = scanner.nextInt();
        ArrayList<Integer> cupsCapacity = new ArrayList<>();
        scanner.nextLine();
        for(int i = 0; i < numOfFriends * 2; i++){
            cupsCapacity.add(scanner.nextInt());
        }

        //sort cupsCapacity in descending order
        cupsCapacity.sort((Comparator.reverseOrder()));

        /**
         * solve the problem as a normal math, we have:
         *- call maxBoyCapacity = capacity of boy's cup expect (to get max potCapacity)
         *- equation: (maxBoyCapacity * numOfFriends) + (maxBoyCapacity/2 * numOfFriends) <= potCapacity
         *- solve the equation, we have: maxBoyCapacity ~ ((potCapacity/numOfFriends)*2/3)
         * */
        double maxBoyCapacity = (double) (potCapacity*2) / (numOfFriends*3);

        //compare maxBoyCapacity with the capacity of last boy's cup (min capacity between boys)
        maxBoyCapacity = Math.min(maxBoyCapacity, cupsCapacity.get(numOfFriends - 1));
        double maxGirlCapacity = maxBoyCapacity/2;
        maxGirlCapacity = Math.min(maxGirlCapacity, cupsCapacity.get(numOfFriends * 2 - 1));
        if(maxGirlCapacity == cupsCapacity.get(numOfFriends * 2 - 1)){
            maxBoyCapacity = maxGirlCapacity * 2;
        }

        double ans = maxBoyCapacity * numOfFriends + maxGirlCapacity * numOfFriends;
        if(ans >= potCapacity){
            System.out.println(potCapacity);
        }else {
            System.out.println(ans);
        }
    }
}
