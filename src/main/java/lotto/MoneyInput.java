package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class MoneyInput {
    public String moneyInput;
    public int money;
    public int lottoCount = 0;

    public void inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        moneyInput = readLine();
        for (int i = 0; i < moneyInput.length(); i++) {
            if (moneyInput.charAt(i) < '0' || moneyInput.charAt(i) > '9') {
                System.out.println("[ERROR] 구입금액을 다시 확인해주세요");
                throw new IllegalArgumentException();
            }
        }
        money = Integer.parseInt(moneyInput);
        if (money % 1000 != 0) {
            System.out.println("[ERROR] 금액을 다시 확인해주세요.");
            throw new IllegalArgumentException();
        }
        lottoCount = money / 1000;
        System.out.println();
    }
}
