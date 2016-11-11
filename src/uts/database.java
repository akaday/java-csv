/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uts;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class database {
    //Delimiter used in CSV file
    DefaultTableModel model;
    Object[][] semuaData;
    Object[] dataBaru, kolom, listKegiatan;

    public static String fileMahasiswa    = "C://Users/User/Documents/NetBeansProjects/uts/mahasiswa.csv";
    public static String fileKegiatan     = "C://Users/User/Documents/NetBeansProjects/uts/kegiatan.csv";


    public static List readKegiatan() throws FileNotFoundException, IOException
    {
        CSVReader csvReader2 = new CSVReader(new FileReader(fileKegiatan), ';');
        List content2 = csvReader2.readAll();

        csvReader2.close();
        return content2;
    }

    public static List readMahasiswa() throws FileNotFoundException, IOException
    {
        CSVReader csvReader = new CSVReader(new FileReader(fileMahasiswa), ';');
        List content = csvReader.readAll();

        csvReader.close();
        return content;
    }

//    public static void main(String[] args) throws Exception
    public static void writeMahasiswa(String dataBaru) throws Exception
    {
        CSVWriter writer = new CSVWriter(new FileWriter(fileMahasiswa, true), ';', CSVWriter.NO_QUOTE_CHARACTER);
//        String dataBaru = "15042025;Sedayu;Unknow;Manah";
        String [] record = dataBaru.split(";");

        writer.writeNext(record);

        writer.close();
    }

    public static void writeKegiatan(String dataBaru) throws Exception
    {
        CSVWriter writer = new CSVWriter(new FileWriter(fileKegiatan, true), ';', CSVWriter.NO_QUOTE_CHARACTER);

//        String dataBaru = "3;David;Feezor;USA;40";
        String [] record = dataBaru.split(";");

        writer.writeNext(record);

        writer.close();
    }

}
