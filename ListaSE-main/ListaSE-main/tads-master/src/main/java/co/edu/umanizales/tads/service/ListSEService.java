package co.edu.umanizales.tads.service;

import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListSE;
import co.edu.umanizales.tads.model.Node;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE kids;

    public ListSEService() {
        kids = new ListSE();
        kids.add(new Kid("543","Jheferson",(byte)4));
        kids.add(new Kid("123","Jose",(byte)3));
        kids.add(new Kid("876","Joshua",(byte)5));

       kids.addToStart(new Kid("198","duvan",(byte)6));
        kids.addInPosition(2,new Kid("89","juan pablo",(byte)5));
          kids.deleteByIdentification("123");

    }


    public Node getKids()
    {
        return kids.getHead();
    }
}
