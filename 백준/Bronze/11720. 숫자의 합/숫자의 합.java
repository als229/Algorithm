import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
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
}