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
     
    }
    
     /**
     * return an ArrayList that contiains
     * all of ingredients in the recipe
     * that still need to be bought
     */
    public ArrayList<Ingredient> shoppingList()
    {
       return null;
    }
    
    /**
     * Return a single random ingredient from 
     * the ingredientList
     */
    public Ingredient randomIngredient()
    {
        return null;
    }
    
    
}
