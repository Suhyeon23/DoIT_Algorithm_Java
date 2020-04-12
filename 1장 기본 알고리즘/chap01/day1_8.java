import java.util.Scanner;

class day1_8 {
// 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있다. 가우스의 덧셈 방법을 이용하여 1부터 n까지 정수 합을 구하는 프로그램
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n의 값을 입력하세요 : ");
		int n = stdIn.nextInt();
		int sum = 0;
		if(n%2==0)
			sum = (1+n)*n/2;
		else
			sum = (1+n)*(n-1)/2+(n+1)/2;
		System.out.println("1부터 n까지의 합은 "+sum);
		}
}
