
/**
 * Write a description of class RecipeDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecipeDemo
{
    // instance variables - replace the example below with your own
    private Recipe recipe;

    /**
     * Constructor for objects of class RecipeDemo
     */
    public RecipeDemo()
    {
        recipe = new Recipe("Salad");

    }

    public void ingListTest()
    {
        recipe.printIngredientList();
    }

    public void shopgListTest()
    {
        System.out.println(recipe.shoppingList()); 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void loadIngredients()
    {
        recipe.addIngredient(new Ingredient("Lettuce", 2, true));
        recipe.addIngredient(new Ingredient("Tomato", 5, true));
        recipe.addIngredient(new Ingredient("Dressing", 1, false));
        recipe.addIngredient(new Ingredient("Almonds", 1, true));
        recipe.addIngredient(new Ingredient("Carrots", 1, false));

    }
}
