package observerPattern;

/**
 * EmailMsgListener description.
 *
 * @author Daniel
 * @version 14/04/2024
 */
public class EmailMsgListener implements EventListener {

  private final String email;

  public EmailMsgListener(String email) {
    this.email = email;
  }

  @Override
  public void update(Event eventType) {
    System.out.println("send email to " + email + " " + eventType);
  }
}
