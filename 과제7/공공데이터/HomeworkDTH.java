
import org.apache.hadoop.io.Text;

public class HomeworkDTH {

  private String date;
  private float temp;
  private float humid;  
  
  public HomeworkDTH(Text text) {
    try {
      String[] colums = text.toString().split(",");
      
      date = colums[1];
      temp = (float) Double.parseDouble(colums[2]);
      humid = (float) Double.parseDouble(colums[8]);       
    } catch (Exception e) {
      System.out.println("Error record :" + e.getMessage());
    }
  }
  
  public String getDate() { return date; }
  public float getTemp() { return temp; }
  public float getHumid() { return humid; }  
}
