import java.util.ArrayList;
import java.util.List;

public class Cheese
{
    String CheeseName;
    List<String> Alerg = new ArrayList<String>();
    Double Cal;
    Double Price;

    public String getCheeseName()
    {
        return CheeseName;
    }

    public Double getCal() {return Cal; }

    public Double getPrice() {return Price; }

    public List<String> getAlerg() {
        return Alerg;
    }

    public void AddAlerg(String Alergenai)
    {
        Alerg.add(Alergenai);
    }

    public Cheese(String CheeseName, Double Cal, Double Price)
    {
        this.CheeseName = CheeseName;
        this.Cal = Cal;
        this.Price = Price;

    }

    @Override
    public String toString()
    {
        return ("Crust " + this.getCheeseName() + " alerg " + getAlerg());
    }
}
