package hello.coretry.discount;

import org.springframework.stereotype.Component;

import hello.coretry.member.Grade;
import hello.coretry.member.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
