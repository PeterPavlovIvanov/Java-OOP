package EncapsuplationLab.FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserverTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserverTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return firstTeam;
    }

    public List<Person> getReserverTeam() {
        return reserverTeam;
    }

    public void addPlayer(Person person) {

    }

}
