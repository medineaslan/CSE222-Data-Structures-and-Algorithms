/**
 * BranchEmployee class with some methods.
 * @author Medine ASLAN
 * */
public class BranchEmployee extends CargoCompany
{
    /**
     * Keeps customers.
     */
    private static Customer [] customer = new Customer[1];
    /**
     * Keeps customer number.
     */
    private static int customerNumber = 0;

    /**
     * Keep shipments.
     */
    private static Shipment [] cargoShipments = new Shipment[1];
    /**
     * Keep shipment number.
     */
    private static int shipmentNumber = 0;

    /**
     * Constructor of BranchEmployee.
     * @param nameSurname init branch employees name and surname.
     */
    public BranchEmployee(String nameSurname)
    {
        super(nameSurname);
    }

    /**
     * Getter method of cargoShipments array.
     * @return cargoShipments.
     */
    public static Shipment[] getCargoShipments() {
        return cargoShipments;
    }

    /**
     * Getter method of shipmentNumber.
     * @return shipmentNumber.
     */
    public static int getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Getter method of customer array.
     * @return customer.
     */
    public static Customer[] getCustomer() {
        return customer;
    }

    /**
     * Getter method of customerNumber.
     * @return customerNumber.
     */
    public static int getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Setter method of shipment sender name.
     * @param sName is keeps shipment new sender name.
     * @param trackNum is the tracking number of the shipment to be set.
     */
    public void setSenderName(String sName, String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].senderName = sName;
            }
        }
    }

    /**
     * Setter method of shipment sender surname.
     * @param sSurname is keeps shipment new sender surname.
     * @param trackNum is the tracking number of the shipment to be set.
     */
    public void setSenderSurname(String sSurname, String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].senderSurname = sSurname;
            }
        }
    }

    /**
     * Setter method of shipment receiver name.
     * @param rName is keeps shipment new receiver name.
     * @param trackNum is the tracking number of the shipment to be set.
     */
    public void setReceiverName(String rName, String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].receiverName = rName;
            }
        }
    }

    /**
     * Setter method of shipment receiver surname.
     * @param rSurname is keeps shipment new receiver surname.
     * @param trackNum is the tracking number of the shipment to be setted.
     */
    public void setReceiverSurname(String rSurname, String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].receiverSurname = rSurname;
            }
        }
    }

    /**
     * Setter method of shipment current status.
     * @param status is keeps shipment current status.
     * @param trackNum is the tracking number of the shipment to be setted.
     */
    public void setCurrentStatus(String status, String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].currentStatus = status;
            }
        }
    }

    /**
     * Setter method of shipment tracking number.
     * @param newTrackNum is keeps shipment tracking number.
     * @param trackNum is the tracking number of the shipment to be setted.
     */
    public void setTrackingNumber(String newTrackNum, String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].trackingNumber = newTrackNum;
            }
        }
    }

    /**
     * This method allows branch employees enter the shipment information and add the automation system.
     * @param sName is shipment sender name.
     * @param sSurname is shipment sender surname.
     * @param rName is shipment receiver name.
     * @param rSurname is shipment receiver surname.
     * @param status is shipment current status.
     * @param trackNum is shipment tracking number.
     */
    public void addShipment(String sName, String sSurname, String rName, String rSurname, String status, String trackNum)
    {
        if (shipmentNumber != 0) {
            Shipment[] tempBranches = new Shipment[shipmentNumber];

            for (int i = 0; i < shipmentNumber; ++i) {
                tempBranches[i] = new Shipment();
                tempBranches[i].senderName = cargoShipments[i].senderName;
                tempBranches[i].senderSurname = cargoShipments[i].senderSurname;
                tempBranches[i].receiverName = cargoShipments[i].receiverName;
                tempBranches[i].receiverSurname = cargoShipments[i].receiverSurname;
                tempBranches[i].currentStatus = cargoShipments[i].currentStatus;
                tempBranches[i].trackingNumber = cargoShipments[i].trackingNumber;
            }

            cargoShipments = new Shipment[shipmentNumber + 1];

            for (int i = 0; i < shipmentNumber; ++i) {
                cargoShipments[i] = new Shipment();
                cargoShipments[i].senderName = tempBranches[i].senderName ;
                cargoShipments[i].senderSurname = tempBranches[i].senderSurname ;
                cargoShipments[i].receiverName = tempBranches[i].receiverName ;
                cargoShipments[i].receiverSurname = tempBranches[i].receiverSurname ;
                cargoShipments[i].currentStatus = tempBranches[i].currentStatus ;
                cargoShipments[i].trackingNumber = tempBranches[i].trackingNumber ;
            }
        }

        cargoShipments[shipmentNumber] = new Shipment();
        cargoShipments[shipmentNumber].senderName = sName;
        cargoShipments[shipmentNumber].senderSurname = sSurname;
        cargoShipments[shipmentNumber].receiverName = rName;
        cargoShipments[shipmentNumber].receiverSurname = rSurname;
        cargoShipments[shipmentNumber].currentStatus = status;
        cargoShipments[shipmentNumber].trackingNumber = trackNum;

        shipmentNumber++;
    }

    /**
     * This method allows to branch employee can set current status of shipment when shipment is in distribution.
     * @param trackNum is the tracking number of shipment to be setted.
     */
    public void setCurrentStatus(String trackNum)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i].trackingNumber == trackNum)
            {
                cargoShipments[i].currentStatus = "Shipment in distribution.";
            }
        }
    }

    /**
     * This method add customers to customer array.
     * customer array is dynamically allocated.
     * When object is added customerNumber increased.
     * @param customerObj is the customer object to be added.
     */
    public void addCustomer(Customer customerObj)
    {
        if (customerNumber != 0) {
            Customer[] tempBranches = new Customer[customerNumber];

            for (int i = 0; i < customerNumber; ++i) {
                tempBranches[i] = customer[i];
            }

            customer = new Customer[customerNumber + 1];

            for (int i = 0; i < customerNumber; ++i) {
                customer[i] = tempBranches[i];
            }
        }
        customer[customerNumber] = customerObj;
        customerNumber++;
    }

    /**
     * This method remove customers from customer array.
     * When object is removed customerNumber is decreased.
     * @param customerObj is the customer object to be removed.
     */
    public void removeCustomer(Customer customerObj)
    {
        for(int i = 0; i < customerNumber; i++)
        {
            if(customer[i] == customerObj)
            {
                if(i == customerNumber - 1){
                    customerNumber--;
                }
                else{
                    for(int k = i; k < customerNumber - 1; k++ )
                    {
                        customer[k] = customer[k+1];
                    }
                    customerNumber--;
                }
            }
        }
    }

    /**
     * This method allows to branch employee removed shipment from automation system.
     * For example when shipment is delivered, branch employees can removed shipment if he or she wants.
     * @param shipmentObj is the Shipment object to be removed.
     */
    public void removeShipment(Shipment shipmentObj)
    {
        for(int i = 0; i < shipmentNumber; i++)
        {
            if(cargoShipments[i] == shipmentObj)
            {
                if(i == shipmentNumber - 1){
                    shipmentNumber--;
                }
                else{
                    for(int k = i; k < shipmentNumber - 1; k++ )
                    {
                        cargoShipments[k] = cargoShipments[k+1];
                    }
                    shipmentNumber--;
                }
            }
        }
    }
}
