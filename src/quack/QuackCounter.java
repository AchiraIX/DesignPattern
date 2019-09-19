package quack;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numOfQuack;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
        numOfQuack++;
    }

    public static int getQuack(){
        return numOfQuack;
    }
}
