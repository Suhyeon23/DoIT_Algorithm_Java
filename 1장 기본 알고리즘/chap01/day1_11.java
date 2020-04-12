import java.util.Scanner;
class day1_11 {
//양의 정수를 입력받아, 자릿수를 출력하는 프로그램
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n=0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n=stdin.nextInt();
		}while(n<=0);
		
		int no=0;
		while(n>0) {
			n=n/10;
			no++;
		}	
		System.out.println("그 수는 "+no+"자리입니다.");
		}
}
