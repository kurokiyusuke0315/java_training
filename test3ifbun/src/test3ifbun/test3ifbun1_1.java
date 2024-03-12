package test3ifbun;

import java.io.*;

/*
 * 3.実力確認問題1-1
 */
class test3ifbun1_1
{
	/*試験の点数を入力し、対応する成績を表示するプログラム
	 * 試験は 100 点満点（ 0 点～ 100 点）、点数と成績の対応を表示
	 * 60 点以上：「合格」、60 点未満：「不合格」
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
		
		if (num >= 60 && num <= 100) {
			System.out.println("合格");
		}
		else if (num < 60 && num >= 0) {
			System.out.println("不合格");
		}
		else {
			System.out.println("0～100点で入力してください。");
		}
	}
}