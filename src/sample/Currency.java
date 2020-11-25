package sample;

public class Currency
{
    public String sign;
    public double value;

    public Currency(String sign, double value)
    {
        this.sign = sign;
        this.value = value;
    }
    public double getValue()
    {
        return value;
    }
    public void setValue(double value)
    {
        this.value = value;
    }

}
