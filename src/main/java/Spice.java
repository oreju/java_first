public class Spice
{
    String SpiceName;
    Double Cal;

    public String getSpiceName()
    {
        return SpiceName;
    }

    public Double getCal() { return Cal; }

    public Spice(String SpiceName, Double Cal)
    {
        this.SpiceName = SpiceName;
        this.Cal = Cal;
    }

    @Override
    public String toString()
    {
        return ("Spice " + this.getSpiceName());
    }
}
