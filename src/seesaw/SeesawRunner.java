package seesaw;
public class SeesawRunner {

    public static void main(String[] args) {
        Seesaw runner = new Seesaw();
        System.out.println("sum is: "+runner.sum());
        System.out.println("difference is: "+runner.difference());
        System.out.println("product is: "+runner.product());
        System.out.println("average is: "+runner.average());
        System.out.println("absolute is: "+runner.absolute());
        System.out.println("maximum is: "+runner.maximum());
        System.out.println("minimum is: "+runner.minimum());
    }
}
