package may22.copiasereferencias;


public class Main {
    public static void main(String[] args) {

        ClasseClonavel original = new ClasseClonavel("Texto Original", new ClasseClonavel("Texto novo", null));
        ClasseClonavel clone = null;
        ClasseClonavel referencia = original;


        try {
            clone = (ClasseClonavel) original.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        clone.getClasseClonavel().setTexto("Novo 222");

        System.out.print("Teste Clone - ");
        if (original == clone) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

        System.out.print("Teste Cópia - ");
        if (original == referencia) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }


        System.out.println("Texto antigo clone----- " + clone.getTexto());
        System.out.println("Texto antigo referência ----- " + referencia.getTexto());
        System.out.println("Texto antigo original-- " + original.getTexto());

        clone.setTexto("Texto novo CLONE");
        referencia.setTexto("Texto novo REFERÊNCIA");

        System.out.println("Texto novo clone------- " + clone.getTexto());
        System.out.println("Texto novo referência------- " + referencia.getTexto());
        System.out.println("Texto novo original---- " + original.getTexto());


        System.out.println("Texto clone " + clone.getClasseClonavel().getTexto());
        System.out.println("Texto original " + original.getClasseClonavel().getTexto());
    }
}
