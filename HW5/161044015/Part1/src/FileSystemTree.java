import java.util.*;

/**
 * This is my FileSystemTree class which represent file system tree with general tree.
 */
public class FileSystemTree {

    /**
     * Represents root node of the tree.
     */
    FileNode root;

    /**
     * This is my inner FileNode class which is used for represent tree nodes.
     */
    protected static class FileNode{

        /**
         * Keeps node names.
         */
        protected String name;

        /**
         * Keeps childs of nodes with list structure.
         */
        protected List<FileNode> child;

        /**
         * Difference between files and directories. If node is file, isDirectory equals false otherwise true.
         */
        protected boolean isDirectory;

        /**
         * Keeps nodes' parent node.
         */
        protected FileNode parent;

        /**
         * Consturctor of FileNode.
         * @param name initialize node name.
         * @param isDirectory initialize if node is diretory or not.
         * @param parent initialize nodes' parent node.
         */
        public FileNode(String name, boolean isDirectory, FileNode parent){
            this.name = name;
            this.isDirectory = isDirectory;
            this.parent = parent;

            if(isDirectory)
                child = new ArrayList<>();
        }
    }

    /**
     * Constructor of FileSystemTree.
     * Create a file system with a root directory.
     * @param rootName initialize root name.
     */
    public FileSystemTree(String rootName){
         root = new FileNode(rootName, true, null);
    }

    /**
     * This method adds directory to the file system.
     * Firstly path which comes from as a parameter splitted.
     * This method controls if the directory is the same with others. If they are same directory dont add.
     * @param path path of the directory which will added.
     */
    public void addDir(String path){

        String[] tokens = path.split("/");
        boolean isSame = false;
        FileNode temp = root;

        int tokenNumber = tokens.length - 1;

        if(tokens.length == 2){
            FileNode newDir = new FileNode(tokens[tokens.length-1], true, root);
            for(int j = 0; j < root.child.size(); j++){
                if(root.child.get(j).name.compareTo(tokens[tokenNumber]) == 0){
                    if(root.child.get(j).isDirectory)
                        isSame = true;
                }
            }
            if(!isSame)
                root.child.add(newDir);
            else
                System.out.println("This is the same directory name. You can not add with this directory name.");
        }
        else{
            int pathNum = 1;
            int i = 0;

            while(i < root.child.size()){
                if(root.child.get(i).name.compareTo(tokens[pathNum]) == 0 ){
                    pathNum++;
                    if(pathNum == tokenNumber){
                        if(root.child.get(i).isDirectory){
                            FileNode newDir = new FileNode(tokens[tokens.length-1], true, root.child.get(i));
                            for(int j = 0; j < root.child.get(i).child.size(); j++){
                                if(root.child.get(i).child.get(j).name.compareTo(tokens[tokenNumber]) == 0){
                                    if(root.child.get(i).child.get(j).isDirectory){
                                        isSame = true;
                                    }
                                }
                            }
                            if(!isSame)
                                root.child.get(i).child.add(newDir);
                            else
                                System.out.println("This is the same directory name. You can not add with this directory name.");
                        }
                        else
                            System.out.println("You can not add into the file.");
                    }
                    else{
                        root = root.child.get(i);
                        i=0;
                    }
                }
                else
                    i++;
            }
        }
        root = temp;
    }

    /**
     * This method adds file to the file system.
     * Firstly path which comes from as a parameter splitted.
     * This method controls if the file is the same with others. If they are same file dont add.
     * @param path path of the file which will added.
     */
    public void addFile(String path){

        String[] tokens = path.split("/");
        boolean isSame = false;
        FileNode temp = root;

        int tokenNumber = tokens.length - 1;

        if(tokens.length == 2){
            FileNode newFile= new FileNode(tokens[tokens.length-1], false, root);

            for(int j = 0; j < root.child.size(); j++){
                if(root.child.get(j).name.compareTo(tokens[tokenNumber]) == 0){
                    if(!(root.child.get(j).isDirectory))
                        isSame = true;
                }
            }
            if(!isSame)
                root.child.add(newFile);
            else
                System.out.println("This is the same file name. You can not add with this file name.");
        }

        else{
            int pathNum = 1;
            int i = 0;

            while(i < root.child.size()){
                if(root.child.get(i).name.compareTo(tokens[pathNum]) == 0 ){
                    pathNum++;
                    if(pathNum == tokenNumber){
                        if(root.child.get(i).isDirectory){
                            FileNode newFile = new FileNode(tokens[tokens.length-1], false, root.child.get(i));

                            for(int j = 0; j < root.child.get(i).child.size(); j++){
                                if(root.child.get(i).child.get(j).name.compareTo(tokens[tokenNumber]) == 0){
                                    if(!(root.child.get(i).child.get(j).isDirectory) ){
                                        isSame = true;
                                    }
                                }
                            }
                            if(!isSame)
                                root.child.get(i).child.add(newFile);
                            else
                                System.out.println("This is the same file name. You can not add with this file name.");
                        }
                        else
                            System.out.println("You can not add into the file.");

                    }
                    else{
                        root = root.child.get(i);
                        i=0;
                    }
                }
                else
                    i++;
            }
        }
        root = temp;
    }

    /**
     * This method removes a directory or a file from the file system tree.
     * If the path is not found, this method warn the user.
     *  If the directory includes other contents, this method shows the contents and ask the user whether to remove or not.
     *  If the user wants remove, enter 1 otherwise enter different number.
     *  If the user wants the root node, the system is not allows this operation.
     * @param path path of the file or directory which will added.
     */
    public void remove(String path)
    {
        String[] tokens = path.split("/");
        int pathNum = 1;
        int tokenNumber = tokens.length;
        FileNode temp = root;
        boolean isFound = false;

        int i = 0;

        if(tokens[tokenNumber - 1].compareTo(root.name) == 0)
            System.out.println("You can not Remove Root Node.");
        else{
            while(i < root.child.size()){
                if(tokens[pathNum].compareTo(root.child.get(i).name) == 0){
                    pathNum++;
                    if(pathNum == tokenNumber){
                        if(!root.child.get(i).isDirectory){ ///File ise
                            root.child.remove(i);
                            break;
                        }
                        else{
                            if(root.child.get(i).child.isEmpty()){ ///Directory altında bir şey yoksa
                                root.child.remove(i);
                                break;
                            }
                            else{
                                System.out.println("This Directory Includes These Contents.");
                                System.out.println();
                                helperPrintFileSystem(root.child.get(i));
                                System.out.println();
                                System.out.println("Do You Want to Remove This Directory?");
                                System.out.println("If Yes, Enter 1");
                                System.out.println("If No,  Enter Other Numbers.");

                                Scanner myObj = new Scanner(System.in);
                                int removeOrNot = myObj.nextInt();

                                if(removeOrNot == 1)
                                    root.child.remove(i);
                                break;
                            }
                        }
                    }
                    else{
                        root = root.child.get(i);
                        isFound = false;
                        if(root.child.size() == 0){
                            System.out.println("This path can not found.");
                        }
                        else{
                            for(int j=0; j < root.child.size(); j++){
                                if(root.child.get(j).name.compareTo(tokens[pathNum]) == 0){
                                    isFound = true;
                                    break;
                                }
                            }
                            if(!isFound){
                                System.out.println("This path can not found.");
                                break;
                            }
                        }
                        i=0;
                    }
                }
                else{
                    i++;
                    if(i == root.child.size() && tokenNumber == 2){
                        System.out.println("This path can not found.");
                    }
                }
            }
            root = temp;
        }
    }

    /**
     * This method searches the given characters in the file system.
     * If characters is did not found prints information message.
     * @param chars search characters.
     */
    public void search(String chars)
    {
        List <FileNode> fileSystem = new ArrayList <> ();

        fileSystem.add(root);

        int find = 0;

        while (fileSystem.size() > 0)
        {
            int size = fileSystem.size();

            while (size > 0)
            {
                FileNode first = fileSystem.get(0);
                fileSystem.remove(0);

                if(first.name.contains(chars)){
                    find = 1;
                    if(first.isDirectory)
                        System.out.print("dir - ");
                    else
                        System.out.print("file - ");
                    printSearchedPath(root, first, chars);
                    System.out.println();
                }
                if(first.isDirectory){
                    for (int i = 0; i < first.child.size(); i++)
                        fileSystem.add(first.child.get(i));
                }
                size--;
            }
            if(fileSystem.isEmpty() && find != 1)
                System.out.println("This chars not found in tree.");
        }
    }

    /**
     * This method prints the path of the searched file or directory for using search method.
     * @param root root node of the file system.
     * @param cur is node which contains the searched characters.
     * @param search searched characters.
     */
    public void printSearchedPath(FileNode root, FileNode cur, String search){

        if(cur == null)
            return;

        printSearchedPath(root, cur.parent, search);

        if(cur == root)
            System.out.print(cur.name + "/");
        else
            System.out.print(cur.name + "/");
    }

    /**
     * This method prints file system using helperPrintFileSystem method for making recursive.
     */
    public void printFileSystem()
    {
        helperPrintFileSystem(root);
    }

    /**
     * This method prints whole tree recursively.
     * My traversal method prints the tree this way.
     * Firstly printed root node. Then printed roots' childs.
     * After that printed starting from the leftmost node. And printed until its childs is empty.
     * Then, to proceed in the same way, one node passed to the right.
     * @param curNode is the root node.
     */
    public void helperPrintFileSystem(FileNode curNode){

        if(curNode == null)
            return;

        if(curNode == root)
            System.out.println(root.name);

        if(curNode.child != null){
            for(int i = 0; i < curNode.child.size(); i++){
                System.out.print(curNode.child.get(i).name + " ");
                if(i == curNode.child.size() - 1)
                    System.out.println();
            }
            for(int i = 0; i < curNode.child.size(); i++)
                helperPrintFileSystem(curNode.child.get(i));
        }
    }
}
