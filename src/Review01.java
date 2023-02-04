
public class Review01 {

    public static void main(String[] args) {

        //　税抜価格を代入する変数の宣言と値の代入
        int priceExcludingTax = 1500;

        //　消費税額を代入する変数の宣言と、税抜価格から消費税額を計算するメソッドtaxMethodを呼び出しと値の代入
        int tax = taxMethod(priceExcludingTax);

        // 税抜価格と消費税額から税込価格を計算する
        int priceIncludingTax = priceExcludingTax + tax;

        // 計算結果を表示する
        System.out.println(priceExcludingTax + "円の商品の税込価格は" + priceIncludingTax + "円（消費税は" + tax + "円）です。");
    }


    public static int taxMethod(int priceExcludingTax) {

        // 税率を代入する変数の宣言と値*の代入（*2023年1月時点の税率は10%）
        double taxRate = 0.1;

        // 税抜価格と消費税率から消費税額を計算し、返却する
        int result = ((int)(priceExcludingTax * taxRate));
        return result;
    }

}
