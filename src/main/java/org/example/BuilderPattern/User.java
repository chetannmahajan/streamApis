package org.example.BuilderPattern;

public class User {

    private final String fname;
    private final String lName;
    private final int age;

    public User(UserBuilder userBuilder) {
        this.fname = userBuilder.fname;
        this.lName = userBuilder.lName;
        this.age = userBuilder.age;
    }

    public String getFname() {
        return fname;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserBuilder{
        private String fname;
        private String lName;
        private int age;

        public UserBuilder() {

        }

        public String getFname() {
            return fname;
        }

        public UserBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public UserBuilder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }


    }

