import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("¿Qué vas a cultivar?"+"\nSelecciona el número del cultivo que deseas:"+"\n1. Plátano"+"\n2. Papa"+"\n3. Maíz"+"\n4. Fresa"+"\n5. Lechuga.");
    String crop = scanner.next();

    while (!crop.equals("1") && !crop.equals("2") && !crop.equals("3") && !crop.equals("4") && !crop.equals("5")){
      System.out.println("Por favor escoge una opción correcta.");
      System.out.println("¿Qué vas a cultivar?");
      crop = scanner.next();
    }

    if (crop.equals("1")) {
      Cultivos.handlePlatano(scanner);
    } else {
      if (crop.equals("2")) {
        Cultivos.handlePotato(scanner);
      } else {
        if (crop.equals("3")) {
          Cultivos.handleCorn(scanner);
        } else {
          if (crop.equals("4")) {
            Cultivos.handleStrawberry(scanner);
          } else {
            if (crop.equals("5")) {
              Cultivos.handleLettuce(scanner);
            }
          }
        }
      }
    }
    scanner.close();
  }
  
}
