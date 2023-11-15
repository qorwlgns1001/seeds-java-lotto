package lotto;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class LottoInput {
    public List<Integer> winningNumber = new ArrayList<>();
    private int bonusNumber;
    private String winningNumberInput;

    public void winningNumInput() {
        System.out.println();
        System.out.println("당첨 번호를 입력해 주세요.");
        winningNumberInput = readLine();
        String[] splitString = winningNumberInput.split(",");


        for (int i = 0; i < splitString.length; i++) {
            winningNumber.add(Integer.parseInt(splitString[i]));
        }

        Lotto lotto = new Lotto(winningNumber);
        System.out.println();
        System.out.println("보너스 번호를 입력해 주세요.");
        bonusNumber = Integer.parseInt(readLine());
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
