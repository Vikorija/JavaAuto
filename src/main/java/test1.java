import com.github.javafaker.Faker;

public class test1 {
    public static void main(String[] args) {
       System.out.println("hello wordlik");
        System.out.println(Faker.instance().animal().name());
        System.out.println(Faker.instance().dog().name());
    }
}
