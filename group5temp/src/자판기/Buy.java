package ���Ǳ�;

import java.util.Random;

public class Buy extends Thread {
	
	String �����̸�;
	
	public Buy(String �����̸�) { // ������ ��ü ������ �����ڰ��� ���� �ٸ� �۾��� ����ǵ��� ����
		this.�����̸� = �����̸�;
	}
	
	@Override
	public synchronized void run() { // ���ν������ ���� ����� ������
		try {Thread.sleep(5000);}catch(Exception e) {} // ��ǻ�� ����Ȱ�� 5������ ����
		while(true) {
			Music ���� = new Music("����.mp3",true); // ���ǰ�ü ����(��ǻ�Ͱ� ���ſ� ������ ���)
			if(Drink.���Ƚ��>=4) { // ���Ƚ�� 4ȸ �̻�� ������ �����Ŵ
				break;
			}
			if(�����̸�=="�ݶ�") { // Buy ��ü ������ �����ڿ� ���� ��������
				Random random = new Random(); // ������ü ����	
				int buy = random.nextInt(2)+1; // ��ǻ�Ͱ� ������ ���� �������� ����
				if (Drink.�ݶ� < buy) { // ������ ������ ����� �������
					Drink.���Ƚ�� += 1; // ��� 1ȸ ����
					Drink.�޽���.add(0,"���) �ݶ� �����Ͽ� �Ǹ����� ���߽��ϴ�"); // ���޽��� �޽��� ����Ʈ�� ����
					if(Drink.�޽���.size()>=8) { // ����Ʈ�� ���ڿ� ���� ���� ������ ���� �ε����� ��ü ����(ȭ������� 0~4�ε��������� ����)
						Drink.�޽���.remove(5);
					}
				}
				else { // �������� ������ ���Ű����� ����� ������� (���ż��������ϰ��)
					Drink.�ݶ� -= buy; // �ݶ� ��� ����
					Drink.�ڱ� += buy*400 ; // �����ȸ�ŭ �ڱ� ����
					Drink.�޽���.add(0,"�ݶ� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*400 + "��"); // ������ ���ڿ� �ݾ� �޽��� ����Ʈ�� ����
					����.start(); // ���� �������� ���
					if(Drink.�޽���.size()>=8) { // ����Ʈ�� ���ڿ� ���� ���� ������ ���� �ε����� ��ü ����(ȭ������� 0~4�ε��������� ����)
						Drink.�޽���.remove(5);
					}
				}
					try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {} // �ð����� ������ ���� �ӵ�����
			}
			else if(�����̸�=="ȯŸ") { // ȯŸ ���� ������ (�ݶ�� ������ ����)
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.ȯŸ < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) ȯŸ�� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.ȯŸ -= buy;
					Drink.�ڱ� += buy*300 ;
					Drink.�޽���.add(0,"ȯŸ " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*300 + "��");
					����.start();
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
			else if(�����̸�=="���̴�") { // ���̴� ���� ������ (�ݶ�� ������ ����)
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.���̴� < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) ���̴ٰ� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.���̴� -= buy;
					Drink.�ڱ� += buy*200 ;
					Drink.�޽���.add(0,"���̴� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*200 + "��");
					����.start();
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
			else if(�����̸�=="�����") { // ����� ���� ������ (�ݶ�� ������ ����)	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.����� < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) ������� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.����� -= buy;
					Drink.�ڱ� += buy*1500 ;
					Drink.�޽���.add(0,"����� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*1500 + "��");
					����.start();
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
		}
			
	}

}

