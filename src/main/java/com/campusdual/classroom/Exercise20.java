package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> peopleList = new ArrayList<>();
        Person person = new Person("John", "Smith");
        peopleList.add(person);
        Teacher teacher = new Teacher("Maria", "Montessori", "Educacion");
        peopleList.add(teacher);
        PoliceOfficer police = new PoliceOfficer("Jake", "Peralta", "B-99");
        peopleList.add(police);
        Doctor doctor = new Doctor("Gregory", "House", "Nefroloia e infectologia");
        peopleList.add(doctor);
        return peopleList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person p : stringList) {
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }


}
