

import java.util.Scanner;

public class Profiling {

    int max = 1000;
    int index = 0;
    int ProfileNum = 1;
    int deductor = 1000;

    String[] names = new String[max];
    String[] email = new String[max];
    String[] number = new String[max];
    String[] age = new String[max];
    String[] password = new String[max];
    String[] gender = new String [max];

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Profiling name;
        name = new Profiling();
        name.Profile();

    }

    public void Profile() {
        Scanner sc = new Scanner(System.in);

        boolean profile = true;
        pro:
        while (profile) {
            System.out.println("Do you want to create a profile?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int dnn = sc.nextInt();
            if (dnn == 1) {
                ProfileEnter();
            } else if (dnn == 2) {
                System.exit(0);
            }

        }

    }

    public void ProfileEnter() {
        
        Continue:
        while (true) {
            System.out.println("===============================================");
            System.out.println("Profile Number " + ProfileNum);
            System.out.println("");
            System.out.print("Enter your Name: ");
            names[index] = sc.next();
            System.out.print("Enter your Age: ");
            age[index] = sc.next();
            System.out.print("Enter your Gender: ");
            gender[index] = sc.next();
            System.out.print("Enter your Contact No.: ");
            number[index] = sc.next();
            System.out.print("Enter your Email Address: ");
            email[index] = sc.next();
            System.out.print("Enter your Password: ");
            password[index] = sc.next();
            ProfileNum++;
            index++;
            deductor--;

            boolean ewox = true;
            dll:
            while (ewox) {

                System.out.println("===============================================");
                System.out.println("What do you want to do next?");
                System.out.println("1. Add another Profile.");
                System.out.println("2. View all Profiles.");
                System.out.println("3. Find Profiles.");
                System.out.println("4. Exit.");
                int choice = sc.nextInt();
               if(choice==1||choice==2||choice==3||choice==4) {
                switch (choice) {
                    case 1:
                        continue Continue;
                    case 2:
                        for (int j = 0; j < names.length - deductor; j++) {

                            System.out.println("===============================================");
                            System.out.println("Profile No. " + (j+1) + "\n");

                            System.out.println("Name: " + names[j]);
                            System.out.println("Age: " + age[j]);
                            System.out.println("Gender: " + gender [j]);
                            System.out.println("Email: " + email[j]);
                            System.out.println("Password: " + number[j]);
                            System.out.println("===============================================");
                       
                        }
                         continue dll;
                    case 3:
                        System.out.println("Enter Name!");
                        sc.nextLine();
                        String namessearch = sc.nextLine();

                        for (int i = 0; i < names.length; i++) {

                            if (namessearch.equals(names[i])) {
                                while (namessearch.equals(names[i])) {
                                    System.out.println("===============================================");
                                    System.out.println("Name: " + names[i]);
                                    System.out.println("Age: " + age[i]);
                                    System.out.println("Gender: " + gender [i]);
                                    System.out.println("Email: " + email[i]);
                                    System.out.println("Contact Number: " + number[i]);
                                    System.out.println("Password: " + password[i]);

                                    System.out.println("===============================================");
                                    continue dll;
                                }
                      
                                
                            }                
                        }break;
                    case 4:
                        System.exit(0);
                }
               }else{
                   System.out.println("Invalid input! Please try again.");
                   continue dll;
               }
                System.out.println("Profile not found!");
                continue dll;
            }
        }

    }
}