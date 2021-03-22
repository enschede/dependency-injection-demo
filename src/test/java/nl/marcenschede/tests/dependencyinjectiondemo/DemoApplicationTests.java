package nl.marcenschede.tests.dependencyinjectiondemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderManager beheerder;

    @Test
    void finderTest() {

        beheerder.cancelOrder(1L);

        final var order = orderRepository.findOrderByOrderId(1L);
        log.info("Found is {}", order);
    }

}
