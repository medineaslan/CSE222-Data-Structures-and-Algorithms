import java.util.Scanner;

/**
 * This my Main class. It contains menu. I tested methods which I write.
 */
public class Main {
    public static void main(String[] args){

        LibrarySystem library = new LibrarySystem();

        System.out.println("=========================Welcome to the Library System======================");

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
                int password = object.nextInt();
                if(password == library.getPassword()){
                    System.out.println("You have successfully logged in.");

                    Administrators admin = new Administrators();

                    int control = 1;

                    while(control != 0){

                        System.out.println();
                        System.out.println("-Please Enter '0' If You Want Exit");
                        System.out.println("-Please Enter '1' If You Want Add Book");
                        System.out.println("-Please Enter '2' If You Want Delete Book");
                        System.out.println("-Please Enter '3' If You Want Update Author of Book");
                        System.out.println("-Please Enter '4' If You Want Update Title of Book");
                        System.out.println("-Please Enter '5' If You Want Update Location of Book");
                        System.out.println("-Please Enter '6' If You Want Search Book by Title");
                        System.out.println("-Please Enter '7' If You Want Search Book by Author Name");

                        System.out.print("Your Choice: ");
                        int choice = object.nextInt();

                        if(choice == 1){
                            System.out.println("Enter Author Name: ");
                            String author = object.nextLine();
                            author = object.nextLine();
                            System.out.println("Enter Title: ");
                            String title = object.nextLine();
                            System.out.println("Enter Location: ");
                            String location = object.nextLine();

                            Books book1 = new Books(author, title, location);
                            admin.addBook(book1);
                            break;
                        }
                        else if(choice == 2){
                            System.out.println("Enter Author Name: ");
                            String author = object.nextLine();
                            author = object.nextLine();
                            System.out.println("Enter Title: ");
                            String title = object.nextLine();
                            System.out.println("Enter Location: ");
                            String location = object.nextLine();

                            Books book2 = new Books(author, title, location);
                            admin.deleteBook(book2);
                            break;
                        }
                        else if(choice == 3){
                            System.out.println("Enter New Author Name:");
                            String authorNew = object.nextLine();
                            authorNew = object.nextLine();
                            System.out.println("Enter Author Name of Book Which will Update: ");
                            String author = object.nextLine();
                            System.out.println("Enter Title of Book Which will Update: ");
                            String title = object.nextLine();
                            System.out.println("Enter Location of Book Which will Update: ");
                            String location = object.nextLine();

                            Books book3 = new Books(author, title, location);

                            admin.updateAuthorName(book3, authorNew);
                            break;

                        }
                        else if(choice == 4){
                            System.out.println("Enter New Title:");
                            String titleNew = object.nextLine();
                            titleNew = object.nextLine();
                            System.out.println("Enter Author Name of Book Which will Update: ");
                            String author = object.nextLine();
                            System.out.println("Enter Title of Book Which will Update: ");
                            String title = object.nextLine();
                            System.out.println("Enter Location of Book Which will Update: ");
                            String location = object.nextLine();

                            Books book4 = new Books(author, title, location);

                            admin.updateTitle(book4, titleNew);
                            break;

                        }
                        else if(choice == 5){
                            System.out.println("Enter New Location:");
                            String locationNew = object.nextLine();
                            locationNew = object.nextLine();

                            System.out.println("Enter Author Name of Book Which will Update: ");
                            String author = object.nextLine();
                            System.out.println("Enter Title of Book Which will Update: ");
                            String title = object.nextLine();
                            System.out.println("Enter Location of Book Which will Update: ");
                            String location = object.nextLine();

                            Books book5 = new Books(author, title, location);

                            admin.updateLocation(book5, locationNew);
                            break;

                        }
                        else if(choice == 6){
                            System.out.println("Enter Title: ");
                            String title = object.nextLine();
                            title = object.nextLine();

                            admin.searchByTitle(title);
                            break;
                        }
                        else if(choice == 7){
                            System.out.println("Enter Author Name: ");
                            String author = object.nextLine();
                            author = object.nextLine();

                            admin.searchByAuthorName(author);
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

                Users user = new Users();

                boolean control = true;

                while(control){

                    System.out.println();
                    System.out.println("-Please Enter '0' If You Want Exit");
                    System.out.println("-Please Enter '1' If You Want Search Book by Title");
                    System.out.println("-Please Enter '2' If You Want Search Book by Author Name");

                    System.out.print("Your Choice: ");
                    int choice = object.nextInt();

                    if(choice == 1){
                        System.out.println("Enter Title: ");
                        String title = object.nextLine();
                        title = object.nextLine();

                        user.searchByTitle(title);
                        break;
                    }
                    else if(choice == 2){
                        System.out.println("Enter Author Name: ");
                        String author = object.nextLine();
                        author = object.nextLine();

                        user.searchByAuthorName(author);
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
