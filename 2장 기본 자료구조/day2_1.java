package day2;
import java.util.Random;

// 배열 요소의 최댓값을 나타냅니다(값을 난수로 생성).
// +키 값 뿐만 아니라 사람수도 난수로 생성
class day2_1 {
	// 배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = 1+rand.nextInt(10);			//배열의 요솟수를 1~10 중 랜덤하게 설정

		int[] height = new int[num];			// 요솟수가 num인 배열을 생성

		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);		// 요소의 값을 난수로 결정
			System.out.println("height[" + i + "]：" + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}