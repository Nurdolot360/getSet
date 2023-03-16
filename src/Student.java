public class Student {
    String name;
    String bozdei;
    String surName;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBozdei(String s) {
        return bozdei;
    }

    public void setBozdei(String bozdei) {
        this.bozdei = bozdei;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
        this.age = age;

        }
    }
}
