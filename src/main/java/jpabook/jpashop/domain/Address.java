package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable // 어딘가 내장이 될수 있다.
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    // JPA 스펙상 기본 생성자가 필수로 필요하다.
    protected Address() {
    }
}
