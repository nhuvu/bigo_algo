/**
 https://codeforces.com/problemset/problem/673/a
 * **/
package L01_DynamicArrayAndString;

import java.util.ArrayList;
import java.util.Scanner;
public class BearAndGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> minutes = new ArrayList<>();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            minutes.add(scanner.nextInt());
        }
        System.out.println(numberOfMinutes(minutes));
    }

    public static int numberOfMinutes(ArrayList<Integer> minutes){
        int moment = minutes.get(0);
        if(moment > 15){
            return 15;
        } else {
            if(minutes.size() == 1){
                return moment + 15;
            } else {
                if(moment + 15 < minutes.get(1)){
                    return moment + 15;
                } else {
                    for(int i = 1; i < minutes.size(); i++){
                        if((minutes.get(i) - minutes.get(i-1)) <= 15){
                            moment = minutes.get(i) + 15;
                        }else {
                            return moment;
                        }
                    }
                }
            }
        }
        if(moment >= 90){
            return 90;
        } else {
            return moment;
        }
    }
}
