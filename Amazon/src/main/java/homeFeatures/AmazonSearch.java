package homeFeatures;

import org.testng.annotations.DataProvider;

public class AmazonSearch {
    private String category;
    private String name;

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @DataProvider(name = "search")
    public static Object[][] getAmazonData(){
        return new Object[][]{
                {"Computers", "Dell Laptop"},
                {"Cell Phones & Accessories", "samsung galaxy s6"},
                {"Electronics", "TV"}
        };
    }
}
