package lotto.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LottoMangerTest {

    @Test
    void 로또_맞춘_갯수_체크() {
        LottoManger lottoManger = new LottoManger(3, new FrontExtractStrategy());

        List<Integer> winNumbers = List.of(1, 2, 3, 4, 5, 6);
        assertThat(lottoManger.retrieveWinNums(winNumbers))
                .containsExactly(6L, 6L, 6L);
    }

    @Test
    void 로또_반절_맞춘_갯수_체크() {
        LottoManger lottoManger = new LottoManger(3, new FrontExtractStrategy());

        List<Integer> winNumbers = List.of(1, 11, 12, 7, 2, 5);
        assertThat(lottoManger.retrieveWinNums(winNumbers))
                .containsExactly(3L, 3L, 3L);
    }
}