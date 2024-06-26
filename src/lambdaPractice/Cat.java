package lambdaPractice;

/**
 * Cat description.
 *
 * @author Daniel
 * @version 13/04/2024
 */
public class Cat {

  private int id;
  private String name;

  public Cat(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return id + " " + name;
  }
}
