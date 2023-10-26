package hello.coretry;

import hello.coretry.member.Grade;
import hello.coretry.member.Member;
import hello.coretry.member.MemberService;
import hello.coretry.member.MemberServiceImpl;
import hello.coretry.order.Order;
import hello.coretry.order.OrderService;
import hello.coretry.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
