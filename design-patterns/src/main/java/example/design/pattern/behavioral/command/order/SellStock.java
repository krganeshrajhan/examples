package example.design.pattern.behavioral.command.order;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
