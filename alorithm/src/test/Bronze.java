package test;

import java.util.ArrayList;
import java.util.Scanner;


/*	
 
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	}
}
 */
public class Bronze {
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		num1546();
	}
	
	public static void test1() {
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
	
	public static void question1() {
		
	    // 숫자의 개수 N 을 입력 받음.
	    int N = sc.nextInt();
	    
	    // N개의 숫자를 String으로 받음.
	    String input = sc.next();
	    
	    int sum = 0;
	    /*
	        배열 array를 만듬.
	        반복문을 돌려주셔서 input 을 charAt()으로 array에 하나 하나 담음
	        담은 후 array를 반복문을 돌려서 하나하나 인트로 만들어서 더함.
	        그 후 sum 해가지고 출력
	    */
	    
	    for(int i = 0; i < N; i++){
	        sum += input.charAt(i)-'0';  //1234 '1'
	    }
	    
	    System.out.println(sum);
	}

	public static void num1546() {
		/* 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

			예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
			
			세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		 */
		
		/* 1. size 입력 받아서 그 수 만큼 입력 받기
		 * 2. 배열 arr에 입력받은 수들 넣기
		 * 3. arr에 담으면서 가장큰 변수 max와 비교하여 max 값 설정
		 * 4. arr에서 하나 하나 꺼내면서 값 / max * 100 을 해주면서 sum에 더해주기
		 * 5. sum / size 로 결과값 출력
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
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
