import java.util.ArrayList;
/**
 * Where the cats and dogs go to tussle
 *
 * @author Del Huang
 * @version 16/03/21
 */
public class TheArena
{
    // instance variables - replace the example below with your own
    private final int MAXDOGS =3, MAXCATS = 3;
    
    // going to make an array of dogs and cats holding objs
    private ArrayList<Dog> dogs = new ArrayList<Dog>(MAXDOGS);
    private ArrayList<Cat> cats = new ArrayList<Cat>(MAXCATS);
    /**
     * Constructor for objects of class TheArena
     */
    public TheArena()
    {
        fillKennel();
        fight();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fillKennel() {
        for(int idx = 0; idx < dogs.size(); idx++) {
            dogs.add(new Dog ("Dog " + Integer.toString(idx+1)));
            
            System.out.print("Dog " + Integer.toString(idx+1) + "goes ");
        }
    }
    public void dogAttack(Dog dog, Cat cat) {
        System.out.println(dog.getName() + " bites " + cat.getName());
        cat.hit(dog.bite());
        
        if (cat.isAlive() == false) {
            System.out.println(cat.getName() + " is dead!");
        }
    }
    public void fight(){
        this.dogAttack(dogs.get(1), cats.get(2));
        this.dogAttack(dogs.get(1), cats.get(2));
    }
    public void fillCatbed()
    {
        for(int idx = 0; idx < dogs.size(); idx++) {
            dogs.add(new Dog ("Dog " + Integer.toString(idx+1)));
            
        }
    }
}
