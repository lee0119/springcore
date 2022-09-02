package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy  implements DiscountPolicy {


    private int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
                //enum은 == 쓰는게 맞다 ? grade가 enum이기 때문에 / 그럼 안제 쓸까?
        } else {
            return 0;
        }
    }
}
