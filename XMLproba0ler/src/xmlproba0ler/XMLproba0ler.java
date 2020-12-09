package xmlproba0ler;

import java.io.*;
import javax.xml.stream.XMLInputFactory;
//import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XMLproba0ler {

    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        XMLInputFactory imput = XMLInputFactory.newInstance();
        //Dirrecion de la ruta del ejercicio anterior 
        XMLStreamReader leer = imput.createXMLStreamReader(new FileReader("C:\\Users\\YO\\Documents\\NetBeansProjects\\XMLproba0\\autores.xml"));
            while (leer.hasNext()) {
            leer.next();
            
            if (leer.getEventType() == XMLStreamReader.START_ELEMENT) { 
                String lectura=leer.getAttributeLocalName(0);
            if(lectura!= null)
                System.out.println(leer.getAttributeValue(0));         
           }
            if (leer.getEventType() == XMLStreamReader.CHARACTERS) {
                System.out.println(leer.getText());  
      }
    }   
  }   
}
