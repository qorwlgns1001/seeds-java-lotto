package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                if (i == j) {
                    continue;
                }
                if (numbers.get(i).equals(numbers.get(j))) {
                    throw new IllegalArgumentException();
                }
            }
        }
    }
}
