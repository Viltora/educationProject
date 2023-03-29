public class Volkswagen extends ModelOfAuto implements Gear, Lights {

  private final boolean volkswagenUseLight = true;
  private final int averageSpeedOfCar = 55;

  Volkswagen(String modelOfCar, int yearOfCar) {
    super(modelOfCar, yearOfCar);
  }

  @Override
  public void callModelOfAuto() {
    super.callModelOfAuto();
  }

  @Override
  public void firstGear() {
    System.out.println("25 km/h");
  }

  @Override
  public void secondGear() {
    System.out.println("55 km/h");
  }

  @Override
  public boolean turnOnLightsBeforeTurn(boolean b) {
    return volkswagenUseLight;
  }
}
