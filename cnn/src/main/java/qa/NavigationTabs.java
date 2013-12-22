package qa;

/**
 * Created with IntelliJ IDEA.
 * User: rrt
 * Date: 12/22/13
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class NavigationTabs extends CnnBase{

        public final static String us = "#nav-us";
        public final static String world = "#nav-world";
        public final static String politics = "#nav-politics";
        public final static String justice = "#nav-justice";
        public final static String entertainment = "#nav-entertainment";
        public final static String tech = "#nav-tech";
        public final static String health= "#nav-health";
        public final static String living = "#nav-living";
        public final static String travel = "#nav-travel";
        public final static String opinion = "#nav-opinion";

        public  void goToWorld(){
            clickByCss(world);
        }
        public void goToPolitics(){
            clickByCss(politics);
        }
       public void goToJustice(){
        clickByCss(justice);
       }


}
