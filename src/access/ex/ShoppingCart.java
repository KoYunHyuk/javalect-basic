package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount++] = item;
    }


    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<itemCount; i++){
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());;
    }

    // 내부에서만 사용하는 메서드여서 private 로 선언 - 캡슐화(Encapsulation)
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i=0; i<itemCount; i++){
            Item item = items[i]; // Ctrl + Alt + v
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
