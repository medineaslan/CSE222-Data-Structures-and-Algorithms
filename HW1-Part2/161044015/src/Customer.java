/**
 * Customer class with some methods.
 * @author Medine ASLAN
 */
public class Customer implements CargoCompanyInterface
{
    /**
     * Keeps customer name and surname.
     */
    private String nameSurname;

    /**
     * Keeps customer id.
     */
    private String customerId;

    /**
     * Constructor of Customer.
     * @param newNameSurname init nameSurname.
     * @param newCustomerId init customerId.
     */
    public Customer(String newNameSurname, String newCustomerId)
    {
        this.nameSurname = newNameSurname;
        this.customerId = newCustomerId;
    }

    /**
     * Getter method of customerId.
     * @return customerId.
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Overriding getter method of nameSurname.
     * @return nameSurname.
     */
    @Override
    public String getNameOrId()
    {
        return nameSurname;
    }

    /**
     * Overriding setter method of nameSurname.
     * @param newNameOrId keeps the new name or id.
     */
    @Override
    public void setNameOrId(String newNameOrId)
    {
        nameSurname = newNameOrId;
    }

    /**
     * This method allows to customer to see shipment information with shipment tracking number.
     * If branch has not the shipment the information do not see.
     * @param branch branch of shipment.
     * @param isTrackingNumber is the tracking number of the shipment that the customer wants to see.
     */
    public void showInformationOfShipment(Branches branch, String isTrackingNumber)
    {
        boolean flag = false;

        for(int j = 0; j < UserAbstract.getBranches().size(); j++)
        {
            if(UserAbstract.getBranches().get(j).getNameOrId() == branch.getNameOrId())
            {
                boolean isContains = false;

                int shipmentIndex = 0;

                for(int i = 0; i < branch.getCargoShipments().size(); i++)
                {
                    if(branch.getCargoShipments().get(i).trackingNumber.equals(isTrackingNumber))
                    {
                        shipmentIndex = i;
                        isContains = true;
                    }
                }

                if(isContains)
                {
                    System.out.print("Sender Name: ");
                    System.out.println(branch.getCargoShipments().get(shipmentIndex).senderName);
                    System.out.print("Sender Surname: ");
                    System.out.println(branch.getCargoShipments().get(shipmentIndex).senderSurname);
                    System.out.print("Receiver Name: ");
                    System.out.println(branch.getCargoShipments().get(shipmentIndex).receiverName);
                    System.out.print("Receiver Surname: ");
                    System.out.println(branch.getCargoShipments().get(shipmentIndex).receiverSurname);
                    System.out.print("Current Status: ");
                    System.out.println(branch.getCargoShipments().get(shipmentIndex).currentStatus);
                }
                else
                    System.out.println("There is no shipment at this tracking number in this branch.");
                flag = true;
            }

        }
        if(!flag)
            System.out.println("There is no branch at this name.");
    }
}
