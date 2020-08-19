package lu.uni.intro2prog.exam.task1;

/**
 * Launcher Class for 'task 1' project
 */
public class Launcher {

    /**
     * Main Method
     *
     * @param args attributes read from console batch
     */
    public static void main(String[] args) {
        // Instantiate objects
        Container c24 = new Container(2, 3, 4); // capacity: 24
        Container c27 = new Container(3, 3, 3); // capacity: 27
        Container c60 = new Container(5, 4, 3); // capacity: 60
        Container c84 = new Container(7, 2, 6); // capacity: 84
        Storage s1 = new Storage();
        Storage s2 = new Storage();
        Storage s3 = new Storage();

        // Operations
        s1.add(c24);
        s1.add(c60);
        System.out.println("total capacity of s1: " + s1.getTotalCapacity()); // should be 84
        s2.add(c84);
        System.out.println("total capacity of s2: " + s2.getTotalCapacity()); // should be 84
        s3.add(c24);
        s3.add(c27);
        System.out.println("total capacity of s3: " + s3.getTotalCapacity()); // should be 51

        System.out.println("s1 equals s2: " + s1.equals(s2)); // should be true
        System.out.println("s1 equals s3: " + s1.equals(s3)); // should be false
    }
}
