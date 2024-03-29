package jcode.ch_15_xml.q_08_xml_parsers;

import lombok.Data;
import lombok.ToString;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Parser_04_StAX {
    public static void main(String[] args) {
        String fileName = "./xml/xml_parser_04_stax.xml";
        List<Student> studentsList = parseXMLfile(fileName);
        // печатаем в консоль информацию по каждому студенту
        for (Student student : studentsList) {
            System.out.println("student--->" + student);
        }
    }

    private static List<Student> parseXMLfile(String fileName) {
        List<Student> studentsList = new ArrayList<>();
        Student student = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            // инициализируем reader и скармливаем ему xml файл
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            // проходим по всем элементам xml файла
            while (reader.hasNext()) {
                // получаем событие (элемент) и разбираем его по атрибутам
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("Student")) {
                        student = new Student();
                        // Получаем атрибут id для каждого элемента Student
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            student.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("age")) {
                        xmlEvent = reader.nextEvent();
                        student.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("name")) {
                        xmlEvent = reader.nextEvent();
                        student.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("language")) {
                        xmlEvent = reader.nextEvent();
                        student.setLanguage(xmlEvent.asCharacters().getData());
                    }
                }
                // если цикл дошел до закрывающего элемента Student,
                // то добавляем считанного из файла студента в список
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("Student")) {
                        studentsList.add(student);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException exc) {
            exc.printStackTrace();
        }
        return studentsList;
    }
}

@Data
@ToString
class Student {
    private int id;
    private String name;
    private int age;
    private String language;
}
