package ali.ikbal.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );
        Gson gson = new Gson();

        Person person1 = new Person("Ali Ikbal", 22);
        String json1 = gson.toJson(person1);
        System.out.println(json1);

    }
}
