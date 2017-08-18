import java.awt.image.BufferedImage;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ShareInterface1 extends Remote {
	
	public int method1() throws RemoteException;
	public BufferedImage  method2(BufferedImage img1) throws RemoteException;

}
