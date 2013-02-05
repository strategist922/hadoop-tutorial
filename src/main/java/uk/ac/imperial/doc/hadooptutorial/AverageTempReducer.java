package uk.ac.imperial.doc.hadooptutorial;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Reducer;


/**
 * AverageTemp - reduce process
 *
 * Create an average for the supplied keys. 
 * 
 * This class defines the reduce process for the average temperature problem.
 * You will receive a time value representing the time slot as the key. The
 * value will be a list of temperature values that fall into this time slot.
 * You need to calculate the average of the list of temperature values and 
 * then write an output key value pair with the time value as key and the average
 * of the values in the input list as the value. 
 * 
 * You will need to set the generics to specify types for the input and output 
 * keys and values.

 * 
 * Step 2: extract this from historical data
 *        -- find a pattern match in historical data
 *        .e.g all months in which there was a fluctuation of 
 *        		more than 0.5 
 * 
 */
public class AverageTempReducer extends Reducer<KEYIN, VALUEIN, KEYOUT, VALUEOUT> {

	@Override
	protected void reduce(LongWritable key, Iterable<VALUEIN> values, 
			Reducer<KEYIN, VALUEIN, KEYOUT, VALUEOUT>.Context context)
			throws IOException, InterruptedException {

		// TODO: Write your code here. 
		// You need to take the key and list of values provided 
		// and generate a suitable output key value pair. 
	}
}

