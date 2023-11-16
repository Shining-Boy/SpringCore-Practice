package hello.coretry;

import hello.coretry.discount.FixDiscountPolicy;
import hello.coretry.member.MemberService;
import hello.coretry.member.MemberServiceImpl;
import hello.coretry.member.MemoryMemberRepository;
import hello.coretry.order.OrderService;
import hello.coretry.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(
            new MemoryMemberRepository(),
            new FixDiscountPolicy()
        );
    }
}
