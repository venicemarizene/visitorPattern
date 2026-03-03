public class TelcoAllowance implements UsagePromo {

    @Override
    public void visit(Telco telco) {
    }

    @Override
    public String showAllowance(TelcoName name, int price) {
        switch (name) {
            case Smart:
                return "15GB for ₱500";
            case Globe:
                return "10GB for ₱450";
            case Ditto:
                return "8GB for ₱400";
            default:
                return "Unknown Telco";
        }
    }
}
