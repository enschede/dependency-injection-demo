package nl.marcenschede.tests.dependencyinjectiondemo.ordermanagement;

import lombok.extern.slf4j.Slf4j;
import nl.marcenschede.tests.dependencyinjectiondemo.domain.OrderStatus;
import nl.marcenschede.tests.dependencyinjectiondemo.domain.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderManager {

    private final OrderNotificator notificator;

    public OrderManager(OrderNotificator notificator) {
        this.notificator = notificator;
    }

    void cancelOrder(Order order) {
        if (order.getStatus() == OrderStatus.CANCELLED) {
            notificator.sendCancelNotification(order);
        } else {
            notificator.sendCannotCancelNotification(order);
        }

    }
}
