public class Parser {

    private char parsingChar;

    private Dossier root;

    public Parser(String parsingType) {

        if (parsingType.equals("UNIX")) {
            parsingChar = '/';
        } else if (parsingType.equals("WINDOWS")) {
            parsingChar = '\\';
        } else {
            System.out.println("Error: Invalid parsing type.");
        }
        this.root = new Dossier("root", null);
    }

    private void checkParent(String [] pathArray, String path, int pathPosition) {
        Dossier parent = root;
        for (int i = 1; i <= pathPosition; i++) {
            if (parent.getChildren(pathArray[i]) == null) {
                parent.addDossier(new Dossier(pathArray[i], parent));
            } else {
                parent = parent.getChildren(pathArray[i]);
            }
        }
    }

    private void addFile(String [] pathArray, String path, int pathPosition) {
        Dossier parent = root;
        for (int i = 1; i < pathPosition; i++) {
            parent = parent.getChildren(pathArray[i]);
        }
        parent.addFichier(new Fichier(pathArray[pathPosition], parent));
    }

    public Dossier parse (String[] input){
        for (int i = 0; i < input.length; i++) {
            String path = input[i];
            String[] pathArray = path.split(String.valueOf(parsingChar));
            for (int j = 1; j < pathArray.length; j++) {
                if (j == pathArray.length - 1) {
                    addFile(pathArray, path, j);
                } else {
                    checkParent(pathArray, pathArray[j], j);
                }
            }
        }

        return root;
    }


}
