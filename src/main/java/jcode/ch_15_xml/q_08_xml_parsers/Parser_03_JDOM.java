package jcode.ch_15_xml.q_08_xml_parsers;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Parser_03_JDOM {
    public static void main(String[] args) {
        try {

            SAXBuilder sax = new SAXBuilder();
            // XML is a local file
            Document doc = sax.build(new File("./xml/xml_parser_03_jdom.xml"));

            Element rootNode = doc.getRootElement();
            List<Element> list = rootNode.getChildren("staff");

            for (Element target : list) {

                String id = target.getAttributeValue("id");
                String name = target.getChildText("name");
                String role = target.getChildText("role");
                String salary = target.getChildText("salary");
                String currency = "";
                if (salary != null && salary.length() > 1) {
                    // access attribute
                    currency = target.getChild("salary").getAttributeValue("currency");
                }
                String bio = target.getChildText("bio");

                System.out.printf("Staff id : %s%n", id);
                System.out.printf("Name : %s%n", name);
                System.out.printf("Role : %s%n", role);
                System.out.printf("Salary [Currency] : %,.2f [%s]%n", Float.parseFloat(salary), currency);
                System.out.printf("Bio : %s%n%n", bio);

            }

        } catch (IOException | JDOMException e) {
            e.printStackTrace();
        }
    }
}
