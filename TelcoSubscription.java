public interface TelcoSubscription {
    TelcoName getTelcoName();
    int getDataAllowance();
    int getPromoPrice();
    boolean getUnliCallText();

    void accept(TelcoVisitor visitor);
}