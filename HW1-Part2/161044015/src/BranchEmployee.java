import java.util.ArrayList;

/**
 * BranchEmployee class with some methods.
 * @author Medine ASLAN
 * */
public class BranchEmployee extends UserAbstract
{
    /**
     * Keeps employee id.
     */
    private String empId;

    /**
     * Keeps customers in customer array list.
     */
    private static ArrayList<Customer> customer = new ArrayList<>();

    /**
     * Constructor of BranchEmployee.
     * @param nameSurname init nameSurname.
     * @param id init empId.
     */
    public BranchEmployee(String nameSurname,String id)
    {
        super(nameSurname);
        empId = id;
    }

    /**
     * Getter method of customer array.
     * @return customer array list.
     */
    public static ArrayList<Customer> getCustomer() {
        return customer;
    }

    /**
     * Getter method of empId.
     * @return empId.
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * This method adds shipments to the branches.
     * If shipment has same tracking number do not added.
     * Only Shipment objects added.
     * @param branchName keeps the name of the branch to be added to the object.
     * @param objToAdd object to be added.
     */
    @Override
    public void addToBranch(String branchName, CargoCompanyInterface objToAdd)
    {
        Shipment obj;
        obj = (Shipment)objToAdd;

        if(obj.currentStatus == branchName)
        {
            if(branchIsExist(branchName))
            {
                if(objToAdd instanceof Shipment)
                {
                    for(int i = 0; i < getBranches().size(); i++)
                    {
                        if(getBranches().get(i).getNameOrId().equals(branchName))
                        {
                            getBranches().get(i).addShipment((Shipment) objToAdd);
                        }
                    }
                }
                else
                    System.out.println("Wrong object type.");
            }
            else
                System.out.println("There is no branch at this name.");
        }
        else
            System.out.println("Wrong Branch Name.");



    }

    /**
     * This method remove shipments from the branches.
     * If shipment that is not exist do not removed.
     * Only Shipment objects removed.
     * @param branchName keeps the name of the branch to be removed to the object.
     * @param objToRemove object to be removed.
     */
    @Override
    public void removeFromBranch(String branchName, CargoCompanyInterface objToRemove)
    {
        if(branchIsExist(branchName))
        {
            if(objToRemove instanceof Shipment)
            {
                for(int i = 0; i < getBranches().size(); i++)
                {
                    if(getBranches().get(i).getNameOrId().equals(branchName))
                    {
                        getBranches().get(i).removeShipment((Shipment) objToRemove);
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
     * This method adds the customers to the automation system.
     * Same customer do not added.
     * Only Customer objects added.
     * @param objToAdd object to be added.
     */
    @Override
    public void addToAutomationSystem(CargoCompanyInterface objToAdd)
    {
        if(objToAdd instanceof Customer)
        {
            Customer customerObj ;

            customerObj = (Customer)objToAdd;

            boolean isUnique = true;

            if(customer.size() != 0)
            {
                for(int i = 0; i < customer.size(); i++)
                {
                    if(customer.get(i).getCustomerId() == customerObj.getCustomerId() )
                    {
                        isUnique = false;
                    }
                }
            }

            if (customer.size() == 0 || isUnique)
                customer.add((Customer)objToAdd);

            if(!isUnique)
                System.out.println("This customer is already added.");
        }
        else
            System.out.println("Wrong object type.");

    }

    /**
     * This method removes the customers to the automation system.
     * If customer that is not exist do not removed.
     * Only Customer objects removed.
     * @param objToRemove object to be removed.
     */
    @Override
    public void removeFromAutomationSystem(CargoCompanyInterface objToRemove)
    {
        if(objToRemove instanceof Customer)
        {
            Customer customerObj ;

            customerObj = (Customer)objToRemove;

            boolean isContains = false;

            if(customer.size() == 0)
                System.out.println("There is no customer to be removed.");
            else
            {
                for(int i = 0; i < customer.size(); i++)
                {
                    if(customerObj.getCustomerId() == customer.get(i).getCustomerId()){
                        customer.remove(objToRemove);
                        isContains = true;
                    }

                }
                if(!isContains)
                {
                    System.out.println("This customer is not found.");
                }
            }
        }
        else
            System.out.println("Wrong object type.");

    }

    /**
     * This method allows to branch employee can set current status of shipment when shipment is in distribution.
     * @param branch branch of shipment.
     * @param trackNum is the tracking number of shipment to be setted.
     */
    public void setCurrentStatus(Branches branch, String trackNum)
    {
        for(int i = 0; i < branch.getCargoShipments().size(); i++)
        {
            if(branch.getCargoShipments().get(i).trackingNumber.equals(trackNum))
            {
                branch.getCargoShipments().get(i).currentStatus = "Shipment in distribution.";
            }
        }
    }

    /**
     * I used this method to see customer array lists contents.
     * @return customer array lists contents.
     */
    @Override
    public String toString()
    {
        String result = "";

        for(int i = 0; i < customer.size(); ++i)
        {
            result += String.valueOf(i+1) + ")" + customer.get(i).getNameOrId() + "\n";
        }

        return result;
    }
}
