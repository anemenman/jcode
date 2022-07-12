package jcode.ch_15_xml.q_20_jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JAXB_Example_02_unmarshalling {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Book book = (Book) context.createUnmarshaller()
                .unmarshal(new FileReader("./xml/jaxb_book.xml"));

        System.out.println("book--->" + book);
    }
}
