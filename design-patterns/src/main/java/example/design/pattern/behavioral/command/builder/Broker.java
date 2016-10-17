package example.design.pattern.behavioral.command.builder;

import example.design.pattern.behavioral.command.order.Order;
import example.design.pattern.behavioral.command.order.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1532082 on 10/17/2016.
 */
public class Broker {

    public List<Order> orderList = new ArrayList<Order>();


    public void takeOrder(Order stockOrder) {
        orderList.add( stockOrder);
    }


    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
