/**
 * This is my test class which I tested all of FileSystemTree class.
 */
public class Main {

    public static void main(String[] args){

        System.out.println();
        System.out.println("===================Create File System Tree with Root Node.=================");
        System.out.println();

        FileSystemTree myFileSystem = new FileSystemTree("root");

        System.out.println("=======Add 'first_file.txt' in File System Tree with addFile Method.=======");

        myFileSystem.addFile("root/first_file.txt");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();
        System.out.println("=======Add 'first_directory' in File System Tree with addDir Method.=======");

        myFileSystem.addDir("root/first_directory");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();
        System.out.println("=======Add 'new_file.txt' in 'first_directory' with addFile Method.========");

        myFileSystem.addFile("root/first_directory/new_file.txt");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();
        System.out.println("=======Add 'second_directory' in File System Tree with addDir Method=======");

        myFileSystem.addDir("root/second_directory");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("=======Error checking if user wants add same directory in a level 1========");
        System.out.println("=======Add 'second_directory' in File System Tree with addDir Method=======");
        System.out.println();

        myFileSystem.addDir("root/second_directory");

        System.out.println();

        System.out.println("================Error checking if user wants add same file ================");
        System.out.println("========Add 'new_file.txt' in 'first_directory' with addFile Method========");
        System.out.println();

        myFileSystem.addFile("root/first_directory/new_file.txt");

        System.out.println();

        System.out.println("====Error checking if user wants remove the 'root' node of file system.====");
        System.out.println();

        myFileSystem.remove("root");

        System.out.println();

        System.out.println("=======Add 'third_directory' in File System Tree with addDir Method========");

        myFileSystem.addDir("root/third_directory");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("=======Add 'new_directory' in 'second_directory' with addDir Method.=======");

        myFileSystem.addDir("root/second_directory/new_directory");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("======Add 'second_file.txt' in 'first_directory' with addFile Method.======");

        myFileSystem.addFile("root/first_directory/second_file.txt");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("=======Add 'new_directory' in 'first_directory' with addDir Method.========");

        myFileSystem.addDir("root/first_directory/new_directory");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("=======Add 'new_directory' in 'third_directory' with addDir Method.========");

        myFileSystem.addDir("root/third_directory/new_directory");

        System.out.println("==============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("==Add 'other_directory' in 'third_directory/new_directory' with addDir Method.==");

        myFileSystem.addDir("root/third_directory/new_directory/other_directory");

        System.out.println("================================Print File System===============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("==Add 'new_file.txt' in 'third_directory/new_directory/other_directory' with addFile Method.==");

        myFileSystem.addFile("root/third_directory/new_directory/other_directory/new_file.txt");

        System.out.println("======================================Print File System=======================================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("====================Search 'new' in a file system tree=====================");
        System.out.println();

        myFileSystem.search("new");

        System.out.println();

        System.out.println("======Error check! Search chars which they are not in the file system======");
        System.out.println("===============Search 'heyYou' in a file system tree=======================");
        System.out.println();

        myFileSystem.search("heyYou");

        System.out.println();

        System.out.println("==============Error check! Path is not found while removing.===============");
        System.out.println("==================Remove root/first_directory/heyYou=======================");

        System.out.println();

        myFileSystem.remove("root/first_directory/heyYou");

        System.out.println();

        System.out.println("==============Error check! Path is not found while removing.===============");
        System.out.println("======================Remove root/sixth_directory==========================");

        System.out.println();

        myFileSystem.remove("root/sixth_directory");

        System.out.println();

        System.out.println("==============Error check! Path is not found while removing.===============");
        System.out.println("==========Remove root/second_directory/new_directory/heyYou================");

        System.out.println();

        myFileSystem.remove("root/second_directory/new_directory/heyYou");

        System.out.println();

        System.out.println("=====Remove 'root/second_directory/new_directory' with remove method.======");

        System.out.println();

        System.out.println("=====================Print File System Before Remove=======================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        myFileSystem.remove("root/second_directory/new_directory");

        System.out.println("=====================Print File System After Remove========================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("============Remove 'root/third_directory' with remove method.=============");

        myFileSystem.remove("root/third_directory");

        System.out.println("================Print File System After Remove Method=====================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("=========Error Check! If user wants to add file into the file=============");
        System.out.println("===Add 'root/first_directory/new_file.txt/heyYou' using addFile method.===");

        System.out.println();

        myFileSystem.addFile("root/first_directory/new_file.txt/heyYou");

        System.out.println();

        System.out.println("=============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

        System.out.println("=======Error Check! If user wants to add directory into the file==========");
        System.out.println("===Add 'root/first_directory/new_file.txt/heyYou' using addDir method.====");

        System.out.println();

        myFileSystem.addDir("root/first_directory/new_file.txt/heyYou");

        System.out.println();

        System.out.println("=============================Print File System============================");
        System.out.println();

        myFileSystem.printFileSystem();

        System.out.println();

    }
}
