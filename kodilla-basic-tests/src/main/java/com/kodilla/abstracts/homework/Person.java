package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    String position;

    public Person(String firstName, int age, String position){
        this.firstName=firstName;
        this.age=age;
        this.position=position;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }
    public String getPosition(){
        return position;
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
        Person personOne=new Person("x",40,"y");
        personOne.displaySalaryAndResponsibilities(officeAssistance1);

        Job recruiter1=new Recruiter();
        Person personTwo=new Person("xx", 41,"yy");
        personTwo.displaySalaryAndResponsibilities(recruiter1);

        Job teamLeader1=new TeamLeader();
        Person personThree=new Person("xxx", 42, "yyy");
        personThree.displaySalaryAndResponsibilities(teamLeader1);


        person1.getFirstName();
        String person11=person1.getFirstName();
        System.out.println(person11);
        person1.getAge();
        int person12=person1.getAge();
        System.out.println(person12);
        person1.getPosition();
        String person17=person1.getPosition();
        System.out.println(person17);
        person1.displaySalaryAndResponsibilities(officeAssistance1);

        person2.getFirstName();
        String person13=person2.getFirstName();
        System.out.println(person13);
        person2.getAge();
        int person14=person2.getAge();
        System.out.println(person14);
        person2.getPosition();
        String person18=person2.getPosition();
        System.out.println(person18);
        person2.displaySalaryAndResponsibilities(recruiter1);

        person3.getFirstName();
        String person15=person3.getFirstName();
        System.out.println(person15);
        person3.getAge();
        int person16=person3.getAge();
        System.out.println(person16);
        person3.getPosition();
        String person19=person3.getPosition();
        System.out.println(person19);
        person3.displaySalaryAndResponsibilities(teamLeader1);

    }




}
