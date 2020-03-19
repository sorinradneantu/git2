package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

import java.util.ArrayList;

public class ProcesorCautare implements Procesor {
    private String text;

    public ProcesorCautare(String text) {
        this.text = text;
    }

    @Override
    public int proceseaza(ArrayList<Document> documente) {
        int res = 0;

        for (Document document : documente) {
            String[] continut = document.analizeaza();
            for (String cuvant : continut) {
                if (cuvant.equals(text)) {
                    res++;
                }
            }
        }

        return res;
    }
    public void modifica() // aici am modificat in al doilea branch creat
    {
        this.text="GIT GIT GIT";
    }
}
