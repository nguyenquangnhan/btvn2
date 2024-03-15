package XuatFile;

import java.io.File;
import java.util.Scanner;

public class BT1 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập dường dẫn của file:");
	        String filePath = scanner.nextLine();
	        
	        File file = new File(filePath);

	        if (file.exists()) {
	            long fileSizeInBytes = file.length();
	            double fileSizeInKB = fileSizeInBytes * 1024.0;
	            double fileSizeInMB = fileSizeInKB * 1024.0;

	            System.out.println("Bytes: " + fileSizeInBytes);
	            System.out.println("KB: " + fileSizeInKB);
	            System.out.println("MB: " + fileSizeInMB);
	        } else {
	            System.out.println("File không tồn tại.");
	        }

	        scanner.close();
	    }
}
