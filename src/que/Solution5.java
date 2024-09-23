package que;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        //큐에다 1부터 N꺼지 넣자
        for (int i = 1; i <= N ; i++) {
            queue.add(i);
        }
        //카드가 큐에 한장남을때 까지 반복
        while (queue.size()>1){
            if (queue(K))
            for (int i = 0; i <K-1 ; i++) {
                queue.offer(queue.poll());
            }
            queue.poll(); // 첫장버리세요.
             // 맨앞장 카드 뽑아서 뒤어 붙이세요
        }
        System.out.println(queue.poll());
    }
}
