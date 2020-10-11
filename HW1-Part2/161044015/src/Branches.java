import java.util.ArrayList;

/**
 * Branches class with some methods.
 * It has branches name, branches branch employees and transportation personnel.
 * @author Medine ASLAN
 */
public class Branches implements CargoCompanyInterface
{
    /**
     * Keeps branch name.
     */
    private String branchName;

    /**
     * Keeps branch id.
     */
    private String branchId;

    /**
     * Keep branch employees in branchEmployees array list.
     */
    private ArrayList<BranchEmployee> branchEmployees = new ArrayList<>();

    /**
     * Keep transportation personnel in transportPersonnel array list.
     */
    private ArrayList<TransportationPersonnel> transportPersonnel = new ArrayList<>();

    /**
     * Keep shipments in cargoShipments array list.
     */
    private ArrayList<Shipment> cargoShipments = new ArrayList<>();

    /**
     * Constructor of Branches.
     * @param name init branchName.
     * @param id init branchId.
     */
    public Branches(String name, String id)
    {
        this.branchName = name;
        this.branchId = id;
    }

    /**
     * Getter method of branchId.
     * @return branchId.
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Overriding getter method of branchName.
     * @return branchName.
     */
    @Override
    public String getNameOrId()
    {
        return branchName;
    }

    /**
     * Overriding setter method of branchName.
     * @param newNameOrId keeps the new name or id.
     */
    @Override
    public void setNameOrId(String newNameOrId)
    {
        branchName = newNameOrId;
    }

    /**
     * Getter method of branchEmployees array list.
     * @return branchEmployees.
     */
    public ArrayList<BranchEmployee> getBranchEmployees() {
        return branchEmployees;
    }

    /**
     * Getter method of transportPersonnel array list.
     * @return transportPersonnel.
     */
    public ArrayList<TransportationPersonnel> getTransportPersonnel() {
        return transportPersonnel;
    }

    /**
     * Getter method of cargoShipments array list.
     * @return cargoShipments.
     */
    public ArrayList<Shipment> getCargoShipments() {
        return cargoShipments;
    }

    /**
     * This method allows the add shipments to branches.
     * Same object do not added.
     * @param shipmentObj Shipment object to be added.
     */

    public void addShipment(Shipment shipmentObj)
    {
        boolean isUnique = true;

        if(cargoShipments.size() != 0)
        {
            for(int i = 0; i < cargoShipments.size(); i++)
            {
                if(cargoShipments.get(i).trackingNumber == shipmentObj.trackingNumber )
                {
                    isUnique = false;
                }
            }
        }

        if (cargoShipments.size() == 0 || isUnique)
            cargoShipments.add(shipmentObj);

        if(!isUnique)
            System.out.println("This shipment is already added.");

    }

    /**
     * This method allows the remove shipments from branches.
     * If object that is not exist do not removed.
     * @param shipmentObj Shipment object to be removed.
     */
    public void removeShipment(Shipment shipmentObj)
    {
        boolean isContains = false;

        if(cargoShipments.size() == 0)
            System.out.println("There is no shipment to be removed.");
        else
        {
            for(int i = 0; i < cargoShipments.size(); i++)
            {
                if(shipmentObj.trackingNumber == cargoShipments.get(i).trackingNumber){
                    cargoShipments.remove(shipmentObj);
                    isContains = true;
                }

            }
            if(!isContains)
            {
                System.out.println("This shipment is not found.");
            }
        }
    }

    /**
     * This method allows the add branch employees to branches.
     * Same object do not added.
     * @param employeeObj BranchEmployee object to be added.
     */
    public void addBranchEmployee(BranchEmployee employeeObj)
    {
        boolean isUnique = true;

        if(branchEmployees.size() != 0)
        {
            for(int i = 0; i < branchEmployees.size(); i++)
            {
                if(branchEmployees.get(i).getEmpId() == employeeObj.getEmpId() )
                {
                    isUnique = false;
                }
            }
        }

        if (branchEmployees.size() == 0 || isUnique)
            branchEmployees.add(employeeObj);

        if(!isUnique)
            System.out.println("This branch employee is already added.");

    }

    /**
     * This method allows to remove branch employee from branches.
     * If object that is not exist do not removed.
     * @param employeeObj BranchEmployee object to be removed.
     */
    public void removeBranchEmployee(BranchEmployee employeeObj)
    {

        boolean isContains = false;

        if(branchEmployees.size() == 0)
            System.out.println("There is no branch employee to be removed.");
        else
        {
            for(int i = 0; i < branchEmployees.size(); i++)
            {
                if(employeeObj.getEmpId() == branchEmployees.get(i).getEmpId()){
                    branchEmployees.remove(employeeObj);
                    isContains = true;
                }

            }
            if(!isContains)
            {
                System.out.println("This branch employee is not found.");
            }
        }
    }

    /**
     * This method allows to add transportation personnel to the branches.
     * Same object do not added.
     * @param personnelObj TransportationPersonnel object to be added.
     */
    public void addTransportPersonnel(TransportationPersonnel personnelObj)
    {
        boolean isUnique = true;

        if(transportPersonnel.size() != 0)
        {
            for(int i = 0; i < transportPersonnel.size(); i++)
            {
                if(transportPersonnel.get(i).getPersonnelId() == personnelObj.getPersonnelId() )
                {
                    isUnique = false;
                }
            }
        }

        if (transportPersonnel.size() == 0 || isUnique)
            transportPersonnel.add(personnelObj);

        if(!isUnique)
            System.out.println("This transportation personnel is already added.");

    }

    /**
     * This method allows to remove transportation personnel from the branches.
     * If object that is not exists do not removed.
     * @param personnelObj TransportationPersonnel object to be removed.
     */
    public void removeTransportPersonnel(TransportationPersonnel personnelObj)
    {
        boolean isContains = false;

        if(transportPersonnel.size() == 0)
            System.out.println("There is no transportation personnel to be removed.");
        else
        {
            for(int i = 0; i < transportPersonnel.size(); i++)
            {
                if(personnelObj.getPersonnelId() == transportPersonnel.get(i).getPersonnelId()){
                    transportPersonnel.remove(personnelObj);
                    isContains = true;
                }

            }
            if(!isContains)
            {
                System.out.println("This transportation personnel is not found.");
            }
        }
    }

    /**
     * This method allows to see branchEmployees and transportPersonnel array lists content.
     * @param empOrPersonnel if 1 see branchEmployees contents else see transportPersonnel content.
     * @return array lists content.
     */
    public String printEmployeeInformation(int empOrPersonnel)
    {
        String result = "";

        if(empOrPersonnel == 1)
        {
            for(int i = 0; i < branchEmployees.size(); ++i)
            {
                result += branchEmployees.get(i).getNameOrId() + "\n";
            }

        }
        else
        {
            for(int i = 0; i < transportPersonnel.size(); ++i)
            {
                result += transportPersonnel.get(i).getNameOrId() + "\n";
            }
        }
        return result;
    }
}

