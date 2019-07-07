public class State {
  private String name;
  private String bird;
  private String flower;

  public State(String stateName, String stateBird, String stateFlower) {
    name = stateName;
    bird = stateBird;
    flower = stateFlower;
  }

  public String getName() {
    return name;
  }
  public String getBird() {
    return bird;
  }
  public String getFlower() {
    return flower;
  }

  public String toString() {

    return String.format("%-30s | %-30s | %-30s\n", name, bird, flower);
  }

}
