package uk.ac.imperial.doc.hadooptutorial;

import java.io.IOException;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * AverageTemp - Map process
 *
 * Get average temp for 10 sec. intervals.
 * 
 * This class defines the map process for the average temperature problem.
 * You will receive a sensor data record as input, you need to produce an
 * output pair that has the time for the 10-second time slot as the key and
 * the temperature as the value. 
 * 
 * You will need to set the generics to specify types for the input and output 
 * keys and values.
 *
 */
public class AverageTempMapper extends Mapper<KEYIN, VALUEIN, KEYOUT, VALUEOUT> {

	@Override
	protected void map(LongWritable key, Text value, Mapper<KEYIN, VALUEIN, KEYOUT, VALUEOUT>.Context context)
			throws IOException, InterruptedException {

		// TODO: Write your code here. 
		// You need to take the key value pair provided as input
		// and generate a suitable output key value pair. 
	}
}

