package day4;
import java.util.Scanner;
// int형 스택의 사용 예
//+ indexOf, clear, IsEmpty, IsFull 함수 사용 예 추가

class day4_1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	// 최대 64개를 푸시할 수 있는 스택

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
					"(4)덤프　(5)검색　(6)비우기　(7)비어있는지　(8)가득차있는지　(0)종료：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							// 푸시
				System.out.print("데이터：");
				x = stdIn.nextInt();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							// 팝
				try {
			 		x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							// 피크
				try {
			 		x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 덤프
				s.dump();
				break;
				
			 case 5:							// 검색
				 System.out.print("데이터：");
					x = stdIn.nextInt();
					try {			
						System.out.println("검색한 데이터는 스택[" + s.indexOf(x) + "]에 있습니다.");
				 	} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
			 case 6:							// 비우기(스택의 모든 요소 삭제)
				 try {			
						s.clear();
				 	} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				 
			 case 7:							// 비어있는지 검사
				 if(s.isEmpty())
					 System.out.println("스택이 비어있습니다.");
				 else
					 System.out.println("스택이 비어있지 않습니다.");
				 break;
				 
			 case 8:							// 가득차있는지 검사
				 if(s.isFull())
					 System.out.println("스택이 가득차있습니다.");
				 else
					 System.out.println("스택이 가득차있지 않습니다.");
				 break;	
			}
		}
	}
}