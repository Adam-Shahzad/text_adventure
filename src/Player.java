import java.util.ArrayList;

public class Player {
	int x_Co_orrdinates;
	int y_Co_orrdinates;
	int hit_points = 3;
	String direction;

	public Player(int x_Co_orrdinates, int y_Co_orrdinates, String direction) {
		super();
		this.x_Co_orrdinates = x_Co_orrdinates;
		this.y_Co_orrdinates = y_Co_orrdinates;
		this.hit_points = 3;
		this.direction = direction;
	}

	public int getX_Co_orrdinates() {
		return x_Co_orrdinates;
	}

	public void setX_Co_orrdinates(int x_Co_orrdinates) {
		this.x_Co_orrdinates = x_Co_orrdinates;
	}

	public int getY_Co_orrdinates() {
		return y_Co_orrdinates;
	}

	public void setY_Co_orrdinates(int y_Co_orrdinates) {
		this.y_Co_orrdinates = y_Co_orrdinates;
	}

	public int getHit_points() {
		return hit_points;
	}

	public void setHit_points(int hit_points) {
		this.hit_points = hit_points;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {

		this.direction = direction;
	}

	public void move(String direction, Player p) {

		switch (direction) {
		case "n":
			this.y_Co_orrdinates++;
			break;
		case "s":
			this.y_Co_orrdinates--;
			break;
		case "e":
			this.x_Co_orrdinates++;
			break;
		case "w":
			this.x_Co_orrdinates--;
			break;
		default:

		}
		
		

	}

	public String check_goal(goal g,Player p){
		if (this.x_Co_orrdinates==g.x_value&& this.y_Co_orrdinates == g.y_value)
		{
			return g.return_text(p);
		}
		else 
		{
			return "empty";
		}
	}
	
	public String check_obstacle(obsticle o, Player p){
		
		if (this.x_Co_orrdinates==o.x_value && this.y_Co_orrdinates == o.y_value)
		{
			this.setHit_points(this.getHit_points()-o.damage);
			return o.return_text(p);
		}
		else 
		{
			return "empty";
		}
}

	public double compass(goal g,Player p){
		
		int x_diference =Math.abs((g.x_value-p.getX_Co_orrdinates()));
		int y_diference=Math.abs((g.y_value-p.getY_Co_orrdinates()));
		
		double answer = x_diference*x_diference + y_diference*y_diference;
		answer = Math.sqrt(answer);
		return answer;
		
	}

	public String look_around(Place og, Player p)
	{
		
		return "";
		
	}
	
	public boolean check_hit_points(Player p){
		if (this.hit_points >0 ){return true;}
		else {return false;}
	}

	public void look(){
		System.out.println("Your in a forrest");
		
	}
}

