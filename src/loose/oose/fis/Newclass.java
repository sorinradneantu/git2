package loose.oose.fis;

import loose.oose.fis.documents.Document;
import loose.oose.fis.documents.JSON;
import loose.oose.fis.documents.XML;
import loose.oose.fis.processors.Procesor;
import loose.oose.fis.processors.ProcesorCautare;
import loose.oose.fis.processors.ProcesorCompus;

public class Newclass{

  private String information;
  
    public Newclass(String information)
  {
    this.information=information;
  }

    public String toString()
  {
    return this.information;
  }

}