package edusys.helper;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class XImage {
    /*
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
     */
 
    
    /*
     * Sao chép file logo chuyên đề vào thư mục logo
     * @param images là đối tượng file ảnh
     */   
    public static void save(File images){
        File file = new File("logos", images.getName());
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(images.getAbsolutePath());
            Path to = Paths.get(file.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } 
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    /*
     * Đọc hình ảnh logo chuyên đề
     * @param fileName  là tên file logo
     * @return ảnh đọc được
     */   
    public static ImageIcon read(String fileName){
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}