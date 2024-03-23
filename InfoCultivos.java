import java.util.Scanner;

public class InfoCultivos {

  public static void imprimirplatano() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Generalidades del cultivo de Platano"+"\n - Clima: Los plátanos prosperan en ambientes cálidos y húmedos, donde las temperaturas se mantienen consistentemente entre 20-30 °C durante todo el año. Además, la humedad relativa debería ser alta, idealmente entre el 75% y el 90%"+"\n - Suelo: El plátano prefiere suelos ricos en potasio, arcillo-silíceos, calizos, o los obtenidos por la roturación de los bosques, susceptibles de riego en verano, pero que no retengan agua en invierno. Los suelos ideales para su cultivo son aquellos que tienen buen drenaje, son ricos en materia orgánica y mantienen una estructura suelta que permite una fácil penetración de las raíces. Además, el pH del suelo debe estar en el rango de 5.5 a 7.0 para promover un crecimiento saludable de las plantas"+"\n - Morfología: El plátano es una planta herbácea perenne gigante, con rizoma corto y tallo aparente, que resulta de la unión de las vainas foliares, cónico y de 3,5-7,5 m de altura, terminado en una corona de hojas. El verdadero tallo es un rizoma grande, almidonoso, subterráneo, que está coronado con yemas, las cuales se desarrollan una vez que la planta ha florecido y fructificado. Las raíces son superficiales que se distribuyen en una capa de 30-40 cm, concentrándose la mayor parte de ellas en los 15-20 cm"+"\nLos cultivos de Plátano pueden ser atacados por otras plagas..."+"\n¿Desea conocerlas?"+"\n1. Sí."+"\n2. No.");

    String tp = sc.next();

    while (!tp.equals("1") && !tp.equals("2")) {
      System.out.println("Por favor escoge una opción correcta: ");
      tp = sc.next();
    }

    if (tp.equals("1")) {
      System.out.println("Nemátodos: Recimiento raquítico y atrofiado de las plantas."+"\n - Amarillamiento y marchitamiento de las hojas más viejas." + "\n - Raíces con nudosidades o agallas."+"\n - Pudrición de las raíces.");
      System.out.println("Arañas Rojas: Aparición de puntos amarillentos o bronceados en el haz de las hojas."+"\n - Formación de telas araña en el envés de las hojas."+"\n - Decoloración y secamiento de las hojas afectadas.");
      System.out.println("Picudos Negros: Orificios de entrada en el cormo o rizoma."+"\n - Presencia de masas de fibras en los orificios."+"\n - Amarillamiento y marchitez de las hojas."+"\n - Pudrición del cormo y volcamiento de la planta en casos severos");
      System.out.println("¿Sobre cual plaga deseas conocer más?"+"\n1. Nemátodos."+"\n2. Arañas Rojas."+"\n3. Picudos Negros.");
      tp = sc.next();

      while (!tp.equals("1") && !tp.equals("2") && !tp.equals("3")) {
        System.out.println("Por favor ingrese una opción correcta:");
        tp = sc.next();
      }

      if(tp.equals("1")){
        Plagas.nematodo(sc);
      } else {
        if (tp.equals("2")){
          Plagas.arañaRoja(sc);
        } else {
          if (tp.equals("3")){
            Plagas.picudoNegro(sc);
          }
        }
      }
    } else {
      if (tp.equals("2")) {
        System.out.println("¡Muchas gracias por usar nuestro programa, hasta la próxima!");
      }
    }
    sc.close();
  }

  public static void imprimirpapa() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Generalidades de un cultivo de papa:"+"\n- Origen: La papa es originaria de los valles interandinos y laderas occidentales de los Andes peruanos."+"\n- Clima y Suelo: El cultivo de papa requiere suelos fértiles, sueltos y arenosos, con buen drenaje. La brotación ocurre a los 5 °C, y se maximiza a los 15 °C"+"\n- Importancia Económica: Se considera uno de los principales cultivos agrícolas en cuanto a superficie, solo superado por productos destinados a la agroindustria como soya, caña de azúcar, maíz, trigo y arroz."+"\n- Manejo Agronómico: Para la producción de papa a nivel comercial, la forma asexual es la más utilizada, mediante el uso del tubérculo como semilla y producto consumible."+"\nLos cultivos de Maíz pueden ser atacados por otras plagas..."+"\n¿Desea conocerlas?"+"\n1. Sí."+"\n2. No.");

    String op = sc.next();

    while (!op.equals("1") && !op.equals("2")) {

      System.out.println("Por favor escoja una opción correcta:");
      op = sc.next();
    }
    if (op.equals("1")) {
      System.out.println("Tizón (Phytophthora infestans):"+"\n - Manchas irregulares de color verde oliva a marrón en las hojas."+"\n - Lesiones oscuras en los tallos."+"\n - Pudrición húmeda y ennegrecimiento de los tubérculos.");
      System.out.println("Escarabajo de la papa (Leptinotarsa decemlineata):"+"\n - Defoliación total o parcial de las plantas."+"\n - Presencia de adultos y larvas devorando las hojas."+"\n - Excrementos en forma de grumos en las hojas.");
      System.out.println("Mosca minadora (Liriomyza spp.):"+"\n - Minas o galerías serpenteantes dentro de las hojas."+"\n - Manchas irregulares y secas en las hojas minadas."+"\n - Caída prematura de las hojas muy infestadas.");
      System.out.println("¿Sobre cual plaga deseas conocer más?"+"\n1. Tizón."+"\n2. Escarabajo de la Papa."+"\n3. Mosca minadora.");
      String op2 = sc.next();

      while (!op2.equals("1") && !op2.equals("2") && !op2.equals("3")) {
        System.out.println("Por favor ingrese una opción correcta:");
        op2 = sc.next();
      }
      
      if(op2.equals("1")){
        Plagas.tizon(sc);
      } else {
        if (op2.equals("2")){
          Plagas.escarabajo(sc);
        } else {
          if (op2.equals("3")){
            Plagas.moscaMinadora(sc);
          }
        }
      }
    } else {
      if (op.equals("2")) {
        System.out.println("¡Muchas gracias por usar nuestro programa, hasta la próxima!");
      }
    }
    sc.close();
  }

  public static void imprimirmaiz() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Generalidades del cultivo de Maíz:"+"\n - Clima: El maíz es un tipo de cultivo de verano, por lo que sólo puede prosperar en climas cálidos. Durante el día, la temperatura óptima para el cultivo oscila entre 25-33°C, mientras que por la noche lo óptimo es 17-23°C"+ "\n - Suelo: El maíz prefiere suelos ricos en materia orgánica, con buena capacidad de retención de agua y drenaje. Los suelos más favorables son los francos y profundos. Es esencial el mantenimiento de la “fertilidad física” del suelo. Su deterioro puede causar limitaciones no siempre fáciles de identificar y, a menudo, de muy lenta corrección. El pH óptimo para el maíz está entre 5,8 y 6,8"+"\n - Morfología: El maíz es una planta herbácea, anual, monoica de amplia adaptación. Su desarrollo se inicia en el proceso de la germinación del grano. Al germinar el grano, la primera estructura que emerge es la radícula, de la cual al poco tiempo emergen de 2 o 3 raíces en forma lateral, formando lo que dará origen a las raíces seminales. Los granos de maíz son cariópsides desnudas, cuyas partes fundamentales son el pericarpio, el endospermo, el germen y el fenículo."+"\nLos cultivos de Maíz pueden ser atacados por otras plagas..."+"¿Desea conocerlas?" + "\n1. Sí."+"\n2. No.");

    String op = sc.next();

    while (!op.equals("1") && !op.equals("2")) {
      System.out.println("Por favor escoja una opción correcta:");
      op = sc.next();
    }

    if (op.equals("1")) {
      System.out.println("Pulgones: Presencia de colonias de pulgones en las hojas, tallos y mazorcas"+"\n - Hojas arrugadas, deformadas o enrolladas"+"\n - Secreción de melaza azucarada que atrae hormigas y fumagina");
      System.out.println("Araña Roja: Aparición de puntos amarillentos o bronceados en el haz de las hojas"+"\n - Formación de telas araña en el envés de las hojas"+"\n - Decoloración y secamiento de las hojas afectadas");
      System.out.println("Orugas: Perforaciones y defoliación de las hojas"+"\n - Presencia de excrementos en las hojas y mazorcas"+"\n - Daños en las mazorcas y granos por alimentación directa");
      System.out.println("¿Sobre cual plaga deseas conocer más?"+"\n1. Pulgones."+"\n2. Araña Roja."+"\n3. Orugas.");
      String op2 = sc.next();
      while (!op2.equals("1") && !op2.equals("2") && !op2.equals("3")) {
        System.out.println("Por favor ingrese una opción correcta:");
        op2 = sc.next();
      }

      if(op2.equals("1")){
        Plagas.pulgones(sc);
      } else {
        if (op2.equals("2")){
          Plagas.arañaRoja(sc);
        } else {
          if (op2.equals("3")){
            Plagas.oruga(sc);
          }
        }
      }
    } else {
      if (op.equals("2")) {
        System.out.println("¡Muchas gracias por usar nuestro programa, hasta la próxima!");
      }
    }
    sc.close();
  }

  public static void imprimirfresa() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Generalidades de un cultivo de Fresa:"+"\n- Clima: La fresa puede adaptarse a diferentes períodos de temperatura y luz, dos condiciones necesarias para el establecimiento exitoso del cultivo."+"\n- Suelo: La fresa se debe cultivar en terrenos sueltos, de textura franco-franco arenosa, frescos, pero bien drenados, con una profundidad superior a 80 cm y ricos en materia orgánica entre 3% a 7%, con fertilidad media a alta. El pH debe estar entre 4,5 a 7,51"+"\n- Morfología: La fresa es una planta herbácea, por lo cual presenta un sistema radicular fasciculado, compuesto por raíces y raicillas. El tallo está constituido por un eje corto de forma cónica llamado “corona”, en el que se observan numerosas escamas foliares. Las hojas se insertan en la corona y se disponen en roseta. Las inflorescencias se pueden desarrollar a partir de una yema terminal de la corona o de yemas axilares de las hojas."+"\nLos cultivos de plátano pueden ser atacados por otras plagas..."+"¿Desea conocerlas?"+"\n1. Sí."+"\n2. No.");

    String op = sc.next();

    while (!op.equals("1") && !op.equals("2")) {
      System.out.println("Por favor escoja una opción correcta:");
      op = sc.next();
    }

    if (op.equals("1")) {
      System.out.println("Nemátodos: Crecimiento raquítico y atrofiado de las plantas."+"\n - Amarillamiento y marchitamiento de las hojas más viejas."+"\n - Raíces con nudosidades o agallas."+"\n - Pudrición de las raíces.");
      System.out.println("Ácaros: Aparición de puntos amarillentos o bronceados en el haz de las hojas"+"\n - Formación de telas en el envés de las hojas"+"\n - Decoloración, secamiento y caída prematura de hojas");
      System.out.println("Pulgones: Presencia de colonias de pulgones en brotes, hojas y flores"+"\n - Hojas arrugadas, deformadas o enrolladas"+"\n - Secreción de melaza azucarada que atrae hormigas y fumagina"+"\n - Transmisión de virosis");
      System.out.println("¿Sobre cual plaga deseas conocer más?"+"\n1. Nemátodos."+"\n2. Ácaros."+"\n3. Pulgones.");
      String op2 = sc.next();
      while (!op2.equals("1") && !op2.equals("2") && !op2.equals("3")) {
        System.out.println("Por favor ingrese una opción correcta:");
        op2 = sc.next();
      }

      if(op2.equals("1")){
        Plagas.nematodo(sc);
      } else {
        if (op2.equals("2")){
          Plagas.acaro(sc);
        } else {
          if (op2.equals("3")){
            Plagas.pulgones(sc);
          }
        }
      }
    } else {
      if (op.equals("2")){
        System.out.println("¡Muchas gracias por usar nuestro programa, hasta la próxima!");
      }
    }
    sc.close();
  }

  public static void imprimirlechuga() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Generalidades de un cultivo de Lechuga:"+"\n- La lechuga es oriunda de la cuenca del Mediterráneo, aunque algunos autores afirman que proviene de la India o de Asia Central."+"\n- Clima: La lechuga se adapta a diversos climas. La temperatura adecuada de crecimiento fluctúa dentro de los 15 - 20 °C12."+"Suelo: La lechuga se desarrolla en suelos francos con muy buen drenaje puesto que las raíces de esta especie tienen un sistema radicular sensible al exceso de agua. El pH óptimo varía entre 5,5 y 6,51"+"\n- Morfología: La lechuga es una planta autógama que presenta raíz del tipo pivotante que llega a alcanzar los 30 cm de profundidad; tallo corto que se compone de las hojas a manera de rosetas, estas varían en color, forma y textura de acuerdo a la variedad."+"\nLos cultivos de lechuga pueden ser atacados por otras plagas..."+"¿Desea conocerlas?"+"\n1. Sí."+"\n2. No.");

    String op = sc.next();

    while (!op.equals("1") && !op.equals("2")) {
      System.out.println("Por favor escoja una opción correcta:");
      op = sc.next();
    }

    if (op.equals("1")) {
      System.out.println("Pulgones:"+"\n - Presencia de colonias de pulgones en el envés de las hojas y cogollo."+"\n - Hojas arrugadas, deformadas o enrolladas."+"\n - Secreción de melaza azucarada que atrae hormigas y fumagina."+"\n - Transmisión de virosis.");
      System.out.println("Caracoles:" + "\n - Perforaciones irregulares y áreas comidas en las hojas."+"\n - Rastros de baba en las hojas y cogollos."+"\n - Daños en las hojas externas e internas de la lechuga.");
      System.out.println("Orugas (varias especies):"+"\n - Perforaciones y defoliación de las hojas externas."+"\n - Presencia de excrementos en las hojas y cogollos."+"\n - Daños por alimentación directa en las hojas internas y cogollo."+"\n - Galerías o túneles dentro de las hojas.");
      System.out.println("¿Sobre cual plaga deseas conocer más?"+"\n1. Pulgones."+"\n2. Caracoles."+"\n3. Orugas.");

      String op2 = sc.next();

      while (!op2.equals("1") && !op2.equals("2") && !op2.equals("3")) {
        System.out.println("Por favor ingrese una opción correcta:");
        op2 = sc.next();
      }

      if(op2.equals("1")){
        Plagas.pulgones(sc);
      } else {
        if (op2.equals("2")){
          Plagas.caracol(sc);
        } else {
          if (op2.equals("3")){
            Plagas.oruga(sc);
          }
        }
      }
    } else {
      if(op.equals("2")){
        System.out.println("¡Muchas gracias por usar nuestro programa, hasta la próxima!");
      }
    }
    sc.close();
  }
}
