/**
 * Administrators class with some methods.
 * Add and remove branches, branch employees and transportation personnel.
 * @author Medine ASLAN
 */
public class Administrators extends CargoCompany
{
    /**
     * This array keeps branches.
     */
    private static Branches [] branches = new Branches[1];
    /**
     * This data keeps branch number.
     */
    private static int branchNumber = 0;

    /**
     * Constructor of Administrators.
     * @param nameSurname is init name and surname.
     */
    public Administrators(String nameSurname)
    {
        super(nameSurname);
    }

    /**
     * Getter method of branches array.
     * @return branches array.
     */
    public static Branches[] getBranches()
    {
        return branches;
    }

    /**
     * Getter method of branch number.
     * @return branchNumber.
     */
    public static int getBranchNumber()
    {
        return branchNumber;
    }

    /**
     * This method add branches to branches array.
     * branches array is dynamically allocated.
     * When object is added branchNumber increased.
     * @param branchObj is the branch object to be added.
     */
    public void addBranches(Branches branchObj)
    {
        if (branchNumber != 0) {
            Branches[] tempBranches = new Branches[branchNumber];

            for (int i = 0; i < branchNumber; ++i) {
                tempBranches[i] = branches[i];
            }

            branches = new Branches[branchNumber + 1];

            for (int i = 0; i < branchNumber; ++i) {
                branches[i] = tempBranches[i];
            }
        }
        branches[branchNumber] = branchObj;
        branchNumber++;
    }

    /**
     * This method remove branches from branches array.
     * When object is removed branchNumber is decreased.
     * @param branchObj is the branch object to be removed.
     */
    public void removeBranches(Branches branchObj)
    {
        for(int i = 0; i < branchNumber; i++)
        {
            if(branches[i] == branchObj)
            {
                if(i == branchNumber - 1){
                    branchNumber--;
                }
                else{
                    for(int k = i; k < branchNumber - 1; k++ )
                    {
                        branches[k] = branches[k+1];
                    }
                    branchNumber--;
                }
            }
        }
    }

    /**
     * This method add branch employee according to the branches.
     * @param branchName is the branch where the employee will be added.
     * @param employeeObj is the branch employee object to be added.
     */
    public void addBranchEmployeeToBranch(String branchName, BranchEmployee employeeObj)
    {
        for(int i = 0; i < branchNumber; i++)
        {
            if(branches[i].getBranchName() == branchName)
            {
                branches[i].addBranchEmployee(employeeObj);
            }
        }
    }

    /**
     * This method remove branch employee according to the branches.
     * @param branchName is the branch where the employee will be removed.
     * @param employeeObj is the branch employee object to be removed.
     */
    public void removeBranchEmployeeToBranch(String branchName, BranchEmployee employeeObj)
    {
        for(int i = 0; i < branchNumber; i++)
        {
            if(branches[i].getBranchName() == branchName)
            {
                branches[i].removeBranchEmployee(employeeObj);
            }
        }
    }

    /**
     * This method add transportation personnel according to the branches.
     * @param branchName is the branch where the personnel will be added.
     * @param personnelObj is the transportation personnel object to be added.
     */
    public void addBranchTransportPersonnel(String branchName, TransportationPersonnel personnelObj)
    {
        for(int i = 0; i < branchNumber; i++)
        {
            if(branches[i].getBranchName() == branchName)
            {
                branches[i].addTransportPersonnel(personnelObj);
            }
        }
    }

    /**
     * This method remove transportation personnel according to the branches.
     * @param branchName is the branch where the personnel will be removed.
     * @param personnelObj is the transportation personnel object to be removed.
     */
    public void removeBranchTransportPersonnel(String branchName, TransportationPersonnel personnelObj)
    {
        for(int i = 0; i < branchNumber; i++)
        {
            if(branches[i].getBranchName() == branchName)
            {
                branches[i].removeTransportPersonnel(personnelObj);
            }
        }
    }
}
