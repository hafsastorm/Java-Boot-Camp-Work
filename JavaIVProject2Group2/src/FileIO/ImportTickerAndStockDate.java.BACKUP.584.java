package FileIO;

<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportTickerAndStockDate {
	
	public static void ImportTickerAndStockDate () throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("s&p500-2015-06-01.csv"));
		scanner.useDelimiter(",");
		while(scanner.hasNext()){
		System.out.print(scanner.next()+"|");
		}

		scanner.close();

		}
		
		public static void main (String args[]) throws FileNotFoundException{
			ImportTickerAndStockDate();
		}
}


=======
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import Models.OpeningStock;
import Repository.OpeningStockRepository;
import Repository.StockConnectionProvider;
public class ImportTickerandStockDate {

	public static void main(String[] args)
{
		new ImportTickerandStockDate( "S&P500-2015-06-01.csv", "2015-06-01");
}
private OpeningStockRepository openingPriceRepository;
private String filename;
private String date;

public ImportTickerandStockDate( String filename, String date )
{
	this.filename = filename;
	this.date = date;
	openingPriceRepository = new OpeningStockRepository( StockConnectionProvider.createConnection() );
	for ( OpeningStock openingPrice : read( ) )
{
		openingPriceRepository.create( openingPrice );
}
}

public List<OpeningStock> read( )
{
	File stockFile = new File( filename );
	Scanner scanner;
	try
{
	scanner = new Scanner(stockFile);
	List<OpeningStock> openingPrices = new ArrayList<OpeningStock>();
	if ( scanner.hasNext() )
{
		String headerLineToIgnore = scanner.nextLine();
}
	while ( scanner.hasNext() )
{
	String line = scanner.nextLine();
	int firstCommaIndex = line.indexOf(',');
	String ticker = line.substring(0, firstCommaIndex );
	double price = Double.parseDouble( line.substring(firstCommaIndex + 1) );
	openingPrices.add( new OpeningStock( ticker, date, price) );
}
	scanner.close();
	return openingPrices;
} 
	catch ( Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return null;
}
}
>>>>>>> 0ef229b92091e6ab0a0b48ccf91f54ec2c98688f
