package L01_DynamicArrayAndString;

import java.util.ArrayList;
import java.util.Scanner;

public class BigSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Segment> segments = new ArrayList<>();
        for(int i = 0; i < n; i++){
            scanner.nextLine();
            Segment s = new Segment(scanner.nextInt(), scanner.nextInt());
            segments.add(s);
        }
        System.out.println(indexOfBiggestSegment(segments));

    }

    public static int indexOfBiggestSegment(ArrayList<Segment> segments){
        int minBorder = minBorder(segments);
        int maxBorder = maxBorder(segments);
        for(int i = 0; i < segments.size(); i++){
            if(segments.get(i).start == minBorder && segments.get(i).end == maxBorder){
                return i + 1;
            }
        }
        return -1;
    }

    public static int minBorder(ArrayList<Segment> segments){
        int min = segments.get(0).start;
        for(Segment s : segments){
            if(min >= s.start){
                min = s.start;
            }
        }
        return min;
    }

    public static int maxBorder(ArrayList<Segment> segments){
        int max = segments.get(0).end;
        for(Segment s : segments){
            if(max <= s.end){
                max = s.end;
            }
        }
        return max;
    }

}

class Segment{
    int start;
    int end;
    public Segment(int a, int b){
        this.start = a;
        this.end = b;
    }
}
