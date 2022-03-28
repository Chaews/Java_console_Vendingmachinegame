package ÀÚÆÇ±â;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class Controller extends Thread{

	
	public static void cls() { // ¹Ýº¹¹®À¸·Î ºó°ø°£ ¹Ð¾î³»¼­ ¿òÁ÷ÀÌ´Â°ÍÃ³·³ Ç¥ÇöÇÏ±â À§ÇÑ ¹Ýº¹¹® Ãâ·Â¸Þ¼Òµå
		for(int i = 1 ; i <= 60; i++) { // 60ÁÙ Ãâ·Â ¹Ýº¹¹®
			System.out.println();
		}
	}

	public static void È­¸éÃâ·Â¸Þ¼Òµå() { // È­¸é Ãâ·Â ¸Þ¼Òµå
		DecimalFormat df = new DecimalFormat("#,##0"); // ÀÚ±Ý Ãâ·ÂÇü½Ä ¼³Á¤
		while(true) { // ¹«ÇÑ·çÇÁ [Á¾·á Á¶°Ç : °æ°íÈ½¼ö 4È¸ÀÌ»ó]
			if(Drink.°æ°íÈ½¼ö>=4) {  // °æ°íÈ½¼ö 4È¸ ÀÌ»ó½Ã ¸ÞÀÎ ½º·¹µå Á¾·á
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // ÀÚÆÇ±â ±ÛÀÚ¿¡ ¹ÝÂ¦ÀÌ´Â È¿°ú ÁÖ±âÀ§ÇØ 2°³ÀÇ È­¸éÀ¸·Î ÇÁ·¹ÀÓ »ý¼º
				if(i == 0) {
					cls(); // È­¸é ¹Ð¾î³»±â ¸Þ¼Òµå
					String money = df.format(Drink.ÀÚ±Ý); // ÀÚ±ÝÀÇ Ãâ·ÂÇü½Ä ¼³Á¤ÇÏ¿© ¹®ÀÚ¿­·Î ÀúÀå
					System.out.println("  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤ ");
					System.out.println("  ¦¢                                                            ¦¢ ");
					System.out.println("  ¦¢     ¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à   ¡à       ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à     ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à     ¦¢ ");
					System.out.println("  ¦¢         ¡à¡à       ¡à         ¡à  ¡à     ¡à¡à¡à          ¡à   ¡à     ¦¢ ");
					System.out.println("  ¦¢         ¡à¡à       ¡à         ¡à  ¡à     ¡à           ¡à    ¡à     ¦¢ ");
					System.out.println("  ¦¢        ¡à  ¡à      ¡à¡à¡à     ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à          ¡à     ¡à     ¦¢ ");
					System.out.println("  ¦¢       ¡à    ¡à     ¡à                            ¡à      ¡à     ¦¢        ***********************************");
					System.out.printf ("  ¦¢      ¡à      ¡à    ¡à         ¡à                 ¡à       ¡à     ¦¢                       ¾Ë¸²ÆÇ                 \n");
					System.out.printf ("  ¦¢     ¡à        ¡à   ¡à         ¡à                ¡à        ¡à     ¦¢        %-15s °æ°í È½¼ö:%s              \n","Level : " + Drink.½Ã°£Â÷ÀÌ,Drink.°æ°íÈ½¼ö);
					System.out.printf ("  ¦¢                  ¡à         ¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à     ¡à         ¡à     ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(4)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(3)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(2)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
		            System.out.printf ("  ¦¢        COLA         FANTA        CIDER      RED BULL       ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(1)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
		            System.out.printf ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        %-30s              \n",Drink.¸Þ½ÃÁö.get(0)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢ ###     ¦¢  ¦¢    #    ¦¢  ¦¢####¦¢    ¦¢     ¦¢        ***********************************");
		            System.out.println("  ¦¢     ¦¢COCA COLA¦¢  ¦¢  ###    ¦¢  ¦¢# # # # #¦¢  ¦¢####¦¢    ¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢     ####¦¢  ¦¢         ¦¢  ¦¢  # # #  ¦¢  ¦¢####¦¢    ¦¢     ¦¢                      ÇöÀç ÀÚ±Ý  ");
		            System.out.println("  ¦¢     ¦¢####*####¦¢  ¦¢ F A N   ¦¢  ¦¢# # # # #¦¢  ¦¢    ¦¢####¦¢     ¦¢                      " + money);
		            System.out.println("  ¦¢     ¦¢####*    ¦¢  ¦¢     T A ¦¢  ¦¢    #    ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢         ¦¢  ¦¢  CIDER  ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢                      ¹öÆ°À§Ä¡");
					System.out.printf ("  ¦¢        %3d          %3d           %3d          %3d         ¦¢        ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤\n",Drink.ÄÝ¶ó,Drink.È¯Å¸,Drink.»çÀÌ´Ù,Drink.·¹µåºÒ);	
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                               (|) (¦¡)      ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       ###  ####   ###  #   # ####              #####       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #   #             #           ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      # ### ####  #   # #   # ####              ####        ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #                     #       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       #### #   #  ###   ###  #                 ####        ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥\n");
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
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢ ###     ¦¢  ¦¢    #    ¦¢  ¦¢####¦¢    ¦¢     ¦¢        ***********************************");
		            System.out.println("  ¦¢     ¦¢COCA COLA¦¢  ¦¢  ###    ¦¢  ¦¢# # # # #¦¢  ¦¢####¦¢    ¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢     ####¦¢  ¦¢         ¦¢  ¦¢  # # #  ¦¢  ¦¢####¦¢    ¦¢     ¦¢                      ÇöÀç ÀÚ±Ý  ");
		            System.out.println("  ¦¢     ¦¢####*####¦¢  ¦¢ F A N   ¦¢  ¦¢# # # # #¦¢  ¦¢    ¦¢####¦¢     ¦¢                      " + money);
		            System.out.println("  ¦¢     ¦¢####*    ¦¢  ¦¢     T A ¦¢  ¦¢    #    ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢         ¦¢  ¦¢  CIDER  ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢                      ¹öÆ°À§Ä¡");
					System.out.printf ("  ¦¢        %3d          %3d           %3d          %3d         ¦¢        ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤\n",Drink.ÄÝ¶ó,Drink.È¯Å¸,Drink.»çÀÌ´Ù,Drink.·¹µåºÒ);	
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                               (|) (¦¡)      ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       ###  ####   ###  #   # ####              #####       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #   #             #           ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      # ### ####  #   # #   # ####              ####        ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #                     #       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       #### #   #  ###   ###  #                 ####        ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥\n");
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
	public static void ½ÃÀÛÄ«¿îÆ®() {
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
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("          ¢Æ¢Æ                 ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("                  ¢Æ¢Æ         ");
				System.out.println("                  ¢Æ¢Æ         ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("          ¢Æ¢Æ     ¢Æ¢Æ          ");
				System.out.println("          ¢Æ¢Æ     ¢Æ¢Æ          ");
				System.out.println("          ¢Æ¢Æ     ¢Æ¢Æ          ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("                 ¢Æ¢Æ          ");
				System.out.println("                 ¢Æ¢Æ          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("                  ¢Æ¢Æ         ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("                  ¢Æ¢Æ         ");
				System.out.println("                  ¢Æ¢Æ         ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("                  ¢Æ¢Æ         ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("          ¢Æ¢Æ                 ");
				System.out.println("          ¢Æ¢Æ                 ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("            ¢Æ¢Æ¢Æ¢Æ             ");
				System.out.println("              ¢Æ¢Æ             ");
				System.out.println("              ¢Æ¢Æ             ");
				System.out.println("              ¢Æ¢Æ             ");
				System.out.println("              ¢Æ¢Æ             ");
				System.out.println("          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
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
	 public static void ½ÃÀÛÈ­¸é() {
			System.out.println("********* ÀÚÆÇ±â °ÔÀÓ *********");
			System.out.println("     ÀÚÆÇ±â¿¡ À½·á¼ö°¡ ¸ðÀÚ¶ó¼­   ");
			System.out.println("     ÆÇ¸ÅÇÏÁö ¸øÇÏ¸é °æ°íÀÔ´Ï´Ù   ");
			System.out.println("         Àß Ã¤¿öÁÖ¼¼¿ä!        ");
			System.out.println("*****************************");
	 }
	 
	 public static boolean ·©Å©ÆÇÁ¤(long °ÔÀÓ½Ã°£) {
		 for(int i = 0 ; i < 5 ; i++) {
			 if(Drink.·©Å·.get(i).getPlaytime() < °ÔÀÓ½Ã°£) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void ·©Å©µî·Ï(long °ÔÀÓ½Ã°£, String ÀÌ¸§, String ÄÚ¸àÆ®) {
		 for(int i = 0 ; i < 5 ; i++) {
			 if(Drink.·©Å·.get(i).getPlaytime() < °ÔÀÓ½Ã°£) {
				 Rank rank = new Rank(i+1, ÀÌ¸§, °ÔÀÓ½Ã°£, ÄÚ¸àÆ®);
				 Drink.·©Å·.add(i,rank);
				 break;
			 }
		 }	 	 
	 }
	 
	 public static void ·©Å©Ãâ·Â() {
		 System.out.println("--------¼øÀ§Ç¥--------");
		 System.out.println("·©Å·\tÀÌ¸§\tÇÃ·¹ÀÌ½Ã°£\t\tÄÚ¸àÆ®");
		 for(int i = 0 ; i < 5 ; i++) {
			 System.out.println(Drink.·©Å·.get(i).getRank()+"\t"+ Drink.·©Å·.get(i).getName()+"\t"+ Drink.·©Å·.get(i).getPlaytime()+"\t\t"+ Drink.·©Å·.get(i).getContent());
		 }
		 System.out.println("---------------------");
	 }
	 
	 public static void save() {
		 try { // ¿¹¿Ü[¿À·ù]°¡ ¹ß»ýÇÒ°Í °°Àº ÄÚµå ¹­À½ (¿¹»ó)					// ÆÄÀÏ °æ·Î , ÀÌ¾î¾²±â=true[¿É¼Ç]
				FileOutputStream fileOutputStream = new FileOutputStream("D:/java/ÀÚÆÇ±â.txt");
				for(int i = 0 ; i < 5 ; i++) {
					String ³»º¸³»±â = Drink.·©Å·.get(i).getRank()+","+Drink.·©Å·.get(i).getName()+","+Drink.·©Å·.get(i).getPlaytime()+","+Drink.·©Å·.get(i).getContent()+"\n";
					fileOutputStream.write(³»º¸³»±â.getBytes()); // ¹®ÀÚ¿­ -> ¹ÙÀÌÆ®¿­
				}
			}
			catch(Exception e) { // ¿¹¿Ü[¿À·ù] Ã³¸®[Àâ±â] : Exception Å¬·¡½º
			}
	 }
	 
	public static void load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/ÀÚÆÇ±â.txt");
			byte[] bytes = new byte[1024]; // bit -> byte -> kb -> mb -> gb
			fileInputStream.read(bytes);
			String ÆÄÀÏ³»¿ë = new String(bytes); // ¹ÙÀÌÆ®¿­ -> ¹®ÀÚ¿­
			String[] file = ÆÄÀÏ³»¿ë.split("\n");	
			int j = 0 ;
			for(Rank temp : Drink.·©Å·) {
				if(j == Drink.·©Å·.size()){
					break;
				}
				int i = 0 ;
				for(String temp2 : file) {
					String[] ÇÊµå¸ñ·Ï = temp2.split(",");
					Rank rank = new Rank(Integer.parseInt(ÇÊµå¸ñ·Ï[0]), ÇÊµå¸ñ·Ï[1], Long.parseLong(ÇÊµå¸ñ·Ï[2]),ÇÊµå¸ñ·Ï[3]);
					// ¸®½ºÆ® ÀúÀå
					Drink.·©Å·.remove(i);
					Drink.·©Å·.add(i,rank);
					i++;
				}
				j++;
			}
		}
		catch(Exception e){ // catch : ¿¹¿Ü Àâ±â -> Exception Å¬·¡½ºÀÇ °´Ã¼¿¡ ÀúÀå
		}
	}

	 
}
	
