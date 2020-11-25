package sample;

import java.util.ArrayList;

public class CurrencyConverter
{
    private ArrayList<Currency> currency = new ArrayList<Currency>();

    public CurrencyConverter()
    {
        currency.add(new Currency("Yen", 124.00));
        currency.add(new Currency("USD", 1.19));
    }

    public ArrayList<String> getSigns()
    {
        ArrayList<String> string = new ArrayList<String>();
        for (Currency cur : currency)
        {
            string.add(cur.getSign());
        }
        return string;
    }
    public double euroTo (String sign, double euro)
    {
        double value = 1.0;

        for (Currency cur : currency)
        {
            if (cur.getSign().equals(sign))
                value = cur.getValue();
        }
        return euro = value;
    }
}
