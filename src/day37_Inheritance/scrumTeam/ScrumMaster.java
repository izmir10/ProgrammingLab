package day37_Inheritance.scrumTeam;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

}

/*
7. Create a sub class of EMployee named ScrumMaster:

			Add any extra variable or method that ScrumMaster object need to have
 */