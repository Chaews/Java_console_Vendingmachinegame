package ÀÚÆÇ±â;

import java.text.DecimalFormat;
import java.util.Random;

public class Controller extends Thread{

	
	public static void cls() {
		for(int i = 1 ; i <= 60; i++) {
			System.out.println();
		}
	}
	
	
	
	public static void È­¸éÃâ·Â¸Þ¼Òµå() {
		DecimalFormat df = new DecimalFormat("#,##0");
		while(true) {
			if(Drink.°æ°íÈ½¼ö==4) {
				break;
			}
			for(int i = 0 ; i < 2 ; i++) {
				if(i == 0) {
					cls();
					String money = df.format(Drink.ÀÚ±Ý);
					System.out.println("  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤ ");
					System.out.println("  ¦¢                                                            ¦¢ ");
					System.out.println("  ¦¢     ¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à   ¡à       ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à     ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à     ¦¢ ");
					System.out.println("  ¦¢         ¡à¡à       ¡à         ¡à  ¡à     ¡à¡à¡à          ¡à   ¡à     ¦¢ ");
					System.out.println("  ¦¢         ¡à¡à       ¡à         ¡à  ¡à     ¡à           ¡à    ¡à     ¦¢ ");
					System.out.println("  ¦¢        ¡à  ¡à      ¡à¡à¡à     ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à          ¡à     ¡à     ¦¢ ");
					System.out.println("  ¦¢       ¡à    ¡à     ¡à                            ¡à      ¡à     ¦¢        ***********************************");
					System.out.printf ("  ¦¢      ¡à      ¡à    ¡à         ¡à                 ¡à       ¡à     ¦¢                       ¾Ë¸²ÆÇ                 \n");
					System.out.printf ("  ¦¢     ¡à        ¡à   ¡à         ¡à                ¡à        ¡à     ¦¢        %-15s °æ°í È½¼ö:%s              \n","Level : " + Drink.½Ã°£Â÷ÀÌ,Drink.°æ°íÈ½¼ö);
					System.out.printf ("  ¦¢                  ¡à         ¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à     ¡à         ¡à     ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(4));
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(3));
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(2));
		            System.out.printf ("  ¦¢        COLA         FANTA        CIDER      RED BULL       ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(1));
		            System.out.printf ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(0));
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢ ###     ¦¢  ¦¢    #    ¦¢  ¦¢####¦¢    ¦¢     ¦¢        ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		            System.out.println("  ¦¢     ¦¢COCA COLA¦¢  ¦¢  ###    ¦¢  ¦¢# # # # #¦¢  ¦¢####¦¢    ¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢     ####¦¢  ¦¢         ¦¢  ¦¢  # # #  ¦¢  ¦¢####¦¢    ¦¢     ¦¢                      ÇöÀç ÀÚ±Ý  ");
		            System.out.println("  ¦¢     ¦¢####*####¦¢  ¦¢ F A N   ¦¢  ¦¢# # # # #¦¢  ¦¢    ¦¢####¦¢     ¦¢                      " + money);
		            System.out.println("  ¦¢     ¦¢####*    ¦¢  ¦¢     T A ¦¢  ¦¢    #    ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢         ¦¢  ¦¢  CIDER  ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢                      ¹öÆ°À§Ä¡");
					System.out.printf ("  ¦¢        %3d          %3d           %3d          %3d         ¦¢        ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤\n",Drink.ÄÝ¶ó,Drink.È¯Å¸,Drink.»çÀÌ´Ù,Drink.·¹µåºÒ);	
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 			          ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢	¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥\n");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢ ");
					System.out.println("  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥ ");
				}
				else {
					cls();
					String money = df.format(Drink.ÀÚ±Ý);
					System.out.println("  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤ ");
					System.out.println("  ¦¢                                                            ¦¢ ");
					System.out.println("  ¦¢     ¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á   ¡á       ¡á¡á¡á¡á¡á¡á¡á¡á   ¡á     ¡á¡á¡á¡á¡á¡á¡á¡á   ¡á     ¦¢ ");
					System.out.println("  ¦¢         ¡á¡á       ¡á         ¡á  ¡á     ¡á¡á¡á          ¡á   ¡á     ¦¢ ");
					System.out.println("  ¦¢         ¡á¡á       ¡á         ¡á  ¡á     ¡á           ¡á    ¡á     ¦¢ ");
					System.out.println("  ¦¢        ¡á  ¡á      ¡á¡á¡á     ¡á¡á¡á¡á¡á¡á¡á¡á   ¡á          ¡á     ¡á     ¦¢ ");
					System.out.println("  ¦¢       ¡á    ¡á     ¡á                            ¡á      ¡á     ¦¢        ***********************************");
					System.out.printf ("  ¦¢      ¡á      ¡á    ¡á         ¡á                 ¡á       ¡á     ¦¢                       ¾Ë¸²ÆÇ                 \n");
					System.out.printf ("  ¦¢     ¡á        ¡á   ¡á         ¡á                ¡á        ¡á     ¦¢        %-15s °æ°í È½¼ö:%s              \n","Level : " + Drink.½Ã°£Â÷ÀÌ,Drink.°æ°íÈ½¼ö);
					System.out.printf ("  ¦¢                  ¡á         ¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á     ¡á         ¡á     ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(4));
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(3));
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(2));
		            System.out.printf ("  ¦¢        COLA         FANTA        CIDER      RED BULL       ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(1));
		            System.out.printf ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(0));
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢ ###     ¦¢  ¦¢    #    ¦¢  ¦¢####¦¢    ¦¢     ¦¢        ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		            System.out.println("  ¦¢     ¦¢COCA COLA¦¢  ¦¢  ###    ¦¢  ¦¢# # # # #¦¢  ¦¢####¦¢    ¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢     ####¦¢  ¦¢         ¦¢  ¦¢  # # #  ¦¢  ¦¢####¦¢    ¦¢     ¦¢                      ÇöÀç ÀÚ±Ý  ");
		            System.out.println("  ¦¢     ¦¢####*####¦¢  ¦¢ F A N   ¦¢  ¦¢# # # # #¦¢  ¦¢    ¦¢####¦¢     ¦¢                      " + money);
		            System.out.println("  ¦¢     ¦¢####*    ¦¢  ¦¢     T A ¦¢  ¦¢    #    ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢         ¦¢  ¦¢  CIDER  ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢                      ¹öÆ°À§Ä¡");
					System.out.printf ("  ¦¢        %3d          %3d           %3d          %3d         ¦¢        ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤\n",Drink.ÄÝ¶ó,Drink.È¯Å¸,Drink.»çÀÌ´Ù,Drink.·¹µåºÒ);	
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 			          ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢ 	¦¢ 				  ¦¢\n");
					System.out.print  ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢	¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥\n");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢ ");
					System.out.println("  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥ ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // Ãâ·Â¸Þ¼Òµå end

	@Override
	public void run() {
		super.run();
		while(true)
			try {
				Random random = new Random();
				Drink.ÄÝ¶ó -= random.nextInt(2)+1;
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {	
			}
	}
}
	
