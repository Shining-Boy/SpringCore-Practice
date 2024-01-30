package hello.coretry.member;

public class MemberServiceImpl implements MemberService{
    // private final MemberRepository memberRepository = new MemoryMemberRepository(); //DIP 원칙 위반
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);        
    }
    
    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
