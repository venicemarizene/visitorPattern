public class UnliCallTextPackage implements UnliCallOffer {

    @Override
    public void visit(Telco telco) {
    }

    @Override
    public String showUnliCallsTextOffer(TelcoName name, boolean offer) {
        if (!offer) {
            return "No Unlimited Call/Text. Charged per use.";
        }

        switch (name) {
            case Globe:
                return "Unlimited calls/texts within Globe network.";
            case Ditto:
                return "Unlimited calls/texts to ALL networks.";
            default:
                return "No unlimited offer available.";
        }
    }
}
