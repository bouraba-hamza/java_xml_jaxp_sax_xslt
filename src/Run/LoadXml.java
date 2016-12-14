package Run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import Sax.SaxParser;

public class LoadXml {

	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		
		
		XMLReader reader = parser.getXMLReader();
		
		reader.setContentHandler(new SaxParser());
		
		reader.parse("c:\\Users\\HP\\Desktop\\JAVA JAXP SAX + XSLT XPATH\\commande.xml");
		
		
	   //parser.parse(new InputSource(new StringReader("C:\\commande.xml")), new SaxParser());
		
		
	} 
	
}
