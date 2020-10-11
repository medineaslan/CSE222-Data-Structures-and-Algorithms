/**
 * This class is driver class to test methods and other classes.
 * @author Medine ASLAN
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("============ Administrators =============");

        Administrators admin1 = new Administrators("Ahmet Ceylan");
        Administrators admin2 = new Administrators("Nisa Keskin");

        System.out.println("1)"+admin1.getNameOrId());
        System.out.println("2)"+admin2.getNameOrId());

        Branches branch1 = new Branches("İzmit","01");
        Branches branch2 = new Branches("Gölcük","02");
        Branches branch3 = new Branches("Derince","03");
        Branches branch4 = new Branches("Gebze","04");
        Branches branch5 = new Branches("Körfez","05");
        Branches branch6 = new Branches("Başiskele","06");

        System.out.println("============== Add Branches =============");
        System.out.println("Branches :");

        admin1.addToAutomationSystem(branch1);
        admin1.addToAutomationSystem(branch2);
        admin1.addToAutomationSystem(branch3);
        admin2.addToAutomationSystem(branch4);
        admin2.addToAutomationSystem(branch5);

        System.out.println(admin1.toString());

        System.out.println("========== Add Branch '"+ branch1.getNameOrId() + "' Again =========");

        admin1.addToAutomationSystem(branch1);

        System.out.println("Branches :");

        System.out.println(admin1.toString());

        System.out.println("============= Remove Branch4 ============");

        System.out.println("Branches :");

        admin1.removeFromAutomationSystem(branch4);

        System.out.println(admin2.toString());

        System.out.println("============= Remove Branch1 ============");
        System.out.println("Branches :");

        admin1.removeFromAutomationSystem(branch1);

        System.out.println(admin1.toString());

        System.out.println("===== Remove Branch That is Not Exist =====");

        admin1.removeFromAutomationSystem(branch6);

        System.out.println();

        System.out.println("=============== Add Branch Again ==============");
        System.out.println("Branches :");

        admin1.addToAutomationSystem(branch6);

        System.out.println(admin1.toString());

        BranchEmployee branchEmployee1 = new BranchEmployee("Murat Türk","01");
        BranchEmployee branchEmployee2 = new BranchEmployee("Fatih Karan","02");
        BranchEmployee branchEmployee3 = new BranchEmployee("Melek Güneş","03");
        BranchEmployee branchEmployee4 = new BranchEmployee("Hülya Can","04");
        BranchEmployee branchEmployee5 = new BranchEmployee("Elif Güz","05");
        BranchEmployee branchEmployee6 = new BranchEmployee("Bahar Bayrak","06");
        BranchEmployee branchEmployee7 = new BranchEmployee("Ali Metin","07");

        System.out.println("=========== Add Branch Employee ==========");

        admin1.addToBranch(branch2.getNameOrId(), branchEmployee1);
        admin1.addToBranch(branch2.getNameOrId(), branchEmployee2);
        admin2.addToBranch(branch3.getNameOrId(), branchEmployee3);
        admin2.addToBranch(branch3.getNameOrId(), branchEmployee6);
        admin2.addToBranch(branch5.getNameOrId(), branchEmployee7);
        admin2.addToBranch(branch5.getNameOrId(), branchEmployee4);
        admin2.addToBranch(branch6.getNameOrId(), branchEmployee5);

        System.out.printf("Branch %s Employee:",branch2.getNameOrId());
        System.out.println();
        System.out.println(branch2.printEmployeeInformation(1));

        System.out.printf("Branch %s Employee:",branch3.getNameOrId());
        System.out.println();
        System.out.println(branch3.printEmployeeInformation(1));

        System.out.printf("Branch %s Employee:",branch5.getNameOrId());
        System.out.println();
        System.out.println(branch5.printEmployeeInformation(1));

        System.out.printf("Branch %s Employee:",branch6.getNameOrId());
        System.out.println();
        System.out.println(branch6.printEmployeeInformation(1));

        System.out.print("=== Add '" + branchEmployee5.getNameOrId());
        System.out.println("' to Branch '" + branch6.getNameOrId() + "' Again ===");

        admin2.addToBranch(branch6.getNameOrId(), branchEmployee5);
        System.out.println();

        System.out.printf("Branch %s Employee:",branch6.getNameOrId());
        System.out.println();
        System.out.println(branch6.printEmployeeInformation(1));


        System.out.printf("=== Remove Branch Employee '%s' ", branchEmployee7.getNameOrId());
        System.out.printf("From Branch '%s' ===",branch5.getNameOrId());
        System.out.println();

        admin1.removeFromBranch(branch5.getNameOrId(),branchEmployee7);

        System.out.printf("Branch %s Employee:",branch5.getNameOrId());
        System.out.println();
        System.out.println(branch5.printEmployeeInformation(1));

        System.out.printf("===== Add Branch Employee '%s' ", branchEmployee7.getNameOrId());
        System.out.printf("to Branch '%s' =====",branch5.getNameOrId());
        System.out.println();

        admin1.addToBranch(branch5.getNameOrId(), branchEmployee7);

        System.out.printf("Branch %s Employee:",branch5.getNameOrId());
        System.out.println();
        System.out.println(branch5.printEmployeeInformation(1));

        System.out.print("== Remove Branch Employee '" +branchEmployee1.getNameOrId());
        System.out.println("' that is not exist in the Branch '" +branch5.getNameOrId()+ "' ==");

        admin1.removeFromBranch(branch5.getNameOrId(),branchEmployee1);
        System.out.println();

        TransportationPersonnel transportPersonnel1 = new TransportationPersonnel("Yakup Yılmaz","01");
        TransportationPersonnel transportPersonnel2 = new TransportationPersonnel("Beyza Sevim","02");
        TransportationPersonnel transportPersonnel3 = new TransportationPersonnel("Merve Boz","03");
        TransportationPersonnel transportPersonnel4 = new TransportationPersonnel("Fatma Eren","04");
        TransportationPersonnel transportPersonnel5 = new TransportationPersonnel("Kaya Akın","05");
        TransportationPersonnel transportPersonnel6 = new TransportationPersonnel("Enes Çakır","06");

        System.out.println("============= Add Transportation Personnel =============");

        admin1.addToBranch(branch2.getNameOrId(), transportPersonnel1);
        admin1.addToBranch(branch3.getNameOrId(), transportPersonnel2);
        admin2.addToBranch(branch3.getNameOrId(), transportPersonnel3);
        admin2.addToBranch(branch5.getNameOrId(), transportPersonnel4);
        admin1.addToBranch(branch6.getNameOrId(), transportPersonnel5);
        admin1.addToBranch(branch6.getNameOrId(), transportPersonnel6);

        System.out.println("Branch "+ branch2.getNameOrId() + " Transportation Personnel:");
        System.out.println(branch2.printEmployeeInformation(0));

        System.out.println("Branch "+ branch3.getNameOrId() + " Transportation Personnel:");
        System.out.println(branch3.printEmployeeInformation(0));

        System.out.println("Branch "+ branch5.getNameOrId() + " Transportation Personnel:");
        System.out.println(branch5.printEmployeeInformation(0));

        System.out.println("Branch "+ branch6.getNameOrId() + " Transportation Personnel:");
        System.out.println(branch6.printEmployeeInformation(0));

        System.out.print("=== Add '" + transportPersonnel5.getNameOrId());
        System.out.println("' to Branch '" + branch6.getNameOrId() + "' Again ===");

        admin1.addToBranch(branch6.getNameOrId(), transportPersonnel5);

        System.out.println();

        System.out.println("Branch "+ branch6.getNameOrId() + " Transportation Personnel:");
        System.out.println(branch6.printEmployeeInformation(0));

        System.out.print("=== Remove Transportation Personnel "+"'" +transportPersonnel6.getNameOrId()+"' ");
        System.out.println("From Branch '" + branch6.getNameOrId()+"'===");

        admin1.removeFromBranch(branch6.getNameOrId(),transportPersonnel6);

        System.out.println("Branch "+ branch6.getNameOrId() + " Transportation Personnel:");

        System.out.println(branch6.printEmployeeInformation(0));

        System.out.println();
        System.out.print("===== Add Transportation Personnel "+"'" +transportPersonnel6.getNameOrId()+"' ");
        System.out.println("to Branch '" + branch6.getNameOrId()+"'=====");

        admin1.addToBranch(branch6.getNameOrId(), transportPersonnel6);

        System.out.println("Branch "+ branch6.getNameOrId() + " Transportation Personnel:");

        System.out.println(branch6.printEmployeeInformation(0));

        System.out.print("== Remove Transportation Personnel '" +transportPersonnel1.getNameOrId());
        System.out.println("' that is not exist in the Branch '" +branch5.getNameOrId()+ "' ==");

        admin1.removeFromBranch(branch5.getNameOrId(),transportPersonnel1);

        Customer customer1 = new Customer("Enes Aslan","01");
        Customer customer2 = new Customer("Medine Aslan","02");
        Customer customer3 = new Customer("Adem Aslan","03");
        Customer customer4 = new Customer("Cemile Aslan","04");
        Customer customer5 = new Customer("Nagihan Aslan","05");
        Customer customer6 = new Customer("Elif Aslan","06");

        branchEmployee1.addToAutomationSystem(customer1);
        branchEmployee1.addToAutomationSystem(customer2);
        branchEmployee1.addToAutomationSystem(customer3);
        branchEmployee2.addToAutomationSystem(customer4);
        branchEmployee2.addToAutomationSystem(customer5);

        System.out.println();
        System.out.println("========== Add Customer ==========");
        System.out.println("Customers:");

        System.out.println(branchEmployee1.toString());

        System.out.println("========== Add Customer '"+ customer1.getNameOrId() + "' Again =========");

        branchEmployee1.addToAutomationSystem(customer1);
        System.out.println();

        System.out.println("Customers:");

        System.out.println(branchEmployee1.toString());

        System.out.println("========== Remove Customer5 ==========");
        System.out.println("Customers:");

        branchEmployee1.removeFromAutomationSystem(customer5);

        System.out.println(branchEmployee1.toString());

        System.out.println("===== Remove Customer That is Not Exist =====");

        branchEmployee1.removeFromAutomationSystem(customer6);

        System.out.println();

        Shipment shipment1 = new Shipment("Medine","Aslan","Enes","Aslan","Derince","3210" );
        Shipment shipment2 = new Shipment("Adem","Aslan","Cemile","Aslan","Körfez","3211" );
        Shipment shipment3 = new Shipment("Haydar","Kurban","Kaya","Eren","Başiskele","3221" );

        branchEmployee1.addToBranch(branch3.getNameOrId(),shipment1);
        branchEmployee1.addToBranch(branch5.getNameOrId(),shipment2);
        branchEmployee1.addToBranch(branch6.getNameOrId(),shipment3);

        System.out.println("=================== Add Shipment ====================");

        System.out.println("Shipments Tracking Numbers");

        System.out.println("Branch '"+branch3.getNameOrId()+"' Shipments Tracking Numbers");
        for(int i = 0; i < branch3.getCargoShipments().size(); i++)
            System.out.println(branch3.getCargoShipments().get(i).trackingNumber);
        System.out.println("Branch '"+branch5.getNameOrId()+"' Shipments Tracking Numbers");
        for(int i = 0; i < branch5.getCargoShipments().size(); i++)
            System.out.println(branch5.getCargoShipments().get(i).trackingNumber);
        System.out.println("Branch '"+branch6.getNameOrId()+"' Shipments Tracking Numbers");
        for(int i = 0; i < branch6.getCargoShipments().size(); i++)
            System.out.println(branch6.getCargoShipments().get(i).trackingNumber);

        System.out.println();



        System.out.println("======= Add Shipment Again with Tracking Number '"+shipment1.trackingNumber+"' =======");

        branchEmployee1.addToBranch(branch3.getNameOrId(),shipment1);

        System.out.println();

        System.out.println("Shipments Tracking Numbers");

        System.out.println("Branch '"+branch3.getNameOrId()+"' Shipments Tracking Numbers");
        for(int i = 0; i < branch3.getCargoShipments().size(); i++)
            System.out.println(branch3.getCargoShipments().get(i).trackingNumber);
        System.out.println("Branch '"+branch5.getNameOrId()+"' Shipments Tracking Numbers");
        for(int i = 0; i < branch5.getCargoShipments().size(); i++)
            System.out.println(branch5.getCargoShipments().get(i).trackingNumber);
        System.out.println("Branch '"+branch6.getNameOrId()+"' Shipments Tracking Numbers");
        for(int i = 0; i < branch6.getCargoShipments().size(); i++)
            System.out.println(branch6.getCargoShipments().get(i).trackingNumber);

        System.out.println();

        System.out.print("=== Remove Shipment with Tracking Number is '" + shipment2.trackingNumber);
        System.out.println("' That is Not Exist in Branch '"+ branch3.getNameOrId() +"' ===");

        branchEmployee1.removeFromBranch(branch3.getNameOrId(), shipment2);
        System.out.println();
        System.out.println("========== Information of Shipments In The Branch ==========");

        System.out.println("=== Shipment 1 ===");
        customer1.showInformationOfShipment(branch3,"3210");
        System.out.println();
        System.out.println("=== Shipment 2 ===");
        customer2.showInformationOfShipment(branch5,"3211");
        System.out.println();
        System.out.println("=== Shipment 3 ===");
        customer2.showInformationOfShipment(branch6,"3221");
        System.out.println();

        System.out.println("========== Information of Shipments After Shipment1 is in Distribution ==========");

        System.out.println("=== Shipment 1 ===");
        branchEmployee1.setCurrentStatus(branch3,"3210");
        customer1.showInformationOfShipment(branch3,"3210");
        System.out.println();

        System.out.println("=== Shipment 2 ===");
        customer2.showInformationOfShipment(branch5,"3211");
        System.out.println();

        System.out.println("=== Shipment 3 ===");
        customer2.showInformationOfShipment(branch6,"3221");
        System.out.println();

        System.out.println("========== Information of Shipments After Shipment1 is Delivered ==========");

        transportPersonnel1.setCurrentStatus(branch3,"3210");

        System.out.println("=== Shipment 1 ===");
        customer1.showInformationOfShipment(branch3,"3210");
        System.out.println();
        System.out.println("=== Shipment 2 ===");
        customer2.showInformationOfShipment(branch5,"3211");
        System.out.println();
        System.out.println("=== Shipment 3 ===");
        customer2.showInformationOfShipment(branch6,"3221");
        System.out.println();

        System.out.println("====== Show Information Of Shipment That is not Exist ======");

        customer1.showInformationOfShipment(branch3, shipment2.trackingNumber);

        System.out.println();

        System.out.println("============== Remove Shipment ===============");
        System.out.println();
        System.out.print("Shipment Number of Branch3 Before the Remove Shipment 1: ");

        System.out.println(branch3.getCargoShipments().size());

        System.out.print("Shipment Number of Branch3 After the Remove Shipment 1: ");

        branchEmployee1.removeFromBranch(branch3.getNameOrId(),branch3.getCargoShipments().get(0));

        System.out.println(branch3.getCargoShipments().size());

        System.out.println();

        System.out.println("=========== Tests of Other Error Handlings ==========");
        System.out.println();

        System.out.println("If Administrators Wants to Add Customers: ");
        admin1.addToAutomationSystem(customer1);
        System.out.println();
        System.out.println("If Administrators Wants to Remove Customers: ");
        admin1.removeFromAutomationSystem(customer1);
        System.out.println();

        System.out.println("If Branch Employees Wants to Add The Branches: ");
        branchEmployee1.addToAutomationSystem(branch1);
        System.out.println();

        System.out.println("If Branch Employees Wants to Remove The Branches: ");
        branchEmployee1.removeFromAutomationSystem(branch1);
        System.out.println();

        System.out.println("If Branch Employees Wants to Remove The Transportation Personnel: ");
        branchEmployee1.removeFromBranch(branch2.getNameOrId(), transportPersonnel1);
        System.out.println();

        System.out.println("If Administrators Wants to Add Branch Employees the Branch That is not Exist: ");
        admin1.addToBranch(branch1.getNameOrId(), branchEmployee1);
        System.out.println();

        System.out.println("If Branch Employees Wants to Add Shipment the Branch That is not Exists: ");
        branchEmployee1.addToBranch(branch1.getNameOrId(),shipment1);
        System.out.println();


        System.out.println("If Branch Employees Wants to Add Shipment in a branch its current status not belongs to that branch.");
        Shipment shipment4 = new Shipment("Nesli","Boz","Ayşe","Son","İzmit","3214" );

        branchEmployee1.addToBranch(branch5.getNameOrId(),shipment4);
        System.out.println();

    }
}
