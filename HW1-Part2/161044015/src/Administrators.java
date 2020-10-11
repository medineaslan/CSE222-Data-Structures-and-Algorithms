/**
 * Administrators class with some methods.
 * Add and remove branches, branch employees and transportation personnel.
 * @author Medine ASLAN
 */
public class Administrators extends UserAbstract
{
    /**
     * Constructor of Administrators.
     * @param nameSurname is init name and surname.
     */
    public Administrators(String nameSurname)
    {
        super(nameSurname);
    }

    /**
     * This method adds the branches to the automation system.
     * Same branch is not added.
     * Only Branches objects added.
     * @param objToAdd object to be added.
     */
    @Override
    public void addToAutomationSystem(CargoCompanyInterface objToAdd)
    {
        if(objToAdd instanceof Branches){
            Branches brObj ;

            brObj = (Branches)objToAdd;

            boolean isUnique = true;

            if(getBranches().size() != 0)
            {
                for(int i = 0; i < getBranches().size(); i++)
                {
                    if(getBranches().get(i).getBranchId() == brObj.getBranchId() )
                    {
                        isUnique = false;
                    }
                }
            }

            if (getBranches().size() == 0 || isUnique)
                getBranches().add((Branches)objToAdd);

            if(!isUnique)
                System.out.println("This branch is already added.");
        }
        else
            System.out.println("Wrong object type.");
    }

    /**
     * This method removes the branches to the automation system.
     * The object that is not exist do not removed.
     * Only Branches objects removed.
     * @param objToRemove object to be removed.
     */
    @Override
    public void removeFromAutomationSystem(CargoCompanyInterface objToRemove)
    {
        if(objToRemove instanceof  Branches)
        {
            Branches brObj ;

            brObj = (Branches)objToRemove;

            boolean isContains = false;

            if(getBranches().size() == 0)
                System.out.println("There is no branch to be removed.");
            else
            {
                for(int i = 0; i < getBranches().size(); i++)
                {
                    if(brObj.getBranchId() == getBranches().get(i).getBranchId()){
                        getBranches().remove(objToRemove);
                        isContains = true;
                    }

                }
                if(!isContains)
                {
                    System.out.println("This branch is not found.");
                }
            }
        }
        else
            System.out.println("Wrong object type.");

    }

    /**
     * This method adds transportation personnel and branch employees from branches.
     * Same persons do not added.
     * @param branchName keeps the name of the branch to be added to the object.
     * @param objToAdd object to be added.
     */
    @Override
    public void addToBranch(String branchName, CargoCompanyInterface objToAdd)
    {
        if(branchIsExist(branchName))
        {
            if(objToAdd instanceof BranchEmployee || objToAdd instanceof TransportationPersonnel)
            {
                for(int i = 0; i < getBranches().size(); i++)
                {
                    if(getBranches().get(i).getNameOrId().equals(branchName))
                    {
                        if(objToAdd instanceof BranchEmployee)
                            getBranches().get(i).addBranchEmployee((BranchEmployee) objToAdd);
                        else
                            getBranches().get(i).addTransportPersonnel((TransportationPersonnel) objToAdd);
                    }
                }
            }
            else
                System.out.println("Wrong object type.");
        }
        else
            System.out.println("There is no branch at this name.");


    }

    /**
     * This method removes the branch employees and transportation personnels from the branches.
     * The object that is not exists in the branch do not removed.
     * @param branchName keeps the name of the branch to be removed to the object.
     * @param objToRemove object to be removed.
     */
    @Override
    public void removeFromBranch(String branchName, CargoCompanyInterface objToRemove)
    {
        if(branchIsExist(branchName))
        {
            if(objToRemove instanceof BranchEmployee || objToRemove instanceof TransportationPersonnel)
            {
                for(int i = 0; i < getBranches().size(); i++)
                {
                    if(getBranches().get(i).getNameOrId().equals(branchName))
                    {
                        if(objToRemove instanceof BranchEmployee)
                            getBranches().get(i).removeBranchEmployee((BranchEmployee) objToRemove);
                        else
                            getBranches().get(i).removeTransportPersonnel((TransportationPersonnel) objToRemove);
                    }
                }
            }
            else
                System.out.println("Wrong object type.");
        }
        else
            System.out.println("There is no branch at this name.");

    }
}
