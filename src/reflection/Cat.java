package reflection;

/**
 * Cat description.
 *
 * @author Daniel
 * @version 13/04/2024
 */
public class Cat {

  private int id;
  private String name;
  private static final String dontChangeThisEVER = "final";

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getDontChangeThisEVER() {
    return dontChangeThisEVER;
  }

  public Cat(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void doAThing() {
    System.out.println("thing");
  }

  private void doAPrivateThing() {
    System.out.println("o.0... how?");
  }

  private static void doAPrivateStaticThing() {
    System.out.println("Hey hey get out of here!");
  }

  private void doAPrivateThingWithParam(String quote) {
    System.out.println("o.0... how? " + quote);
  }

  private static void doAPrivateStaticThingWithParams(String quote, String name) {
    System.out.println("Hey hey get out of here! " + quote + " " + name);
  }
}
