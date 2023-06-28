package org.example;

import org.example.entity.User;
import org.example.services.Iterator;
import org.example.services.UserRepository;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 6/27/2023 15:35
 */

public class Main {
    public static void main(String[] args) {
        User[] userArray = {
                new User.UserBuilder()
                        .setFirstName("Tim")
                        .setLastName("Jackson")
                        .setAge(23)
                        .build(),
                new User.UserBuilder()
                        .setFirstName("Bob")
                        .setLastName("Marks")
                        .setAge(27)
                        .build(),
                new User.UserBuilder()
                        .setFirstName("Jonathan")
                        .setLastName("Swift")
                        .setAge(19)
                        .build()
        };

        UserRepository users = new UserRepository(userArray);
        Iterator iterator = users.getIterator();
        while(iterator.hasNext()){
            User user = (User)iterator.next();
            System.out.println("Name: " + user.firstName);
            System.out.println("Lastname: " + user.lastName);
            System.out.println("Age: " + user.age);
            System.out.println("---------------");
        }
    }
}