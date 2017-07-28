
public abstract class Place {
	int x_value;
	int y_value;

	public int get_x_value() {
		return x_value;
	}

	public int get_y_value() {
		return y_value;
	}

	public abstract String return_text(Player p);

}