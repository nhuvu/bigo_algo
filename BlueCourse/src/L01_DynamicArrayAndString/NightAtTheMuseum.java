package L01_DynamicArrayAndString;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countRotation(s.toCharArray()));
    }

    public static int countRotation(char[] chars){
        int current = 97;
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            int rightRotation;
            int leftRotation;
            if(current < (int) chars[i]){
                rightRotation = Math.abs((int) chars[i] - current);
                leftRotation = (current + 26) - (int) chars[i];
                if(rightRotation <= leftRotation){
                    count+=rightRotation;
                } else {
                    count+=leftRotation;
                }
            }else {
                rightRotation = Math.abs(current - (int) chars[i]);
                leftRotation = ((int) chars[i] + 26) - current;
                if(rightRotation <= leftRotation){
                    count+=rightRotation;
                } else {
                    count+=leftRotation;
                }
            }
            current = (int) chars[i];
        }
        return count;
    }
}
