package ���Ǳ�;

public class TimeCheck extends Thread {
	
	@Override
	public synchronized void run() {
		
		while(true) { // �ð�üũ �ݺ�
			long ����ð� = System.currentTimeMillis(); // �����尡 ����ǰ��ִ� ���� �ð� ����
			long �ð����� = (����ð�-Drink.���۽ð�)/1000; // ���ӽ��۽� �����صξ��� ���۽ð����� ���̸� ���Ͽ�
			Drink.�ð�����=((int)�ð�����/5)+1; // �ð����� ������ ����
		}
	}

}