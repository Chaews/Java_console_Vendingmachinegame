package ���Ǳ�;

import java.util.ArrayList;
import java.util.Scanner;

public class Drink{
	
	// ��� �����忡�� ����ϱ� ���� ������ static���� ����
	static int �ڱ� = 10000 ;
	static int �ݶ� = 0 ;
	static int ���̴� = 0 ;
	static int ȯŸ = 0 ;
	static int ����� = 0 ;
	static long ���۽ð� ; // ���ӽ��۽� ���۽ð��� ����
	static int �ð����� = 1 ; // �ð�����üũ �޼ҵ带 �̿��Ͽ� ���� ����ð��� ��ġ�� ��Ÿ�� (5�ʴ� 1������)
	static int ���Ƚ�� = 0 ; // �������������� ����� ����
	static ArrayList<String> �޽��� = new ArrayList<>(); // �ݺ�������� ���� �޽��� ������� �����ϱ����� ����Ʈȭ �Ͽ� ����Ʈ�ڸ��� �����س��� ���
	static ArrayList<Rank> ��ŷ = new ArrayList<>(); // ��ŷ���� ����Ʈ
	
	
	public static void main(String[] args) { // �޽��� �ε����� ���� �ְ� �߰�
		Scanner scanner = new Scanner(System.in);
		TimeCheck timecheck = new TimeCheck(); // �ð� üũ ��ü ����
		Music ������� = new Music("�������.mp3",true); // ���������� ��ü ����
		Buy buy1 = new Buy("�ݶ�"); // ��ǻ�� �ݶ� ���� ��ü ����
		Buy buy2 = new Buy("ȯŸ"); // ��ǻ�� ȯŸ ���� ��ü ����
		Buy buy3 = new Buy("���̴�"); // ��ǻ�� ���̴� ���� ��ü ����
		Buy buy4 = new Buy("�����"); // ��ǻ�� ����� ���� ��ü ����

		for(int i = 1 ; i <=5 ; i++) { // ���۾��� �������� ������� ���ӽ��۽� 0,1,2,3,4 �ε����� null���¶� .get ���ٿ����� ���Ұ�
			�޽���.add(" "); 
			Rank rank = new Rank(i, " ", 0, " ");
			��ŷ.add(i-1, rank); // 
		}
		Controller.load(); // ��ũ ���� ����� ���� �ҷ�����
		
		while(true) { // ����ȭ�� �ݺ��� ���� [�������� : 1�����ý�]
			Controller.����ȭ��(); // ����ȭ�� ��� �޼ҵ�
			try {
				System.out.println("1.���ӽ���\t2.��������"); 
				System.out.print("���� >> "); int ch = scanner.nextInt();
				scanner.nextLine(); // �������� ȭ��� ����Ű����� ���� nextLine ���
				if(ch==1) {
					break; // ����ȭ��
				}
				else if(ch==2) {
					Controller.��ũ���(); // ��ũ ��� �޼ҵ�
					System.out.println("���ܰ�� ���ư��÷��� �ƹ�Ű�� �����ּ���..");
					scanner.nextLine();
				}
				else {
					
				}
			}
			catch(Exception e) { //
				System.out.println("�˸�) �߸��� �Է��Դϴ�.");
				scanner = new Scanner(System.in);
			}

		}
		
		Controller.����ī��Ʈ(); // ī��Ʈ�ٿ� ��¸޼ҵ�
		
		Btn buttons = new Btn(); // ��ư��ü ����
	    buttons.showButton(); // ��ư ����
		
	    ���۽ð� = System.currentTimeMillis(); // ���۽ð� ����

		�������.start();	// ���������� ������ ���� (thread 1)
		timecheck.start(); // �ð�üũ ������ ���� (thread 2)
		buy1.start(); // ��ǻ�� �ݶ� ���� ������ ���� (thread 3)
		buy2.start(); // ��ǻ�� ȯŸ ���� ������ ���� (thread 4)
		buy3.start(); // ��ǻ�� ���̴� ���� ������ ���� (thread 5)
		buy4.start(); // ��ǻ�� ����� ���� ������ ���� (thread 6)
		Controller.ȭ����¸޼ҵ�(); // ȭ����¸޼ҵ� while ���ѷ��� (main thread)

		Controller.gameover(); // ���ӿ���ȭ�� ��� �޼ҵ�
		
		
		long ����ð� = System.currentTimeMillis(); // ��ũ������ ���� ����ð� Ȯ��
		long ���ӽð� = (����ð�-���۽ð�)/1000; // �� ���ӽð��� ������ ����
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		boolean result = Controller.��ũ����(���ӽð�); // ��ũ �����޼ҵ�
		if(result) { // ������ 5���̻��϶� ��ũ���
			System.out.println(" ********** ���� ��Ŀ �Դϴ� ********** ");
			System.out.print("�̸��� �Է����ּ��� : "); String �̸� = scanner.nextLine();
			System.out.print("�ڸ�Ʈ�� �Է����ּ��� : "); String �ڸ�Ʈ = scanner.nextLine();
			Controller.��ũ���(���ӽð�,�̸�,�ڸ�Ʈ);
		}
		Controller.��ũ���(); // ��ũ ��� �޼ҵ�
		Controller.save(); // ��ũ���� ���� ����޼ҵ�
			
	}
		
}
