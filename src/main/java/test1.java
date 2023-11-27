import com.github.javafaker.Faker;

import java.util.Locale;

public class test1 {
    public static void main(String[] args) {
       System.out.println("Hello in worldik beautiful "
               + Faker.instance().animal().name().toUpperCase()
               + " with name "
               + Faker.instance().dog().name().toUpperCase());

    }
}
