// © Sebastian Lopez-Cot 2025. Licensed CC BY-NC-SA 4.0.

package code;

import code.world.Policy;

public class StudentPolicy implements Policy {

    public StudentPolicy() {}

    @Override
    public void execute(Robot robot) {
        // TODO: Write your code here.
        robot.turnRight();
        robot.moveForward();
        robot.moveForward();
        robot.turnLeft();
        robot.moveForward();
        robot.moveForward();
        robot.turnRight();
        // Feel free to add whatever variables you need in this class.
    }
}