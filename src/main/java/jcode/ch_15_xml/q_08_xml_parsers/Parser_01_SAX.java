package jcode.ch_15_xml.q_08_xml_parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class Parser_01_SAX extends DefaultHandler {
    private String currentElement = null;

    public static void main(String[] args) {
        try {
            //В JDK 5.0 введен этот парсер, и путь такой: com.sun.org.apache.xerces.internal.parsers.SAXParser.
            Class c = Class.forName("org.apache.xerces.parsers.SAXParser");
            XMLReader reader = (XMLReader) c.newInstance();
            Parser_01_SAX ss = new Parser_01_SAX();
            reader.setContentHandler(ss);
            reader.parse("./xml/xml_parser_01.xml");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void startElement(String uri, String local_name, String raw_name, Attributes amap) throws SAXException {
        currentElement = local_name;
        System.out.println("start " + local_name + " found ");
    }

    public void endElement(String uri, String local_name, String raw_name) throws SAXException {
        System.out.println("end " + local_name + " found");
    }

    public void startDocument() throws SAXException {
        System.out.println("start document");
    }

    public void endDocument() throws SAXException {
        System.out.println("end document");
    }

    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if (!Character.isISOControl(value.charAt(0))) {
            System.out.println("characters " + value + " found " + currentElement);
        }
    }
}
