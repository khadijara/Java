package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variable
        int menuOption = 0, userType = 0, orderOption = 0, customerNumber = 0  , employeeNumber = 0 ,
                userChoice = 0 , average = 0 , orderItem = 0 ,  burger = 0,pizza = 0 , drink = 0 , pasta = 0,
                quantity = 0,  itemCode = 0,  price = 0  , sum  ;

        float sumPrice = 0.0f;
        double tax , totalPrice , finalPrice , clientMoney = 0.0, extraMoney;
        boolean correctType , vip = false, Exit = false ;
        String  cName = " " , surname = " " , city = " " , profession = " " , nameE = " " , surnameE = " " , cityE = "" , education = " " , input = "" ,bloodtype = "" ;

        // Arrays
        String[] menu = new String[6]; // for Main Menu
        int[] reviews = new int[4]; // for reviews of the restaurant
        ArrayList<String> menuChosen = new ArrayList<String>();   // Final Array for printing information of Menu

        //colours
        String black = "\033[30m";
        String red = "\033[31m";
        String green = "\033[32m";
        String yellow = "\033[33m";
        String blue = "\033[34m";
        String purple = "\033[35m";
        String cyan = "\033[36m";
        // Logo
        String logo = "RRRRRRRRRRRRRRRRR                                                 tttt                                                                                                               tttt          \n" +
                "R::::::::::::::::R                                             ttt:::t                                                                                                            ttt:::t          \n" +
                "R::::::RRRRRR:::::R                                            t:::::t                                                                                                            t:::::t          \n" +
                "RR:::::R     R:::::R                                           t:::::t                                                                                                            t:::::t          \n" +
                "  R::::R     R:::::R    eeeeeeeeeeee        ssssssssss   ttttttt:::::ttttttt      aaaaaaaaaaaaa   uuuuuu    uuuuuu  rrrrr   rrrrrrrrr     aaaaaaaaaaaaa   nnnn  nnnnnnnn    ttttttt:::::ttttttt    \n" +
                "  R::::R     R:::::R  ee::::::::::::ee    ss::::::::::s  t:::::::::::::::::t      a::::::::::::a  u::::u    u::::u  r::::rrr:::::::::r    a::::::::::::a  n:::nn::::::::nn  t:::::::::::::::::t    \n" +
                "  R::::RRRRRR:::::R  e::::::eeeee:::::eess:::::::::::::s t:::::::::::::::::t      aaaaaaaaa:::::a u::::u    u::::u  r:::::::::::::::::r   aaaaaaaaa:::::a n::::::::::::::nn t:::::::::::::::::t    \n" +
                "  R:::::::::::::RR  e::::::e     e:::::es::::::ssss:::::stttttt:::::::tttttt               a::::a u::::u    u::::u  rr::::::rrrrr::::::r           a::::a nn:::::::::::::::ntttttt:::::::tttttt    \n" +
                "  R::::RRRRRR:::::R e:::::::eeeee::::::e s:::::s  ssssss       t:::::t              aaaaaaa:::::a u::::u    u::::u   r:::::r     r:::::r    aaaaaaa:::::a   n:::::nnnn:::::n      t:::::t          \n" +
                "  R::::R     R:::::Re:::::::::::::::::e    s::::::s            t:::::t            aa::::::::::::a u::::u    u::::u   r:::::r     rrrrrrr  aa::::::::::::a   n::::n    n::::n      t:::::t          \n" +
                "  R::::R     R:::::Re::::::eeeeeeeeeee        s::::::s         t:::::t           a::::aaaa::::::a u::::u    u::::u   r:::::r             a::::aaaa::::::a   n::::n    n::::n      t:::::t          \n" +
                "  R::::R     R:::::Re:::::::e           ssssss   s:::::s       t:::::t    tttttta::::a    a:::::a u:::::uuuu:::::u   r:::::r            a::::a    a:::::a   n::::n    n::::n      t:::::t    tttttt\n" +
                "RR:::::R     R:::::Re::::::::e          s:::::ssss::::::s      t::::::tttt:::::ta::::a    a:::::a u:::::::::::::::uu r:::::r            a::::a    a:::::a   n::::n    n::::n      t::::::tttt:::::t\n" +
                "R::::::R     R:::::R e::::::::eeeeeeee  s::::::::::::::s       tt::::::::::::::ta:::::aaaa::::::a  u:::::::::::::::u r:::::r            a:::::aaaa::::::a   n::::n    n::::n      tt::::::::::::::t\n" +
                "R::::::R     R:::::R  ee:::::::::::::e   s:::::::::::ss          tt:::::::::::tt a::::::::::aa:::a  uu::::::::uu:::u r:::::r             a::::::::::aa:::a  n::::n    n::::n        tt:::::::::::tt\n" +
                "RRRRRRRR     RRRRRRR    eeeeeeeeeeeeee    sssssssssss              ttttttttttt    aaaaaaaaaa  aaaa    uuuuuuuu  uuuu rrrrrrr              aaaaaaaaaa  aaaa  nnnnnn    nnnnnn          ttttttttttt  \n" +
                "                                                                                                                                                                                                   ";

        // Scanner
        Scanner read = new Scanner (System.in);

        //program
        System.out.println(green+"*-*-*-*-*-*-*-*-*-*-Welcome to my Restaurant*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(cyan +logo);
do {
    do {
            System.out.println(blue+"-*-*-*-*-*-*-*-*-*-*-*-*Main Menu-*-*-*-*-*-*-*-*-*-*-*-*-*-*"+green);
                menu[1] = "Detail Of User";
                menu[2] = "Place an order";
                menu[3] = "Paying Bill";
                menu[4] = "Feedback";
                menu[5] = "Exit";

                for (int i = 1; i < menu.length; i++) {
                    System.out.println(i + "- " + menu[i]);
                }
                System.out.print(black+"Select 1 option and press Enter:");
                 correctType = read.hasNextInt();
                    if (!correctType) {
                        System.out.println(red+"Enter data is not a Integer Type! ");
                        read.nextLine();
                    } else {
                         menuOption = read.nextInt();
                         read.nextLine();
                     if (menuOption < 1 || menuOption > 5) {
                        System.out.println(red+"Enter Star is out of range. Please Enter 1- 5");
                        correctType = false;
             }
        }
    } while (!correctType);

                switch (menuOption) {
                    case 1:
                        do {
                            System.out.println(purple + "Which type of User you are?\n1- Customer\n2- Employee\n3- Exit");
                            correctType = read.hasNextInt();
                            if (!correctType) {
                                System.out.println(red + "Enter data is not a Integer Type! ");
                                read.nextLine();
                            } else {
                                userType = read.nextInt();
                                read.nextLine();
                            if (userType < 1 || userType > 3) {
                            System.out.println(red + "Enter Star is out of range. Please Enter 1- 3");
                            correctType = false;
                                }
                            }
                        } while (!correctType);

                    switch (userType) {
                        case 1:
                            do {
                                System.out.print(blue + "How many customers you want to insert:"); // ask how many Customers
                                correctType = read.hasNextInt();                   // save the number of customers.
                                if (correctType == false) {                     //checking and controlling error. This code will only accept numbers.
                                    read.nextLine();
                                    System.out.println(red + "Enter value is not a integer type");
                                } else {
                                    customerNumber = read.nextInt();
                                    read.nextLine();
                                    if (customerNumber <= 0 || customerNumber > 10) {       // to control negative numbers
                                        System.out.println(red + "Program is not allowing you to enter negative and more than 10  number ");
                                        correctType = false;
                                    }
                                }
                            } while (correctType == false);

                            String[] matrixHeader = new String[4];  // header of the matrix table

                            matrixHeader[0] = "FirstName";
                            matrixHeader[1] = "LastName";
                            matrixHeader[2] = "City";
                            matrixHeader[3] = "Profession";

                            String[][] customers = new String[customerNumber][4];

                            for (int i = 0; i < customers.length; i++) {

                                System.out.println(green + "Insert the Following Information Below:");   // Customers Information
                                System.out.println(blue + "Your First Name:");
                                cName = read.next();
                                read.nextLine();
                                customers[i][0] = cName;
                                System.out.println(blue + "Your Last Name: ");
                                surname = read.next();
                                read.nextLine();
                                customers[i][1] = surname;
                                System.out.println(blue + "City, Where are you from: ");
                                city = read.next();
                                read.nextLine();
                                customers[i][2] = city;
                                System.out.println(blue + "Your profession: ");
                                profession = read.next();
                                read.nextLine();
                                customers[i][3] = profession;
                            }

                                System.out.println();
                                for (int i = 0; i < matrixHeader.length; i++) {    // print header of the matrix
                                    System.out.print(black + matrixHeader[i] + "  ");
                                }

                                System.out.println();
                                for (int i = 0; i < customers.length; i++) {         // print the information of customers in the form of matrix
                                    for (int j = 0; j < customers[i].length; j++) {
                                        System.out.print(green + customers[i][j] + "  ");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                            break;
                        case 2:
                            do {
                                System.out.print(blue + "How many employees you want to insert:"); // ask how many Employees
                                correctType = read.hasNextInt();                   // save the number of employees.
                                if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                    read.nextLine();
                                    System.out.println(red + "Enter value is not a integer type");
                                } else {
                                    employeeNumber = read.nextInt();
                                    read.nextLine();
                                    if (employeeNumber <= 0 || employeeNumber > 15) {       // to control negative numbers
                                        System.out.println(red + "Program is not allowing you to enter negative and more than 15 employee number");
                                        correctType = false;
                                    }
                                }
                            } while (!correctType);

                            String[] employeeHeader = new String[5];  // Initialize an array for Employee header  matrix table

                            employeeHeader[0] = "FirstName";
                            employeeHeader[1] = "LastName";
                            employeeHeader[2] = "BloodGroup";
                            employeeHeader[3] = "City";
                            employeeHeader[4] = "Education";

                            String[][] employee = new String[employeeNumber][5];

                            for (int i = 0; i < employeeNumber; i++) {

                                System.out.println(green + "Insert the Following Information Below:");   // Employee Information
                                System.out.println(blue + "Your First Name:");
                                nameE = read.next(); // Name of the Employee
                                read.nextLine();
                                employee[i][0] = nameE;
                                System.out.println(blue + "Your Last Name: ");
                                surnameE = read.next();    // Surname of the Employee
                                read.nextLine();
                                employee[i][1] = surnameE;

                                while (bloodtype.isEmpty()) {   // Blood  Group
                                    System.out.println(blue + "Introduce your blood type");
                                    input = read.nextLine();
                                    input = input.toUpperCase();
                                        if (input.startsWith("A")) bloodtype += "A";
                                        if (input.startsWith("B")) bloodtype += "B";
                                        if (input.startsWith("AB")) bloodtype += "AB";
                                        if (input.startsWith("O")) bloodtype += "O";
                                        if (bloodtype.isBlank()) {
                                            System.out.println(red + "Error, wrong blood type");
                                            continue;
                                    }
                                        if (input.endsWith("+")) {
                                            bloodtype += "+";
                                        } else if (input.endsWith("-")) {
                                            bloodtype += "-";
                                        } else {
                                            System.out.println(red + "Wrong RH, please try again");
                                            bloodtype = "";
                                            continue;
                                        }
                                }
                                employee[i][2] = input;

                                System.out.println(blue + "Your City:");     // City Information
                                cityE = read.next();
                                read.nextLine();
                                employee[i][3] = cityE;
                                System.out.println(blue + "Your Qualification:");
                                education = read.next();
                                read.nextLine();
                                employee[i][4] = education;
                            }

                            System.out.println();
                            for (int i = 0; i < employeeHeader.length; i++) {    // print header of the matrix
                                System.out.print(black + employeeHeader[i] + "  ");
                            }

                            System.out.println();
                            for (int i = 0; i < employee.length; i++) {         // print the information  of the Employees in the form of matrix
                                for (int j = 0; j < employee[i].length; j++) {
                                    System.out.print(green + employee[i][j] + "  ");
                                }
                                System.out.println();
                            }
                            System.out.println();

                            break;
                        case 3: // Exit to the main menu
                            System.out.println(black + "Back to the Main Menu......");
                            break;
                    }
                    break;
                    case 2:   //Menu
                            do {
                                System.out.println(purple + "1-Order Food\n2-Serve Food\n3-Exit");
                                correctType = read.hasNextInt();
                                if (!correctType ) {                     //checking and controlling error. This code will only accept numbers.
                                    read.nextLine();
                                    System.out.println(red + "Enter value is not a integer type");
                                } else {
                                    orderOption = read.nextInt();
                                    read.nextLine();
                                    if (orderOption < 1 || orderOption > 3) {       // to control negative numbers
                                        System.out.println(red + "Please Enter number between (1-3) ");
                                        correctType = false;
                                    }
                                }
                            } while (!correctType);

                    switch (orderOption) {
                            case 1:   // order food
                                    String[][] menuCard = new String[6][4];  // initialize an array for menu card with 4 column and 6 rows

                                    menuCard[0][0] = "Item #Code";
                                    menuCard[0][1] = "Description";
                                    menuCard[0][2] = "Size";
                                    menuCard[0][3] = "Price ";

                                    menuCard[1][0] = "[11]----------";
                                    menuCard[1][1] = "Burger-------------";
                                    menuCard[1][2] = "Small/Medium-------";
                                    menuCard[1][3] = "130/180";

                                    menuCard[2][0] = "[12]----------";
                                    menuCard[2][1] = "Chicken Pizza------";
                                    menuCard[2][2] = "12/14/16inch-------";
                                    menuCard[2][3] = "500/750/1000";

                                    menuCard[3][0] = "[13]----------";
                                    menuCard[3][1] = "pasta---------";
                                    menuCard[3][2] = "Half/Full----------";
                                    menuCard[3][3] = "120/240";

                                    menuCard[4][0] = "[14]----------";
                                    menuCard[4][1] = "Cappuccino---------";
                                    menuCard[4][2] = "250mg-------------";
                                    menuCard[4][3] = "200";

                                    menuCard[5][0] = "[15]----------";
                                    menuCard[5][1] = "Cold Drink--------";
                                    menuCard[5][2] = "250/500mg---------";
                                    menuCard[5][3] = "100/200";

                                    for (int i = 0; i < 6; i++) {
                                        for (int j = 0; j < 4; j++) {
                                            System.out.print(green + menuCard[i][j] + " ");   // print all the menu in the form of Matrix
                                        }
                                        System.out.println();
                                    }
                            do {
                                System.out.println(blue + "How many items do you want to order?");   // Ask for ITem
                                correctType = read.hasNextInt();                   // save the number of item.
                                if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                    read.nextLine();
                                    System.out.println(red + "Enter value is not a integer type");
                                } else {
                                    orderItem = read.nextInt();
                                    read.nextLine();
                                    if (orderItem < 1 || orderItem > 3) {       // to control negative numbers
                                        System.out.println(red + "You can not choose more than 3 Item at same time . ");
                                        correctType = false;
                                    }
                                }
                            } while (!correctType);

                            for (int i = 0; i < orderItem ; i++) {
                                do {
                                    System.out.print(blue + "Enter the Item Code number:");   // Enter the code of the Item that user want to Select
                                    correctType = read.hasNextInt();                            // Controlling Error
                                    if (!correctType) {
                                        read.nextLine();
                                        System.out.println(red + "Enter value is not a integer type");
                                    } else {
                                        itemCode = read.nextInt();
                                        read.nextLine();
                                        if (itemCode < 11 || itemCode > 15) {
                                            System.out.println(red + "Please Enter correct Item code number ");
                                            correctType = false;
                                        }
                                    }
                                } while (!correctType);

                        switch (itemCode) {
                                case 11:   // for burger
                                    do {
                                        System.out.println(blue+"Enter the size of the burger: 1. 200gm  2. 300gm");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            burger = read.nextInt();
                                            read.nextLine();
                                            if (burger < 1 || burger > 2) {       // to control negative numbers
                                                System.out.println(red + "Please Enter correct Burger Number.");
                                                correctType = false;
                                            }
                                        }
                                    } while (!correctType);
                                    do {
                                        System.out.println(blue+"Enter the Quantity that you want:");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            quantity = read.nextInt();
                                            read.nextLine();
                                            correctType = true;
                                        }
                                    } while ( !correctType);

                                        if (burger == 1) {
                                            price = 130 * quantity;
                                        } else {
                                            price = 190 * quantity;
                                        }
                                            break;

                                case 12:  // for pizza
                                    do {
                                        System.out.println(blue+"Enter the size of the Chicken Pizza: 1. 12inch  2. 14inch 3.16inch");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            pizza = read.nextInt();
                                            read.nextLine();
                                            if (pizza < 1 || pizza > 3) {       // to control negative numbers and more than 3
                                                System.out.println(red + "Please Enter correct Pizza Number.");
                                                correctType = false;
                                            }
                                        }
                                    } while ( !correctType);
                                    do {
                                       System.out.println(blue+"Enter the Quantity that you want:");
                                       correctType = read.hasNextInt();
                                       if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                           read.nextLine();
                                           System.out.println(red + "Enter value is not a integer type");
                                       } else {
                                           quantity = read.nextInt();
                                           read.nextLine();
                                           correctType = true;
                                       }
                                    } while ( !correctType );

                                            if (pizza == 1) {
                                                price = 500 * quantity;
                                            } else if (pizza == 2) {
                                                price = 750 * quantity;
                                            } else {
                                                price = 1000 * quantity;
                                            }
                                            break;
                                case 13: // for Pasta
                                    do {
                                        System.out.println(blue+"Enter the size of the Pasta Plate: 1. Half  2. Full");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            pasta = read.nextInt();
                                            read.nextLine();
                                            if (pasta < 1 || pasta > 2) {       // to control negative numbers
                                                System.out.println(red + "Please Enter correct Pizza Number.");
                                                correctType = false;
                                            }
                                        }
                                    } while ( !correctType);

                                    do {
                                        System.out.println(blue+"Enter the Quantity that you want:");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            quantity = read.nextInt();
                                            read.nextLine();
                                            correctType = true;
                                        }
                                    } while ( !correctType );

                                            if (pasta == 1) {
                                                price = 120 * quantity;
                                            } else  {
                                                price = 240 * quantity;
                                            }
                                            break;
                                case 14: // cappuccino
                                    do {
                                        System.out.println(blue+"We have 250mg of Cappuccino\nEnter the Quantity that you want:");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            quantity = read.nextInt();
                                            read.nextLine();
                                            correctType = true;
                                        }
                                    } while ( !correctType );

                                        price = 200 * quantity;
                                            break;
                                case 15: // for cold drink
                                    do {
                                        System.out.println(blue+"Enter the size of the Cold Drink: 1. 250mg  2. 500mg ");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            drink = read.nextInt();
                                            read.nextLine();
                                            if (drink < 1 || drink > 2) {       // to control negative numbers
                                                System.out.println(red + "Please Enter correct Pizza Number.");
                                                correctType = false;
                                            }
                                        }
                                    } while ( !correctType);

                                    do {
                                        System.out.println(blue+"Enter the Quantity that you want:");
                                        correctType = read.hasNextInt();
                                        if (!correctType) {                     //checking and controlling error. This code will only accept numbers.
                                            read.nextLine();
                                            System.out.println(red + "Enter value is not a integer type");
                                        } else {
                                            quantity = read.nextInt();
                                            read.nextLine();
                                            correctType = true;
                                        }
                                    } while ( !correctType );

                                        if (drink == 1) {
                                            price = 100 * quantity;
                                        } else  {
                                            price = 200 * quantity;
                                        }
                                            break;
                                        default:
                                            break;
                                    }
                                        System.out.println(cyan + "The price of your selected Item is: " + purple + price + " €."); // Each Item Price
                                        sumPrice += price ;

                                        String infoMenu ="-  Item Code:  " + itemCode + "  Quantity of the Item: " + quantity + " " + "  Price: " + price +"€";  // For Menu detail , I concatenate the String and then add it into the ArrayList .
                                        menuChosen.add(infoMenu);  // Line # 15 String infoMenu
                                        System.out.println("---------\nThe price of " + i + " dishes is: "+ sumPrice);    // count the total choosen Item
                            }
                            break;
                        case 2: // serve food
                            if (orderItem == 0){
                                System.out.println("Please order first!");
                            } else {
                                System.out.println("You ordered "+ orderItem + " Dishes From the Menu.");
                                System.out.println( cyan + "\n*************************************\n*************************************\nFood is going to Serve\n************************************* " );

                                for (int counter = 0; counter < menuChosen.size(); counter++) {
                                    System.out.println(yellow + menuChosen.get(counter)); // here I  will print the detail of Menu that user ordered.
                                }
                                    }
                                    break;
                        case 3: // Exit
                                System.out.println(black+"Back to main menu.......");  // Go back to the main menu
                                 break;
                                }
                            break;
                case 3:    // bill
                    int bill = 0;
                    System.out.println(blue+"-*-*-*-*-*-*-*-*-*-*-*-*Billing Time-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                            do {
                                System.out.println(purple+"What do you want to do?\n1- Pay a bill\n2- Want to go main menu");
                                correctType = read.hasNextInt();

                                if (!correctType) {
                                    System.out.println(red+"Enter data is not a Integer Type! ");
                                    read.nextLine();
                                } else {
                                    bill = read.nextInt();
                                    read.nextLine();

                                    if (bill < 1 || bill > 2) {
                                        System.out.println(red+"Enter Choice is out of range. Please Enter 1 or 2 ");
                                        correctType = false;
                                    }
                                }
                            } while (!correctType);
                        switch(bill){
                            case 1: // paying a bill
                                do {
                                    System.out.println(blue+"Before Paying Bill complete some formalities\nAre You a VIP Customer?(true /false )");
                                    correctType = read.hasNextBoolean();
                                    if (!correctType) {
                                        System.out.println(red + "Enter data is not a Boolean Type! ");
                                        read.nextLine();
                                    } else {
                                        vip = read.nextBoolean();
                                        read.nextLine();
                                        correctType = true;
                                    }
                                } while (!correctType);
                                // Calculate the bill With tax

                                tax = 0.0675 + sumPrice;
                                totalPrice = 0.2 + tax;

                                System.out.println (yellow+"Cost of meal is: " + sumPrice  );
                                System.out.println("Tax: $" + 0.0675);
                                System.out.println("Tip: $" + 0.2);
                                System.out.println("Total Bill: $" + totalPrice+"\n");

                                if (vip){
                                    System.out.println(blue+"You are a VIP customer.\nSo, here we are giving you  a discount.");
                                    finalPrice =  totalPrice * 0.8f;
                                } else {
                                    finalPrice = totalPrice;
                                }

                                System.out.println(purple+"The Final Price of your Meal is : " + finalPrice);

                                // Time to pay Money
                            do {
                                System.out.println(blue+"Enter the price of your Bill.");
                                correctType = read.hasNextFloat();
                                    if (correctType == false ) {
                                        System.out.println(red + "The Entered Type is not a number . Please Enter correct Type."); // Controlling Error also
                                        read.nextLine();
                                    }  else if (correctType == true) {
                                        System.out.print(green);
                                        float inputs = read.nextFloat();
                            while (!(inputs == 0.01 || inputs == 0.02 || inputs == 0.05 || inputs == 0.1 || inputs == 0.2 || inputs == 0.5 || inputs == 1.0 || inputs == 2.0 || inputs == 5.0 || inputs == 10.0 || inputs == 20.0 || inputs == 50.0 || inputs == 100.0 || inputs == 200.0 || inputs == 500.0)){ // for real money
                                System.out.println("Please introduce valid currency");
                                inputs = read.nextFloat();
                            }
                            clientMoney = clientMoney + inputs;
                            read.nextLine();

                                if (clientMoney == finalPrice) {
                                    System.out.println(blue + "Have your ticket and Have Fun.");  // Actual price enter in the program .
                                } else if (clientMoney > finalPrice) {
                                    extraMoney = clientMoney - finalPrice;   // For Extra money
                                    System.out.println(blue + "Have your ticket and your change also:  "  + extraMoney + "€");
                                } else  {
                                    extraMoney = finalPrice - clientMoney;  // For less money
                                    System.out.println(blue + "You need to pay more " +  + extraMoney + "€ left. ");
                                    correctType = false;
                                }
                            }
                        } while (!correctType);
                    case 2: // Exit
                        System.out.println(black+"Back to the main menu.......");
                        break;
                        }
                    break;

                case 4:  // Feedback
                        System.out.println(blue+"-*-*-*-*-*-*-*-*-*-*-*-*Feedback Time-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    do {
                        System.out.println(purple+"What do you want to do?\n1- Want to give Feedback\n2- Want to go main menu");
                        correctType = read.hasNextInt();

                        if (!correctType) {
                            System.out.println(red+"Enter data is not a Integer Type! ");
                            read.nextLine();
                        } else {
                            userChoice = read.nextInt();
                            read.nextLine();

                            if (userChoice < 1 || userChoice > 2) {
                                System.out.println(red+"Enter Choice is out of range. Please Enter 1 or 2 ");
                                correctType = false;
                            }
                        }
                    } while (!correctType);

                switch (userChoice) {
                    case 1:
                            System.out.println(cyan+"Lets rate some questions about Restaurant\nYou have to rate these following questions in (1-10) stars.\nYour reviews result will send to the Owner.\nSo lets get started....\n");

                        for (int i = 0; i < 4; i++) {   // question for feedback
                            do {
                                switch (i) {
                                    case 0:
                                        System.out.println(blue+"How was the Food. Is that match with your Expectations?");
                                        break;
                                    case 1:
                                        System.out.println(blue+"How was the service?");
                                        break;
                                    case 2:
                                        System.out.println(blue+"How was the cleaning of the restaurant?");
                                        break;
                                    case 3:
                                        System.out.println(blue+"Did you like the Environment of the Restaurant?");
                                        break;
                                    default:
                                        break;
                                }
                                correctType = read.hasNextInt();
                                if (!correctType) {
                                    System.out.println(red+"Enter data is not a Integer Type! ");
                                    read.nextLine();
                                } else {
                                    reviews[i] = read.nextInt();
                                    read.nextLine();

                                    if (reviews[i] < 0 || reviews[i] > 10) {
                                        System.out.println(red+"Enter Star is out of range. Please Enter 1-10");
                                        correctType = false;
                                    }
                                }
                            } while (!correctType);
                        }

                        for (int i = 0; i < 4; i++) {     // add total stars of feedback and divided by 4 for average
                            sum = reviews[0] + reviews[1] + reviews[2] + reviews[3];
                            average = sum / 4;
                        }

                    System.out.println(cyan+"-------------------------------------------------------");    // REmarks Regarding Average
                    if (average < 5) {
                        System.out.println(black+average + cyan+"\nYou got a very low stars.\nTry to raise up your quality\nSo, that more Customer wish to come at your restaurant.\nOtherwise, your restaurant can be close.");
                    } else if (average < 7) {
                        System.out.println(black+average + cyan+"\nYou got less than 7 stars.\nYou need to focus at your restaurant.\nTry to make your restaurant good like others.");
                    } else if (average >= 7) {
                        System.out.println(black+average + cyan+"\nYou got good stars.\nTry to work more in a better way.\nKeep it Up.\nGood Luck.");
                    } else if (average == 10) {
                        System.out.println(black+average + cyan+"\nYou are doing Fantastic Job.\nThis review add you in the top list of the restaurants\nMaintain this standard to keep your restaurant at this place\nGood Luck...");
                    }
                    break;
                case 2:
                    System.out.println(black+"Back to the main menu.......");
                    break;
                }
                break;
            case 5:  // Exit the program
                System.out.println(cyan+"Thank you for coming here!\nClosing the Application\nGood-Bye\n.....\n....\n... ");
                Exit = true;
                break;
            }
        } while ( Exit == false);
    }
}


