package observerPattern;

import java.util.List;
import java.util.ServiceConfigurationError;

/**
 * Main description.
 *
 * @author Daniel
 * @version 14/04/2024
 */
public class Main {

  public static void main(String[] args) {

    NotificationService service = new NotificationService();
    EventListener listener = new EmailMsgListener("wdaniel.lizardo1@gmail.com");
    EventListener listener1 = new MobileAppListener("444 111 8888");
    service.subscribe(Event.NEW_ITEM, listener);
    service.subscribe(Event.SALE, listener);
    service.subscribe(Event.NEW_ITEM, listener1);
    service.subscribe(Event.SALE, listener1);

    service.notifyCustom(Event.NEW_ITEM);
    service.notifyCustom(Event.SALE);

    service.unsubscribe(Event.NEW_ITEM, listener);
    System.out.println();
    service.notifyCustom(Event.NEW_ITEM);

  }

}
