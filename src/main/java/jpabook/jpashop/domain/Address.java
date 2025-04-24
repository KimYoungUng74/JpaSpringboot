package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable // 어딘가 내장이 될수 있다.
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
