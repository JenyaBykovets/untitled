public class Cat {

        String breed;
        String name;
        int age;
        int weight;

        public Cat() {
            System.out.println("created!");
        }

        public Cat(String breed, String size, int age, String color) {
            this.breed = breed;
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void run() {
            System.out.println("cat runs");
        }

        public boolean equals(Object obj) {
            if (obj instanceof Cat) {
                Cat cat = (Cat) obj;
                return this.name.equals(cat.name) && this.age == cat.age;
            }
            return false;
        }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

