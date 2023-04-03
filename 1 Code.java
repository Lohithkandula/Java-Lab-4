import java.io.*;
import java.util.Scanner;
public class one {
public static void main(String[] args)throws IOException
{
String fileName = ""D:\JAVA\srm.txt.txt"";
String line = "";
Scanner myObj = new Scanner(System.in);
char user = myObj.next().charAt(0);
Scanner scanner = new Scanner(new FileReader(fileName));
try {
while ( scanner.hasNextLine() ){
line = scanner.nextLine();
int counter = 0;
for( int i=0; i<line.length(); i++ ) {
if( line.charAt(i) == user ) {
counter++;
}
}
System.out.println(counter);
}
}
finally {
scanner.close();
}
}
}
