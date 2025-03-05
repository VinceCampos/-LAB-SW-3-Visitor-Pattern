public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    private boolean unliCallText;

    public Telco(int dateAllowance, double promoPrice, String telcoName, boolean unliCallText)
    {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.unliCallText = unliCallText;
    }

    public String accept(UsagePromo promo, double price){
        return promo.showAllowance(telcoName, price);
    }

    public String accept(UnliCallOffer offer, boolean unliCallText) {
        return offer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName(){
        return telcoName;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public int getDataAllowance(){
        return dateAllowance;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setDateAllowance(Integer dateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}