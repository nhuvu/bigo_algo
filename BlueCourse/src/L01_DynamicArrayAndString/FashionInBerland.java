/**
 * https://codeforces.com/problemset/problem/691/A
 * */
package L01_DynamicArrayAndString;

import java.util.ArrayList;
import java.util.Scanner;

public class FashionInBerland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            arr.add(scanner.nextInt());
        }
        boolean isValid = valid(arr);
        if(isValid == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean valid(ArrayList<Integer> arr){
        int count = 0;
        if(arr.size() == 1){
            if(arr.get(0) == 1){
                return true;
            }
            return false;
        } else {
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) == 0){
                    count++;
                    if(count > 1){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
