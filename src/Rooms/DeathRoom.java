package Rooms;

import Game.Runner;
import People.Person;

public class DeathRoom extends Room
{
    public DeathRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You get stabbed by the thing in the room. You lose.");
        Runner.gameOff();
    }
}