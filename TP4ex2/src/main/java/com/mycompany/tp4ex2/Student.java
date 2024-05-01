package com.mycompany.tp4ex2;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

/**
 *
 * @author houssem
 */

public class Student extends User
{
    private Double average;
    private Classe classe;
    private Status status;

    public Student(String firstName, String lastName, String email, Long cin, Double average, Classe classe, Status status)
    {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
    
    public void displayInfo()
    {
        System.out.println("Student First Name : " + super.getFirstName() + " Last Name : " + super.getLastName() + " Email : " + super.getEmail() + " CIN : " + super.getCin() + " Classe : " + this.classe + " Status : " + this.status);
    }
    
    public void updateProfile(String NewFirstName, String NewLastName, String NewEmail)
    {
        super.setFirstName(NewFirstName);
        super.setLastName(NewLastName);
        super.setEmail(NewEmail);
    }
    
    public boolean authenticate()
    {
        return true;
    }
    
}

