package ClassWork;

public class Card {
    private String folower;
    private char number;

    public Card(String folower, char number) {
        this.folower = folower;
        this.number = number;
    }

    public void showCard(){
        System.out.println("花色：" + folower + "\n点数：" + number);
    }

}
