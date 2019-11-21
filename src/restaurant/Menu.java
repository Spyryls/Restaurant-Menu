package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    // FIELDS:

    private ArrayList<MenuItem> menuIndex;


    // CONSTRUCTOR (Not needed in Menu.java)
    //METHODS:

    public void addMenuItem(MenuItem nomNom) {
        menuIndex.add(nomNom);
        nomNom.setNew(true);
        // you may want, in the future, to add a DATE using updated!
    }


    // GETTERS & SETTERS:

    public ArrayList<MenuItem> getMenuItems() {
        return menuIndex;
    }
    public void setMenuIndex(ArrayList<MenuItem> menuIndex) {
        this.menuIndex = menuIndex;
    }

}
