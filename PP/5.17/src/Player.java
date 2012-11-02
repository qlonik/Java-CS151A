
/**
 * Player.java This class represents a player
 *
 * @author Nikita Volodin
 */
public class Player {

    //each player has all points and points for current turn
    private int points, pointsCurrentTurn;

    //constructor
    public Player() {
        points = 0;
        pointsCurrentTurn = 0;
    }
    
    /**
     * 
     * @return All points of a player
     */
    public int getAllPoints() {
        return points;
    }
    
    /**
     * 
     * @return All point of a player at current turn
     */
    public int getPointsCurrentTurn(){
        return pointsCurrentTurn;
    }
    
    /**
     * Adds points to all points
     * @param point Points to add
     */
    public void addPoints(int point) {
        this.points += point;
        pointsCurrentTurn = 0;
    }
    
    /**
     * Adds points to points of current turn
     * @param point Points to add
     */
    public void addCurrentTurnPoints(int point) {
        this.pointsCurrentTurn += point;
    }
    
    /**
     * Drop points for current turn and if parameter true, then overall points as well
     * @param allPoints Drop overall points if it is true
     */
    public void dropPoints(boolean allPoints) {
        pointsCurrentTurn = 0;
        if (allPoints)
            points = 0;
    }
}
