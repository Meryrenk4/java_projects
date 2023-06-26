package BoxingMatch.src;

public class MainBoxingMatch {
    public static void main(String[] args) {
        // Mark is the first fighter and Alex is the second fighter
        Fighter marc = new Fighter("Marc" , 15 , 100, 100, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);

        // Usage the method
        if (marc.whoStarts()) {
            // the condition is true, so the first fighter must be start
            Ring r = new Ring(marc, alex, 100, 100);
            r.run();
        } else {
            // the condition is false, so the second fighter must be start
            Ring r = new Ring(alex, marc, 100, 100);
            r.run();
        }
    }
}