package example.design.pattern.behavioral.command;

import example.design.pattern.behavioral.command.builder.Broker;
import example.design.pattern.behavioral.command.order.BuyStock;
import example.design.pattern.behavioral.command.order.SellStock;
import example.design.pattern.behavioral.command.order.Stock;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
