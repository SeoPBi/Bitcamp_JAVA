package poly.instanceof_;

public class Cup {

    private String itemName;
    private int price;
    private String compnanyName;

    public Cup(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
        this.compnanyName = "컵회사";
    }

    public void showInfo() {
        System.out.println("컵 이름 : " + itemName);
        System.out.println("컵 가격 : " + price);
        System.out.println("컵 회사 : " + compnanyName);
    }
    
    public Cup() {
        this.itemName = "입력안됨";
        this.price = 0;
        this.compnanyName = "컵회사";
    }
}
