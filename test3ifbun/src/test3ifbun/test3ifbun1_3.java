package test3ifbun;

import java.io.*;

/*
 * 3.実力確認問題1-3
 */
class test3ifbun1_3
{
	/*試験の点数を入力し、対応する成績を表示するプログラム
	 * 試験は 100 点満点（ 0 点～ 100 点）、点数と成績の対応を表示
	 * 80 点以上：「優」、70 点以上、80 点未満：「良」、60 点以上、70 点未満：「可」、60 点未満：「不可」
	 * @param コマンドの入力、出力される文字列を指定
	 */
	public static void main(String[] args)throws IOException
	{
		System.out.println("試験の点数を入力してください。");
		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println(num+"点");
		
		if (num >= 80 && num <= 100) {
			System.out.println("優");
		}
		else if (num < 80 && num >= 70) {
			System.out.println("良");
		}	
		else if (num < 70 && num >= 60) {
			System.out.println("可");
		}
		else if (num < 60 && num >= 0){
			System.out.println("不可");
		}
		else {
			System.out.println("0～100点で入力してください。");
		}
	}
}