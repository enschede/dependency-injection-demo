package nl.marcenschede.tests.dependencyinjectiondemo.ordermanagement;

import nl.marcenschede.tests.dependencyinjectiondemo.domain.Order;

public interface OrderNotificator {
    void sendCancelNotification(Order order);
}
