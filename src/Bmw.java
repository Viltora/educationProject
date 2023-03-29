public class Bmw extends ModelOfAuto implements Gear, Lights {

  private boolean bmwUseLights = false;
  private int averageSpeedOfCar = 65;

  Bmw(String modelOfCar, int yearOfCar) {
    super(modelOfCar, yearOfCar);
  }

  @Override
  public void callModelOfAuto() {
    super.callModelOfAuto();
  }

  @Override
  public void firstGear() {
    System.out.println("30 km/h");
  }

  @Override
  public void secondGear() {
    System.out.println("70 km/h");
  }

  @Override
  public boolean turnOnLightsBeforeTurn(boolean b) {
    return bmwUseLights;
  }
}
