/**
 * This class is driver class to test methods and other classes.
 * @author Medine ASLAN
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("============ Administrators =============");

        Administrators admin1 = new Administrators("Ahmet Ceylan");
        Administrators admin2 = new Administrators("Nisa Keskin");

        System.out.println("1)"+admin1.getUserNameSurname());
        System.out.println("2)"+admin2.getUserNameSurname());

        Branches branch1 = new Branches("İzmit");
        Branches branch2 = new Branches("Gölcük");
        Branches branch3 = new Branches("Derince");
        Branches branch4 = new Branches("Gebze");
        Branches branch5 = new Branches("Körfez");
        Branches branch6 = new Branches("Başiskele");

        System.out.println("============== Add Branches =============");
        System.out.println("Branches :");

        admin1.addBranches(branch1);
        admin1.addBranches(branch2);
        admin1.addBranches(branch3);
        admin2.addBranches(branch4);
        admin2.addBranches(branch5);

        for (int i = 0; i < admin1.getBranchNumber(); i++) {
            System.out.println(i+1+")"+admin1.getBranches()[i].getBranchName());
        }

        System.out.println("============= Remove Branch4 ============");
        System.out.println("Branches :");

        admin1.removeBranches(branch4);

        for (int i = 0; i < admin2.getBranchNumber(); i++) {
            System.out.println(i+1+")"+admin2.getBranches()[i].getBranchName());
        }

        System.out.println("============= Remove Branch1 ============");
        System.out.println("Branches :");

        admin1.removeBranches(branch1);

        for (int i = 0; i < admin1.getBranchNumber(); i++) {
            System.out.println(i+1+")"+admin1.getBranches()[i].getBranchName());
        }

        System.out.println("=============== Add Branch ==============");
        System.out.println("Branches :");

        admin1.addBranches(branch6);

        for (int i = 0; i < admin1.getBranchNumber(); i++) {
            System.out.println(i+1+")"+admin1.getBranches()[i].getBranchName());
        }

        BranchEmployee branchEmployee1 = new BranchEmployee("Murat Türk");
        BranchEmployee branchEmployee2 = new BranchEmployee("Fatih Karan");
        BranchEmployee branchEmployee3 = new BranchEmployee("Melek Güneş");
        BranchEmployee branchEmployee4 = new BranchEmployee("Hülya Can");
        BranchEmployee branchEmployee5 = new BranchEmployee("Elif Güz");
        BranchEmployee branchEmployee6 = new BranchEmployee("Bahar Bayrak");
        BranchEmployee branchEmployee7 = new BranchEmployee("Ali Metin");

        System.out.println("=========== Add Branch Employee ==========");

        admin1.addBranchEmployeeToBranch(branch2.getBranchName(), branchEmployee1);
        admin1.addBranchEmployeeToBranch(branch2.getBranchName(), branchEmployee2);
        admin2.addBranchEmployeeToBranch(branch3.getBranchName(), branchEmployee3);
        admin2.addBranchEmployeeToBranch(branch3.getBranchName(), branchEmployee6);
        admin2.addBranchEmployeeToBranch(branch5.getBranchName(), branchEmployee7);
        admin2.addBranchEmployeeToBranch(branch5.getBranchName(), branchEmployee4);
        admin2.addBranchEmployeeToBranch(branch6.getBranchName(), branchEmployee5);

        System.out.printf("Branch %s Employee:",branch2.getBranchName());
        System.out.println();
        for (int i = 0; i < branch2.getEmployeeNumber(); i++) {
            System.out.println(branch2.getBranchEmployees()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.printf("Branch %s Employee:",branch3.getBranchName());
        System.out.println();
        for (int i = 0; i < branch3.getEmployeeNumber(); i++) {
            System.out.println(branch3.getBranchEmployees()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.printf("Branch %s Employee:",branch5.getBranchName());
        System.out.println();
        for (int i = 0; i < branch5.getEmployeeNumber(); i++) {
            System.out.println(branch5.getBranchEmployees()[i].getUserNameSurname());
        }
        System.out.println();

        System.out.printf("Branch %s Employee:",branch6.getBranchName());
        System.out.println();
        for (int i = 0; i < branch6.getEmployeeNumber(); i++) {
            System.out.println(branch6.getBranchEmployees()[i].getUserNameSurname());
        }
        System.out.println();

        System.out.printf("=== Remove Branch Employee '%s' ", branchEmployee7.getUserNameSurname());
        System.out.printf("From Branch '%s' ===",branch5.getBranchName());
        System.out.println();

        admin1.removeBranchEmployeeToBranch(branch5.getBranchName(),branchEmployee7);

        System.out.printf("Branch %s Employee:",branch5.getBranchName());
        System.out.println();
        for (int i = 0; i < branch5.getEmployeeNumber(); i++) {
            System.out.println(branch5.getBranchEmployees()[i].getUserNameSurname());
        }

        System.out.println();
        System.out.printf("===== Add Branch Employee '%s' ", branchEmployee7.getUserNameSurname());
        System.out.printf("to Branch '%s' =====",branch5.getBranchName());
        System.out.println();

        admin1.addBranchEmployeeToBranch(branch5.getBranchName(), branchEmployee7);

        System.out.printf("Branch %s Employee:",branch5.getBranchName());
        System.out.println();
        for (int i = 0; i < branch5.getEmployeeNumber(); i++) {
            System.out.println(branch5.getBranchEmployees()[i].getUserNameSurname());
        }

        TransportationPersonnel transportPersonnel1 = new TransportationPersonnel("Yakup Yılmaz");
        TransportationPersonnel transportPersonnel2 = new TransportationPersonnel("Beyza Sevim");
        TransportationPersonnel transportPersonnel3 = new TransportationPersonnel("Merve Boz");
        TransportationPersonnel transportPersonnel4 = new TransportationPersonnel("Fatma Eren");
        TransportationPersonnel transportPersonnel5 = new TransportationPersonnel("Kaya Akın");
        TransportationPersonnel transportPersonnel6 = new TransportationPersonnel("Enes Çakır");

        System.out.println();
        System.out.println("============= Add Transportation Personnel =============");

        admin1.addBranchTransportPersonnel(branch2.getBranchName(), transportPersonnel1);
        admin1.addBranchTransportPersonnel(branch3.getBranchName(), transportPersonnel2);
        admin2.addBranchTransportPersonnel(branch3.getBranchName(), transportPersonnel3);
        admin2.addBranchTransportPersonnel(branch5.getBranchName(), transportPersonnel4);
        admin1.addBranchTransportPersonnel(branch6.getBranchName(), transportPersonnel5);
        admin1.addBranchTransportPersonnel(branch6.getBranchName(), transportPersonnel6);

        System.out.println("Branch "+ branch2.getBranchName() + " Transportation Personnel:");
        for (int i = 0; i < branch2.getPersonnelNumber(); i++) {
            System.out.println(branch2.getTransportPersonnel()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.println("Branch "+ branch3.getBranchName() + " Transportation Personnel:");
        for (int i = 0; i < branch3.getPersonnelNumber(); i++) {
            System.out.println(branch3.getTransportPersonnel()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.println("Branch "+ branch5.getBranchName() + " Transportation Personnel:");
        for (int i = 0; i < branch5.getPersonnelNumber(); i++) {
            System.out.println(branch5.getTransportPersonnel()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.println("Branch "+ branch6.getBranchName() + " Transportation Personnel:");
        for (int i = 0; i < branch6.getPersonnelNumber(); i++) {
            System.out.println(branch6.getTransportPersonnel()[i].getUserNameSurname());
        }
        System.out.println();

        System.out.print("=== Remove Transportation Personnel "+"'" +transportPersonnel6.getUserNameSurname()+"' ");
        System.out.println("From Branch '" + branch6.getBranchName()+"'===");

        admin1.removeBranchTransportPersonnel(branch6.getBranchName(),transportPersonnel6);

        System.out.println("Branch "+ branch6.getBranchName() + " Transportation Personnel:");

        for (int i = 0; i < branch6.getPersonnelNumber(); i++) {
            System.out.println(branch6.getTransportPersonnel()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.print("===== Add Transportation Personnel "+"'" +transportPersonnel6.getUserNameSurname()+"' ");
        System.out.println("to Branch '" + branch6.getBranchName()+"'=====");

        admin1.addBranchTransportPersonnel(branch6.getBranchName(), transportPersonnel6);

        System.out.println("Branch "+ branch6.getBranchName() + " Transportation Personnel:");

        for (int i = 0; i < branch6.getPersonnelNumber(); i++) {
            System.out.println(branch6.getTransportPersonnel()[i].getUserNameSurname());
        }

        Customer c1 = new Customer("Enes Aslan");
        Customer c2 = new Customer("Medine Aslan");
        Customer c3 = new Customer("Adem Aslan");
        Customer c4 = new Customer("Cemile Aslan");
        Customer c5 = new Customer("Nagihan Aslan");

        branchEmployee1.addCustomer(c1);
        branchEmployee1.addCustomer(c2);
        branchEmployee1.addCustomer(c3);
        branchEmployee2.addCustomer(c4);
        branchEmployee2.addCustomer(c5);

        System.out.println();
        System.out.println("========== Add Customer ==========");
        System.out.println("Customers:");


        for (int i = 0; i < branchEmployee1.getCustomerNumber(); i++) {
            System.out.println(i+1+")"+branchEmployee1.getCustomer()[i].getUserNameSurname());
        }

        System.out.println("========== Remove Customer5 ==========");
        System.out.println("Customers:");

        branchEmployee1.removeCustomer(c5);

        for (int i = 0; i < branchEmployee1.getCustomerNumber(); i++) {
            System.out.println(i+1+")"+branchEmployee1.getCustomer()[i].getUserNameSurname());
        }
        System.out.println();
        System.out.println("========== Information of Shipments In The Branch ==========");

        branchEmployee1.addShipment("Medine","Aslan","Enes","Aslan","Gölcük","3210" );
        branchEmployee1.addShipment("Adem","Aslan","Cemile","Aslan","Başiskele","3211" );
        branchEmployee1.addShipment("Haydar","Kurban","Kaya","Eren","Körfez","3221" );

        System.out.println("=== Shipment 1 ===");
        c1.showInformationOfShipment("3210");
        System.out.println();
        System.out.println("=== Shipment 2 ===");
        c2.showInformationOfShipment("3211");
        System.out.println();
        System.out.println("=== Shipment 3 ===");
        c2.showInformationOfShipment("3221");
        System.out.println();

        System.out.print("Shipment Number is : ");

        System.out.println(branchEmployee1.getShipmentNumber());

        System.out.println();
        System.out.println("========== Information of Shipments After Shipment1 is in Distribution ==========");

        System.out.println("=== Shipment 1 ===");
        branchEmployee1.setCurrentStatus("3210");
        c1.showInformationOfShipment("3210");
        System.out.println();

        System.out.println("=== Shipment 2 ===");
        c2.showInformationOfShipment("3211");
        System.out.println();

        System.out.println("=== Shipment 3 ===");
        c2.showInformationOfShipment("3221");
        System.out.println();

        System.out.print("Shipment Number is : ");

        System.out.println(branchEmployee1.getShipmentNumber());
        System.out.println();
        System.out.println("========== Information of Shipments After Shipment1 is Delivered ==========");

        transportPersonnel1.setCurrentStatus("3210");

        System.out.println("=== Shipment 1 ===");
        c1.showInformationOfShipment("3210");
        System.out.println();
        System.out.println("=== Shipment 2 ===");
        c2.showInformationOfShipment("3211");
        System.out.println();
        System.out.println("=== Shipment 3 ===");
        c2.showInformationOfShipment("3221");
        System.out.println();

        System.out.print("Shipment Number is : ");

        System.out.println(branchEmployee1.getShipmentNumber());
        System.out.println();
        System.out.println("=========== Set SenderName of Shipment2 by Branch Employee ===========");
        System.out.println("=== Shipment 2 ===");

        branchEmployee1.setSenderName("Nagihan", "3211");

        c1.showInformationOfShipment("3211");
        System.out.println();

        System.out.println("============== Remove Shipment ===============");
        System.out.println();
        System.out.print("Shipment Number Before the Remove Shipment1 : ");

        System.out.println(branchEmployee1.getShipmentNumber());

        System.out.print("Shipment Number After the Remove Shipment1 : ");

        branchEmployee1.removeShipment(branchEmployee1.getCargoShipments()[0]);

        System.out.println(branchEmployee1.getShipmentNumber());
    }
}
