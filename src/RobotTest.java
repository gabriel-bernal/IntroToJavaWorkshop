import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotTest {
	public static void main(String[] args) {
		Robot C3PO= new Robot();
	
		for (int i = 0; i < 4; i++) {
		C3PO.setSpeed(10);
			C3PO.setPenColor(Color.CYAN);
		C3PO.penDown();
		C3PO.move(300);
		C3PO.turn(90);
		}}}
	


