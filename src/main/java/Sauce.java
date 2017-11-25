import java.util.ArrayList;
import java.util.List;

public class Sauce
{
    String SauceName;
    List<String> Alerg = new ArrayList<String>();
    Double Cal;

    public String getSauceName()
    {
        return SauceName;
    }

    public Double getCal() { return  Cal; }

    public List<String> getAlerg() {
        return Alerg;
    }

    public void AddAlerg(String Alergenai)
    {
        Alerg.add(Alergenai);
    }

    public Sauce(String SauceName, Double Cal)
    {
        this.SauceName = SauceName;
        this.Cal = Cal;

    }

    @Override
    public String toString()
    {
        return ("Crust " + this.getSauceName() + " alerg " + getAlerg());
    }
}
