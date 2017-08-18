import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ShareInterface2 extends Remote {
	
	public int method3() throws RemoteException;
	public byte[] method4(String fileName , int n) throws RemoteException;

}
