package ���Ǳ�;

import java.util.Random;

public class Controller extends Thread{

	
	public static void cls() {
		for(int i = 1 ; i <= 60; i++) {
			System.out.println();
		}
	}
	
	
	
	public static void ȭ����¸޼ҵ�() {
		while(true) {
			if(Drink.���Ƚ��==4) {
				break;
			}
			for(int i = 0 ; i < 2 ; i++) {
				if(i == 0) {
					cls();
					System.out.println("���� �ڱ� : " + Drink.�ڱ�);
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ���������������������������������������������������������������������� ");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                   ���̴� �߰���              �� \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-30s              \n",Drink.�޽���.get(0));;
					System.out.printf ("  ��     ��        ��   ��         ������������     ��         ��     ��        %-30s              \n",Drink.�޽���.get(4));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(3));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(2));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(1));
					System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Drink.�޽���.get(0));
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     ��        ����������������������������������������������������������������������");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��       %3d           %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Drink.�ݶ�,Drink.ȯŸ,Drink.���̴�,Drink.�����);	
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            ��        �� 				  ��\n");
					System.out.print  ("  ��                                                            ��        �� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 			          ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��	����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
				}
				else {
					cls();
					System.out.println("���� �ڱ� : " + Drink.�ڱ�);
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ���������������������������������������������������������������������� ");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                   ���̴� �߰���              �� \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-30s              \n",Drink.�޽���.get(0));;
					System.out.printf ("  ��     ��        ��   ��         ������������     ��         ��     ��        %-30s              \n",Drink.�޽���.get(4));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(3));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(2));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(1));
					System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Drink.�޽���.get(0));
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     ��        ����������������������������������������������������������������������");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ��         ��  ��         ��  ��         ��  ��         ��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��       %3d           %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Drink.�ݶ�,Drink.ȯŸ,Drink.���̴�,Drink.�����);	
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            ��        �� 				  ��\n");
					System.out.print  ("  ��                                                            ��        �� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��                                                            �� 	�� 			          ��\n");
					System.out.print  ("  ��                                                            �� 	�� 				  ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��	����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // ��¸޼ҵ� end

	@Override
	public void run() {
		super.run();
		while(true)
			try {
				Random random = new Random();
				Drink.�ݶ� -= random.nextInt(2)+1;
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {	
			}
	}
}
	
