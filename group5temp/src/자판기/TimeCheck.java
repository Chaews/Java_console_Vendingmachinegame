package ���Ǳ�;

public class TimeCheck extends Thread {
	
	private boolean stop;
	
	public void setStop (boolean stop) {
		this.stop = stop ;
	}
	
	
	@Override
	public synchronized void run() {
		
		while(!stop) { // �ð�üũ �ݺ�
			if(Controller.���Ƚ��>=4) { // ���Ƚ�� 4ȸ �̻�� ������ �����Ŵ
				break;
			}
			long ����ð� = System.currentTimeMillis(); // �����尡 ����ǰ��ִ� ���� �ð� ����
			long �ð����� = (����ð�-Controller.���۽ð�)/1000; // ���ӽ��۽� �����صξ��� ���۽ð����� ���̸� ���Ͽ�
			Controller.�ð�����=((int)�ð�����/5)+1; // �ð����� ������ ����
		}
	}

}