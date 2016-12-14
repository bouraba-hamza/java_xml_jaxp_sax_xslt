package Sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser implements ContentHandler {

	Locator c;
	
	@Override
	public void setDocumentLocator(Locator locator) {
		
		c = locator;
	
		
	}

	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("start Document");
		
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("end Document");
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		
		
		System.out.println("Ligne : "+c.getLineNumber());
		System.out.println("--Begin : "+qName);
		
		if (atts.getLength()> 0) {
			
			for (int i = 0; i < atts.getLength(); i++) {
				
				System.out.println("Attr name : "+atts.getQName(i)+" Attr Value ="+atts.getValue(i));
			}
			
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("--End : "+qName);
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		
		String s = new String(ch,start,length);
		System.out.println(s);
		
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}



}
