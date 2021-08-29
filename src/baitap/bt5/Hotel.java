package baitap.bt5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> personList;
    public Hotel(){
        this.personList = new ArrayList<>();
    }
    public void add(Person person){
        this.personList.add(person);
    }
    public boolean delete(String socmnd){
        Person personList = this.personList.stream().filter(p -> p.getSocmnd().equals(socmnd))
                .findFirst().orElse(null);
        if (personList == null){
            return false;
        }
        else {
            this.personList.remove(personList);
            return true;
        }
    }
    public int calculator(String socmnd){
        Person person = this.personList.stream().filter(p-> p.getSocmnd().equals(socmnd))
                .findFirst().orElse(null);
        if (person == null){
            return 0;
        }
        return  person.getRoom().getGiaphong() * person.getSothue();
    }
    public void show(){
        this.personList.forEach(person -> System.out.println(person.toString()));
    }
}
