package APIWork;

public class Card {
    private  String ds;     // 点数
    private  String hs;     // 花色

    public Card() {
    }

    public Card(String ds, String hs) {
        this.ds = ds;
        this.hs = hs;
    }
    public void showCard() {
        System.out.println(ds + hs + " ");
    }
}
