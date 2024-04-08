package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Volodymyr", "Podkorytov");

        Gson gson = new Gson();
        String person = gson.toJson(user);
        System.out.println(person);
    }
}
