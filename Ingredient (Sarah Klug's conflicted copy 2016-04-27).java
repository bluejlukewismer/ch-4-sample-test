
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ingredient
{
    // instance variables - replace the example below with your own
    private String name;
    private int amount;
    private boolean needToBuy;

    /**
     * Constructor for objects of class Ingredient
     */
    public Ingredient(String name, int amount, boolean needToBuy)
    {
        this.name = name;
        this.amount = amount;
        this.needToBuy = needToBuy;
    }

    /**
     * print info on the ingredient
     */
    public void printDetails()
    {
        if(needToBuy)
        {
            System.out.println(name + "- amount: " + amount + " - still need to purchase? no");  
        }
        else{
            System.out.println(name + "- amount: " + amount + " - still need to purchase? yes");
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public boolean needToBuy()
    {
        return needToBuy;
    }
}
