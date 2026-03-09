import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

public class arrayname {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       ArrayList<String> names=new ArrayList<String>();
       int choice;
       do { System.out.println("\n----- MENU -----");
            System.out.println("1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Search Name");
            System.out.println("4. Sort Names");
            System.out.println("5. Display Names");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
          switch (choice) {
              case 1:
                  System.out.print("Enter name to add: ");
                  names.add(sc.next());
                  break;
              case 2:
                  System.out.print("Enter name to remove: ");
                  names.remove(sc.next());
                  break;
             case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.next();
                    if(names.contains(searchName))
                        System.out.println("Name found.");
                    else
                        System.out.println("Name not found.");
                    break;

               case 4:
                    Collections.sort(names);
                    System.out.println("Names sorted.");
                    break;
              case 5:
                  System.out.println("Names:");
                  for (String name : names) {
                      System.out.println("- " + name);
                  }
                  break;
              default:
                  throw new AssertionError();
          }  
           
       } while (true);
        }
    }   
    

