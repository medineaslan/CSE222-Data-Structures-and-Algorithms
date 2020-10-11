/**
 * Transportation class with some methods.
 * @author Medine ASLAN
 */
public class TransportationPersonnel implements CargoCompanyInterface
{
    /**
     * Keeps transportation personnel name and surname.
     */
    private String nameSurname;

    /**
     * Keeps transportation personnel id.
     */
    private String personnelId;

    /**
     * Constructor of TransportationPersonnel.
     * @param newNameSurname init nameSurname.
     * @param id init personnelId.
     */
    public TransportationPersonnel(String newNameSurname, String id)
    {
        this.nameSurname = newNameSurname;
        personnelId = id;
    }

    /**
     * Getter method of personnelId.
     * @return personnelId.
     */
    public String getPersonnelId() {
        return personnelId;
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
     * This method changes the shipment current status when shipment is delivered.
     * @param branch branch of shipment.
     * @param trackingNum tracking number of shipment that changed current status.
     */
    public void setCurrentStatus(Branches branch, String trackingNum)
    {
        for(int i = 0; i < branch.getCargoShipments().size(); i++)
        {
            if(branch.getCargoShipments().get(i).trackingNumber.equals(trackingNum))
            {
                branch.getCargoShipments().get(i).currentStatus = "Delivered";
            }
        }
    }
}

