package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public void displayJob(){
        System.out.println(getJob());
    }

    public void displaySalaryAndResponsibilities() {
        System.out.println("Salary: " + job.getSalary());
        job.displayResponsibilities();
    }

    public static void main(String[] args) {

        Job officeAssistance1 = new OfficeAssistance();
        Person person1 = new Person("Noemi", 25, officeAssistance1);



        Job recruiter1 = new Recruiter();
        Person person2 = new Person("Magda", 24, recruiter1);

        Job teamLeader1 = new TeamLeader();
        Person person3 = new Person("Mateusz", 27, teamLeader1);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getAge());
        person1.displaySalaryAndResponsibilities();

        System.out.println(person2.getFirstName());
        System.out.println(person2.getAge());
        person2.displaySalaryAndResponsibilities();


        System.out.println(person3.getFirstName());
        System.out.println(person3.getAge());
        person3.displaySalaryAndResponsibilities();

    }
}
