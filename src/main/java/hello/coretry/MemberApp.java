package hello.coretry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.coretry.member.Grade;
import hello.coretry.member.Member;
import hello.coretry.member.MemberService;
import hello.coretry.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        //MemberService memberService = new MemberServiceImpl();
        // AppConfig appConfig = new AppConfig();
        // MemberService memberService = appConfig.memberService();
        ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
