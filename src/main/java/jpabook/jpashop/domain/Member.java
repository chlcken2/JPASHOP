package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded //내장타입을 가지고있다

    private Address address;

    @OneToMany(mappedBy = "member") // order에 있는 member 필드에 의해 매핑된거란 선언
    private List<Order> orders = new ArrayList<>();

}
