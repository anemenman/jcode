package jcode.ch_15_xml.q_09_xpath;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.FileInputStream;

public class XPath_01 {
    public static void main(String[] args) throws Exception {

        String id = "01";

        FileInputStream fileIS = new FileInputStream("./xml/xpath_example.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(fileIS);
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/Tutorials/Tutorial";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);

        System.out.println("nodeList--->" + nodeList);
        System.out.println("nodeList.getLength--->" + nodeList.getLength());

        String expression2 = "/Tutorials/Tutorial[@tutId=" + "'" + id + "'" + "]";
        Node node = (Node) xPath.compile(expression2).evaluate(xmlDocument, XPathConstants.NODE);

        System.out.println("node--->" + node);
    }
}
