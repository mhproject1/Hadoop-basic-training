
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class HomeworkReducer extends Reducer<Text, FloatWritable, Text, Text> {

  private Text result = new Text();

  public void reduce(Text key, Iterable<FloatWritable> values, Context context) throws IOException, InterruptedException {
      
    result.set("--- Hadoop2 Homework");
    context.write(key, result);
  }

}
