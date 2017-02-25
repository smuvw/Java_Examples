package encapsulation;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WriteTOXML {

	public static void main(String[] args) throws IOException {
		
	try {
		JAXBContext jaxbContext=JAXBContext.newInstance(Book.class);
		
		Marshaller marsh=jaxbContext.createMarshaller();
		marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Book b1= new Book(123,"JAva prog","srini");
		marsh.marshal(b1, new FileWriter("books.xml"));
		System.out.println("Marshalling Done");
		
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
