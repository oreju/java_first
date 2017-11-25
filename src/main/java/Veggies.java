import java.util.ArrayList;
import java.util.List;

public class Veggies
{
    String VeggiesName;
    List<String> Alerg = new ArrayList<String>();
    Double Price;

    public String getVeggiesName()
    {
        return VeggiesName;
    }

    public Double getPrice() { return Price; }


    public Veggies(String VeggiesName, Double Price)
    {
        this.VeggiesName = VeggiesName;
        this.Price = Price;

    }

    @Override
    public String toString()
    {
        return ("Veggies " + this.getVeggiesName() + " price " + getPrice());
    }
}
