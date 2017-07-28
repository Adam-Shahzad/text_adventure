
import java.util.Random;
public class obsticle extends Place {
	int x_value;
	int y_value;
	String outcome;
	

	public obsticle(int x_value, int y_value, String outcome) {
		super();
		this.x_value = x_value;
		this.y_value = y_value;
		this.outcome = outcome;
	}

	public String return_text(Player p) {
		if (outcome.endsWith("lost"))
			{
			Random rn = new Random();
			p.setX_Co_orrdinates(rn.nextInt(4 - 0 + 1) + 0);
			p.setY_Co_orrdinates(rn.nextInt(4 - 0 + 1) + 0);
			}
		return outcome + "\nYou have " +p.getHit_points()+ " lives left";
	}

}
