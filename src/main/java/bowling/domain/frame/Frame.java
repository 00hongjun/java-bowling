package bowling.domain.frame;

import bowling.domain.frame.state.State;
import bowling.domain.pin.Pins;
import bowling.domain.score.Score;

import java.util.List;

public interface Frame {

    int MAX_FRAME_NUMBER = 10;

    Frame bowl(final int pinCount);

    boolean isFinish();

    boolean isEnd();

    boolean isFrameFinish(int frameNumber);

    Frame createNext();

    Frame getNext();

    State getState();

    Frame findLast();

    Score getCurrentScore();

    Score getTotalScore(int frameNumber);

    Score getCalculateScore(Score before);

    Frame findFrame(int frameNumber);

    List<Pins> getPins();
}
