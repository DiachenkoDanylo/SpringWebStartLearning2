package spring.models;
/*  SpringWebStart
    май
    @author DiachenkoDanylo
*/

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = " Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 char")
    private String name;


    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Min(value = 0, message = " age should be grater than  0")
    private int age;


    public Person(){

    }

    public Person(int id, String name, String email, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
