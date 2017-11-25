import java.util.ArrayList;
import java.util.List;

public class Crust_n_size
{
    String CrustName;
    String Size;
    Double Price;
    Double Cal;
    List<String> Alerg = new ArrayList<String>();

    public String getCrustName()
    {
        return CrustName;
    }

    public String getSize()
    {
        return Size;
    }

    public List<String> getAlerg() {
        return Alerg;
    }

    public void AddAlerg(String Alergenai)
    {
        Alerg.add(Alergenai);
    }

    public Crust_n_size(String CrustName, String Size, Double Price, Double Cal)
    {
        this.CrustName =CrustName;
        this.Size = Size;
        this.Price = Price;
        this.Cal = Cal;
    }

    @Override
    public String toString()
    {
        return ("Crust " + this.getCrustName() + " size " + getSize());
    }
}
