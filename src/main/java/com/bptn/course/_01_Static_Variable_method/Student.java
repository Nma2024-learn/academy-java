package com.bptn.course._01_Static_Variable_method;

public class Student {

	    // Instance Variables
	    private String name;
	    private int grade;
	    private String studentID;

	    // Static Variables
	    public static String principalName = "Ms. McKoy"; // The default value for principalName
	    public static int nextID = 100; // Default starting ID

	    // Constructor
	    public Student(String name, int grade) {
	        this.name = name;
	        this.grade = grade;
	        // Create studentID using the first initial (in uppercase) and the nextID value
	        this.studentID = Character.toUpperCase(name.charAt(0)) + Integer.toString(nextID);
	        // Increment nextID by 1
	        nextID++;
	    }

	    // Static method to set a new principal
	    public static void newPrincipal(String newPrincipalName) {
	        principalName = newPrincipalName;
	    }

	    // Static method to reset the nextID to 100
	    public static void resetID() {
	        nextID = 100;
	    }

	    // toString method to return the student's name and ID
	    public String toString() {
	        return name + " " + studentID;
	    }

	    // Main method to demonstrate the functionality
	    public static void main(String[] args) {
	        Student s1 = new Student("Muhammed", 11);
	        Student s2 = new Student("Alan", 11);
	        Student s3 = new Student("Sophie", 11);

	        System.out.println("Principal Name for student 1: " + Student.principalName);
	        System.out.println("Student ID for student 1: " + s1.studentID);
	        System.out.println("Student ID for student 2: " + s2.studentID);
	        System.out.println("Student ID for student 3: " + s3.studentID);

	        Student.newPrincipal("Mr. McKoy");
	        System.out.println("New principal name: " + Student.principalName);

	        Student.resetID();
	        Student s4 = new Student("Kevin", 11);
	        System.out.println("Student ID for student 4: " + s4.studentID);
	        System.out.println("String representation of student 4: " + s4.toString());
	    }
	}

