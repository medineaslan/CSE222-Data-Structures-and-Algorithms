/**
 * Customer class with some methods.
 * @author Medine ASLAN
 */
public class Customer extends CargoCompany
{
    /**
     * Constructor of Customer.
     * @param nameSurname init customer name and surname.
     */
    public Customer(String nameSurname)
    {
        super(nameSurname);
    }

    /**
     * This method allows to customer to see shipment information with shipment tracking number .
     * @param isTrackingNumber is the tracking number of the shipment that the customer wants to see.
     */
    public void showInformationOfShipment(String isTrackingNumber)
    {

        int shipmentIndex = 0;

        for(int i = 0; i < BranchEmployee.getShipmentNumber(); i++)
        {
            if(BranchEmployee.getCargoShipments()[i].trackingNumber == isTrackingNumber )
            {
                shipmentIndex = i;
            }
        }

        System.out.print("Sender Name: ");
        System.out.println(BranchEmployee.getCargoShipments()[shipmentIndex].senderName);
        System.out.print("Sender Surname: ");
        System.out.println(BranchEmployee.getCargoShipments()[shipmentIndex].senderSurname);
        System.out.print("Receiver Name: ");
        System.out.println(BranchEmployee.getCargoShipments()[shipmentIndex].receiverName);
        System.out.print("Receiver Surname: ");
        System.out.println(BranchEmployee.getCargoShipments()[shipmentIndex].receiverSurname);
        System.out.print("Current Status: ");
        System.out.println(BranchEmployee.getCargoShipments()[shipmentIndex].currentStatus);

    }
}
