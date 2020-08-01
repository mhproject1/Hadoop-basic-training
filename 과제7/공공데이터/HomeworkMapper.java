
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class HomeworkMapper extends Mapper<LongWritable, Text, Text, FloatWritable> {
  private final static FloatWritable outputValue = new FloatWritable(1);
  private Text outputKey = new Text();
  
  public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	  HomeworkDTH parser = new HomeworkDTH(value);	  
 
	  outputKey.set( "Temp : " + parser.getTemp() + ",	Humid : " + parser.getHumid() + ",	Date : " + parser.getDate());
	  
	  context.write(outputKey, outputValue);	 
  }
}
