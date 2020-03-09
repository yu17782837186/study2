package com.ning.test;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.setName("zhangsan");
        user2=user1;
        user2.setName("lisi");
        System.out.print(user1.getName());
    }
}
