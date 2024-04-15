package observerPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NotificationService description.
 *
 * @author Daniel
 * @version 14/04/2024
 */
public class NotificationService {

  private final Map<Event, List<EventListener>> customers;

  public NotificationService() {
    customers = new HashMap<>();
    Arrays.stream(Event.values()).forEach(event ->
        customers.put(event, new ArrayList<>()));
  }

  public void subscribe(Event eventType, EventListener listener) {
    customers.get(eventType).add(listener);
  }

  public void unsubscribe(Event eventType, EventListener listener) {
    customers.get(eventType).remove(listener);
  }

  public void notifyCustom(Event eventType) {
    customers.get(eventType)
        .forEach(eventListener -> eventListener.update(eventType));
  }

}
