package lotto;

import java.util.ArrayList;
import java.util.List;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class WinningNumInput {
    public String winningNumString;
    public String[] winningNumStringArray;
    public List<Integer> winningNumArray = new ArrayList<>();
    public int bonusNumber;

    public void winningNumber() {
        System.out.println();
        System.out.println("당청 번호를 입력해 주세요.");
        winningNumString = readLine();
        winningNumStringArray = winningNumString.split(",");
        for (String str : winningNumStringArray) {
            if (winningNumArray.contains(Integer.parseInt(str))) {
                System.out.println("[ERROR] 로또번호는 중복되면 안됩니다.");
                throw new IllegalArgumentException();
            }
            winningNumArray.add(Integer.parseInt(str));
        }
        Lotto lotto = new Lotto(winningNumArray);
    }

    public void bonusNumber() {
        WinningNumInput winningNumInput = new WinningNumInput();
        System.out.println();
        System.out.println("보너스 번호를 입력해 주세요.");
        bonusNumber = Integer.parseInt(readLine());
        if (winningNumArray.contains(bonusNumber)) {
            System.out.println("[ERROR] 보너스번호는 중복되면 안됩니다.");
            throw new IllegalArgumentException();
        }
    }
}
