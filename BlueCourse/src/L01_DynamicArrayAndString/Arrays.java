/**
 https://codeforces.com/problemset/problem/691/A
 * */
package L01_DynamicArrayAndString;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //size array A & B
        int sizeA = scanner.nextInt();
        int sizeB = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        scanner.nextLine();
        //number of elements from A & B
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < sizeA; i++){
            A.add(scanner.nextInt());
        }
        scanner.nextLine();
        for(int i = 0; i < sizeB; i++){
            B.add(scanner.nextInt());
        }

        boolean isValid = isValid(A,B,k,m);
        if(isValid){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //Method to check if any existence of group of
    // all k elements from array a less than all m element from array b
    public static boolean isValid(ArrayList<Integer> a, ArrayList<Integer> b, int k, int m){
        boolean flag = true;
        //Case 1: Check if min A > max B -> false
        if(a.get(0) >= b.get(b.size() - 1)){
            flag = false;
        }

        //Case 2: k = A.size or k < m -> check if max A > all m elements of B (duyệt ngược)
        if(k == a.size()){
            int maxA = a.get(a.size() - 1);
            for(int i = b.size() - 1; i > (b.size() - m); i--){
                if(maxA >= b.get(i)){
                    flag = false;
                }
            }for(int i = 0; i < k; i++){
                for(int j = b.size() - 1; j > (b.size() - m); j--){
                    if(a.get(i) >= b.get(j)){
                        flag = false;
                        break;
                    }
                }
            }
        }

        //Case 3: m = B.size -> check if min B < all k element of A (duyệt xuôi)
        if(m == b.size()){
            int minB = b.get(0);
            for(int i = 0; i < k; i++){
                if(minB <= a.get(i)){
                    flag = false;
                }
            }
        }

        //Case 4: A = B, k=m=A.size
        if(a.size() == b.size() && k == a.size() && k == m){
            boolean diff = false;
            for(int i = 0; i < k; i++){
                if(!Objects.equals(a.get(i), b.get(i))){
                    diff = true;
                    break;
                }
            }
            if(diff == false){
                flag = false;
            }
        }

        //Case 5: duyệt xuôi A, k element; duyệt ngược B, m element -> max A >= min B -> false
        if(a.get(k-1) >= b.get(b.size() - m)){
            flag = false;
        }
        return flag;
    }

}
