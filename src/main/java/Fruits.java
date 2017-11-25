public class Fruits
{
    String FruitName;
    Double Cal;
    Double Price;

    public String getFruitName()
    {
        return FruitName;
    }

    public Double getCal() {return Cal; }

    public Double getPrice() {return Price; }


    public Fruits(String FruitName, Double Cal, Double Price)
    {
        this.FruitName =FruitName;
        this.Cal = Cal;
        this.Price = Price;
    }

    @Override
    public String toString()
    {
        return ("Fruit " + this.getFruitName() + " calories " + getCal());
    }
}
