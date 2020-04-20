package bowling.domain.frame.state;

import bowling.domain.Pins;
import bowling.domain.score.Calculator;
import bowling.domain.score.Score;
import bowling.exception.BowlingException;

public class Ready implements State {

    @Override
    public State bowl(final int pinsCount) {
        Pins pins = Pins.from().bowl(pinsCount);

        if (pins.isFinish()) {
            return new Strike();
        }

        return new FirstBowl(pins);
    }

    @Override
    public boolean isFinish() {
        return false;
    }

    @Override
    public String getCurrentPinsState() {
        throw new BowlingException();
    }

    @Override
    public Score getCurrentScore() {
        throw new BowlingException();
    }

    @Override
    public Calculator getCurrentCalculator() {
        throw new BowlingException();
    }

    @Override
    public Score getCalculateScore(Score before) {
        throw new BowlingException();
    }

    @Override
    public Calculator getScoreCalculate(Calculator calculator) {
        throw new BowlingException();
    }
}
