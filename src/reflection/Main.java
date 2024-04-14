package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Main description.
 *
 * @author Daniel
 * @version 13/04/2024
 */
public class Main {

  public static void main(String[] args) throws Exception {
    Cat cat = new Cat(1, "Charles Mcgill");

    Field[] catFields = cat.getClass().getDeclaredFields();

    System.out.println(cat.getName());

    for (Field field: catFields) {
      if (field.getName().equals("name")) {
        field.setAccessible(true);
        field.set(cat, "Lalo");
      }
    }

    System.out.println(cat.getName());

    Method[] catMethods = cat.getClass().getDeclaredMethods();

    cat.doAThing();

    for (Method method: catMethods) {
      if (method.getName().equals("doAPrivateThing")) {
        method.setAccessible(true);
        method.invoke(cat);
      }

      if (method.getName().equals("doAPrivateStaticThing")) {
        method.setAccessible(true);
        method.invoke(null);
      }

      if (method.getName().equals("doAPrivateThingWithParam")) {
        method.setAccessible(true);
        method.invoke(cat, "hehehehehe");
      }

      if (method.getName().equals("doAPrivateStaticThingWithParams")) {
        method.setAccessible(true);
        method.invoke(null, "heheh", "its a me");
      }
    }
  }

}
