import java.util.Scanner;
class day1_14 {
//입력한 수를 한 변으로하는 정사각형을 *기호로 출력하는 프로그램
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		int n=0;
		do {
			System.out.print("단 수 : ");
			n=stdin.nextInt();
		}while(n<=0);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print("*");	
			}
			System.out.println(" ");
		}
		}
}
