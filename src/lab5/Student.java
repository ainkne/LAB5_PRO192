package lab5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    String id, name, address;
    long phone;
    public Student(){}

    public Student(String id, String name, String address, long phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " - Name: " + getName() + " - Address: " + getAddress() +
                " - Phone number: " + getPhone();
    }
}
