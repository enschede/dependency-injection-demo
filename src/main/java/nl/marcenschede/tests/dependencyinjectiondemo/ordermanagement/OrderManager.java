package nl.marcenschede.tests.dependencyinjectiondemo.ordermanagement;

import nl.marcenschede.tests.dependencyinjectiondemo.domain.Order;
import nl.marcenschede.tests.dependencyinjectiondemo.domain.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class OrderManager {

    private final OrderNotificator notificator;

    public OrderManager(OrderNotificator notificator) {
        this.notificator = notificator;
    }

    void cancelOrder(Order order) {
        if (order.getStatus() == OrderStatus.CANCELLED)
            notificator.sendCancelNotification(order);

    }
}
