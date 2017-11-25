import java.util.ArrayList;
import java.util.List;

public class Meat
{
    String MeatName;
    List<String> Alerg = new ArrayList<String>();
    Double Cal;
    Double Price;

    public String getMeatName()
    {
        return MeatName;
    }

    public Double getCal() { return Cal; }

    public Double getPrice() { return Price; }

    public List<String> getAlerg() {
        return Alerg;
    }

    public void AddAlerg(String Alergenai)
    {
        Alerg.add(Alergenai);
    }

    public Meat(String MeatName, Double Cal, Double Price)
    {
        this.MeatName = MeatName;
        this.Cal = Cal;
        this.Price = Price;
    }

    @Override
    public String toString()
    {
        return ("Meat " + this.getMeatName() + " alerg " + getAlerg());
    }
}
