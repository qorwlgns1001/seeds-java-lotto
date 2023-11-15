package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputMoney {
    private String input;
    private int inputMoney;
    private int countLotto;
    public ArrayList<List<Integer>> lottoList = new ArrayList<>();

    public void initInputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        input = readLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
        inputMoney = Integer.parseInt(input);
        if (inputMoney % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
        countLotto = inputMoney / 1000;
        System.out.println();
        System.out.println(countLotto + "개를 구매했습니다.");


        for (int i = 0; i < countLotto; i++) {
            lottoList.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        }
        for (int i = 0; i < countLotto; i++){
            lottoList.get(i).sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 < o2) {
                        return -1;
                    } else if (o1.equals(o2)) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
            System.out.println(lottoList.get(i));
        }
    }

    public int getInputMoney() {
        return inputMoney;
    }

    public int getCountLotto() {
        return countLotto;
    }
}
