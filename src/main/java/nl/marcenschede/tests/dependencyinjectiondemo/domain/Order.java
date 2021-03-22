package nl.marcenschede.tests.dependencyinjectiondemo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@With
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;
    private String naam;
    private OrderStatus status = OrderStatus.OPEN;
}
