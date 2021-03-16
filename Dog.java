
/**
 * Creates a dog object
 *
 * @author Del Huang
 * @version 16/03/21
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private String name;
    private int hp;
    
    /**
     * Constructor for objects of class Dog
     */
    public Dog(String nm)
    {
        // initialise instance variables
        name = nm;
        hp = 150;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void bark() {
        System.out.println("bark");
    }
    public String getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public void hit(int amt) {
        this.hp -= amt;
    }
    public int bite() {
        int MIN = 1;
        int MAX = 10;
        return (int) (MIN + Math.random() * MAX);
    }
    public boolean isAlive() {
        if (this.hp <= 0){
            return false;
        }
        return true;
    }
}
