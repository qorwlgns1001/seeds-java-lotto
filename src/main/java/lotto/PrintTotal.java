package lotto;

import java.util.List;

public class PrintTotal {
    public int three = 0, four = 0, five = 0, fiveBonus = 0, six = 0, count = 0;
    public double totalPrice = 0;
    public void printTotalPrice(List<List<Integer>> list, List<Integer> winningList, int bonusNum, int buyCount) {
        for (int i = 0; i < buyCount; i++) {
            count = 0;
            for (int j = 0; j < winningList.size(); j++) {
                if (list.get(i).contains(winningList.get(j))) {
                    count++;
                }
            }
            if (count == 3) {
                three++;
            }
            else if (count == 4) {
                 four++;
            }
            else if (count == 5 && list.get(i).contains(bonusNum)) {
                fiveBonus++;
            }
            else if (count == 5) {
                five++;
            }
            else if (count == 6) {
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
        System.out.printf("총 수익률은 %.1f", totalPrice / (buyCount * 1000));
        System.out.println("%입니다.");
        //3개 일치 (5,000원) - 1개
        //4개 일치 (50,000원) - 0개
        //5개 일치 (1,500,000원) - 0개
        //5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
        //6개 일치 (2,000,000,000원) - 0개
        //총 수익률은 62.5%입니다.
    }
}
