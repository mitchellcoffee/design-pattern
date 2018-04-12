package morris.designpattern.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Random rand;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        rand = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(rand.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
