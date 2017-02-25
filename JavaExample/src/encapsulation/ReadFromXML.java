package encapsulation;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadFromXML {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		
		File f= new File("books.xml");
		
		JAXBContext jaxbContext=JAXBContext.newInstance(Book.class);
		
		Unmarshaller unmarsh= jaxbContext.createUnmarshaller();
		
		Book b=(Book)unmarsh.unmarshal(f);
		
		System.out.println(b.getBookId());
		System.out.println(b);
		
		

	}

}
