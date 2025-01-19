package org.example.BuilderPattern;

public class MainBuilder {

    public static void main(String[] args) {

        User user = new User.UserBuilder().setFname("ashfds").setlName("dsafsd").setAge(23).build();
        System.out.println(user.toString());
    }

}

