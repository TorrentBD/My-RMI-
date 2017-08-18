
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server5 {
 
	public static void main(String[] args) {
        try {
            Registry r5 = LocateRegistry.createRegistry(1095);
         
             ShareInterface5 s5 = new Implement5();
         
            r5.rebind("Server5", s5);
         
            System.out.println("Server 5 is started........");
         
         } catch (Exception e) {
             System.out.println(e.getMessage());
            }

	}

}
