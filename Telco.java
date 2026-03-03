public class Telco implements TelcoSubscription {

    private int dataAllowance;
    private int promoPrice;
    private TelcoName telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, int promoPrice, TelcoName telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public TelcoName getTelcoName() {
        return telcoName;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public int getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}
