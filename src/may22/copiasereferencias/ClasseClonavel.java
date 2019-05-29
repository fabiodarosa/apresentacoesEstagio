package may22.copiasereferencias;

public class ClasseClonavel implements Cloneable {

    private String texto;
    ClasseClonavel classeClonavel;

    public ClasseClonavel(String texto, ClasseClonavel classeClonavel) {
        this.classeClonavel = classeClonavel;
        this.texto = texto;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ClasseClonavel getClasseClonavel() {
        return classeClonavel;
    }

    public void setClasseClonavel(ClasseClonavel classeClonavel) {
        this.classeClonavel = classeClonavel;
    }
}
