
// Dateien wie Klassen dürfen Sonderzeichen enthalten, hier das "ü"
public class JavaUnterstütztUnicode
{
  public static void main(String[] args) {
    // Umlaute in Methodennamen stellen keine Probleme dar
    grüßeÖsterreich();
  }

  private static void grüßeÖsterreich() {
    // Dieses Programm läuft ganz normal, es hätte auch auf Chinesisch sein können (fast)
    System.out.println("Hallo, Österreich!");    
  }
}
