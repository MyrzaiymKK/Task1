import java.time.LocalDate;
import java.time.Period;

import static java.lang.StringTemplate.STR;

public class info {
    private String name;
    private String lastName;
    private LocalDate birth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public String getInfo(){
     return STR."""
             name: \{getName()}
             last name: \{getLastName()}
             birthday: \{getBirth()}
             """;
    }

    public void method(){
        LocalDate correct = LocalDate.now();
        LocalDate birtd = birth;
        Period period = Period.between(birtd,correct);
        int year = period.getYears();
        System.out.println(getInfo() + "age: " + year);

    }
}

