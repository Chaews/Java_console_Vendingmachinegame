package 濠っ晦;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class Controller extends Thread{

	
	public static void cls() { // 奩犒僥戲煎 綴奢除 塵橫頂憮 遺霜檜朝匙籀歲 ル⑷ж晦 嬪и 奩犒僥 轎溘詭模萄
		for(int i = 1 ; i <= 60; i++) { // 60還 轎溘 奩犒僥
			System.out.println();
		}
	}

	public static void �飛橨漞繡瑆珛�() { // �飛� 轎溘 詭模萄
		DecimalFormat df = new DecimalFormat("#,##0"); // 濠旎 轎溘⑽衝 撲薑
		while(true) { // 鼠и瑞Щ [謙猿 褻勒 : 唳堅�蝦� 4�蛻抳鄿
			if(Drink.唳堅�蝦�>=4) {  // 唳堅�蝦� 4�� 檜鼻衛 詭檣 蝶溯萄 謙猿
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // 濠っ晦 旋濠縑 奩礎檜朝 �膩� 輿晦嬪п 2偃曖 �飛橉虞� Щ溯歜 儅撩
				if(i == 0) {
					cls(); // �飛� 塵橫頂晦 詭模萄
					String money = df.format(Drink.濠旎); // 濠旎曖 轎溘⑽衝 撲薑ж罹 僥濠翮煎 盪濰
					System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖 ");
					System.out.println("  弛                                                            弛 ");
					System.out.println("  弛     ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤   ﹤       ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤     ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤     弛 ");
					System.out.println("  弛         ﹤﹤       ﹤         ﹤  ﹤     ﹤﹤﹤          ﹤   ﹤     弛 ");
					System.out.println("  弛         ﹤﹤       ﹤         ﹤  ﹤     ﹤           ﹤    ﹤     弛 ");
					System.out.println("  弛        ﹤  ﹤      ﹤﹤﹤     ﹤﹤﹤﹤﹤﹤﹤﹤   ﹤          ﹤     ﹤     弛 ");
					System.out.println("  弛       ﹤    ﹤     ﹤                            ﹤      ﹤     弛        ***********************************");
					System.out.printf ("  弛      ﹤      ﹤    ﹤         ﹤                 ﹤       ﹤     弛                       憲葡っ                 \n");
					System.out.printf ("  弛     ﹤        ﹤   ﹤         ﹤                ﹤        ﹤     弛        %-15s 唳堅 �蝦�:%s              \n","Level : " + Drink.衛除離檜,Drink.唳堅�蝦�);
					System.out.printf ("  弛                  ﹤         ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤     ﹤         ﹤     弛        %-30s              \n",Drink.詭衛雖.get(4)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(3)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(2)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
		            System.out.printf ("  弛        COLA         FANTA        CIDER      RED BULL       弛        %-30s              \n",Drink.詭衛雖.get(1)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
		            System.out.printf ("  弛     忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖     弛        %-30s              \n",Drink.詭衛雖.get(0)); // 僥濠翮 檣策蝶縑 盪濰脹 僥濠 轎溘
		            System.out.println("  弛     弛         弛  弛 ###     弛  弛    #    弛  弛####弛    弛     弛        ***********************************");
		            System.out.println("  弛     弛COCA COLA弛  弛  ###    弛  弛# # # # #弛  弛####弛    弛     弛 ");
		            System.out.println("  弛     弛     ####弛  弛         弛  弛  # # #  弛  弛####弛    弛     弛                      ⑷營 濠旎  ");
		            System.out.println("  弛     弛####*####弛  弛 F A N   弛  弛# # # # #弛  弛    弛####弛     弛                      " + money);
		            System.out.println("  弛     弛####*    弛  弛     T A 弛  弛    #    弛  弛    弛####弛     弛 ");
		            System.out.println("  弛     弛         弛  弛         弛  弛  CIDER  弛  弛    弛####弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎     弛                      幗が嬪纂");
					System.out.printf ("  弛        %3d          %3d           %3d          %3d         弛        忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n",Drink.屬塭,Drink.�級�,Drink.餌檜棻,Drink.溯萄碳);	
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                               (|) (式)      弛        弛                                 弛\n");
		            System.out.print  ("  弛       ###  ####   ###  #   # ####              #####       弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   #             #           弛        弛                                 弛\n");
		            System.out.print  ("  弛      # ### ####  #   # #   # ####              ####        弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #                     #       弛        弛                                 弛\n");
		            System.out.print  ("  弛       #### #   #  ###   ###  #                 ####        弛        弛                                 弛\n");
					System.out.print  ("  弛     忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖     弛        戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎     弛 ");
					System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎 ");
				}
				else {
					cls();
					String money = df.format(Drink.濠旎);
					System.out.println("  忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖 ");
					System.out.println("  弛                                                            弛 ");
					System.out.println("  弛     ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥   ﹥       ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥     ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥     弛 ");
					System.out.println("  弛         ﹥﹥       ﹥         ﹥  ﹥     ﹥﹥﹥          ﹥   ﹥     弛 ");
					System.out.println("  弛         ﹥﹥       ﹥         ﹥  ﹥     ﹥           ﹥    ﹥     弛 ");
					System.out.println("  弛        ﹥  ﹥      ﹥﹥﹥     ﹥﹥﹥﹥﹥﹥﹥﹥   ﹥          ﹥     ﹥     弛 ");
					System.out.println("  弛       ﹥    ﹥     ﹥                            ﹥      ﹥     弛        ***********************************");
					System.out.printf ("  弛      ﹥      ﹥    ﹥         ﹥                 ﹥       ﹥     弛                       憲葡っ                 \n");
					System.out.printf ("  弛     ﹥        ﹥   ﹥         ﹥                ﹥        ﹥     弛        %-15s 唳堅 �蝦�:%s              \n","Level : " + Drink.衛除離檜,Drink.唳堅�蝦�);
					System.out.printf ("  弛                  ﹥         ﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥﹥     ﹥         ﹥     弛        %-30s              \n",Drink.詭衛雖.get(4));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(3));
					System.out.printf ("  弛                                                            弛        %-30s              \n",Drink.詭衛雖.get(2));
		            System.out.printf ("  弛        COLA         FANTA        CIDER      RED BULL       弛        %-30s              \n",Drink.詭衛雖.get(1));
		            System.out.printf ("  弛     忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖  忙式式式式式式式式式忖     弛        %-30s              \n",Drink.詭衛雖.get(0));
		            System.out.println("  弛     弛         弛  弛 ###     弛  弛    #    弛  弛####弛    弛     弛        ***********************************");
		            System.out.println("  弛     弛COCA COLA弛  弛  ###    弛  弛# # # # #弛  弛####弛    弛     弛 ");
		            System.out.println("  弛     弛     ####弛  弛         弛  弛  # # #  弛  弛####弛    弛     弛                      ⑷營 濠旎  ");
		            System.out.println("  弛     弛####*####弛  弛 F A N   弛  弛# # # # #弛  弛    弛####弛     弛                      " + money);
		            System.out.println("  弛     弛####*    弛  弛     T A 弛  弛    #    弛  弛    弛####弛     弛 ");
		            System.out.println("  弛     弛         弛  弛         弛  弛  CIDER  弛  弛    弛####弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎  戌式式式式式式式式式戎     弛                      幗が嬪纂");
					System.out.printf ("  弛        %3d          %3d           %3d          %3d         弛        忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖\n",Drink.屬塭,Drink.�級�,Drink.餌檜棻,Drink.溯萄碳);	
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                                            弛        弛                                 弛\n");
					System.out.print  ("  弛                                               (|) (式)      弛        弛                                 弛\n");
		            System.out.print  ("  弛       ###  ####   ###  #   # ####              #####       弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #   #             #           弛        弛                                 弛\n");
		            System.out.print  ("  弛      # ### ####  #   # #   # ####              ####        弛        弛                                 弛\n");
		            System.out.print  ("  弛      #   # #   # #   # #   # #                     #       弛        弛                                 弛\n");
		            System.out.print  ("  弛       #### #   #  ###   ###  #                 ####        弛        弛                                 弛\n");
					System.out.print  ("  弛     忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖     弛        戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎\n");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     弛                                                弛     弛 ");
					System.out.println("  弛     戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎     弛 ");
					System.out.println("  戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎 ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // 轎溘詭模萄 end
	public static void 衛濛蘋遴お() {
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
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("          〤〤                 ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("          〤〤     〤〤          ");
				System.out.println("          〤〤     〤〤          ");
				System.out.println("          〤〤     〤〤          ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                 〤〤          ");
				System.out.println("                 〤〤          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("                  〤〤         ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				System.out.println("          〤〤                 ");
				System.out.println("          〤〤                 ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("            〤〤〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("              〤〤             ");
				System.out.println("          〤〤〤〤〤〤〤〤〤〤         ");
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
	 public static void 衛濛�飛�() {
			System.out.println("********* 濠っ晦 啪歜 *********");
			System.out.println("     濠っ晦縑 擠猿熱陛 賅濠塭憮   ");
			System.out.println("     っ衙ж雖 跤ж賊 唳堅殮棲棻   ");
			System.out.println("         澀 瓣錶輿撮蹂!        ");
			System.out.println("*****************************");
	 }
	 
	 public static boolean 楨觼っ薑(long 啪歜衛除) {
		 for(int i = 0 ; i < 5 ; i++) {
			 if(Drink.楨韁.get(i).getPlaytime() < 啪歜衛除) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public static void 楨觼蛔煙(long 啪歜衛除, String 檜葷, String 囀詮お) {
		 for(int i = 0 ; i < 5 ; i++) {
			 if(Drink.楨韁.get(i).getPlaytime() < 啪歜衛除) {
				 Rank rank = new Rank(i+1, 檜葷, 啪歜衛除, 囀詮お);
				 Drink.楨韁.add(i,rank);
				 break;
			 }
		 }	 	 
	 }
	 
	 public static void 楨觼轎溘() {
		 System.out.println("--------牖嬪ル--------");
		 System.out.println("楨韁\t檜葷\tЫ溯檜衛除\t\t囀詮お");
		 for(int i = 0 ; i < 5 ; i++) {
			 System.out.println(Drink.楨韁.get(i).getRank()+"\t"+ Drink.楨韁.get(i).getName()+"\t"+ Drink.楨韁.get(i).getPlaytime()+"\t\t"+ Drink.楨韁.get(i).getContent());
		 }
		 System.out.println("---------------------");
	 }
	 
	 public static void save() {
		 try { // 蕨諼[螃盟]陛 嫦儅й匙 偽擎 囀萄 僮擠 (蕨鼻)					// だ橾 唳煎 , 檜橫噙晦=true[褫暮]
				FileOutputStream fileOutputStream = new FileOutputStream("D:/java/濠っ晦.txt");
				for(int i = 0 ; i < 5 ; i++) {
					String 頂爾頂晦 = Drink.楨韁.get(i).getRank()+","+Drink.楨韁.get(i).getName()+","+Drink.楨韁.get(i).getPlaytime()+","+Drink.楨韁.get(i).getContent()+"\n";
					fileOutputStream.write(頂爾頂晦.getBytes()); // 僥濠翮 -> 夥檜お翮
				}
			}
			catch(Exception e) { // 蕨諼[螃盟] 籀葬[濩晦] : Exception 贗楚蝶
			}
	 }
	 
	public static void load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/濠っ晦.txt");
			byte[] bytes = new byte[1024]; // bit -> byte -> kb -> mb -> gb
			fileInputStream.read(bytes);
			String だ橾頂辨 = new String(bytes); // 夥檜お翮 -> 僥濠翮
			String[] file = だ橾頂辨.split("\n");	
			int i = 0 ;
			for(String temp : file) {
				String[] в萄跡煙 = temp.split(",");
				Rank rank = new Rank(Integer.parseInt(в萄跡煙[0]), в萄跡煙[1], (long)(Integer.parseInt(в萄跡煙[2])),в萄跡煙[3]);
				// 葬蝶お 盪濰
				Drink.楨韁.remove(i);
				Drink.楨韁.add(i,rank);
				i++;
			}
			
		
		}
		catch(Exception e){ // catch : 蕨諼 濩晦 -> Exception 贗楚蝶曖 偌羹縑 盪濰
		}
	}

	 
}
	
