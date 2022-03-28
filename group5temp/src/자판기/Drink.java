package 자판기;

import java.util.ArrayList;

public class Drink{
	
	// 모든 스레드에서 사용하기 위해 변수를 static으로 선언
	static int 자금 = 10000 ;
	static int 콜라 = 0 ;
	static int 사이다 = 0 ;
	static int 환타 = 0 ;
	static int 레드불 = 0 ;
	static long 시작시간 ; // 게임시작시 시작시간을 저장
	static int 시간차이 = 1 ; // 시간차이체크 메소드를 이용하여 게임 경과시간을 수치로 나타냄 (5초당 1씩증가)
	static int 경고횟수 = 0 ; // 게임종료조건을 만들기 위함
	static ArrayList<String> 메시지 = new ArrayList<>(); // 반복출력으로 인해 메시지 사라짐을 방지하기위해 리스트화 하여 리스트자리를 지정해놓고 출력
	
	
	public static void main(String[] args) { // 메시지 인덱스에 공백 넣고 추가
		for(int i = 1 ; i <=5 ; i++) { // 이작업을 수행하지 않을경우 게임시작시 0,1,2,3,4 인덱스에 null상태라 .get 접근연산자 사용불가
			메시지.add(" "); 
		}
		
		Controller.시작화면출력(); // 오프닝 화면 출력메소드
		
		
		Btn buttons = new Btn(); // 버튼객체 생성
	    buttons.showButton(); // 버튼 생성
		
	    시작시간 = System.currentTimeMillis(); // 시작시간 저장
		TimeCheck timecheck = new TimeCheck(); // 시간 체크 객체 생성
		Music 배경음악 = new Music("배경음악.mp3",true); // 배경음악재생 객체 생성
		Buy buy1 = new Buy("콜라"); // 컴퓨터 콜라 구매 객체 생성
		Buy buy2 = new Buy("환타"); // 컴퓨터 환타 구매 객체 생성
		Buy buy3 = new Buy("사이다"); // 컴퓨터 사이다 구매 객체 생성
		Buy buy4 = new Buy("레드불"); // 컴퓨터 레드불 구매 객체 생성


		배경음악.start();	// 배경음악재생 스레드 시작 (thread 1)
		timecheck.start(); // 시간체크 스레드 시작 (thread 2)
		buy1.start(); // 컴퓨터 콜라 구매 스레드 시작 (thread 3)
		buy2.start(); // 컴퓨터 환타 구매 스레드 시작 (thread 4)
		buy3.start(); // 컴퓨터 사이다 구매 스레드 시작 (thread 5)
		buy4.start(); // 컴퓨터 레드불 구매 스레드 시작 (thread 6)
		Controller.화면출력메소드(); // 화면출력메소드 while 무한루프 (main thread)

		
		
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");
		System.out.println("Game Over");

	}
		
}
