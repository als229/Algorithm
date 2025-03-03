import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);

		// 1. size 입력 받아서 그 수 만큼 입력 받기
		int size = sc.nextInt();
		
		double sum = 0;
		int max = 0;
		
        for(int i = 1; i <= size; i++) {
            int num = sc.nextInt();

            sum += num;

            if(num > max) {
                max = num;
            }
		}
		
		System.out.println(sum * 100 / max / size);
	}
}