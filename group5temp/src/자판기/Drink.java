package ���Ǳ�;

import java.util.ArrayList;

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
	
	
	public static void main(String[] args) { // �޽��� �ε����� ���� �ְ� �߰�
		for(int i = 1 ; i <=5 ; i++) { // ���۾��� �������� ������� ���ӽ��۽� 0,1,2,3,4 �ε����� null���¶� .get ���ٿ����� ���Ұ�
			�޽���.add(" "); 
		}
		
		Controller.����ȭ�����(); // ������ ȭ�� ��¸޼ҵ�
		
		
		Btn buttons = new Btn(); // ��ư��ü ����
	    buttons.showButton(); // ��ư ����
		
	    ���۽ð� = System.currentTimeMillis(); // ���۽ð� ����
		TimeCheck timecheck = new TimeCheck(); // �ð� üũ ��ü ����
		Music ������� = new Music("�������.mp3",true); // ���������� ��ü ����
		Buy buy1 = new Buy("�ݶ�"); // ��ǻ�� �ݶ� ���� ��ü ����
		Buy buy2 = new Buy("ȯŸ"); // ��ǻ�� ȯŸ ���� ��ü ����
		Buy buy3 = new Buy("���̴�"); // ��ǻ�� ���̴� ���� ��ü ����
		Buy buy4 = new Buy("�����"); // ��ǻ�� ����� ���� ��ü ����


		�������.start();	// ���������� ������ ���� (thread 1)
		timecheck.start(); // �ð�üũ ������ ���� (thread 2)
		buy1.start(); // ��ǻ�� �ݶ� ���� ������ ���� (thread 3)
		buy2.start(); // ��ǻ�� ȯŸ ���� ������ ���� (thread 4)
		buy3.start(); // ��ǻ�� ���̴� ���� ������ ���� (thread 5)
		buy4.start(); // ��ǻ�� ����� ���� ������ ���� (thread 6)
		Controller.ȭ����¸޼ҵ�(); // ȭ����¸޼ҵ� while ���ѷ��� (main thread)

		
		
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
