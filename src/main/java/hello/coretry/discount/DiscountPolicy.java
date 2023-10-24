package hello.coretry.discount;

import hello.coretry.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
