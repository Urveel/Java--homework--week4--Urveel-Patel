package Programme_21_abstractexample;

public class TestAbstraction1 {
    //In real scenario, method is called by programmer or user
    class TestAbstraction{
        public static void main(String args[]){
            Shape s=new Circle1();//In a real scenario, object is provided through m ethod, e.g., getShape() method
            s.draw();
        }
    }

}
