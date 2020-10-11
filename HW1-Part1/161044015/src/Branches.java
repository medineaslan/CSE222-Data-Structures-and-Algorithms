/**
 * Branches class with some methods.
 * It has branches name, branches branch employees and transportation personnel.
 * @author Medine ASLAN
 */
public class Branches{

    /**
     * Keeps branch name.
     */
    private String branchName;

    /**
     * Keep branch employees in branches.
     */
    private BranchEmployee [] branchEmployees = new BranchEmployee[1];
    /**
     * Keep branch employee number.
     */
    private int employeeNumber = 0;

    /**
     * Keep transportation personnel in branches.
     */
    private TransportationPersonnel [] transportPersonnel = new TransportationPersonnel[1];
    /**
     * Keep transportation personnel number.
     */
    private int personnelNumber = 0;

    /**
     * Constructor of branches.
     * @param name init branches name.
     */
    public Branches(String name)
    {
        branchName = name;
    }

    /**
     * Getter method of branchEmployees array.
     * @return branchEmployees.
     */
    public BranchEmployee[] getBranchEmployees() {
        return branchEmployees;
    }

    /**
     * Getter method of employee number.
     * @return employeeNumber.
     */
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Getter method of transportPersonnel array.
     * @return transportPersonnel.
     */
    public TransportationPersonnel[] getTransportPersonnel() {
        return transportPersonnel;
    }

    /**
     * Getter method of personnelNumber.
     * @return personnelNumber.
     */
    public int getPersonnelNumber() {
        return personnelNumber;
    }

    /**
     * Getter method of branchName.
     * @return branchName.
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * This method add branch employees.
     * branchEmployees array is dynamically allocated.
     * When object is added employeeNumber increased.
     * @param employeeObj is the branch employee object to be added.
     */
    public void addBranchEmployee(BranchEmployee employeeObj)
    {
        if (employeeNumber != 0) {
            BranchEmployee [] tempBranches = new BranchEmployee[employeeNumber];

            for (int i = 0; i < employeeNumber; ++i) {
                tempBranches[i] = branchEmployees[i];
            }

            branchEmployees = new BranchEmployee[employeeNumber + 1];

            for (int i = 0; i < employeeNumber; ++i) {
                branchEmployees[i] = tempBranches[i];
            }
        }
        branchEmployees[employeeNumber] = employeeObj;
        employeeNumber++;
    }

    /**
     * This method remove branch employees from branchEmployees array.
     * When object is removed employeeNumber is decreased.
     * @param employeeObj is the branch employee object to be removed.
     */
    public void removeBranchEmployee(BranchEmployee employeeObj)
    {
        for(int i = 0; i < employeeNumber; i++)
        {
            if(branchEmployees[i] == employeeObj)
            {
                if(i == employeeNumber - 1){
                    employeeNumber--;
                }
                else{
                    for(int k = i; k < employeeNumber - 1; k++ )
                    {
                        branchEmployees[k] = branchEmployees[k+1];
                    }
                    employeeNumber--;
                }
            }
        }
    }

    /**
     * This method add transportation personnel to transportPersonnel array.
     * transportPersonnel array is dynamically allocated.
     * When object is added branchNumber increased.
     * @param personnelObj is the transportation personnel object to be added.
     */
    public void addTransportPersonnel(TransportationPersonnel personnelObj)
    {
        if (personnelNumber != 0) {
            TransportationPersonnel[] tempBranches = new TransportationPersonnel[personnelNumber];

            for (int i = 0; i < personnelNumber; ++i) {
                tempBranches[i] = transportPersonnel[i];
            }

            transportPersonnel = new TransportationPersonnel[personnelNumber + 1];

            for (int i = 0; i < personnelNumber; ++i) {
                transportPersonnel[i] = tempBranches[i];
            }
        }
        transportPersonnel[personnelNumber] = personnelObj;
        personnelNumber++;
    }

    /**
     * This method remove transportation personnel from transportPersonnel array.
     * When object is removed branchNumber is decreased.
     * @param personnelObj is the transportation personnel object to be removed.
     */
    public void removeTransportPersonnel(TransportationPersonnel personnelObj)
    {
        for(int i = 0; i < personnelNumber; i++)
        {
            if(transportPersonnel[i] == personnelObj)
            {
                if(i == personnelNumber - 1){
                    personnelNumber--;
                }
                else{
                    for(int k = i; k < personnelNumber - 1; k++ )
                    {
                        transportPersonnel[k] = transportPersonnel[k+1];
                    }
                    personnelNumber--;
                }
            }
        }
    }
}
