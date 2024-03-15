package XuatFile;

import java.io.File;
import java.util.Scanner;

public class BT2 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập đường dẫn:");
	        String path = scanner.nextLine();

	        File file = new File(path);

	        if (file.exists()) {
	            if (deleteFile(file)) {
	                System.out.println("Xóa oke");
	            } else {
	                System.out.println("Xóa kh  oke.");
	            }
	        } else {
	            System.out.println("Thư mục kh tồn tại.");
	        }

	        scanner.close();
	    }

	    private static boolean deleteFile(File file) {
	        if (file.isDirectory()) {
	            File[] files = file.listFiles();
	            if (files != null) {
	                for (File subFile : files) {
	                    deleteFile(subFile);
	                }
	            }
	        }
	        return file.delete();
	    }

}
