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
			
			//2. 배열 arr에 입력받은 수들 넣기
			arr.add(num);
			
			//3. arr에 담으면서 가장큰 변수 max와 비교하여 max 값 설정
			if(num > max) {
				max = num;
			}
		}
		
		for(int i = 0; i < size; i++) {
			// 4. arr에서 하나 하나 꺼내면서 값 / max * 100 을 해주면서 sum에 더해주기
			sum += (double)(arr.get(i)) / max * 100;
		}
		//5. sum / size 로 결과값 출력
		System.out.println(sum / size);
	}
}