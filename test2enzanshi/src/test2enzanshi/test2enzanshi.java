package test2enzanshi;

/**
 * 実力確認問題　2．演算子
 **/
class test2enznshi
{
	/**コンソールに”Hello World!”を表示
	 * 変数1に”Hello”を代入し、変数2に”World”を代入し、2つの文字列を結合させて”Hello World”を表示
	 * int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x とy の値を表示
	 * a) int 型の変数 x に数値 7 を代入し、変数 x の値を3倍及び半分にして表示
	 * @param args　コマンドの引数　出力される文字列、数値を指定
	 **/
	public static void main(String[] args)
	{
		//2-1
		System.out.println("Heloo World!");
		
		//2-2
		String a = "Hello ";
		String b = "World!";
		System.out.println(a + b);
		
		//2-3
		int x = 3;
		int y = 6;
		int z = 0;
		
		z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
		
		//2-4
		x = 7;
		System.out.println(x * 3);
		System.out.println(x / 2);		
	}
}