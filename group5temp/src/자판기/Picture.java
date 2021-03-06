package 자판기;

import java.text.DecimalFormat;

public class Picture {
	
	public static void cls() { // 반복문으로 빈공간 밀어내서 움직이는것처럼 표현하기 위한 반복문 출력메소드
		for(int i = 1 ; i <= 60; i++) { // 60줄 출력 반복문
			System.out.println();
		}
	}
	
	 public static void 시작화면() {
		 	for(int i = 1 ; i <= 34 ; i++) {
		 		System.out.println();
		 	}
			System.out.println("\t\t\t┌─────────────────────────┐");
			System.out.println("\t\t\t│         화면조정글씨        │");
			System.out.println("\t\t\t└─────────────────────────┘");
			System.out.println("\t\t콘솔창을 최대화 해주시고 화면조정글씨 박스가 깨지지 않도록 화면을 확대해주세요");
			System.out.println(); //콘솔창을 알맞은 사이즈로 조절하도록 하는 장치 
			System.out.println();
			
			System.out.println("\t\t\t********* 자판기 게임 *********");
			System.out.println("\t\t\t     자판기에 음료수가 모자라서   ");
			System.out.println("\t\t\t     판매하지 못하면 경고입니다   ");
			System.out.println("\t\t\t         잘 채워주세요!        ");
			System.out.println("\t\t\t*****************************");

	 }
	
	public static void 화면출력메소드() { // 화면 출력 메소드
		DecimalFormat df = new DecimalFormat("#,##0"); // 자금 출력형식 설정
		while(true) { // 무한루프 [종료 조건 : 경고횟수 4회이상]
			if(Controller.경고횟수>=4) {  // 경고횟수 4회 이상시 메인 스레드 종료
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // 자판기 글자에 반짝이는 효과 주기위해 2개의 화면으로 프레임 생성
				if(i == 0) {
					cls(); // 화면 밀어내기 메소드
					String money = df.format(Controller.자금); // 자금의 출력형식 설정하여 문자열로 저장
					System.out.println("  ┌────────────────────────────────────────────────────────────┐ ");
					System.out.println("  │                                                            │ ");
					System.out.println("  │     □□□□□□□□□□   □       □□□□□□□□   □     □□□□□□□□   □     │ ");
					System.out.println("  │         □□       □         □  □     □□□          □   □     │ ");
					System.out.println("  │         □□       □         □  □     □           □    □     │ ");
					System.out.println("  │        □  □      □□□     □□□□□□□□   □          □     □     │ ");
					System.out.println("  │       □    □     □                            □      □     │        ***********************************");
					System.out.printf ("  │      □      □    □         □                 □       □     │                       알림판                 \n");
					System.out.printf ("  │     □        □   □         □                □        □     │        %-15s 경고 횟수:%s              \n","Level : " + Controller.시간차이,Controller.경고횟수);
					System.out.printf ("  │                  □         □□□□□□□□□□□     □         □     │        %-30s              \n",Controller.메시지.get(4)); // 문자열 인덱스에 저장된 문자 출력
					System.out.printf ("  │                                                            │        %-30s              \n",Controller.메시지.get(3)); // 문자열 인덱스에 저장된 문자 출력
					System.out.printf ("  │                                                            │        %-30s              \n",Controller.메시지.get(2)); // 문자열 인덱스에 저장된 문자 출력
		            System.out.printf ("  │        COLA         FANTA        CIDER      RED BULL       │        %-30s              \n",Controller.메시지.get(1)); // 문자열 인덱스에 저장된 문자 출력
		            System.out.printf ("  │     ┌─────────┐  ┌─────────┐  ┌─────────┐  ┌─────────┐     │        %-30s              \n",Controller.메시지.get(0)); // 문자열 인덱스에 저장된 문자 출력
		            System.out.println("  │     │         │  │ ###     │  │    #    │  │####│    │     │        ***********************************");
		            System.out.println("  │     │COCA COLA│  │  ###    │  │# # # # #│  │####│    │     │ ");
		            System.out.println("  │     │     ####│  │         │  │  # # #  │  │####│    │     │                      현재 자금  ");
		            System.out.println("  │     │####*####│  │ F A N   │  │# # # # #│  │    │####│     │                      " + money);
		            System.out.println("  │     │####*    │  │     T A │  │    #    │  │    │####│     │ ");
		            System.out.println("  │     │         │  │         │  │  CIDER  │  │    │####│     │ ");
					System.out.println("  │     └─────────┘  └─────────┘  └─────────┘  └─────────┘     │                      버튼위치");
					System.out.printf ("  │        %3d          %3d           %3d          %3d         │        ┌─────────────────────────────────┐\n",Controller.콜라,Controller.환타,Controller.사이다,Controller.레드불);	
					System.out.print  ("  │                                                            │        │                                 │\n");
					System.out.print  ("  │                                                            │        │                                 │\n");
					System.out.print  ("  │                                               (|) (─)      │        │                                 │\n");
		            System.out.print  ("  │       ###  ####   ###  #   # ####              #####       │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #   #             #           │        │                                 │\n");
		            System.out.print  ("  │      # ### ####  #   # #   # ####              ####        │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #                     #       │        │                                 │\n");
		            System.out.print  ("  │       #### #   #  ###   ###  #                 ####        │        │                                 │\n");
					System.out.print  ("  │     ┌────────────────────────────────────────────────┐     │        └─────────────────────────────────┘\n");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     └────────────────────────────────────────────────┘     │ ");
					System.out.println("  └────────────────────────────────────────────────────────────┘ ");
				}
				else {
					cls();
					String money = df.format(Controller.자금);
					System.out.println("  ┌────────────────────────────────────────────────────────────┐ ");
					System.out.println("  │                                                            │ ");
					System.out.println("  │     ■■■■■■■■■■   ■       ■■■■■■■■   ■     ■■■■■■■■   ■     │ ");
					System.out.println("  │         ■■       ■         ■  ■     ■■■          ■   ■     │ ");
					System.out.println("  │         ■■       ■         ■  ■     ■           ■    ■     │ ");
					System.out.println("  │        ■  ■      ■■■     ■■■■■■■■   ■          ■     ■     │ ");
					System.out.println("  │       ■    ■     ■                            ■      ■     │        ***********************************");
					System.out.printf ("  │      ■      ■    ■         ■                 ■       ■     │                       알림판                 \n");
					System.out.printf ("  │     ■        ■   ■         ■                ■        ■     │        %-15s 경고 횟수:%s              \n","Level : " + Controller.시간차이,Controller.경고횟수);
					System.out.printf ("  │                  ■         ■■■■■■■■■■■     ■         ■     │        %-30s              \n",Controller.메시지.get(4));
					System.out.printf ("  │                                                            │        %-30s              \n",Controller.메시지.get(3));
					System.out.printf ("  │                                                            │        %-30s              \n",Controller.메시지.get(2));
		            System.out.printf ("  │        COLA         FANTA        CIDER      RED BULL       │        %-30s              \n",Controller.메시지.get(1));
		            System.out.printf ("  │     ┌─────────┐  ┌─────────┐  ┌─────────┐  ┌─────────┐     │        %-30s              \n",Controller.메시지.get(0));
		            System.out.println("  │     │         │  │ ###     │  │    #    │  │####│    │     │        ***********************************");
		            System.out.println("  │     │COCA COLA│  │  ###    │  │# # # # #│  │####│    │     │ ");
		            System.out.println("  │     │     ####│  │         │  │  # # #  │  │####│    │     │                      현재 자금  ");
		            System.out.println("  │     │####*####│  │ F A N   │  │# # # # #│  │    │####│     │                      " + money);
		            System.out.println("  │     │####*    │  │     T A │  │    #    │  │    │####│     │ ");
		            System.out.println("  │     │         │  │         │  │  CIDER  │  │    │####│     │ ");
					System.out.println("  │     └─────────┘  └─────────┘  └─────────┘  └─────────┘     │                      버튼위치");
					System.out.printf ("  │        %3d          %3d           %3d          %3d         │        ┌─────────────────────────────────┐\n",Controller.콜라,Controller.환타,Controller.사이다,Controller.레드불);	
					System.out.print  ("  │                                                            │        │                                 │\n");
					System.out.print  ("  │                                                            │        │                                 │\n");
					System.out.print  ("  │                                               (|) (─)      │        │                                 │\n");
		            System.out.print  ("  │       ###  ####   ###  #   # ####              #####       │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #   #             #           │        │                                 │\n");
		            System.out.print  ("  │      # ### ####  #   # #   # ####              ####        │        │                                 │\n");
		            System.out.print  ("  │      #   # #   # #   # #   # #                     #       │        │                                 │\n");
		            System.out.print  ("  │       #### #   #  ###   ###  #                 ####        │        │                                 │\n");
					System.out.print  ("  │     ┌────────────────────────────────────────────────┐     │        └─────────────────────────────────┘\n");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     │                                                │     │ ");
					System.out.println("  │     └────────────────────────────────────────────────┘     │ ");
					System.out.println("  └────────────────────────────────────────────────────────────┘ ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // 출력메소드 end
	
	public static void 시작카운트() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
			if(i==0) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==1) {			
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t          ▒▒                 ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t                  ▒▒         ");
				System.out.println("\t\t\t                  ▒▒         ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("\t\t\t          ▒▒     ▒▒          ");
				System.out.println("\t\t\t          ▒▒     ▒▒          ");
				System.out.println("\t\t\t          ▒▒     ▒▒          ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t                 ▒▒          ");
				System.out.println("\t\t\t                 ▒▒          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t                  ▒▒         ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t                  ▒▒         ");
				System.out.println("\t\t\t                  ▒▒         ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t                  ▒▒         ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				System.out.println("\t\t\t          ▒▒                 ");
				System.out.println("\t\t\t          ▒▒                 ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("\t\t\t            ▒▒▒▒             ");
				System.out.println("\t\t\t              ▒▒             ");
				System.out.println("\t\t\t              ▒▒             ");
				System.out.println("\t\t\t              ▒▒             ");
				System.out.println("\t\t\t              ▒▒             ");
				System.out.println("\t\t\t          ▒▒▒▒▒▒▒▒▒▒         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}
	
	 public static void gameover() {
	      System.out.println();      
	      System.out.println("   ##########       ######      ####    ####   ############");
	      System.out.println("  ############     ########     #####  #####   ############");
	      System.out.println("  ####    ####   ####    ####   ############   ####");
	      System.out.println("  ###            ####    ####   ##  ####  ##   ############");
	      System.out.println("  ###    #####   ############   ##  ####  ##   ############");
	      System.out.println("  ####      ##   ############   ##  ####  ##   ####");
	      System.out.println("  ############   ####    ####   ##  ####  ##   ############");
	      System.out.println("   ##########    ####    ####   ##  ####  ##   ############");
	      System.out.println();
	      System.out.println("     ######      ####    ####   ############   ##########");
	      System.out.println("   ####  ####    ####    ####   ############   ####  #####");
	      System.out.println("  ####    ####   ####    ####   ####           ###    #####");
	      System.out.println("  ###      ###   ####    ####   ############   ####  #####");
	      System.out.println("  ###      ###   ####    ####   ############   ##########");
	      System.out.println("  ####    ####    ####  ####    ####           ###    ###");
	      System.out.println("   ####  ####      ########     ############   ###     ###");
	      System.out.println("     ######          ####       ############   ###      ###");
	   }
	 
	 public static void 랭크출력() { // 랭크 출력 메소드
		cls();
		System.out.println("\t\t\t---------------- 순위표 ----------------");
		System.out.println("\t\t\t랭킹\t이름\t플레이시간\t코멘트");
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println("\t\t\t"+(i+1)+"\t"+ Controller.랭킹.get(i).getName()+"\t"+ Controller.랭킹.get(i).getPlaytime()+"초\t"+ Controller.랭킹.get(i).getContent());
		}
		System.out.println("\t\t\t---------------------------------------");
	 }

}
