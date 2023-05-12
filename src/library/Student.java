package library.management.system.pkg1;
import java.util.*;
public class Student extends Person{
   private int level;
    public Student() {
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
