import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, f , arr));
    }

    private static int solution(int n, int f, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        while(lt <= rt) {
            int mid = (lt + rt)/2;
            if(arr[mid] == f) {
                answer = mid + 1;
                break;
            }

            if(arr[mid] > f) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }
}
