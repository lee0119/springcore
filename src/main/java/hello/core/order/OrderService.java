package hello.core.order;



//서비스 공부 다시하기
public interface OrderService   {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
