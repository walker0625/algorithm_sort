import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CheckDup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n ,arr));
    }

    private static char solution(int n, int[] arr) {
        char answer = 'U';

        // 1 N
        HashSet s = new HashSet();

        for (int x : arr) {
            s.add(x);
        }

        if(s.size() != n) {
            answer = 'D';
        }

        // 2 LogN
        Arrays.sort(arr);

        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                answer = 'D';
            }
        }

        return answer;
    }
}
