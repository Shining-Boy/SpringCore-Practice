package hello.coretry.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.coretry.member.Grade;
import hello.coretry.member.Member;
import hello.coretry.member.MemberService;
import hello.coretry.member.MemberServiceImpl;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
