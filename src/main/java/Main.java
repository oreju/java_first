import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("VEIKIU");

        List<Object> history_saved = new ArrayList();


        // paploteliai ir dydis

        Crust_n_size italian_large = new Crust_n_size("Italian Style", "Large", 10.0, 256.0);
        italian_large.AddAlerg("Gluten");
        italian_large.AddAlerg("Milk");
//        for (String alergen : italian_large.getAlerg()) {
//            System.out.println(alergen);
//        }
//        System.out.println(italian_large.getCrustName());

        Crust_n_size classic_large = new Crust_n_size("Classic Style", "Large", 0.9, 1000.0);
        classic_large.AddAlerg("Milk");

        Crust_n_size classic_small = new Crust_n_size("Classic Style", "Small", 0.7, 500.0);
        classic_small.AddAlerg("Milk");

        List<Object> Crust = new ArrayList<>();
        Crust.add(italian_large);
        Crust.add(classic_large);
        Crust.add(classic_small);

        // suris

        Cheese soy = new Cheese("Soy", 100.0, 0.2);
        soy.AddAlerg("Gluten");

        Cheese goat = new Cheese("Goat", 80.0, 0.1);
        goat.AddAlerg("Milk");

        List<Object> CheeseObj = new ArrayList<>();
        CheeseObj.add(soy);
        CheeseObj.add(goat);

        // vaisiai

        Fruits pineap = new Fruits("Pineapples", 10.0, 0.05);
        Fruits orange = new Fruits("Oranges", 5.0, 0.03);

        List<Object> FruitsObj = new ArrayList<>();
        FruitsObj.add(pineap);
        FruitsObj.add(orange);

        // mesa

        Meat pepperoni = new Meat("Pepperoni", 300.0, 4.0);
        Meat salami = new Meat("Salami", 400.0, 3.2);
        Meat beef = new Meat("Beef", 360.0, 2.9);

        List<Object> MeatObj = new ArrayList<>();
        MeatObj.add(pepperoni);
        MeatObj.add(salami);
        MeatObj.add(beef);

        // padazas

        Sauce tomato = new Sauce("Tomato", 300.0);
        Sauce bbq = new Sauce("BBQ", 400.0);
        Sauce garlic = new Sauce("Garlic", 360.0);

        List<Object> SauceObj = new ArrayList<>();
        SauceObj.add(tomato);
        SauceObj.add(bbq);
        SauceObj.add(garlic);

        // prieskoniai

        Spice basil = new Spice("Basil", 15.0);
        Spice garlicsp = new Spice("Garlic", 32.0);

        List<Object> SpiceObj = new ArrayList<>();
        SpiceObj.add(basil);
        SpiceObj.add(garlicsp);

        // darzoves

        Veggies olive = new Veggies("Black Olives", 0.1);
        Veggies jalapenos = new Veggies("Jalapenos", 0.1);
        Veggies spinach = new Veggies("Spinach", 0.1);
        Veggies tomatoes = new Veggies("Tomatoes", 0.1);


        List<Object> VeggiesObj = new ArrayList<>();
        VeggiesObj.add(jalapenos);
        VeggiesObj.add(spinach);
        VeggiesObj.add(olive);
        VeggiesObj.add(tomatoes);

        int i=1;
        //int n=0;
        int select;
        while (i != 0)
        {
            System.out.println("Hi! Build your own pizza");
            System.out.println("1. Choose crust and size:");
            System.out.println("2. Choose sauce:");
            System.out.println("3. Choose spicies:");
            System.out.println("4. Choose veggies:");
            System.out.println("5. Choose cheese:");
            System.out.println("6. Choose fruits:");
            System.out.println("7. Choose meat:");
            System.out.println("8. Show your pizza");
            System.out.println("0. Exit");



            Scanner in = new Scanner(System.in);
            i = in.nextInt();

            switch (i)
            {

                case 1:
                    System.out.println("1. Choose crust and size");


                    System.out.println("0: " +Crust.get(0));
                    System.out.println("1: " +Crust.get(1));
                    System.out.println("2: " +Crust.get(1));
                    select =in.nextInt();
                    History crust = new History(Crust.get(select));
                    history_saved.add(crust.saveCrust_n_size());


                    break;

                case 2:
                    System.out.println("2. Choose cheese");

                    System.out.println("0: " +CheeseObj.get(0));
                    System.out.println("1: " +CheeseObj.get(1));

                    System.out.println("pasirinkite skaiciu");
                    select =in.nextInt();
                    History cheese = new History(CheeseObj.get(select));
                    history_saved.add(cheese.saveCheese());



                    break;
                case 3:
                    System.out.println("3. Choose fruits on your pizza");

                    System.out.println("0: " +FruitsObj.get(0));
                    System.out.println("1: " +FruitsObj.get(1));

                    System.out.println("pasirinkite skaiciu");
                    select =in.nextInt();
                    History save = new History(FruitsObj.get(select));
                    history_saved.add(save.saveFruits());


                    break;
                case 4:
                    System.out.println("4. Choose meat");

                    System.out.println("0: " +MeatObj.get(0));
                    System.out.println("1: " +MeatObj.get(1));
                    System.out.println("2: " +MeatObj.get(2));


                    System.out.println("pasirinkite skaiciu");
                    select =in.nextInt();
                    History meat = new History(MeatObj.get(select));
                    history_saved.add(meat.saveMeat());


                    break;
                case 5:
                    System.out.println("5. Choose sauce");

                    System.out.println("0: " +SauceObj.get(0));
                    System.out.println("1: " +SauceObj.get(1));
                    System.out.println("2: " +SauceObj.get(2));


                    System.out.println("pasirinkite skaiciu");
                    select =in.nextInt();
                    History sauce = new History(SauceObj.get(select));
                    history_saved.add(sauce.saveSauce());



                    break;
                case 6:
                    System.out.println("6. Choose spices");

                    System.out.println("0: " +SpiceObj.get(0));
                    System.out.println("1: " +SpiceObj.get(1));

                    System.out.println("pasirinkite skaiciu");
                    select =in.nextInt();
                    History spice = new History(SpiceObj.get(select));
                    history_saved.add(spice.saveSpice());

                    break;
                case 7:
                    System.out.println("7. Choose veggies");

                    System.out.println("0: " +VeggiesObj.get(0));
                    System.out.println("1: " +VeggiesObj.get(1));

                    System.out.println("pasirinkite skaiciu");
                    select =in.nextInt();
                    History veggies = new History(VeggiesObj.get(select));
                    history_saved.add(veggies.saveVeggies());

                    break;
                case 8:
                    System.out.println("8. Show my pizza.");

                    history_saved.forEach(System.out::println);


                    return;

                //break;
                case 0:
                    System.out.println("Programa baigia darba");
                    break;
                default:
                    System.out.println("Tokio pasirinkimo nėra");
            }


        }













    }

}
