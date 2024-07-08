/**
 * https://vjudge.net/problem/UVA-12100
 * */
package MidTerm;

import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCase = scanner.nextInt();
        for(int i = 0; i < numOfCase; i++){
            scanner.nextLine();
            int numOfJob = scanner.nextInt();
            int myJobIndex = scanner.nextInt();
            int myJobPriority = 0;
            scanner.nextLine();
            Queue<int[]> jobPriorityQueue = new LinkedList<>();
            int max = 0;
            int maxIndex = 0;
            for(int j = 0; j < numOfJob; j++){
                int priority = scanner.nextInt();
                if(max < priority){
                    max = priority;
                    maxIndex = j;
                }
                if(myJobIndex == j){
                    myJobPriority = priority;
                }
                jobPriorityQueue.add(new int[]{j, priority});
            }
            int[] maxInQueue = new int[]{maxIndex, max};
            int[] myJob = new int[] {myJobIndex, myJobPriority};
            ArrayList<int[]> list = new ArrayList<>();
            while (jobPriorityQueue.peek() != maxInQueue){
                list.add(jobPriorityQueue.poll());
            }
            jobPriorityQueue.addAll(list);

            int count = 0;
            for(int k = 0; k < jobPriorityQueue.size(); k++){
                if(k != myJob[0]){
                    jobPriorityQueue.poll();
                    count++;
                }
            }
            System.out.println(count + 1);
        }
    }
}
