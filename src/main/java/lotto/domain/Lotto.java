package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    private static final int LOTTO_SIZE = 6;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateLottoSize(numbers);
        this.numbers = numbers;
    }



    private static void validateLottoSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("Lotto에는 " + LOTTO_SIZE + "개의 숫자만 들어올 수 있습니다.");
        }

    }

    public List<Integer> retrieveNumbers() {
        return new ArrayList<>(numbers);
    }

    public long retrieveCorrectNum(List<Integer> correctNums) {
        return numbers.stream()
                .filter(correctNums::contains)
                .count();
    }
}
