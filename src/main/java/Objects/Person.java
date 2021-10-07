package Objects;

public class Person {
    public String name;
    public String surname;
    public int age;
    public double weight;
    public boolean isHetero;

    public void retrieveInformation () {
        System.out.printf("Name is: %s\n Surname is: %s\n Age is: %d\n Weight is: %f\n Is hetero: %s", name, surname,age,weight,isHetero);
    }
}
