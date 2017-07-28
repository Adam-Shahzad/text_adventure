
public class obsticle extends Place {
	int x_value = 1;
	int y_value = 2;

	public String return_text(Player p) {
		return "you hit an obstacle \nYou have " +p.getHit_points()+ " lives left";
	}

}
