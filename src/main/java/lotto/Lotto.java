package lotto;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Lotto {
    private final List<Integer> numbers;
    WinningNumInput winningNumInput = new WinningNumInput();

    public Lotto(List<Integer> numbers) {

        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            System.out.println("[ERROR] 로또 번호는 6개입니다.");
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(i).equals(numbers.get(j))) {
                    System.out.println("[ERROR] 로또 번호가 중복됩니다.");
                    throw new IllegalArgumentException();

                }
            }
        }
    }
}
