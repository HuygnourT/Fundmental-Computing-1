package file;
import java.io.*;
public class WriteFile {
	public static void write() throws FileNotFoundException
	{
		PrintStream p = new PrintStream(new File("src/file/text.txt"));
		p.append("abc\n");
		p.append("def");
	}
	public static void insert() throws IOException
	{
		String data = "\nnijkl";
		File p = new File("src/file/text.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		fw = new FileWriter(p.getAbsoluteFile(),true);
		bw = new BufferedWriter(fw);
		bw.write(data);
		try {
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

	}
	public static void main(String[] args) throws IOException {
		WriteFile.write();
		WriteFile.insert();
		
	}

}
