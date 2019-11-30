package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job){
        this.firstName=firstName;
        this.age=age;
        this.job=job;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }
    public String getJob(){
        return getJob();
    }

    public void displaySalaryAndResponsibilities(Job job){
        System.out.println("Salary: "+job.getSalary());
        job.displayResponsibilities();
    }



    public static void main (String[] args){

        Person person1=new Person("Noemi",25,"Office Assistance");
        Person person2=new Person("Magda",24,"Recruiter");
        Person person3=new Person("Mateusz",27,"Team Leader");

        Job officeAssistance1=new OfficeAssistance();
        Person person=new Person("x",40,"y");
        person.displaySalaryAndResponsibilities(officeAssistance1);


        OfficeAssistance officeAssistance=new OfficeAssistance();
        officeAssistance.displayResponsibilities();

        Recruiter recruiter=new Recruiter();
        recruiter.displayResponsibilities();

        TeamLeader teamLeader=new TeamLeader();
        teamLeader.displayResponsibilities();

    }




}
