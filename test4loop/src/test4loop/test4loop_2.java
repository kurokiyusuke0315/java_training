package test4loop;
import java.io.*;
/**
 * 実力確認問題　4．for文
 **/
public class test4loop_2
{
	/**
	 * 商品と単価、支払金額を3回入力、String型配列に格納し、支払金額の不足有無を出力する。
	 * 不足金額がある場合は、String型配列からint型配列に変換した値を使用し不足金額の合計を出力する。
	 * @param args　商品、単価、支払金額の格納、不足金額有無の判別と出力、不足金額合計の出力
	 **/
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String[][] list = new String[3][3];		//商品、単価、支払金額格納　文字列
		int[][] list2 = new int[3][2];		//単価、支払金額格納　値
		int sumfusoku = 0;		//不足合計
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println("商品を入力してください。");
			String str = br.readLine();
			list[i][0] = str;
			
			if (str.isEmpty()) {
				System.out.println((i + 1) + "回目の" + "商品名の入力がありません。");
				break;
			}
			
			System.out.println("単価を入力してください。");
			String str2 = br.readLine();
			list[i][1] = str2;
			list2[i][0] = Integer.parseInt(list[i][1]);
			
			if (list2[i][0] <= 0) {
				System.out.println((i + 1) + "回目の単価に0以上の整数を入力して下さい。");
				break;
			}

			System.out.println("支払金額を入力してください。");
			String str3 = br.readLine();
			list[i][2] = str3;
			list2[i][1] = Integer.parseInt(list[i][2]);
			
			if (list2[i][0] > list2[i][1]) {
				sumfusoku += list2[i][0] - list2[i][1]; 
			}
			
			if (list2[i][1] <= 0) {
				System.out.println((i + 1) +"回目の支払金額に0以上の整数を入力して下さい。");
				break;
			}
		}
		
		if (list[0][1] != null || list[0][2] != null) {
			if (list2[0][0] > list2[0][1]) {
				System.out.println(list[0][0] + "、" + list[0][1] + "円、" + "支払金額不足");
			}
			else {
				System.out.println(list[0][0] + "、" + list[0][1] + "円、" + "支払金額不足無し");
			}
		}
		
		if (list[1][1] != null || list[1][2] != null) {
			if (list2[1][0] > list2[1][1]) {
				System.out.println(list[1][0] + "、" + list[1][1] + "円、" + "支払金額不足");
			}
			else {
				System.out.println(list[1][0] + "、" + list[1][1] + "円、" + "支払金額不足無し");
			}
		}
		
		if (list[2][1] != null || list[2][2] != null) {
			if (list2[2][0] > list2[2][1]) {
				System.out.println(list[2][0] + "、" + list[2][1] + "円、" + "支払金額不足");
			}
			else {
				System.out.println(list[2][0] + "、" + list[2][1] + "円、" + "支払金額不足無し");
			}
		}
		
		if (sumfusoku > 0) {
		System.out.println("全体の不足金:" + sumfusoku + "円");
		}
	}
}