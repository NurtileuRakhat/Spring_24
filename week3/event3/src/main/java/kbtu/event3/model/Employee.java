package kbtu.event3.model;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    // No-argument constructor
    protected Employee() {}

    // Parameterized constructor
    public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters
    public Integer getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
}
