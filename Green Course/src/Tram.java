import java.util.Scanner;

public class Tram {
    /** https://codeforces.com/problemset/problem/116/A*/
    public static int tram(int n){
        Scanner sc = new Scanner(System.in);
        int in, out, passengers = 0, max = 0;
        for(int i = 0; i < n; i++){
            out = sc.nextInt();
            in = sc.nextInt();
            passengers -= out;
            passengers += in;
            if(max <= passengers){
                max = passengers;
            }
        }
        return max;
    }



}
