package Online_shop;

public class Products {
    static int product_count = 1;
    public int ID;
    public float price;
    public String name;
    public String group;
    public String subgroup;


    public Products(String name,float price,String group,String subgroup)
    {
        ID=product_count;
        this.name=name;
        this.group=group;
        this.subgroup=subgroup;
        this.price=price;
        product_count++;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }
}
