package morris.designpattern.strategy.a;

public class Hand {

    public static final int HANDVALUE_GUU = 0;   // 石头
    public static final int HANDVALUE_CHO = 1;   // 剪刀
    public static final int HANDVALUE_PAA = 2;

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    public static final String[] name = {
            "石头", "剪刀", "布"
    };

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand b) {
        return fight(b) == 1;
    }

    public boolean isWeakerThan(Hand b) {
        return fight(b) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}


