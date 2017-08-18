
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

 
public class Implement1 extends UnicastRemoteObject implements ShareInterface1{

    public Implement1() throws RemoteException{
    }

    @Override
    public int method1() throws RemoteException {
      return 1;  
    }

    @Override
    public BufferedImage method2(BufferedImage img1) throws RemoteException {
//         try {
//            File file = new File(fileName);
//            byte buffer[] = new byte[(int) file.length()/n];
//            BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileName));
//            input.read(buffer,0, buffer.length);
//            input.close();
//            
//            return (buffer);
//        } catch (Exception e) {
//            System.out.println("FileImpl: " + e.getMessage());
//            //e.printStackTrace();
//            return (null);
//        }

        return img1;
    }
    
    
    
    
    
}
