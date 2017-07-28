
public class obsticle extends Place {
	int x_value;
	int y_value;

	public obsticle(int x_value, int y_value) {
		super();
		this.x_value = x_value;
		this.y_value = y_value;
	}

	public String return_text(Player p) {
		return "you hit an obstacle \nYou have " +p.getHit_points()+ " lives left";
	}

}
