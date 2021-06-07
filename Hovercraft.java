public class Hovercraft implements SeaVessel, LandVehicle{
	String enterLand(){
		return "VROOM";
  }
	String enterSea(){
		return "BLOOSH";
  }
	public String drive(){
		return "BRRRR BABY!!!";
  }

  public int Launch(){
    return 100; /*km/h*/
  }
}
