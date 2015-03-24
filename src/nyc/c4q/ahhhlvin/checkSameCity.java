package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/23/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class checkSameCity {
    public static void main(String[] args) {


        Person thing1 = new Person();
        thing1.setCity("Los Angeles");
        Person thing2 = new Person();
        thing2.setCity("San Diego");


        System.out.println(checkSameCity(thing1, thing2));



        Person parent = new Person();
        parent.setPhoneNumber("5107895851");
        parent.setCity("Fremont");

        Person child = registerChild(parent);
        child.setName("Abc");

        System.out.println("\n\n\nThe child's phone number is: " + child.getPhoneNumber() + "\nThe child's city is: " + child.getCity());

    }

    public static boolean checkSameCity(Person one, Person two){


        if (one.getCity() == two.getCity()) {
            return true;
        } else {
            return false;
        }
    }


    public static Person registerChild(Person parent) {
        Person child = new Person();
        child.setPhoneNumber(parent.getPhoneNumber());
        child.setCity(parent.getCity());

        return child;
    }

}
