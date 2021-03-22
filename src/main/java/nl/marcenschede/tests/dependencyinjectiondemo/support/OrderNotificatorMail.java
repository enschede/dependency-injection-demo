package nl.marcenschede.tests.dependencyinjectiondemo.support;

import nl.marcenschede.tests.dependencyinjectiondemo.domain.Order;
import org.springframework.stereotype.Component;
import nl.marcenschede.tests.dependencyinjectiondemo.ordermanagement.OrderNotificator;

@Component
public class OrderNotificatorMail implements OrderNotificator {

    @Override
    public void sendCancelNotification(Order order) {

    }

    @Override
    public void sendCannotCancelNotification(Order order) {

    }

}
