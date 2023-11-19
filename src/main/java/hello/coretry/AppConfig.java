package hello.coretry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.coretry.discount.DiscountPolicy;
import hello.coretry.discount.FixDiscountPolicy;
import hello.coretry.discount.RateDiscountPolicy;
import hello.coretry.member.MemberRepository;
import hello.coretry.member.MemberService;
import hello.coretry.member.MemberServiceImpl;
import hello.coretry.member.MemoryMemberRepository;
import hello.coretry.order.OrderService;
import hello.coretry.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
            memberRepository(),
            discountPolicy()
        );
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
