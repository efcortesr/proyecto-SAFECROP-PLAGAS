package GUI;
import java.util.ArrayList;

public class Plaga {
    public static ArrayList<Plaga> plagas = new ArrayList<>();
    private String nombre;
    private String descripcion;
    private String producto;

    static {
        plagas.add(new Plaga("Nemátodo", "Nematicidas: Son productos que contienen ingredientes activos diseñados específicamente para combatir y eliminar los nematodos presentes en el suelo. Al aplicarlos, se forma una barrera protectora alrededor de las raíces de las plantas, evitando así la proliferación de estos organismos. Un ejemplo de un nematicida es el Oxamilo el cual es un insecticida de contacto para uso agrícola, cuando se aplica al suelo y al follaje para el control de nemátodos, para los insectos, actúa por contacto; con efecto moderado residual.", "Crecimiento raquítico y atrofiado de las plantas."+"\n"+"\nAmarillamiento y marchitamiento de las hojas más viejas."+"\n"+"\nRaíces con nudosidades o agallas."+"\n"+"\nPudrición de las raíces."));
        plagas.add(new Plaga("Araña Roja", "Un producto para combatir la araña roja es el Bio Neem. Este producto actúa por contacto y tiene un efecto residual moderado. Al aplicarlo, se forma una barrera protectora alrededor de las plantas, evitando así la proliferación de estos organismos.", "Aparición de puntos amarillentos o bronceados en el haz de las hojas."+"\n"+"\nFormación de telas araña en el envés de las hojas."+"\n"+"\nDecoloración y secamiento de las hojas afectadas."));
        plagas.add(new Plaga("Picudo Negro", "Insecticidas sistémicos: Estos productos se absorben por la planta y pueden ser efectivos contra insectos como el picudo negro que se alimentan de la savia de las plantas. Los insecticidas sistémicos pueden ofrecer protección prolongada ya que circulan dentro de la planta y son consumidos por el insecto cuando se alimenta.", "Orificios de entrada en el cormo o rizoma."+"\n"+"\nPresencia de masas de fibras en los orificios."+"\n"+"\nAmarillamiento y marchitez de las hojas."+"\n"+"\nPudrición del cormo y volcamiento de la planta en casos severos"));
        plagas.add(new Plaga("Tizón", "Fungicidas: Se puede utilizar fungicidas específicos que sean efectivos contra los hongos causantes del tizón. Hay productos fungicidas diseñados para controlar distintas clases de hongos que pueden llegar a causar la plaga de tizón en diferentes cultivos.", "Manchas irregulares de color verde oliva a marrón en las hojas."+"\n"+"\nLesiones oscuras en los tallos."+"\n"+"\nPudrición húmeda y ennegrecimiento de los tubérculos."));
        plagas.add(new Plaga("Escarabajo", "El FungiMix es un insecticida o producto biológico ideal para eliminar plagas de escarabajos, mariposas nocturnas, entre otros tipos de insectos dañinos para un cultivo. En total este insecitcida funciona para eliminar 4 clases de insectos que suelen dañar cultivos frutales", "Defoliación total o parcial de las plantas."+"\n"+"\nPresencia de adultos y larvas devorando las hojas."+"\n"+"\nExcrementos en forma de grumos en las hojas."));
        plagas.add(new Plaga("Mosca", "El Aceite de Neem es uno de los insecticidas naturales y ecológicos más usados en el tratamiento de todo tipo de plagas. Una de sus principales ventajas es que tiene una gran permanencia en la planta, de alrededor de 3 semanas, por lo que además de acabar con la mosca minadora, evitará el ataque de otros insectos.", "Minas o galerías serpenteantes dentro de las hojas."+"\n"+"\nManchas irregulares y secas en las hojas minadas."+"\n"+"\nCaída prematura de las hojas muy infestadas."));
        plagas.add(new Plaga("Pulgones", "Los insecticidas sistémicos son absorbidos por las plantas y circulan a través del sistema vascular, lo que significa que son ingeridos por los pulgones cuando se alimentan de la savia de las plantas. Ejemplos de insecticidas sistémicos incluyen al acetamiprid, y tiametoxam. Estos productos son efectivos contra una amplia variedad de plagas, incluyendo principalmente los pulgones.", "Presencia de colonias de pulgones en las hojas, tallos y mazorcas"+"\n"+"\nHojas arrugadas, deformadas o enrolladas"+"\n"+"\nSecreción de melaza azucarada que atrae hormigas y fumagina"));
        plagas.add(new Plaga("Orugas", "Los insecticidas biológicos basados en bacterias como el Bacillus son altamente efectivos contra las orugas debido a que produce toxinas específicas que son letales para las larvas de polillas y mariposas, pero son seguras para otros organismos.", "Perforaciones y defoliación de las hojas"+"\n"+"\nPresencia de excrementos en las hojas y mazorcas"+"\n"+"\nDaños en las mazorcas y granos por alimentación directa"));
        plagas.add(new Plaga("Caracoles", "El metaldehído es un compuesto orgánico ampliamente utilizado como ingrediente activo en cebos para controlar caracoles y babosas en jardines y cultivos. Se presenta comúnmente en forma de gránulos (particula pequeña) que se distribuyen alrededor de las plantas vulnerables.", "Perforaciones irregulares y áreas comidas en las hojas."+"\n"+"\nRastros de baba en las hojas y cogollos."+"\n"+"\nDaños en las hojas externas e internas de la lechuga."));
        plagas.add(new Plaga("Ácaros", " La abamectina es un insecticida y acaricida derivado de bacterias. Actúa sobre el sistema nervioso de insectos y ácaros, causando parálisis y muerte. Se utiliza principalmente en la agricultura para controlar plagas como lo puede ser los ácaros primordialmente.", "Aparición de puntos amarillentos o bronceados en el haz de las hojas"+"\n"+"\nFormación de telas en el envés de las hojas"+"\n"+"\nDecoloración, secamiento y caída prematura de hojas"));
    }


    public Plaga(String nombre, String producto, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.producto = producto;
    }

    public String getNombrePlaga() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcionPlaga() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Plaga> getLista() {
        return plagas;
    }


}