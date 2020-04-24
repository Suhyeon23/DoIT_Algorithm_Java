package day3;
import java.util.Scanner;
//어떤 값을 갖는 배열 안의 모든 요소를 다른 배열에 복사함

class day3_3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int i=0;
		int count = 0;
		
		for(i=0;i<n;i++) {
			if(a[i]==key) {
				idx[count]=i;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = std.nextInt();
		int x[] = new int[num];
		int y[] = new int[num];
		
		for(int i=0;i<num;i++) {
		System.out.print("x["+i+"]=");
		x[i] = std.nextInt();
		}
		
		System.out.print("찾는 값:");
		int ky = std.nextInt();
		
		int kyNum = searchIdx(x,num,ky,y);
		if(kyNum==0)
			System.out.print("일치하는 값이 없습니다.");
		else {
			for(int i=0;i<kyNum;i++)
			System.out.println("그 값은 x["+y[i]+"]에 있습니다.");
		}
	}
}
	