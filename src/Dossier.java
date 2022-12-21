import java.util.ArrayList;

public class Dossier
{
    private String name;
    private ArrayList<Fichier> fichiers;
    private ArrayList<Dossier> dossiers;

    private Dossier parent;

    public Dossier(String name, Dossier parent) {
        this.name = name;
        fichiers = new ArrayList<Fichier>();
        dossiers = new ArrayList<Dossier>();
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public Dossier getParent() {
        return parent;
    }
    public void addFichier(Fichier fichier) {
        fichiers.add(fichier);
    }

    public void addDossier(Dossier dossier) {
        dossiers.add(dossier);
    }

    public Dossier getChildren(String name) {
        for (int i = 0; i < dossiers.size(); i++) {
            if (dossiers.get(i).name.equals(name)) {
                return dossiers.get(i);
            }
        }
        return null;
    }

    public ArrayList<Dossier> getDossiers() {
        return dossiers;
    }

    public ArrayList<Fichier> getFichiers() {
        return fichiers;
    }
}
