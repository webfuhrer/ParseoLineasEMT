package paqueteemt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AccesoFichero {
private static String ruta_xml="D:\\ClasesOnline\\emt.xml";
private static String ruta_fichero_html="D:\\ClasesOnline\\tabla.html";
	public static ArrayList<Parada> parsearXML() {
		// TODO Auto-generated method stub
		ArrayList<Parada> lista_paradas=new ArrayList<>();
		SAXBuilder constructor=new SAXBuilder();
		File f=new File(ruta_xml);
		try {
			Document d=constructor.build(f);
			Element elemento_raiz=d.getRootElement();
			Element elemento_docelement=elemento_raiz.getChild("DocumentElement");
			List<Element> elementos_reg=elemento_docelement.getChildren("REG");
			for (Element element : elementos_reg) {
				String label=element.getChild("Label").getValue();
				String origen=element.getChild("NameA").getValue();
				String destino=element.getChild("NameB").getValue();
				System.out.println(label+", "+origen+", "+destino);
				Parada p=new Parada(label, origen, destino);
				lista_paradas.add(p);
			}
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_paradas;
	}

	public static void grabarTablaHTML(String html_tabla) {
		String header="<HTML><HEAD><TITLE>Líneas EMT</title></head><body>";
		String footer="</body></html>";
		String html_completo=header+html_tabla+footer;
		try {
			FileWriter fw=new FileWriter(ruta_fichero_html, false);
			fw.write(html_completo);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
