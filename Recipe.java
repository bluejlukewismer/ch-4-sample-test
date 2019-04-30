import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Recipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    private ArrayList<Ingredient> ingredientList;
    private String name;
    private int servings;

    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(String name)
    {
        this.name = name;
        ingredientList = new ArrayList<Ingredient>();
        servings = 1;
        //String name, int amount, boolean needToBuy

    }

    public void addIngredient(Ingredient item)
    {
        ingredientList.add(item);
    }

    /**
     * print all of ingredients in the recipe
     */
    public void printIngredientList()
    {
        for(Ingredient ingredient : ingredientList)
        {
            System.out.println(ingredient.toString());
        }
    }

    /**
     * return an ArrayList that contiains
     * all of ingredients in the recipe
     * that still need to be bought
     */
    public ArrayList<Ingredient> shoppingList()
    {
        ArrayList<Ingredient> shoppingList1;
        shoppingList1 = new ArrayList<Ingredient>();
        for(Ingredient ingredient : ingredientList)
        {
            if(ingredient.needToBuy())
            {
                shoppingList1.add(ingredient);

            }
        }
        return shoppingList1;
    }

    /**
     * Return a single random ingredient from 
     * the ingredientList
     */
    public Ingredient randomIngredient()
    {

        if(ingredientList.size() > 0) {
            Random rand = new Random();
            int ingredient = rand.nextInt(ingredientList.size());
            return ingredient;
        }

    }

    public Ingredient findIngredient()
    {
        for(Ingredient ingredient: ingredientList)
        {
            if(ingredient.getName() == name) {
                return ingredient;
            }
        }
        return null;
    }

}
