import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fam {
    public Fam(String motherName) {

    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String motherName = reader.readLine();
         Faml famMother = new Faml (motherName);

         String fatherName = reader.readLine();
         Faml famFather = new Faml (fatherName, famMother);
        System.out.println(famMother);
        System.out.println(famFather);
    }
    public static class Faml {
        private String name;
        private Faml parent;

        public Faml(String name) {
            this.name = name;
        }

        public Faml(String name, Faml parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
          if (parent == null){
              return "This name is " + "no mother";
          }else{
              return "This name is " + "mother is " + parent.name;
          }
        }
    }

}
