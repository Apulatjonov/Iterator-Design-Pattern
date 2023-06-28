package org.example.services;

import org.example.entity.User;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 6/27/2023 15:35
 */

public class UserRepository implements Container{
    private User[] users;

    public UserRepository(User[] users){
        this.users = users;
    }

    @Override
    public Iterator getIterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < users.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return users[index++];
            }
            return null;
        }
    }
}
