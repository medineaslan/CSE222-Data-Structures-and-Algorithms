/**
 * This class keeps shipment information.
 * @author Medine ASLAN
 */
public class Shipment implements CargoCompanyInterface
{
    /**
     * Keeps shipment sender name.
     */
    protected String senderName;
    /**
     * Keeps shipment sender surname.
     */
    protected String senderSurname;
    /**
     * Keeps shipment receiver name.
     */
    protected String receiverName;
    /**
     * Keeps shipment receiver surname.
     */
    protected String receiverSurname;
    /**
     * Keeps shipment current status.
     */
    protected String currentStatus ;
    /**
     * Keeps shipment tracking number.
     */
    protected String trackingNumber;


    /**
     * Constructor of Shipment.
     * @param sName init senderName.
     * @param sSurname init senderSurname.
     * @param rName init receiverName.
     * @param rSurname init receiverSurname.
     * @param status init currentStatus.
     * @param trackNum init trackingNumber.
     */
    public Shipment(String sName, String sSurname, String rName, String rSurname, String status, String trackNum)
    {
        senderName = sName;
        senderSurname = sSurname;
        receiverName = rName;
        receiverSurname = rSurname;
        currentStatus = status;
        trackingNumber = trackNum;
    }

    /**
     * Overriding getter method of trackingNumber.
     * @return trackingNumber.
     */
    @Override
    public String getNameOrId()
    {
        return trackingNumber;
    }

    /**
     * Overriding setter method of tracking number.
     * @param newShipmentId keeps the new tracking number.
     */
    @Override
    public void setNameOrId(String newShipmentId)
    {
        trackingNumber = newShipmentId;
    }

}

