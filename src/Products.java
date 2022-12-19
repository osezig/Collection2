
import java.util.Objects;
import java.util.Set;

public class Products {
    private String name;
    private double cost;
    private double weight;

    private boolean bought;

    public Products(String name, double cost, double weight) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void addProductsInFoodBasket(Set<Products> foodBasket) {
        if (!foodBasket.contains(this)) {
            foodBasket.add(this);
            this.bought = true;
        } else {
            throw new UnsupportedOperationException("Продукт " + this.name + " уже находится в корзине");
        }
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.cost, cost) == 0 && Double.compare(products.weight, weight) == 0 && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }
}