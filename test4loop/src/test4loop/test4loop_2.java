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
		
		String[][] List = new String[3][3];		//商品、単価、支払金額格納　文字列
		int[][] List2 = new int[3][2];		//単価、支払金額格納　値
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("商品を入力してください。");
			String str = br.readLine();
			List[i][0] = str;
			
			if(str.isEmpty()) {
				System.out.println((i + 1) + "回目の" + "商品名の入力がありません。");
				break;
			}
			
			System.out.println("単価を入力してください。");
			String str2 = br.readLine();
			List[i][1] = str2;
			List2[i][0] = Integer.parseInt(List[i][1]);
			
			if(List2[i][0] <= 0) {
				System.out.println((i + 1) + "回目の単価に0以上の整数を入力して下さい。");
				break;
			}

			System.out.println("支払金額を入力してください。");
			String str3 = br.readLine();
			List[i][2] = str3;
			List2[i][1] = Integer.parseInt(List[i][2]);
			
			if(List2[i][1] <= 0) {
				System.out.println((i + 1) +"回目の支払金額に0以上の整数を入力して下さい。");
				break;
			}
			
		}
				
		for(int k = 0 ; k < List.length ; k++) {
			
			if(List[k][0].isEmpty()) {
				break;
			}
			if(List2[k][0] <= 0) {
				break;
			}
			if(List2[k][1] <= 0) {
				break;
			}
			
			if(List2[k][0] > List2[k][1]) {
				System.out.println(List[k][0] + "、" + List[k][1] + "円、" + "支払金額不足");
			}
			else {
				System.out.println(List[k][0] + "、" + List[k][1] + "円、" + "支払金額不足無し");
			}
		}
		
		int sum = 0;	//単価合計
		int sum2 = 0;	//支払金額合計
		
		for(int j = 0 ; j < List2.length ; j++) {
			sum += List2[j][0];
			sum2 += List2[j][1];
		}
		
		if(sum > sum2) {
			System.out.println("全体の不足金：" + (sum - sum2) + "円");
		}
	}
}