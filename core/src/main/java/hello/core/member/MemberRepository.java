package hello.core.member;

public interface MemberRepository {

    void save(Member member);


    //멤버 찾아오기 더 연습 연구
    Member findbyId(Long memberId);

}
