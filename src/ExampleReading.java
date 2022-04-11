import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\Bruno Mendes\\Desktop\\poema.txt"));
		
		String linha;
		while (reader.ready()) {
			linha = reader.readLine();
			System.out.println(linha);
		}
		
		reader.close();
		
		}catch(IOException e) {
			System.out.println("Falha ao ler arquivo.");
		}
		
	}

}
