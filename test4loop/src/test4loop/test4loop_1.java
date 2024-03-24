package test4loop;
/**
 * 実力確認問題　4．for文
 **/
public class test4loop_1 
{
	/**下記の保険契約者の情報をString型配列へ格納し出力する。
	 * 出力の最後に遅延利息が発生している人数を出力してください。
	 * 【保険契約者一覧】
	 * 契約者名	保険料	遅延利息金
	 * 中村	5000	2000
	 * 田島	3000
	 * 小澤	4500	
	 * 大西	6000	3500
	　* @param args　保険契約者情報の格納、契約者情報の出力、遅延利息金発生人数の出力
	　**/
	public static void main(String[] args)
	{
		String[][] hoken = new String[4][3]; //保険契約者情報格納先
		
		hoken[0][0] = "中村";
		hoken[0][1] = "5000";
		hoken[0][2] = "2000";
		hoken[1][0] = "田島";
		hoken[1][1] = "3000";
		hoken[2][0] = "小澤";
		hoken[2][1] = "4500";
		hoken[3][0] = "大西";
		hoken[3][1] = "6000";
		hoken[3][2] = "3500";
		
		int sum = 0; //遅延利息金合計人数
		
		for (int i = 0; i < hoken.length; i++) {
			if (hoken[i][2] != null) {
				sum = sum + 1;
			}
			System.out.println("契約者名：" + hoken[i][0] + "、" + "保険料：" + hoken[i][1] + "円");
		}
		if (sum >= 1) {
			System.out.println("遅延利息金が発生している人数は" + sum + "人です。");
		}
	}
}