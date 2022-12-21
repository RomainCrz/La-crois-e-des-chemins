public class Fichier {

    private String name;
    private Dossier parent;

    public Fichier(String name, Dossier parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public Dossier getParent() {
        return parent;
    }
}
