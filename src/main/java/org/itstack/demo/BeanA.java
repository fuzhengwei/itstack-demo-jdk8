package org.itstack.demo;

public class BeanA {

    private Integer id;
    private String name;
    private Integer age;
    private String idCard;

    public BeanA(Integer id, String name, Integer age, String idCard) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
