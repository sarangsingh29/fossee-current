/**
 * Created by saarang on 26/5/16.
 */
import generated.*;
import mxgraph.MxGeometry;
import mxgraph.Root;
import xcos.*;
import mxgraph.*;

import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



public class Convertor
{
    public static void printGeometry(MxGeometry mg)
    {
            String geom="<mxGeometry x="+mg.getX()+" y="+mg.getY()+" as="+mg.getAs()+" height:"+mg.getHeight()
                        +" width:"+mg.getWidth()+"/>";
            System.out.println(geom);
    }

    public static void main(String []args) throws JAXBException {
      /*  JAXBContext jaxbContext=JAXBContext.newInstance(generated.ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<ExpenseT> unmarshalledObject =
                (JAXBElement<ExpenseT>)unmarshaller.unmarshal(
                        ClassLoader.getSystemResourceAsStream("testxml.xml"));
        ExpenseT expenseObj = unmarshalledObject.getValue();
        UserT user = expenseObj.getUser();
        ItemListT items = expenseObj.getItems();
        System.out.println("PrintingExpense for: "+user.getUserName());
        for ( ItemT item : items.getItem()){
            System.out.println("Name: "+item.getItemName());
                    System.out.println("Amount: "+item.getAmount());
                            System.out.println("Date Purchase: "+item.getPurchasedOn());
        }*/

        /*JAXBContext jaxbContext=JAXBContext.newInstance(xcos.ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<Mavtyp> unmarshalledObject =
            (JAXBElement<Mavtyp>)unmarshaller.unmarshal(
                    ClassLoader.getSystemResourceAsStream("bigsum.xml"));

        Mavtyp xcosObj=unmarshalledObject.getValue();
        MxGraphModel mgModel=xcosObj.getMxGraphModel();
        Root rt=mgModel.getRoot().get(0);

        System.out.println(mgModel.getAs());*/


        JAXBContext jaxbContext = JAXBContext.newInstance(mxgraph.ObjectFactory.class);
        Unmarshaller unm = jaxbContext.createUnmarshaller();
        JAXBElement<Mavmx> unmarshalledObject =
                (JAXBElement<Mavmx>) unm.unmarshal(
                        ClassLoader.getSystemResourceAsStream("bigsomadi.xml"));
        Mavmx robj = unmarshalledObject.getValue();
        Root rt = robj.getRoot().get(0);
        //System.out.println(rt.getMavval());

        for (mxgraph.MxCell mx : rt.getMxCell())
        {
            System.out.println(mx.getId());
            if(mx.getValue()!=null) {
                if (mx.getValue().contains("BIGSOM")) {
                    System.out.println("BigSom block found.");
                    String newcode = "<BigSom ";
                    newcode += "name=\"dependsOnU\" " + "id=" + mx.getId() + " ";
                    newcode += "parent=" + rt.getMxCell().get(1).getId() + " ";
                    newcode += "style=\"Insert Custom Style Here\" ";
                    newcode += "value=\"BigSom_f\">";
                    System.out.println(newcode);
                    MxGeometry mgtemp = mx.getMxGeometry();
                    if (mgtemp != null) {
                        printGeometry(mgtemp);
                    }
                    System.out.println("</BigSom>");
                }

//                if(mx.getStyle().contains("ExplicitInputPort")
            }


        }
    }
}
