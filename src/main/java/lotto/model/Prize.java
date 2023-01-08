package lotto.model;

import lotto.exception.InvalidCashValue;

public class Prize extends Cash {
    public Prize(Cash cash) {
        this(cash.getCash());
    }

    public Prize(long cash) {
        if (cash < 0) {
            throw new InvalidCashValue();
        }

        super.cash = cash;
    }

    @Override
    public Prize plus(Cash val2) {
        return this.plus(val2.getCash());
    }

    @Override
    public Prize plus(long val2) {
        return new Prize(this.cash + val2);
    }
}
