import org.testng.annotations.Test;
import qa.CnnBase;
import qa.NavigationTabs;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 12/21/13
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */

//Generic[SeleniumBase()-->Cnn(qa.CnnBase()--->CnnHome]
public class CnnHome extends NavigationTabs {

   @Test
    public void home(){
       goToPolitics();
       goToWorld();
       }
}
