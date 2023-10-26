package hello.coretry.order;

import hello.coretry.discount.DiscountPolicy;
import hello.coretry.discount.FixDiscountPolicy;
import hello.coretry.member.Member;
import hello.coretry.member.MemberRepository;
import hello.coretry.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
    
}
