import org.testng.annotations.Test;
import qa.CnnBase;
import qa.NavigationTabs;
//Generic[SeleniumBase()-->Cnn(qa.CnnBase()--->CnnHome]
public class CnnHome extends NavigationTabs {

   @Test
    public void home(){
       goToPolitics();
       goToWorld();
       }
}
