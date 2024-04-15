package observerPattern;

/**
 * Store description.
 *
 * @author Daniel
 * @version 14/04/2024
 */
public class Store {

  private final NotificationService service;

  public Store() {
    service = new NotificationService();
  }

  public NotificationService getService() {
    return service;
  }

}
