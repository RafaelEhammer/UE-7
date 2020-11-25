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

    public String getSign()
    {
        return sign;
    }
    public double getValue()
    {
        return value;
    }
}
