import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el cultivo que desea conocer (plátano, papa, maíz, fresa, lechuga): ");
        String crop = scanner.nextLine();

        switch (crop.toLowerCase()) {
            case "platano":
                handleBanana(scanner);
                break;
            case "papa":
                handlePotato(scanner);
                break;
            case "maiz":
                handleCorn(scanner);
                break;
            case "fresa":
                handleStrawberry(scanner);
                break;
            case "lechuga":
                handleLettuce(scanner);
                break;
            default:
                System.out.println("Cultivo no reconocido.");
                break;
        }

        scanner.close();
    }


    public static void handleBanana(Scanner scanner) {
        imprimirplatano();
        String plaga = tipoplaga(scanner);
        plagasplatano(plaga);
    }

    public static void handlePotato(Scanner scanner) {
        imprimirpapa();
        String plaga = tipoplaga(scanner);
        plagaspapa(plaga);
    }

    public static void handleCorn(Scanner scanner) {
        imprimirmaiz();
        String plaga = tipoplaga(scanner);
        plagasmaiz(plaga);
    }

    public static void handleStrawberry(Scanner scanner) {
        imprimirfresa();
        String plaga = tipoplaga(scanner);
        plagasfresa(plaga);
    }

    public static void handleLettuce(Scanner scanner) {
        imprimirlechuga();
        String plaga = tipoplaga(scanner);
        plagaslechuga(plaga);
    }

    public static String tipoplaga(Scanner scanner) {
        System.out.print("Elija el tipo de plaga que identificó y sobre la que desea información: ");
        return scanner.nextLine();
    }

    // Methods to print symptoms of pests by crop
    public static void imprimirplatano() {
        System.out.println("Los síntomas de un cultivo de banano infestado con plagas como nematodos, araña roja y gorgojo negro pueden variar, pero aquí hay algunos signos comunes:");
        System.out.println("Usted identifica las siguientes situaciones en sus cultivos:"); 

        System.out.println("Los síntomas de un cultivo de plátano infestado por plagas como Nemátodos, ArañaRoja, PicudoNegro pueden variar, pero aquí están algunos de los signos más comunes:"); 

        System.out.println("Nemátodos:"); 

        System.out.println("Crecimiento raquítico y atrofiado de las plantas"); 

        System.out.println("Amarillamiento y marchitamiento de las hojas más viejas"); 

        System.out.println("Raíces con nudosidades o agallas"); 

        System.out.println("Pudrición de las raíces"); 

        System.out.println("Araña Roja (Tetranychus spp.):"); 

        System.out.println("Aparición de puntos amarillentos o bronceados en el haz de las hojas"); 

        System.out.println("Formación de telas araña en el envés de las hojas"); 

        System.out.println("Decoloración y secamiento de las hojas afectadas"); 

        System.out.println("Picudo Negro (Cosmopolites sordidus):"); 

        System.out.println("Orificios de entrada en el cormo o rizoma"); 

        System.out.println("Presencia de masas de fibras en los orificios"); 

        System.out.println("Amarillamiento y marchitez de las hojas"); 

        System.out.println("Pudrición del cormo y volcamiento de la planta en casos severos"); 
    }

    public static void imprimirpapa() {
        System.out.println("Los síntomas de un cultivo de papa infestado con plagas como el tizón, el escarabajo y el minador de hojas pueden variar, pero aquí hay algunos signos comunes:");
        System.out.println("Usted identifica las siguientes situaciones en sus cultivos:"); 

        System.out.println("Los síntomas de un cultivo de papa infestado por plagas como Tizón, Escarabajo, MoscaMinadora pueden variar, pero aquí están algunos de los signos más comunes:"); 

        System.out.println("Tizón (Phytophthora infestans):"); 

        System.out.println("Manchas irregulares de color verde oliva a marrón en las hojas"); 

        System.out.println("Lesiones oscuras en los tallos"); 

        System.out.println("Pudrición húmeda y ennegrecimiento de los tubérculos"); 

        System.out.println("Escarabajo de la papa (Leptinotarsa decemlineata):"); 

        System.out.println("Defoliación total o parcial de las plantas"); 

        System.out.println("Presencia de adultos y larvas devorando las hojas"); 

        System.out.println("Excrementos en forma de grumos en las hojas"); 

        System.out.println("Mosca minadora (Liriomyza spp.):"); 

        System.out.println("Minas o galerías serpenteantes dentro de las hojas"); 

        System.out.println("Manchas irregulares y secas en las hojas minadas"); 

        System.out.println("Caída prematura de las hojas muy infestadas"); 
    }

    public static void imprimirmaiz() {
        System.out.println("Los síntomas de un cultivo de maíz infestado con plagas como pulgones, araña roja y orugas pueden variar, pero aquí hay algunos signos comunes:");
        System.out.println("Usted identifica las siguientes situaciones en sus cultivos:"); 

        System.out.println("Los síntomas de un cultivo de maíz infestado por diferentes plagas pueden variar, pero aquí están algunos de los signos más comunes:"); 

        System.out.println("Pulgones:"); 

        System.out.println("Presencia de colonias de pulgones en las hojas, tallos y mazorcas"); 

        System.out.println("Hojas arrugadas, deformadas o enrolladas"); 

        System.out.println("Secreción de melaza azucarada que atrae hormigas y fumagina"); 

        System.out.println("Araña Roja (Tetranychus spp.):"); 

        System.out.println("Aparición de puntos amarillentos o bronceados en el haz de las hojas"); 

        System.out.println("Formación de telas araña en el envés de las hojas"); 

        System.out.println("Decoloración y secamiento de las hojas afectadas"); 

        System.out.println("Orugas (varias especies):"); 

        System.out.println("Perforaciones y defoliación de las hojas"); 

        System.out.println("Presencia de excrementos en las hojas y mazorcas"); 

        System.out.println("Daños en las mazorcas y granos por alimentación directa"); 
    }

    public static void imprimirfresa() {
        System.out.println("Los síntomas de un cultivo de fresas infestado con plagas como nematodos, ácaros y pulgones pueden variar, pero aquí hay algunos signos comunes:");
        System.out.println("Usted identifica las siguientes situaciones en sus cultivos:"); 

        System.out.println("Los síntomas de un cultivo de fresa infestado por plagas como Nemátodos, Ácaros, Pulgones pueden variar, pero estos son algunos de los más comunes:"); 

        System.out.println("Nemátodos:"); 

        System.out.println("Crecimiento raquítico y atrofiado de las plantas"); 

        System.out.println("Amarillamiento y marchitez de las hojas"); 

        System.out.println("Formación de nódulos o agallas en las raíces"); 

        System.out.println("Pudrición de las raíces y sistema radicular deficiente"); 

        System.out.println("Ácaros (arañuela roja, araña blanca, etc.):"); 

        System.out.println("Aparición de puntos amarillentos o bronceados en el haz de las hojas"); 

        System.out.println("Formación de telas en el envés de las hojas"); 

        System.out.println("Decoloración, secamiento y caída prematura de hojas"); 

        System.out.println("Pulgones:"); 

        System.out.println("Presencia de colonias de pulgones en brotes, hojas y flores"); 

        System.out.println("Hojas arrugadas, deformadas o enrolladas"); 

        System.out.println("Secreción de melaza azucarada que atrae hormigas y fumagina"); 

        System.out.println("Transmisión de virosis"); 

        System.out.println("Nemátodos, Ácaros, Pulgones"); 
    }

    public static void imprimirlechuga() {
        System.out.println("Los síntomas de un cultivo de lechuga infestado con plagas como pulgones, caracoles y orugas pueden variar, pero aquí hay algunos signos comunes:");
       System.out.println("Usted identifica las siguientes situaciones en sus cultivos:"); 

       System.out.println("Los síntomas de un cultivo de lechuga infestado por pulgones, caracoles y orugas pueden ser:"); 

       System.out.println("Pulgones:"); 

       System.out.println("Presencia de colonias de pulgones en el envés de las hojas y cogollo"); 

       System.out.println("Hojas arrugadas, deformadas o enrolladas"); 

       System.out.println("Secreción de melaza azucarada que atrae hormigas y fumagina"); 

       System.out.println("Transmisión de virosis"); 

       System.out.println("Caracoles:"); 

       System.out.println("Perforaciones irregulares y áreas comidas en las hojas"); 

       System.out.println("Rastros de baba en las hojas y cogollos"); 

       System.out.println("Daños en las hojas externas e internas de la lechuga"); 

       System.out.println("Orugas (varias especies):"); 

       System.out.println("Perforaciones y defoliación de las hojas externas"); 

       System.out.println("Presencia de excrementos en las hojas y cogollos"); 

       System.out.println("Daños por alimentación directa en las hojas internas y cogollo"); 

       System.out.println("Galerías o túneles dentro de las hojas"); 

       System.out.println("Pulgones, Caracoles, Orugas"); 
    }

    // Methods to provide information about pests by crop
    public static void plagasplatano(String plaga) {
        Scanner input = new Scanner(System.in);

         

        if (plaga.equalsIgnoreCase("Nemátodos")) { 

            System.out.println("Debes fumigar después de los 25-30 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Oxamil (Vydate®) Fenamifos (Nemacur®) Cadusafos (Rugby®)"); 

        } else if (plaga.equalsIgnoreCase("ArañaRoja")) { 

            System.out.println("Debes fumigar después de los 9-14 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Vertimec® Agrimec® Ababam®"); 

        } else if (plaga.equalsIgnoreCase("PicudoNegro")) { 

            System.out.println("Debes fumigar después de los 35-50 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: BotaniGard®, Mycotrol®, Met52®, Bio-Blast®"); 
        } 
    }

    public static void plagaspapa(String plaga) {
      Scanner input = new Scanner(System.in);       

        if (plaga.equalsIgnoreCase("Tizón")) { 

            System.out.println("Debes fumigar después de los 40 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Fluopicolide (Presidio®) Ametoctradina (Zampro®) Oxatiapiprolin (Orondis®)"); 

        } else if (plaga.equalsIgnoreCase("Escarabajo")) { 

            System.out.println("Debes fumigar después de los 7-15 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: BotaniGard®, Mycotrol®, Met52®, Bio-Blast®, Tracer®, Success®"); 

        } else if (plaga.equalsIgnoreCase("MoscaMinadora")) { 

            System.out.println("Debes fumigar después de los 23 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Dipel®, Javelin®"); 

        } 
    }

    public static void plagasmaiz(String plaga) {
      Scanner input = new Scanner(System.in);  
 

        if (plaga.equalsIgnoreCase("Pulgones")) { 

            System.out.println("Debes fumigar después de 14 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: BotaniGard®, Mycotrol®, Vertalec"); 

        } else if (plaga.equalsIgnoreCase("ArañaRoja")) { 

            System.out.println("Debes fumigar después de los 45-50 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Acramite®, Floramite®, Borneo®, Palmito®"); 

        } else if (plaga.equalsIgnoreCase("Orugas")) { 

            System.out.println("Debes fumigar después de los 12-28 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Botanigard®, Mycotrol®, Met52®, Bio-Blast®"); 

        } 
    }

    public static void plagasfresa(String plaga) {
      Scanner input = new Scanner(System.in);


        if (plaga.equalsIgnoreCase("Nemátodos")) { 

            System.out.println("Debes fumigar después de los 23 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Nemacur®, Vydate®, Velum®"); 

        } else if (plaga.equalsIgnoreCase("Ácaros")) { 

            System.out.println("Debes fumigar después de los 30-40 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: BotaniGard®, Mycotrol®, Met52®, Bio-Blast®"); 

        } else if (plaga.equalsIgnoreCase("Pulgones")) { 

            System.out.println("Debes fumigar después de los 14 días de haber plantado"); 

            System.out.println("Los productos que puedes usar son: Vertalec®, Pau-San®"); 

        } 
    }

    public static void plagaslechuga(String plaga) {
      Scanner input = new Scanner(System.in);   

                        if (plaga.equalsIgnoreCase("Pulgones")) { 

                            System.out.println("Debes fumigar después de los 14 días de haber plantado"); 

                            System.out.println("Los productos que puedes usar son: Pyganic®, Vertalec®, NovoSan®"); 

                        } else if (plaga.equalsIgnoreCase("Caracoles")) { 

                            System.out.println("Debes fumigar desde el principio"); 

                            System.out.println("Los productos que puedes usar son: Sluggo®, Deadline®, Ferramol®, Aza-Direct®"); 

                        } else if (plaga.equalsIgnoreCase("Orugas")) { 

                            System.out.println("Debes fumigar después de los 2 días de haber plantado"); 

                            System.out.println("Los productos que puedes usar son: BotaniGard®, Mycotrol®, Met52®, Bio-Blast®, Spinosyn®, Entrust®"); 

                        } 
      input.close(); 

                    } 

                    
          } 

