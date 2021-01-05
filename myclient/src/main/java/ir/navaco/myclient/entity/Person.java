package ir.navaco.myclient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//@Component
@Data
@AllArgsConstructor @NoArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private int age;
}
