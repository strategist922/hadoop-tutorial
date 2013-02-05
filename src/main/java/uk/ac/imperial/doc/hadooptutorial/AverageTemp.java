package uk.ac.imperial.doc.hadooptutorial;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * AverageTemp - Job Configuration
 *
 * Get average temp for 10 sec. intervals.
 *
 */
public class AverageTemp extends Configured implements Tool {

	// The location where your input data is read from
	private static Path INPUT_FILES_PATH = null; 

	
	// The location where your output data is written
	private static Path OUTPUT_FILES_PATH = null;

	/**
	 * Main method used to start MapReduce job
	 */
	public static void main(String[] args) {
		
		// Check that two arguments were passed and set the input/output locations
		if(args.length == 2) {
			INPUT_FILES_PATH = new Path(args[0]);
			OUTPUT_FILES_PATH = new Path(args[1]);
		}
		else {
			System.err.println("Usage: java -jar hadoop-tutorial.jar <input file location> <output file location>");
			System.exit(0);
		}
		
		int result = 0;
		try {
			result = ToolRunner.run(new Configuration(), new AverageTemp(), args);
		} catch (Exception e) {
			System.err.println("An error occurred running the job: " + e.getMessage());
		}
		System.exit(result);
	}

	/**
	 * Set up the various parameters of the job to be run and then
	 * run the job, waiting for completion before returning.
	 */
	public int run(String[] arg0) throws Exception {
		Configuration config = getConf();
		// Create a new object
		Job job = new Job(config, "Pervasive Computing Tutorial - Average Temp");
		
		// Set the classes that provide the map and reduce processes
		job.setMapperClass(/* Set the Mapper class to use here */);
		job.setReducerClass(/* Set the Reducer class to use here */);
		
		// Set the path details for job input/output locations in HDFS
		FileInputFormat.setInputPaths(job, INPUT_FILES_PATH);
		FileOutputFormat.setOutputPath(job, OUTPUT_FILES_PATH);
		
		// Set the types for output keys and values
		job.setOutputKeyClass(/* Set the output key type here */);
		job.setOutputValueClass(/* Set the output value class here */);
		
		// Run the job
		System.out.println("Running your MapReduce job...");
		job.waitForCompletion(true);
		System.out.println("Job has completed...");
		
		return 0;
	}
}

