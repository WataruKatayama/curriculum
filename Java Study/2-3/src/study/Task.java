package study;


	// ① TaskクラスにCalculatorクラスを継承させなさい。
	public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	int calculatorA = Task.plus(10);
    	int calculatorAB = Task.plus(15,15);
    	int calculatorABC = Task.plus(20,20,20);
    	System.out.println("plusメソッドの引数が一つの場合："+calculatorA);
    	System.out.println("plusメソッドの引数が一つの場合："+calculatorAB);
    	System.out.println("plusメソッドの引数が一つの場合："+calculatorABC);
    }
}
