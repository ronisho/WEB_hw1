import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hw1Q4 {

	private static Scanner sc;

	public static void main(String[] args) {
		double widith = 0;
		PrintWriter pw = null;
		sc = new Scanner(System.in);
		String color;
		System.out.println("Enter number of columns:");
		while (!sc.hasNextInt()) sc.next();
		int number = sc.nextInt();
		widith = (double)100/number;
		
		  try {
		     File file = new File("hw4.html");
		     FileWriter fw = new FileWriter(file, true);
		     
		     pw = new PrintWriter(fw);
		     pw.println("<html>");
		     pw.println("\t<head>");
		     pw.println("\t\t<title>hw4</title>");
		     pw.println("\t</head>");
		     pw.println("\t<body>");
		     pw.println("\t\t<div class=\"row\">");
		     
			for(int i=0; i<number ; i++) {
				if(i%3 == 0)
					color = "blue";
				else if(i%3 == 1)
					color = "red";
				else
					color = "green";
		    	 pw.println("\t\t\t<div style=\"height: 100%; width: " + String.valueOf(widith) +"%;");
		    	 pw.println("\t\t\tbackground-color: "+ color + "; float: left;\">");
		    	 pw.println("\t\t\t</div>\n");
		     }
		     
		     pw.println("\t\t</div>");
		     pw.println("\t</body>");
		     pw.println("</html>");
		  } catch (IOException e) {
		     e.printStackTrace();
		  } finally {
		     if (pw != null) {
		        pw.close();
		     }
		  }
	}
}