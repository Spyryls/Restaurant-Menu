package restaurant;

import java.util.Date;

// FIELDS

public class MenuItem {

    private String item;
    private String course;
    private String description;
    private double price;
    private Boolean isNew;
    private Date updated;

    // CONSTRUCTOR

    public MenuItem(String item, String course, String description, double price, Date updated) {
        this.item = item;
        this.course = course;
        this.description = description;
        this.price = price;
        this.updated = updated;
    }

    // METHODS
    // GETTERS & SETTERS

    public String getItem() {
        return item;
    }
    public void setItem(String anItem) {
        this.item = anItem;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String aCourse) {
        this.course = aCourse;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public Boolean getNew() {
        return isNew;
    }
    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date anUpdate) {
        this.updated = anUpdate;
    }

    // OVERRIDES

    @Override
    public String toString() {
        return "MenuItems{" +
                "item='" + item + '\'' +
                ", course='" + course + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", updated=" + updated +
                '}';
    }
}






