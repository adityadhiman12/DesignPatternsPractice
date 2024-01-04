package problemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directorName;
    List<Object> objectList;

    public Directory(String directorName) {
        this.directorName = directorName;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public  void ls() {
        System.out.println("Directory Name: " + directorName);
        for(Object obj: objectList) {
            if(obj instanceof File) {
                ((File)obj).ls();
            }
            else if(obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }

    /**
     * Here the problem is that we always have to do instance of every time we do ls()
     */
}
