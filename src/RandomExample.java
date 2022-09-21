import java.util.*;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();

        // since these all use the same Random object (rand) they will all produce the exact same "random" number
        getRandom(rand);
        getRandom(rand);
        getRandom(rand);
        getRandom(rand);
    }

    private static void getRandom(Random rand){
        System.out.println(rand.nextInt(30 - 23 + 1) + 23);
    }

}