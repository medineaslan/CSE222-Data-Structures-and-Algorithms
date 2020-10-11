import java.util.Scanner;

/**
 * This my Main class. It contains menu. I tested methods which I write.
 * @author Medine Aslan
 */
public class Main {
    public static void main(String[] args){

        BinarySearchTree <Software> binarySearchTree = new BinarySearchTree<>();

        int password = 1234;

        System.out.println();
        System.out.println("=========================Welcome to the Software System======================");

        Software software1 = new Software("Adobe Photoshop 6.0", 1, 100);
        Software software2 = new Software("Adobe Photoshop 6.2", 2, 150);
        Software software3 = new Software("Norton 4.5", 3, 200);
        Software software4 = new Software("Norton 5.5", 4, 250);
        Software software5 = new Software("Adobe Flash 3.3", 5, 300);
        Software software6 = new Software("Adobe Flash 4.0", 6, 350);

        binarySearchTree.add(software1);
        binarySearchTree.add(software2);
        binarySearchTree.add(software3);
        binarySearchTree.add(software4);
        binarySearchTree.add(software5);
        binarySearchTree.add(software6);

        System.out.println(binarySearchTree.toString());

        boolean flag = true;
        while(flag){

            System.out.println();
            System.out.println("=========================Are You User or Administrator?=====================");
            System.out.println("====================Please Enter 'User' or 'Administrator'==================");
            System.out.println("===============If You Want Terminate Program, Please Enter 'Exit'===========");
            System.out.println();
            System.out.print("-Enter your choice: ");
            Scanner object = new Scanner(System.in);
            String whichUser = object.nextLine();

            if(whichUser.compareTo("Administrator") == 0){

                System.out.print("-Please Enter Password (Password is 1234): ");
                int controlPassword = object.nextInt();
                if(controlPassword == password){
                    System.out.println("You have successfully logged in.");

                    int control = 1;

                    while(control != 0){

                        System.out.println();
                        System.out.println("-Please Enter '0' If You Want Exit");
                        System.out.println("-Please Enter '1' If You Want Add Software");
                        System.out.println("-Please Enter '2' If You Want Delete Software");
                        System.out.println("-Please Enter '3' If You Want Update Name of Software");
                        System.out.println("-Please Enter '4' If You Want Update Quantity of Software");
                        System.out.println("-Please Enter '5' If You Want Update Price of Software");
                        System.out.println("-Please Enter '6' If You Want Search Software with Name");

                        System.out.print("Your Choice: ");
                        int choice = object.nextInt();

                        if(choice == 1){
                            System.out.println("Enter Software Name: ");
                            String name = object.nextLine();
                            name = object.nextLine();
                            System.out.println("Enter Quantity: ");
                            int quantity = object.nextInt();
                            System.out.println("Enter Price: ");
                            int price = object.nextInt();

                            Software software = new Software(name, quantity, price);

                            if(binarySearchTree.find(software) != null)
                                binarySearchTree.find(software).setQuantity(binarySearchTree.find(software).getQuantity()+quantity);
                            else
                                binarySearchTree.add(software);

                            System.out.println(binarySearchTree.toString());
                            break;
                        }
                        else if(choice == 2){
                            System.out.println("If you want to remove the software completely enter '1'.");
                            System.out.println("If you want to sell a software enter '2'.");
                            System.out.println("Enter Your Choice: ");
                            int deleteChoice = object.nextInt();
                            if(deleteChoice == 1){
                                System.out.println("Enter Software Name:");
                                String name = object.nextLine();
                                name = object.nextLine();

                                Software software = new Software(name, 0, 0);
                                if(binarySearchTree.find(software) != null){
                                    binarySearchTree.remove(binarySearchTree.find(software));
                                    System.out.println(binarySearchTree.toString());
                                }
                                else
                                    System.out.println("This software is not found.");
                            }
                            else if(deleteChoice == 2){
                                System.out.println("Enter Software Name:");
                                String name = object.nextLine();
                                name = object.nextLine();

                                Software software = new Software(name, 0, 0);
                                if(binarySearchTree.find(software) != null){
                                    if(binarySearchTree.find(software).getQuantity() > 1)
                                        binarySearchTree.find(software).setQuantity(binarySearchTree.find(software).getQuantity() - 1);
                                    else
                                        binarySearchTree.remove(binarySearchTree.find(software));

                                    System.out.println(binarySearchTree.toString());
                                }
                                else
                                    System.out.println("This software is not found.");
                            }
                            else
                                System.out.println("Wrong Choice.");

                            break;
                        }
                        else if(choice == 3){
                            System.out.println("Enter New Software Name:");
                            String nameNew = object.nextLine();
                            nameNew = object.nextLine();
                            System.out.println("Enter Name of Software Which will Update: ");
                            String name = object.nextLine();
                            System.out.println("Enter Quantity of Software Which will Update: ");
                            int quantity = object.nextInt();
                            System.out.println("Enter Price of Software Which will Update: ");
                            int price = object.nextInt();

                            Software software = new Software(name, quantity, price);

                            if(binarySearchTree.find(software) != null){
                                binarySearchTree.find(software).setName(nameNew);
                                System.out.println(binarySearchTree.toString());
                            }
                            else
                                System.out.println("This software is not found.");


                            break;

                        }
                        else if(choice == 4){
                            System.out.println("Enter New Software Quantity:");
                            int quantityNew = object.nextInt();
                            System.out.println("Enter Name of Software Which will Update: ");
                            String name = object.nextLine();
                            name = object.nextLine();
                            System.out.println("Enter Quantity of Software Which will Update: ");
                            int quantity = object.nextInt();
                            System.out.println("Enter Price of Software Which will Update: ");
                            int price = object.nextInt();

                            Software software = new Software(name, quantity, price);

                            if(binarySearchTree.find(software) != null){
                                binarySearchTree.find(software).setQuantity(quantityNew);
                                System.out.println(binarySearchTree.toString());
                            }
                            else
                                System.out.println("This software is not found.");


                            break;

                        }
                        else if(choice == 5){

                            System.out.println("Enter New Software Price:");
                            int priceNew = object.nextInt();
                            System.out.println("Enter Name of Software Which will Update: ");
                            String name = object.nextLine();
                            name = object.nextLine();
                            System.out.println("Enter Quantity of Software Which will Update: ");
                            int quantity = object.nextInt();
                            System.out.println("Enter Price of Software Which will Update: ");
                            int price = object.nextInt();

                            Software software = new Software(name, quantity, price);

                            if(binarySearchTree.find(software) != null){
                                binarySearchTree.find(software).setPrice(priceNew);
                                System.out.println(binarySearchTree.toString());
                            }
                            else
                                System.out.println("This software is not found.");

                            break;

                        }
                        else if(choice == 6){
                            System.out.println("Enter Name of Software: ");
                            String name = object.nextLine();
                            name = object.nextLine();

                            Software software = new Software(name, 0, 0);

                            if(binarySearchTree.find(software) == null)
                                System.out.println("This software is not found.");
                            else
                                System.out.println(binarySearchTree.find(software));

                            break;
                        }
                        else if(choice == 0){
                            control = 0;
                            System.out.println("You Succesfully Logged Out.");
                            System.out.println();
                            break;
                        }
                        else{
                            System.out.println("Wrong Choice. Please Try Again.");
                            System.out.println();
                        }
                    }
                }
                else{
                    System.out.println("Your password is not correct.");
                    System.out.println();
                }
            }
            else if(whichUser.compareTo("User") == 0){
                System.out.println("You have successfully logged in.");

                boolean control = true;

                while(control){

                    System.out.println();
                    System.out.println("-Please Enter '0' If You Want Exit");
                    System.out.println("-Please Enter '1' If You Want Search Software with Name");

                    System.out.print("Your Choice: ");
                    int choice = object.nextInt();

                    if(choice == 1){
                        System.out.println("Enter Name of Software: ");
                        String name = object.nextLine();
                        name = object.nextLine();

                        Software software = new Software(name, 0, 0);

                        if(binarySearchTree.find(software) == null)
                            System.out.println("This software is not found.");
                        else
                            System.out.println(binarySearchTree.find(software));

                        break;
                    }
                    else if(choice == 0){
                        control = false;
                        System.out.println("You Succesfully Logged Out.");
                        break;
                    }
                    else
                        System.out.println("Wrong Choice. Please Try Again.");
                }
            }
            else if(whichUser.compareTo("Exit") == 0){
                flag = false;
            }
            else
                System.out.println("Wrong User Type. Please Try Again.");
        }
    }
}
