import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            byte array[] = new byte[15];
            System.out.println("The first stream");
            for(int i =0;i < array.length;i++)
            {
                array[i] = (byte)(Math.random() * 21+10);
                System.out.println(array[i]);
            }

            byte[] array2 = new byte[15];
            System.out.println("The second stream");
            for(int i = 0;i < array2.length;i++)
            {
                array2[i] = (byte)(Math.random() * 21+10);
                System.out.println(array2[i]);
            }
            byte[] array3 = new byte[15];
            System.out.println("The third stream");
            for(int i = 0;i < array3.length;i++)
            {
                array3[i] = (byte)(Math.random() * 21+10);
                System.out.println(array3[i]);
            }
            byte[] array4 = new byte[15];
            System.out.println("The fourth stream");
            for(int i = 0;i < array4.length;i++)
            {
                array4[i] = (byte)(Math.random() * 21+10);
                System.out.println(array4[i]);
            }
            byte[] array5 = new byte[15];
            System.out.println("The fifty stream");
            for(int i = 0;i < array5.length;i++)
            {
                array5[i] = (byte)(Math.random() * 21+10);
                System.out.println(array5[i]);
            }
            InputStream n = new ByteArrayInputStream(array);
            InputStream n2 = new ByteArrayInputStream(array2);
            InputStream n3 = new ByteArrayInputStream(array3);
            InputStream n4 = new ByteArrayInputStream(array4);
            InputStream n5 = new ByteArrayInputStream(array5);
            Vector myVector = new Vector();
            myVector.add(n);
            myVector.add(n2);
            myVector.add(n3);
            myVector.add(n4);
            myVector.add(n5);
            Enumeration num = myVector.elements();
            SequenceInputStream nAll = new SequenceInputStream(num);
            int All = 0;
            System.out.println("Consistent summary stream");
            int x;
            while((x = nAll.read()) != -1)
            {
                System.out.println(x + " ");
                All++;
            }
            System.out.println("Summary count of elements = " + All);
            n.close();
            n2.close();
            n3.close();
            n4.close();
            n5.close();
            nAll.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}