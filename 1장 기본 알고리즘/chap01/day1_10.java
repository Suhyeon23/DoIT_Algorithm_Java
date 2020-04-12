import java.util.Scanner;
class day1_10 {
//a,b 변수에 정수를 입력받고,b-a를 출력하는 프로그램(b<=a일 경우,b의 값 다시 입력받기)
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = stdin.nextInt();
		System.out.print("b의 값 : ");
		int b = stdin.nextInt();
		do {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값 : ");
			b = stdin.nextInt();
		}while(b<=a);
		int sub = b-a;
		System.out.println("b-a="+sub);
		}
}
