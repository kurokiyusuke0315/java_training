package test3ifbun;

import java.io.*;

/*
 * 3.実力確認問題2
 */
class test3ifbun2
{
	/*整数値 x, y を入力し、以下のうち該当する条件を表示するプログラム
	 * x は y より小さく、かつ、x と y は共に偶数である。
	 * x と y は等しく、かつ、負の数である。
	 * x は y より小さい、または、x は偶数である。
	 * x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
	 * x も y も負の数である、ではない。（ x も y も負の数である、の否定）
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
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if ((x < y) && (x % 2 == 0) && (y % 2 == 0)) {
			System.out.println("xはyより小さく、かつ、x と y は共に偶数である。");
			if ((x < y) || (x % 2 == 0)) {
				a = 2;
			}
			if ((x <= 10 || x >= 100) && (y >= 10 && y <= 100)){
				b = 3;
			}
			if (!(x < 0) && !(y < 0)) {
				c = 4;
			}
			
		}
		else if ((x == y) && (x < 0 )) {
			System.out.println("x と y は等しく、かつ、負の数である。");
			if ((x < y) || (x % 2 == 0)) {
				a = 2;
			}
			if (!(x < 0) && !(y < 0)) {
				b = 4;
			}
		}	
		else if ((x < y) || (x % 2 == 0)) {
			System.out.println("x は y より小さい、または、xは偶数である。");
			if ((x <= 10 || x >= 100) && (y >= 10 && y <= 100)){
				a = 3;
			}
			if (!(x < 0) && !(y < 0)) {
				b = 4;
			}
		}
		else if ((x <= 10 || x >= 100) && (y >= 10 && y <= 100)){
			System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
			if (!((x < 0) && (y < 0))) {
				a = 4;
			}
		}
		else if (!(x < 0) && !(y < 0)) {
			System.out.println("x も y も負の数である、ではない。(x も y　も負の数である、の否定)");
		}
		
		switch (a) {
			case 2:
				System.out.println("x は y より小さい、または、xは偶数である。");
				break;
			case 3:
				System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
				break;
			case 4:
				System.out.println("x も y も負の数である、ではない。(x も y　も負の数である、の否定)");
				break;
		}
		
		switch (b) {
			case 2:
				System.out.println("x は y より小さい、または、xは偶数である。");
				break;
			case 3:
				System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
				break;
			case 4:
				System.out.println("x も y も負の数である、ではない。(x も y　も負の数である、の否定)");
				break;
		}
		
		switch (c) {
			case 2:
				System.out.println("x は y より小さい、または、xは偶数である。");
				break;
			case 3:
				System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
				break;
			case 4:
				System.out.println("x も y も負の数である、ではない。(x も y　も負の数である、の否定)");
				break;
		}
	}
}