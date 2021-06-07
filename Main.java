import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<PoliceCar> myList = new ArrayList<PoliceCar>();
    PoliceCar POPO = new PoliceCar();
    myList.add(POPO);
    System.out.println(myList.get(0).soundSiren());
  }
}