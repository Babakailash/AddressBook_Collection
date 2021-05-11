package demo;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AddressBookTest {

    public static void main(String[] args) {
        System.out.println("**Program Infomation** \nFirst Name" +
                "-> Is the Name of the Person in Address Book \nLast Name" +
                "-> ");

        String input;
        Scanner in = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        boolean stop = false;
        do {
            System.out.println("\nMain Menu");
            System.out.println("1. Add An Entry");
            System.out.println("2. Delete An Entry");
            System.out.println("3. View All Entries");
            System.out.println("4. Update An Entry");
            System.out.println("5. Exit");
            System.out.println("Please Enter Choice from 1 to 5: \n");
            input = (in.next());


            switch (input) {
                case "1":
                    //create a new entry for the addressbook
                    AddressBookEntry entry = new AddressBookEntry();

                    System.out.println("***Adding entry in Address Book***");

                    System.out.println("First Name: ");
                    entry.setFname(in.next());

                    System.out.println("Last Name: ");
                    entry.setLname(in.next());

                    System.out.println("Address: ");
                    entry.setAddress(in.next());

                    System.out.println("City: ");
                    entry.setCity(in.next());

                    System.out.println("State: ");
                    entry.setState(in.next());

                    System.out.println("ZipCode: ");
                    entry.setZipCode(in.nextInt());

                    System.out.println("Mobile: ");
                    entry.setMobile(in.nextInt());

                    System.out.println("Email: ");
                    entry.setEmail(in.next());

                    //add our new entry to the address Book
                    addressBook.add(entry);

                    System.out.println("Added a New Entry. ");
                    break;

                case "2":
                    System.out.println("Enter the index of the Entry, which you wand To Delete: ");
                    //delete the entry at the given index
                    addressBook.delete(in.nextInt());

                    break;

                case "3":
                    System.out.println("Your addressbook contains the following entries: ");
                    //get array of all entries
                    AddressBookEntry[] listOfEntries = addressBook.viewAll();

                    //for every entry in the array
                    for (int i=0; i< listOfEntries.length; i++){
                        System.out.println(listOfEntries[i].toString());

                }
                    break;

                case "4":
                    System.out.println("Enter the index of the entry, which you want to update: ");
                    //get entry at the given index
                    AddressBookEntry entryToUpdate =  addressBook.get(in.nextInt());

                    System.out.println("First Name (current: " + entryToUpdate.getFname() + "):");
                    entryToUpdate.setFname(in.next());

                    System.out.println("Last Name (current: " + entryToUpdate.getLname() + "):");
                    entryToUpdate.setLname(in.next());

                    System.out.println("Address (current: " + entryToUpdate.getAddress() + "):");
                    entryToUpdate.setAddress(in.next());

                    System.out.println("City (current: " + entryToUpdate.getCity() + "):");
                    entryToUpdate.setCity(in.next());

                    System.out.println("State (current: " + entryToUpdate.getState() + "):");
                    entryToUpdate.setState(in.next());

                    System.out.println("Zip Code (current: " + entryToUpdate.getZipCode() + "):");
                    entryToUpdate.setZipCode(in.nextInt());

                    System.out.println("Mobile Number (current: " + entryToUpdate.getMobile() + "):");
                    entryToUpdate.setMobile(in.nextInt());

                    System.out.println("Email (current: " + entryToUpdate.getEmail() + "):");
                    entryToUpdate.setEmail(in.next());

                    break;

                default:
                    break;
            }
            //execute while Stop is False
        }      while (!input.equals("5"));
            System.out.println("***Thank You :)***");
    }
}
