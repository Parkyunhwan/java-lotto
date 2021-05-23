package step3.domain;

import step3.common.WinningType;

public class ProfitCalculator {
    public double calculate(long money, WinningType[] winningTypes) {
        long prizeSum = 0;
        for(WinningType winningType : winningTypes) {
            prizeSum += winningType.getPrize();
        }

        return calculate(money, prizeSum);
    }

    public double calculate(long money, long prizeSum) {
        return Math.floor(((double)prizeSum/money)*100)/100.0;
    }
}
