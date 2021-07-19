public class TemplatePattern {
    public static void main(String[] args) {
        AbstractCooking cookingFood = new CookingFood();
        cookingFood.cook();
        CookingFood cookingFood_special = new CookingFood();
        cookingFood_special.specialHandler();
    }
}
