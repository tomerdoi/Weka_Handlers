import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DatasetsParser {

    public static void main (String[] args) throws FileNotFoundException, IOException
    {
        System.out.println("Program Started...");

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/tomerdoi/Desktop/a.arff"));
        Instances data = new Instances(reader);

        for (int i=0;i<data.numInstances();i++){

            System.out.println(data.instance(i));
        }
        reader.close();
        // setting class attribute
        data.setClassIndex(data.numAttributes() - 1);
    }
}
