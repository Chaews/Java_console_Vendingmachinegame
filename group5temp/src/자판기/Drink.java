package 자판기;

import java.util.ArrayList;
import java.util.Scanner;

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
	static ArrayList<Rank> 랭킹 = new ArrayList<>(); // 랭킹저장 리스트
	
	
	public static void main(String[] args) { // 메시지 인덱스에 공백 넣고 추가
		Scanner scanner = new Scanner(System.in);
		TimeCheck timecheck = new TimeCheck(); // 시간 체크 객체 생성
		Music 배경음악 = new Music("배경음악.mp3",true); // 배경음악재생 객체 생성
		Buy buy1 = new Buy("콜라"); // 컴퓨터 콜라 구매 객체 생성
		Buy buy2 = new Buy("환타"); // 컴퓨터 환타 구매 객체 생성
		Buy buy3 = new Buy("사이다"); // 컴퓨터 사이다 구매 객체 생성
		Buy buy4 = new Buy("레드불"); // 컴퓨터 레드불 구매 객체 생성

		for(int i = 1 ; i <=5 ; i++) { // 이작업을 수행하지 않을경우 게임시작시 0,1,2,3,4 인덱스에 null상태라 .get 접근연산자 사용불가
			메시지.add(" ");
			Rank rank = new Rank(i, " ", 0, " ");
			랭킹.add(i-1, rank);
		}
		Controller.load();
		
		while(true) {
			Controller.시작화면();
			System.out.println("1.게임시작\t2.순위보기"); int ch = scanner.nextInt();
			scanner.nextLine();
			if(ch==1) {
				break;
			}
			else if(ch==2) {
				Controller.랭크출력();
				System.out.println("전단계로 돌아가시려면 아무키나 눌러주세요..");
				scanner.nextLine();
			}
			else {
				
			}
		}
		
		Controller.시작카운트(); // 오프닝 화면 출력메소드
		
		Btn buttons = new Btn(); // 버튼객체 생성
	    buttons.showButton(); // 버튼 생성
		
	    시작시간 = System.currentTimeMillis(); // 시작시간 저장

		배경음악.start();	// 배경음악재생 스레드 시작 (thread 1)
		timecheck.start(); // 시간체크 스레드 시작 (thread 2)
		buy1.start(); // 컴퓨터 콜라 구매 스레드 시작 (thread 3)
		buy2.start(); // 컴퓨터 환타 구매 스레드 시작 (thread 4)
		buy3.start(); // 컴퓨터 사이다 구매 스레드 시작 (thread 5)
		buy4.start(); // 컴퓨터 레드불 구매 스레드 시작 (thread 6)
		Controller.화면출력메소드(); // 화면출력메소드 while 무한루프 (main thread)

		Controller.gameover(); // 게임오버화면 출력 메소드
		
		
		long 종료시간 = System.currentTimeMillis();
		long 게임시간 = (종료시간-시작시간)/1000;
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		boolean result = Controller.랭크판정(게임시간);
		if(result) {
			System.out.println(" *상위 랭커 입니다* ");
			System.out.print("이름을 입력해주세요"); String 이름 = scanner.next();
			System.out.print("코멘트를 입력해주세요"); String 코멘트 = scanner.next();
			Controller.랭크등록(게임시간,이름,코멘트);
		}
		
		Controller.랭크출력();
		Controller.save();
		
	
	
	}
		
}
