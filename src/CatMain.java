public class CatMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.run();

        System.out.println(cat.breed);
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);

        cat.breed = "sfinks";
        cat.name = "baz";
        cat.age = 3;
        cat.weight = 3;

        System.out.println(cat.breed);
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.weight);

        Cat cat2 = new Cat();
        cat2.breed = "savana";
        cat2.name = "daz";
        cat2.age = 3;
        cat2.weight = 2;

        System.out.println(cat2.breed);
        System.out.println(cat2.name);
        System.out.println(cat2.age);
        System.out.println(cat2.weight);

        cat2.run();

    }
}