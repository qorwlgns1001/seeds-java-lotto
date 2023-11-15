package lotto;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static int three = 0, four = 0, five = 0, fiveBonus = 0, six = 0, cnt = 0;
    private static double totalPrice;


    public static void main(String[] args) {
        InputMoney inputMoney = new InputMoney();
        LottoInput lottoInput = new LottoInput();

        inputMoney.initInputMoney();
        lottoInput.winningNumInput();

        List<Integer> winningNum = new ArrayList<>(lottoInput.winningNumber);
        int bonusNum = lottoInput.getBonusNumber();

        for (int i = 0; i < inputMoney.getCountLotto(); i++) {
            cnt = 0;
            for (int j = 0; j < 6; j++) {
                if (winningNum.contains(inputMoney.lottoList.get(i).get(j))) {
                    cnt++;
                }
            }
            if (cnt == 3) {
                three++;
            } else if (cnt == 4) {
                four++;
            } else if (cnt == 5 && inputMoney.lottoList.get(i).contains(bonusNum)) {
                fiveBonus++;
            } else if (cnt == 5) {
                five++;
            } else if (cnt == 6) {
                six++;
            }
        }

        totalPrice = three * 5000 + four * 50000 + five * 1500000 + fiveBonus * 30000000 + six * 2000000000;
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + three + "개");
        System.out.println("4개 일치 (50,000원) - " + four + "개");
        System.out.println("5개 일치 (1,500,000원) - " + five + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + fiveBonus + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + six + "개");
        System.out.println("총 수익률은 " + totalPrice / inputMoney.getInputMoney() * 100 + "%입니다.");


        //3개 일치 (5,000원) - 1개
        //4개 일치 (50,000원) - 0개
        //5개 일치 (1,500,000원) - 0개
        //5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
        //6개 일치 (2,000,000,000원) - 0개
    }
}
