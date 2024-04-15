package observerPattern;

/**
 * EventListener description.
 *
 * @author Daniel
 * @version 14/04/2024
 */
@FunctionalInterface
public interface EventListener {
  void update(Event eventType);

}
