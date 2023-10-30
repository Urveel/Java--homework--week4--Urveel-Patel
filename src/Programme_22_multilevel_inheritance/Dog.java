package Programme_22_multilevel_inheritance;

public class Dog {
    class BabyDog extends Dog {
        public void weep() {
            System.out.println("weeping...");
        }
    }
}
