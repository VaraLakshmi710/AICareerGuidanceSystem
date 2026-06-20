package com.aicareer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      AI CAREER GUIDANCE SYSTEM");
        System.out.println("=================================");
        System.out.println("1. Software Engineer");
        System.out.println("2. AI Engineer");
        System.out.println("3. Data Scientist");
        System.out.println("4. Full Stack Developer");
        System.out.println("5. Cyber Security Engineer");
        System.out.println("=================================");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("\nSoftware Engineer Roadmap");
            System.out.println("1. Learn Java");
            System.out.println("2. Learn SQL");
            System.out.println("3. Learn HTML, CSS, JavaScript");
            System.out.println("4. Learn Spring Boot");
            System.out.println("5. Build Projects");
            System.out.println("6. Create Resume");
            System.out.println("7. Apply for Jobs");
        }
        else if (choice == 2) {
            System.out.println("\nAI Engineer Roadmap");
            System.out.println("1. Learn Python");
            System.out.println("2. Learn Data Structures");
            System.out.println("3. Learn Machine Learning");
            System.out.println("4. Learn Deep Learning");
            System.out.println("5. Learn Generative AI");
            System.out.println("6. Build AI Projects");
            System.out.println("7. Apply for AI Jobs");
        }
        else if (choice == 3) {
            System.out.println("\nData Scientist Roadmap");
            System.out.println("1. Learn Python");
            System.out.println("2. Learn Statistics");
            System.out.println("3. Learn SQL");
            System.out.println("4. Learn Data Analysis");
            System.out.println("5. Learn Machine Learning");
            System.out.println("6. Build Data Projects");
            System.out.println("7. Apply for Jobs");
        }
        else if (choice == 4) {
            System.out.println("\nFull Stack Developer Roadmap");
            System.out.println("1. Learn HTML");
            System.out.println("2. Learn CSS");
            System.out.println("3. Learn JavaScript");
            System.out.println("4. Learn React");
            System.out.println("5. Learn Java");
            System.out.println("6. Learn Spring Boot");
            System.out.println("7. Build Full Stack Projects");
        }
        else if (choice == 5) {
            System.out.println("\nCyber Security Engineer Roadmap");
            System.out.println("1. Learn Networking");
            System.out.println("2. Learn Linux");
            System.out.println("3. Learn Cyber Security Basics");
            System.out.println("4. Learn Ethical Hacking");
            System.out.println("5. Learn Penetration Testing");
            System.out.println("6. Get Certifications");
            System.out.println("7. Apply for Jobs");
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}