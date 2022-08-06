package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Order order;
    private Address address;
    private Status status;
}
