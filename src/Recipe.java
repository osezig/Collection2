import java.util.*;

public class Recipe {

    private Set<Products> productsSet;
    private int sumProducts;
    private String name;

    public Recipe(String name) {
        this.productsSet = new HashSet<>();
        this.name = name;
    }

    public Set<Products> getProductsSet() {
        return productsSet;
    }

    public int getSumProducts() {
        return sumProducts;
    }

    public String getName() {
        return name;
    }

    public void addProductInRecipe(Products... products) {
        this.productsSet.addAll(Arrays.asList(products));
        for (Products prod : this.productsSet) {
            this.sumProducts += prod.getCost();
        }
    }

    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " уже находится в множестве");
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeSet=" + productsSet +
                ", sumProducts=" + sumProducts +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(name, recipe.name);
//        return sumProducts == recipe.sumProducts && Objects.equals(productsSet, recipe.productsSet) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsSet, sumProducts, name);
    }
}