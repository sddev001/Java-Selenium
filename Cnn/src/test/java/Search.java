import baseApi.Base;
import org.testng.annotations.Test;
import utility.DataReader;


import java.io.IOException;

public class Search extends Base {
    public DataReader dr = new DataReader();
    String path = "C:\\Users\\Shibu\\Documents\\Book1.xls";
    @Test
    public void searchNews() throws IOException, InterruptedException {
        String [][] value = dr.fileReader(path);
        typeAndEnterByCss(value[1][0], value[1][1]);
        typeAndEnterByCss(value[2][0], value[2][1]);

    }

}
