class day1_15 {
	//직각 이등변 삼각형을 출력하는 메서드 작성 (직각 부분 - 1.왼쪽 위, 2.오른쪽 위, 3.오른쪽 아래)
		//1.왼쪽 위 직각
		static void triangleLU(int n) {
			for(int i=1;i<=n;i++){
				for(int j=n;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
		//2.오른쪽 위 직각
		static void triangleRU(int n) {
			for(int i=1;i<=n;i++){
				for(int j=n;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println("");
				for(int k=1;k<=i;k++) {
				System.out.print(" ");
				}
			}
		}
		//3.오른쪽 아래 직각
		static void triangleRB(int n) {
			for(int i=1;i<=n;i++){
				for(int j=n;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
				System.out.print("*");
				}
				System.out.println("");
			}
		}
		public static void main(String[] args) {
			triangleLU(5);
			System.out.println(" ");
			triangleRU(5);
			System.out.println(" ");
			triangleRB(5);
		}
	}
