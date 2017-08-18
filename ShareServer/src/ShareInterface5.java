import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ShareInterface5 extends Remote {
	
	public int method9() throws RemoteException;
	public byte[] method10(String fileName , int n) throws RemoteException;

}
