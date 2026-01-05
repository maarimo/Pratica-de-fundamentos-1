package model;

import java.util.Objects;

public class Pessoa {
    private Long id;
    private String name;
    private int age;

    public Pessoa() {}

    public Pessoa(String name, Long id, int age) {
        if (age > 0){
            this.name = name;
            this.id = id;
            this.age = age;
        } else {
            System.out.println("Idade inválida, tente novamente");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
