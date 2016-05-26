/**
 * Created by saarang on 26/5/16.
 */
import generated.*;
import mxgraph.Mavmx;
import mxgraph.Root;
import xcos.Mavtyp;
import xcos.MxGraphModel;
import xcos.XcosDiagram;

import javax.xml.bind.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Reverser

{
    public static void main(String[] args) throws JAXBException
    {

      /*  ObjectFactory factory = new ObjectFactory();

        UserT user = factory.createUserT();
        user.setUserName("Sanaulla");
        ItemT item = factory.createItemT();
        item.setItemName("Seagate External HDD");
        item.setPurchasedOn("August 24, 2010");
        item.setAmount(new BigDecimal("6776.5"));

        ItemListT itemList = factory.createItemListT();
        itemList.getItem().add(item);

        ExpenseT expense = factory.createExpenseT();
        expense.setUser(user);
        expense.setItems(itemList);

        JAXBContext context = JAXBContext.newInstance("generated");
        JAXBElement<ExpenseT> element = factory.createExpenseReport(expense);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(element,System.out);*/

        JAXBContext jaxbContext = JAXBContext.newInstance(mxgraph.ObjectFactory.class);
        Unmarshaller unm = jaxbContext.createUnmarshaller();
        JAXBElement<Mavmx> unmarshalledObject =
                (JAXBElement<Mavmx>) unm.unmarshal(
                        ClassLoader.getSystemResourceAsStream("bigsomadi.xml"));
        Mavmx robj = unmarshalledObject.getValue();
        mxgraph.Root rt = robj.getRoot().get(0);


        xcos.ObjectFactory of=new xcos.ObjectFactory();
        xcos.Root rt1=of.createRoot();
        rt1.setMavxcos("Maverick");


        int cellCount=0;

        for(mxgraph.MxCell mcell: rt.getMxCell())
        {
            if(mcell.getValue()!=null)
            {
                if(mcell.getValue().contains("BIGSOM"))
                {
                    //Code for BigSom.
                    xcos.BigSom bstemp = of.createBigSom();
                    bstemp.setId(mcell.getId());
                    bstemp.setParent(mcell.getParent());
                    bstemp.setStyle(mcell.getStyle());
                    mxgraph.MxGeometry mxgeom=mcell.getMxGeometry();
                    if (mxgeom != null)
                    {
                        xcos.MxGeometry mgtemp = of.createMxGeometry();
                        mgtemp.setWidth(mxgeom.getWidth());
                        mgtemp.setHeight(mxgeom.getHeight());
                        mgtemp.setX(mxgeom.getX());
                        mgtemp.setY(mxgeom.getY());
                        mgtemp.setAs(mxgeom.getAs());

                        bstemp.setMxGeometry(mgtemp);
                    }
                    rt1.getBasicBlockOrCommandPortOrControlPort().add(cellCount++,bstemp);
                    continue;
                }
            }

            if(mcell.getStyle()!=null)
            {
                if (mcell.getStyle().contains("ExplicitInputPort")) {
                    //Code for ExplicitInputPort.
                    xcos.ExplicitInputPort eiport = of.createExplicitInputPort();
                    eiport.setId(mcell.getId());
                    eiport.setStyle("ExplicitInputPort;CustomStyle");
                    eiport.setParent(mcell.getParent());
                    eiport.setValue("");

                    mxgraph.MxGeometry mxgeom = mcell.getMxGeometry();
                    if (mxgeom != null) {
                        xcos.MxGeometry mgtemp = of.createMxGeometry();
                        mgtemp.setWidth(mxgeom.getWidth());
                        mgtemp.setHeight(mxgeom.getHeight());
                        mgtemp.setX(mxgeom.getX());
                        mgtemp.setY(mxgeom.getY());
                        mgtemp.setAs(mxgeom.getAs());

                        eiport.setMxGeometry(mgtemp);
                    }
                    rt1.getBasicBlockOrCommandPortOrControlPort().add(cellCount++,eiport);
                    continue;
                }

                if (mcell.getStyle().contains("ExplicitOutputPort")) {
                    //Code for ExplicitOutputPort.
                    xcos.ExplicitOutputPort eoport = of.createExplicitOutputPort();
                    eoport.setId(mcell.getId());
                    eoport.setStyle("ExplicitOutputPort;CustomStyle");
                    eoport.setParent(mcell.getParent());
                    eoport.setValue("");

                    mxgraph.MxGeometry mxgeom = mcell.getMxGeometry();
                    if (mxgeom != null) {
                        xcos.MxGeometry mgtemp = of.createMxGeometry();
                        mgtemp.setWidth(mxgeom.getWidth());
                        mgtemp.setHeight(mxgeom.getHeight());
                        mgtemp.setX(mxgeom.getX());
                        mgtemp.setY(mxgeom.getY());
                        mgtemp.setAs(mxgeom.getAs());

                        eoport.setMxGeometry(mgtemp);
                    }
                    rt1.getBasicBlockOrCommandPortOrControlPort().add(cellCount++,eoport);
                    continue;
                }
            }

            xcos.MxCell mxc=of.createMxCell();
            mxc.setId(mcell.getId());
            mxc.setParent(mcell.getParent());
            rt1.getBasicBlockOrCommandPortOrControlPort().add(cellCount++,mxc);
        }


        xcos.MxGraphModel mgm=of.createMxGraphModel();
        mgm.setAs("model");
        mgm.getRoot().add(rt1);
        xcos.Mavtyp mt=of.createMavtyp();
        mt.setMxGraphModel(mgm);
        JAXBContext context = JAXBContext.newInstance("xcos");
        JAXBElement<Mavtyp> element = of.createXcosDiagram(mt);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(element,System.out);


    }

}