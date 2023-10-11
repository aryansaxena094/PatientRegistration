/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author Akash Bahri
 */
public class Patient {

    private String FName="No Data";
    private String LName="No Data";
    private int Age=-1;
    private String Email="No Data";
    private String Message="No Data";
    private String PatientType="No Data";
    private String Gender="No Data";
    private ImageIcon icon;

    public void setFName(String FName) throws Exception {
        if (FName.matches("[a-zA-Z]+"))
            this.FName = FName;
        else
            throw new Exception("First Name is not a string");

    }

    public String getFName() {
        return FName;
    }

    public void setLName(String LName) throws Exception {
        if (LName.matches("[a-zA-Z]+"))
            this.LName = LName;
        else
            throw new Exception("Last Name is not a string");
    }

    public String getLName() {
        return LName;
    }

    public void setAge(String Age) throws Exception {
        try {
            int age = Integer.parseInt(Age);
            if (age < 0 || age > 120) {
                throw new Exception("Age is not in range");
            }
            this.Age = age;
        } catch (Exception e) {
            if (e.getMessage().equals("Age is not in range"))
                throw new Exception("Age is not in range");
            else
                throw new Exception("Age is not a number");
        }

    }

    public int getAge() {
        return Age;
    }

    public void setEmail(String Email) throws Exception {
        if (Email.matches("^[a-zA-Z0-9+_.-]+@+[a-zA-Z0-9.-]+.+[a-zA-Z]"))
            this.Email = Email;
        else
            throw new Exception("Email is not valid");
    }

    public String getEmail() {
        return Email;
    }

    public void setMessage(String Message) throws Exception {
        if (Message.isEmpty())
            throw new Exception("Message is empty");
        else
            this.Message = Message;
    }

    public String getMessage() {
        return Message;
    }

    public void setPatientType(String PatientType) {

        this.PatientType = PatientType;

    }

    public String getPatientType() {
        return PatientType;
    }

    public void setGender(String Gender) {

        this.Gender = Gender;

    }

    public String getGender() {
        return Gender;
    }

    public void setIcon(ImageIcon icon) {
        if (icon == null)
            this.icon = new ImageIcon("src\\images\\default.png");
            //throw new NullPointerException("Icon is null");
        else
        this.icon = icon;
    }
    public ImageIcon getIcon() {
        return icon;
    }

}
