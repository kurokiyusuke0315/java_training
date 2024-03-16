package test3ifbun;

import java.io.*;

/*
 * 3.実力確認問題2
 */
class test3ifbun2
{
	/*整数値 x, y を入力し、以下のうち該当する条件を表示するプログラム
	 * x は y より小さく、かつ、x と y は共に偶数である。
	 * xとyは等しく、かつ、負の数である。
	 * x は y より小さい、または、x は偶数である。
	 * @param コマンドの入力、出力される文字列を指定
	 */
	public static void main(String[] args)throws IOException
	{		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		System.out.println("xの値を入力してください。");
		String str1 = br.readLine();
		int x = Integer.parseInt(str1);
		System.out.println("x = " + x);
		
		System.out.println("yの値を入力してください。");
		String str2 = br.readLine();
		int y = Integer.parseInt(str2);
		System.out.println("y = "+y);
		
		if(x == y && (x + y) <= -1) {
			System.out.println("xとyは等しく、かつ、負の数である。");
		}
		else if(x < y && (x + y) % 2 == 0) {
			System.out.println("xはyより小さく、かつ、x と y は共に偶数である。");
			}
		if(x < y || x % 2 == 0) {
			System.out.println("x は yより小さい、または、x は偶数である。");
		}
	}
}