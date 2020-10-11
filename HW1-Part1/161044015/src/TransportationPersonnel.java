/**
 * Transportation class with some methods.
 * @author Medine ASLAN
 */
public class TransportationPersonnel extends CargoCompany{

    /**
     * Constructor of TransportationPersonnel.
     * @param nameSurname init name and surname of personnel.
     */
    public TransportationPersonnel(String nameSurname)
    {
        super(nameSurname);
    }

    /**
     * This method changes the shipment current status when shipment is delivered.
     * @param trackingNum is the tracking number that the transportation personnel wants to change current status of shipment.
     */
    public void setCurrentStatus(String trackingNum)
    {

        for(int i = 0; i < BranchEmployee.getShipmentNumber(); i++)
        {
            if(BranchEmployee.getCargoShipments()[i].trackingNumber == trackingNum)
            {
                BranchEmployee.getCargoShipments()[i].currentStatus = "Delivered";
            }
        }
    }

}
