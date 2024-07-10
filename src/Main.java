//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RandomObject obj1 = RandomObject.createOrRetrieveInstance("Test");
        System.out.println(obj1);
        RandomObject obj2 = RandomObject.createOrRetrieveInstance("Test 2");
        System.out.println(obj2);


    }
}