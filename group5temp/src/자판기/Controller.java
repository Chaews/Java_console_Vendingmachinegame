package ���Ǳ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class Controller extends Thread{

	
	public static void cls() { // �ݺ������� ����� �о�� �����̴°�ó�� ǥ���ϱ� ���� �ݺ��� ��¸޼ҵ�
		for(int i = 1 ; i <= 60; i++) { // 60�� ��� �ݺ���
			System.out.println();
		}
	}

	public static void ȭ����¸޼ҵ�() { // ȭ�� ��� �޼ҵ�
		DecimalFormat df = new DecimalFormat("#,##0"); // �ڱ� ������� ����
		while(true) { // ���ѷ��� [���� ���� : ���Ƚ�� 4ȸ�̻�]
			if(Drink.���Ƚ��>=4) {  // ���Ƚ�� 4ȸ �̻�� ���� ������ ����
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // ���Ǳ� ���ڿ� ��¦�̴� ȿ�� �ֱ����� 2���� ȭ������ ������ ����
				if(i == 0) {
					cls(); // ȭ�� �о�� �޼ҵ�
					String money = df.format(Drink.�ڱ�); // �ڱ��� ������� �����Ͽ� ���ڿ��� ����
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ***********************************");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                       �˸���                 \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-15s ��� Ƚ��:%s              \n","Level : " + Drink.�ð�����,Drink.���Ƚ��);
					System.out.printf ("  ��                  ��         ������������     ��         ��     ��        %-30s              \n",Drink.�޽���.get(4)); // ���ڿ� �ε����� ����� ���� ���
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(3)); // ���ڿ� �ε����� ����� ���� ���
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(2)); // ���ڿ� �ε����� ����� ���� ���
		            System.out.printf ("  ��        COLA         FANTA        CIDER      RED BULL       ��        %-30s              \n",Drink.�޽���.get(1)); // ���ڿ� �ε����� ����� ���� ���
		            System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Drink.�޽���.get(0)); // ���ڿ� �ε����� ����� ���� ���
		            System.out.println("  ��     ��         ��  �� ###     ��  ��    #    ��  ��####��    ��     ��        ***********************************");
		            System.out.println("  ��     ��COCA COLA��  ��  ###    ��  ��# # # # #��  ��####��    ��     �� ");
		            System.out.println("  ��     ��     ####��  ��         ��  ��  # # #  ��  ��####��    ��     ��                      ���� �ڱ�  ");
		            System.out.println("  ��     ��####*####��  �� F A N   ��  ��# # # # #��  ��    ��####��     ��                      " + money);
		            System.out.println("  ��     ��####*    ��  ��     T A ��  ��    #    ��  ��    ��####��     �� ");
		            System.out.println("  ��     ��         ��  ��         ��  ��  CIDER  ��  ��    ��####��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��        %3d          %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Drink.�ݶ�,Drink.ȯŸ,Drink.���̴�,Drink.�����);	
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                               (|) (��)      ��        ��                                 ��\n");
		            System.out.print  ("  ��       ###  ####   ###  #   # ####              #####       ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #   #             #           ��        ��                                 ��\n");
		            System.out.print  ("  ��      # ### ####  #   # #   # ####              ####        ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #                     #       ��        ��                                 ��\n");
		            System.out.print  ("  ��       #### #   #  ###   ###  #                 ####        ��        ��                                 ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��        ����������������������������������������������������������������������\n");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ��                                                ��     �� ");
					System.out.println("  ��     ����������������������������������������������������������������������������������������������������     �� ");
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
				}
				else {
					cls();
					String money = df.format(Drink.�ڱ�);
					System.out.println("  ���������������������������������������������������������������������������������������������������������������������������� ");
					System.out.println("  ��                                                            �� ");
					System.out.println("  ��     �����������   ��       ���������   ��     ���������   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ����          ��   ��     �� ");
					System.out.println("  ��         ���       ��         ��  ��     ��           ��    ��     �� ");
					System.out.println("  ��        ��  ��      ����     ���������   ��          ��     ��     �� ");
					System.out.println("  ��       ��    ��     ��                            ��      ��     ��        ***********************************");
					System.out.printf ("  ��      ��      ��    ��         ��                 ��       ��     ��                       �˸���                 \n");
					System.out.printf ("  ��     ��        ��   ��         ��                ��        ��     ��        %-15s ��� Ƚ��:%s              \n","Level : " + Drink.�ð�����,Drink.���Ƚ��);
					System.out.printf ("  ��                  ��         ������������     ��         ��     ��        %-30s              \n",Drink.�޽���.get(4));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(3));
					System.out.printf ("  ��                                                            ��        %-30s              \n",Drink.�޽���.get(2));
		            System.out.printf ("  ��        COLA         FANTA        CIDER      RED BULL       ��        %-30s              \n",Drink.�޽���.get(1));
		            System.out.printf ("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��        %-30s              \n",Drink.�޽���.get(0));
		            System.out.println("  ��     ��         ��  �� ###     ��  ��    #    ��  ��####��    ��     ��        ***********************************");
		            System.out.println("  ��     ��COCA COLA��  ��  ###    ��  ��# # # # #��  ��####��    ��     �� ");
		            System.out.println("  ��     ��     ####��  ��         ��  ��  # # #  ��  ��####��    ��     ��                      ���� �ڱ�  ");
		            System.out.println("  ��     ��####*####��  �� F A N   ��  ��# # # # #��  ��    ��####��     ��                      " + money);
		            System.out.println("  ��     ��####*    ��  ��     T A ��  ��    #    ��  ��    ��####��     �� ");
		            System.out.println("  ��     ��         ��  ��         ��  ��  CIDER  ��  ��    ��####��     �� ");
					System.out.println("  ��     ����������������������  ����������������������  ����������������������  ����������������������     ��                      ��ư��ġ");
					System.out.printf ("  ��        %3d          %3d           %3d          %3d         ��        ����������������������������������������������������������������������\n",Drink.�ݶ�,Drink.ȯŸ,Drink.���̴�,Drink.�����);	
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                                            ��        ��                                 ��\n");
					System.out.print  ("  ��                                               (|) (��)      ��        ��                                 ��\n");
		            System.out.print  ("  ��       ###  ####   ###  #   # ####              #####       ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #   #             #           ��        ��                                 ��\n");
		            System.out.print  ("  ��      # ### ####  #   # #   # ####              ####        ��        ��                                 ��\n");
		            System.out.print  ("  ��      #   # #   # #   # #   # #                     #       ��        ��                                 ��\n");
		            System.out.print  ("  ��       #### #   #  ###   ###  #                 ####        ��        ��                                 ��\n");
					System.out.print  ("  ��     ����������������������������������������������������������������������������������������������������     ��        ����������������������������������������������������������������������\n");
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
	public static void ����ī��Ʈ() {
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
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("          �Ƣ�                 ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("          �Ƣ�     �Ƣ�          ");
				System.out.println("          �Ƣ�     �Ƣ�          ");
				System.out.println("          �Ƣ�     �Ƣ�          ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                 �Ƣ�          ");
				System.out.println("                 �Ƣ�          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("                  �Ƣ�         ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				System.out.println("          �Ƣ�                 ");
				System.out.println("          �Ƣ�                 ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("            �ƢƢƢ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("              �Ƣ�             ");
				System.out.println("          �ƢƢƢƢƢƢƢƢƢ�         ");
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
	 public static void ����ȭ��() {
			System.out.println("********* ���Ǳ� ���� *********");
			System.out.println("     ���Ǳ⿡ ������� ���ڶ�   ");
			System.out.println("     �Ǹ����� ���ϸ� ����Դϴ�   ");
			System.out.println("         �� ä���ּ���!        ");
			System.out.println("*****************************");
	 }
	 
	 public static boolean ��ũ����(long ���ӽð�) {
		 for(int i = 0 ; i < 5 ; i++) {
			 if(Drink.��ŷ.get(i).getPlaytime() < ���ӽð�) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void ��ũ���(long ���ӽð�, String �̸�, String �ڸ�Ʈ) {
		 for(int i = 0 ; i < 5 ; i++) {
			 if(Drink.��ŷ.get(i).getPlaytime() < ���ӽð�) {
				 Rank rank = new Rank(i+1, �̸�, ���ӽð�, �ڸ�Ʈ);
				 Drink.��ŷ.add(i,rank);
				 break;
			 }
		 }	 	 
	 }
	 
	 public static void ��ũ���() {
		 System.out.println("--------����ǥ--------");
		 System.out.println("��ŷ\t�̸�\t�÷��̽ð�\t\t�ڸ�Ʈ");
		 for(int i = 0 ; i < 5 ; i++) {
			 System.out.println(Drink.��ŷ.get(i).getRank()+"\t"+ Drink.��ŷ.get(i).getName()+"\t"+ Drink.��ŷ.get(i).getPlaytime()+"\t\t"+ Drink.��ŷ.get(i).getContent());
		 }
		 System.out.println("---------------------");
	 }
	 
	 public static void save() {
		 try { // ����[����]�� �߻��Ұ� ���� �ڵ� ���� (����)					// ���� ��� , �̾��=true[�ɼ�]
				FileOutputStream fileOutputStream = new FileOutputStream("D:/java/���Ǳ�.txt");
				for(int i = 0 ; i < 5 ; i++) {
					String �������� = Drink.��ŷ.get(i).getRank()+","+Drink.��ŷ.get(i).getName()+","+Drink.��ŷ.get(i).getPlaytime()+","+Drink.��ŷ.get(i).getContent()+"\n";
					fileOutputStream.write(��������.getBytes()); // ���ڿ� -> ����Ʈ��
				}
			}
			catch(Exception e) { // ����[����] ó��[���] : Exception Ŭ����
			}
	 }
	 
	public static void load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/���Ǳ�.txt");
			byte[] bytes = new byte[1024]; // bit -> byte -> kb -> mb -> gb
			fileInputStream.read(bytes);
			String ���ϳ��� = new String(bytes); // ����Ʈ�� -> ���ڿ�
			String[] file = ���ϳ���.split("\n");	
			int j = 0 ;
			for(Rank temp : Drink.��ŷ) {
				if(j == Drink.��ŷ.size()){
					break;
				}
				int i = 0 ;
				for(String temp2 : file) {
					String[] �ʵ��� = temp2.split(",");
					Rank rank = new Rank(Integer.parseInt(�ʵ���[0]), �ʵ���[1], Long.parseLong(�ʵ���[2]),�ʵ���[3]);
					// ����Ʈ ����
					Drink.��ŷ.remove(i);
					Drink.��ŷ.add(i,rank);
					i++;
				}
				j++;
			}
		}
		catch(Exception e){ // catch : ���� ��� -> Exception Ŭ������ ��ü�� ����
		}
	}

	 
}
	
