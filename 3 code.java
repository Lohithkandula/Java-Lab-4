import java.io.*;
class WriteFile
{
public static void main(String[] args)
{
String str= "Embark on the avenues of excellence with SRM University-AP! Believing
in the power of education to transform lives, our interdisciplinary research-oriented
undergraduate, postgraduate, and doctoral programmes ensure global exposure and
entrepreneurial experience to our students. We are a thriving intellectual community
prepared for a dynamic world.";
try
{
FileWriter fw=new FileWriter("D:\JAVA\srm.txt.txt",true);
fw.write(str);
fw.close();
}
catch(IOException e){}
}
}
