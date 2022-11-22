package Online_shop;

import java.util.ArrayList;

public class Admin {
    static int adminCount=1;
    public ArrayList<Products> productsItems=new ArrayList<Products>();
    private int ID;
    private String name;


    public Admin(String name){
        ID=adminCount;
        this.name=name;
        adminCount++;
    }

    public ArrayList<Products> ViewProducts(){
        for(Products product:productsItems)
        {
            System.out.println(product.name);
        }
        return  productsItems;
    }

    public void AddProducts(String name,float price,String group,String subgroup){
        Products products = new Products(name,price,group,subgroup);
        productsItems.add(products);
    }

    public void DeleteProducts(int id){
        productsItems.remove(id);
    }

    public void ModifyProducts(int id, String name, String group,String subgroup, float price){
        Products p = productsItems.get(id);
        p.setName(name);
        p.setGroup(group);
        p.setPrice(price);
        p.setSubgroup(subgroup);
    }


}
