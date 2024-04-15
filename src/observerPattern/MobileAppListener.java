package observerPattern;

/**
 * MobileAppListener description.
 *
 * @author Daniel
 * @version 14/04/2024
 */
public class MobileAppListener implements EventListener {

  private final String phoneNumber;

  public MobileAppListener(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public void update(Event eventType) {
    System.out.println("Sending textMessage to: " + phoneNumber + " " + eventType);
  }
}
