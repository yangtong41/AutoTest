package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class group_test {

        @BeforeGroups("groupA")      //
        public void beforegroupA(){
            System.out.println("groupA-------");
        }
        @AfterGroups("groupA")      //
        public void aftergroupA(){
            System.out.println("---------groupA");
        }

}
