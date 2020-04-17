package monopoly;

public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player player) {
        int money = player.getNetWorth();
        money = (int) Math.min(200, 0.1*money);
        player.reduceCash(money);
    }
}
