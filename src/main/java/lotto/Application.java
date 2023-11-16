package lotto;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        MoneyInput moneyInput = new MoneyInput();
        RandomLotto randomLotto = new RandomLotto();
        WinningNumInput winningNumInput = new WinningNumInput();
        PrintTotal printTotal = new PrintTotal();

        moneyInput.inputMoney();
        randomLotto.printRandomLotto(moneyInput.lottoCount);
        winningNumInput.winningNumber();
        winningNumInput.bonusNumber();
        printTotal.printTotalPrice(randomLotto.buyLotto, winningNumInput.winningNumArray, winningNumInput.bonusNumber, moneyInput.lottoCount);
    }
}
