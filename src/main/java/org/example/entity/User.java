package org.example.entity;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 6/27/2023 15:29
 */

public class User {
    public String firstName;
    public String lastName;
    public Integer age;

    private User(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static class UserBuilder{
        public String firstName;
        public String lastName;
        public Integer age;

        public UserBuilder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this.firstName, this.lastName, this.age);
        }
    }
}
