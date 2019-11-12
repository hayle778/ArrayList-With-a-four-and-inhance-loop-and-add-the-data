import java.util.ArrayList;
import java.util.Scanner;

public class Soccer {
public static void main(String []  args) {

    Scanner input = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>( );

      String cla="";
      for (int i=0; i<15;i++ ) {
      System.out.println( "Enter a name" );
     cla= input.nextLine();
     list.add(cla);
     }

  for( String r:list ) {

System.out.println( "Names are" + r );
  }






}
}
