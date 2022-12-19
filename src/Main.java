import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание №1");

        Set<Products> foodBasket = new HashSet<>();

        Products mango = new Products("Манго", 99.95, 25.1);
        Products pear = new Products("Груши", 77.6, 55.3);
        Products orange = new Products("Апельсины", 30.4, 25.3);
        Products pomegranate = new Products("Гранат", 23.5, 25.3);
        Products bread = new Products("Хлеб", 23.5, 25.3);
        Products milk = new Products("Молоко", 23.5, 25.3);
        Products eggs = new Products("Яйца", 23.5, 25.3);
        Products cherry = new Products("Вишня", 500.5, 3.3);
        Products cucumbers = new Products("Огурцы", 23.5, 25.3);

        mango.addProductsInFoodBasket(foodBasket);
        pear.addProductsInFoodBasket(foodBasket);
        orange.addProductsInFoodBasket(foodBasket);
        pomegranate.addProductsInFoodBasket(foodBasket);
        bread.addProductsInFoodBasket(foodBasket);
        milk.addProductsInFoodBasket(foodBasket);
        eggs.addProductsInFoodBasket(foodBasket);

        foodBasket.remove(eggs);

        System.out.println("\n=======================================");
        System.out.println("Домашнее задание №2");
        System.out.println("Задание 1");

        Set<Recipe> allRecipe = new HashSet<>();
        Recipe saladFresh = new Recipe("Салат");
        Recipe fruitDish = new Recipe("Фруктовая тарелка");
        Recipe omelet = new Recipe("Омлет с вишней");
        Recipe omelet2 = new Recipe("Омлет с вишней2");

        saladFresh.addProductInRecipe(pear, cucumbers);
        fruitDish.addProductInRecipe(orange, pomegranate);
        omelet.addProductInRecipe(milk, eggs, cherry);
        omelet2.addProductInRecipe(milk, eggs, cherry);

        saladFresh.addRecipeInSet(allRecipe);
        fruitDish.addRecipeInSet(allRecipe);
        omelet.addRecipeInSet(allRecipe);
        omelet2.addRecipeInSet(allRecipe);

        System.out.println("\n=======================================");
        System.out.println("Домашнее задание №2");
        System.out.println("Задание 2");

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < 21; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);
        }

        integerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerSet);

        System.out.println("\n=======================================");
        System.out.println("Домашнее задание №3");
        System.out.println("Задание 2");

        int [][] mas = new int[15][3];
        for (int i = 0; i < mas.length; i++){
            for (int h = 0; h<mas[i].length; h++){
                mas[i][h] = (int)(Math.random() * 8) + 2;
                if(h == mas[i].length - 1){
                    mas[i][h] = mas[i][h-2] * mas[i][h-1];
                    for(int q = 0; q < i; q++){
                        if(mas[i][h] == mas[q][h]){
                            if(mas[i][h-1] == mas[q][h-1]||mas[i][h-2] == mas[q][h-2]) --i;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < mas.length; i++){
            System.out.print("Задание №" + (i + 1 + " Умножить "));
            for(int h = 0; h < mas[i].length; h++){
                if(h == 0)
                    System.out.print(mas[i][h] + " на ");
                if(h == 1)
                    System.out.println(mas[i][h]);
            }
        }

        System.out.println("\n=======================================");
        System.out.println("Домашнее задание №3");
        System.out.println("Задание 3");

        Passport passportOne = new Passport(
                1116548999L,
                "Полковник ",
                "Сандерс ",
                "Петрович ",
                "11.03.1980");
        Passport passportTwo = new Passport(
                3216548633L,
                "Иванов ",
                "Кузьма ",
                "КарыОглы ",
                "13.03.1980");
        Passport passportThree = new Passport(
                3216548634L,
                "Волков ",
                "Ильяс ",
                "Игоревич ",
                "13.03.1980");
        Passport passportFour = new Passport(
                3216548632L,
                "Бегиджон ",
                "Иван ",
                "Иванович ",
                "13.03.1980");

        HashSet<Long, Passport> passportMap = new HashMap<>();

        passportMap.put(passportOne.getNumPassport(), passportOne);
        passportMap.put(passportTwo.getNumPassport(), passportTwo);
        passportMap.put(passportThree.getNumPassport(), passportThree);
        System.out.println(passportMap);
        passportMap.put(passportFour.getNumPassport(), passportFour);
        System.out.println(passportMap);

        System.out.println(passportMap.get(54616546L));


    }
}