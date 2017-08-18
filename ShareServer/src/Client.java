import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Client {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 1, n4 = 1;
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter ");
        try {
            //get host 
            Registry rg1 = LocateRegistry.getRegistry("localhost", 1091);
            Registry rg2 = LocateRegistry.getRegistry("localhost", 1092);
            Registry rg3 = LocateRegistry.getRegistry("localhost", 1093);
            Registry rg4 = LocateRegistry.getRegistry("localhost", 1094);
            Registry rg5 = LocateRegistry.getRegistry("localhost", 1095);
            Registry rg6 = LocateRegistry.getRegistry("localhost", 1096);

            //
            ShareInterface1 ob1 = (ShareInterface1) rg1.lookup("Server1");
            ShareInterface2 ob2 = (ShareInterface2) rg2.lookup("Server2");
            ShareInterface3 ob3 = (ShareInterface3) rg3.lookup("Server3");
            ShareInterface4 ob4 = (ShareInterface4) rg4.lookup("Server4");
            ShareInterface5 ob5 = (ShareInterface5) rg5.lookup("Server5");
            ShareInterface6 ob6 = (ShareInterface6) rg6.lookup("Server6");

                                        
            int x1 = ob1.method1();
            int x2 = ob2.method3();
            int x3 = ob3.method5();
            int x4 = ob4.method7();
            int x5 = ob5.method9();
            int x6 = ob6.method11();

            int n = x1 + x2 + x3 + x4 + x5 + x6;
             
            byte[] data1,data2,data3,data4,data5,data6;
            
            File file = new File("bb.jpg"); // I have bb.jpg in my working directory
            FileInputStream fis = new FileInputStream(file);
            BufferedImage image = ImageIO.read(fis); //reading the image file
            
            int rows = 2; //You should decide the values for rows and cols variables
            int cols = 2;
            int chunks = rows * cols;

            int chunkWidth = image.getWidth() / cols; // determines the chunk width and height
            int chunkHeight = image.getHeight() / rows;
            int count = 0;
            
            BufferedImage imgs[] = new BufferedImage[chunks]; //Image array to hold image chunks
            for (int x = 0; x < rows; x++) {
                for (int y = 0; y < cols; y++) {
                     //Initialize the image array with image chunks
                    imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());

                    // draws the image chunk
                    Graphics2D gr = imgs[count++].createGraphics();
                    gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);
                    gr.dispose();
                }
            }
            
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            
            //writing mini images into image files
            for (int i = 0; i < imgs.length; i++) {
//                //ImageIO.write(imgs[i], "jpg", new File("img" + i + ".jpg"));
//                ImageIO.write(imgs[i], "jpg", bytes);
//                
//                byte[] data = bytes.toByteArray();
//
//                byte[] datar = ob1.method2(data);  //remote method calling
                
                
                //InputStream out = new ByteArrayInputStream(datar);
                BufferedImage img1 = ob1.method2(imgs[i]);
                
                ImageIO.write(img1, "jpg", new File("img" + i + ".jpg"));
            }

//            if (x1 == 1) {
//                 data1 = ob1.method2("bb.jpg", n);
//                InputStream out1 = new ByteArrayInputStream(data1);
//                BufferedImage img1 = ImageIO.read(out1);
//                ImageIO.write(img1, "jpg", new File("bb" + 1 + ".jpg"));
//            }

            if (x2 == 1) {
                 data2 = ob2.method4("bb.jpg", n);
                InputStream out2 = new ByteArrayInputStream(data2);
                BufferedImage img2 = ImageIO.read(out2);
                ImageIO.write(img2, "jpg", new File("bb" + 2 + ".jpg"));
            }
            if (x3 == 1) {
                 data3 = ob3.method6("bb.jpg", n);
                InputStream out3 = new ByteArrayInputStream(data3);
                BufferedImage img3 = ImageIO.read(out3);
                ImageIO.write(img3, "jpg", new File("bb" + 3 + ".jpg"));
            }

            if (x4 == 1) {
                 data4 = ob4.method8("bb.jpg", n);
                InputStream out4 = new ByteArrayInputStream(data4);
                BufferedImage img4 = ImageIO.read(out4);
                ImageIO.write(img4, "jpg", new File("bb" + 4 + ".jpg"));
            }
            if (x5 == 1) {
                data5 = ob5.method10("bb.jpg", n);
                InputStream out5 = new ByteArrayInputStream(data5);
                BufferedImage img5 = ImageIO.read(out5);
                ImageIO.write(img5, "jpg", new File("bb" + 5 + ".jpg"));
            }
            if (x6 == 1) {
                data6 = ob6.method12("bb.jpg", n);
                InputStream out6 = new ByteArrayInputStream(data6);
                BufferedImage img6 = ImageIO.read(out6);
                ImageIO.write(img6, "jpg", new File("bb" + 6 + ".jpg"));
            }

           // byte[] bt = data1+data2+data3+data4+data5;
//            for (int i = 0; i < n; i++) {data2
//                ImageIO.write(imgs[i], "jpg", new File("bb" + i + ".jpg"));
//            }
            System.out.println("Mini images created");

            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
            System.out.println(x4);
            System.out.println(x5);
            System.out.println(x6);
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
