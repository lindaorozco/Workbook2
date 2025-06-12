package week7.Interfaces.Portfolio;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue) {
        super(name, marketValue);

    }

    @Override
    public double getValue() {

        return getMarketValue();
    }
}
