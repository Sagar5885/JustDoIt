package Collections.HashTablePkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by sdodia on 1/29/18.
 */
public class HashTableDemo {
    GetterSetterMethods gsm1 = new GetterSetterMethods("Sagar", "Dodia");

    @Test
    public void Test1(){
        GetterSetterMethods gsm2 = new GetterSetterMethods("Hiral", "Dodia");

        Assert.assertEquals("Sagar", gsm1.getFirst_name());
        Assert.assertEquals("Dodia", gsm1.getLast_name());

        Assert.assertEquals("Hiral", gsm2.getFirst_name());
        Assert.assertEquals("Dodia", gsm2.getLast_name());
        System.out.println();
    }

    @Test
    public void Test2(){
        System.out.println("All different key in hash table with each key with individual GetterSetterMethod Object: ");
        Hashtable<String, GetterSetterMethods> gsmTable1 = new Hashtable<String, GetterSetterMethods>();
        gsmTable1.put("k1", gsm1);
        //gsmTable1.put("k2", gsm2); - gsm2 is internal to Test1 only
        GetterSetterMethods gsm2 = new GetterSetterMethods("Hiral", "Dodia");
        GetterSetterMethods gsm3 = new GetterSetterMethods("Suhani", "Dodia");

        gsmTable1.put("k2", gsm2);
        gsmTable1.put("k3", gsm3);

        String key;
        Enumeration gsms = gsmTable1.keys();
        while (gsms.hasMoreElements()){
            key = (String) gsms.nextElement();
            if(key == "k1"){
                Assert.assertEquals("Sagar", gsmTable1.get(key).getFirst_name());
                Assert.assertEquals("Dodia", gsmTable1.get(key).getLast_name());
                System.out.println("Key k1: "+gsmTable1.get(key).getFirst_name()+" "+gsmTable1.get(key).getLast_name());
            }
            if(key == "k2"){
                Assert.assertEquals("Hiral", gsmTable1.get(key).getFirst_name());
                Assert.assertEquals("Dodia", gsmTable1.get(key).getLast_name());
                System.out.println("Key k2: "+gsmTable1.get(key).getFirst_name()+" "+gsmTable1.get(key).getLast_name());
            }
            if(key == "k3"){
                Assert.assertEquals("Suhani", gsmTable1.get(key).getFirst_name());
                Assert.assertEquals("Dodia", gsmTable1.get(key).getLast_name());
                System.out.println("Key k3: "+gsmTable1.get(key).getFirst_name()+" "+gsmTable1.get(key).getLast_name());
            }
        }
        System.out.println();
    }

    @Test
    public void Test3(){
        System.out.println("Hashtable with linkedListed GetterSetterMethod Objects in: ");
        Hashtable<String, LinkedList<GetterSetterMethods>> gsmTable1 = new Hashtable<String, LinkedList<GetterSetterMethods>>();

        LinkedList<GetterSetterMethods> gsmLinkedList = new LinkedList<>();
        GetterSetterMethods gsm2 = new GetterSetterMethods("Hiral", "Dodia");
        GetterSetterMethods gsm3 = new GetterSetterMethods("Suhani", "Dodia");
        gsmLinkedList.add(gsm1);
        gsmLinkedList.add(gsm2);
        gsmLinkedList.add(gsm3);
        gsmTable1.put("k1", gsmLinkedList);

        LinkedList<GetterSetterMethods> gsmLinkedList2 = new LinkedList<>();
        GetterSetterMethods gsm4 = new GetterSetterMethods("Hiral", "Suthar");
        GetterSetterMethods gsm5 = new GetterSetterMethods("Narendrasinh", "Dodia");
        gsmLinkedList2.add(gsm4);
        gsmLinkedList2.add(gsm5);
        gsmTable1.put("k2", gsmLinkedList2);


        String key;
        Enumeration gsms = gsmTable1.keys();
        while (gsms.hasMoreElements()) {
            key = (String) gsms.nextElement();
            if(key == "k1"){
                int tmp = 0;
                while(gsmTable1.get(key).size() > tmp){
                    if(tmp == 0){
                        Assert.assertEquals("Sagar",gsmTable1.get(key).get(tmp).getFirst_name());
                        Assert.assertEquals("Dodia",gsmTable1.get(key).get(tmp).getLast_name());
                        System.out.println("Key k1: "+gsmTable1.get(key).get(tmp).getFirst_name()+" "+gsmTable1.get(key).get(tmp).getLast_name());
                    }
                    if(tmp == 1){
                        Assert.assertEquals("Hiral",gsmTable1.get(key).get(tmp).getFirst_name());
                        Assert.assertEquals("Dodia",gsmTable1.get(key).get(tmp).getLast_name());
                        System.out.println("Key k1: "+gsmTable1.get(key).get(tmp).getFirst_name()+" "+gsmTable1.get(key).get(tmp).getLast_name());
                    }
                    if(tmp == 2){
                        Assert.assertEquals("Suhani",gsmTable1.get(key).get(tmp).getFirst_name());
                        Assert.assertEquals("Dodia",gsmTable1.get(key).get(tmp).getLast_name());
                        System.out.println("Key k1: "+gsmTable1.get(key).get(tmp).getFirst_name()+" "+gsmTable1.get(key).get(tmp).getLast_name());
                    }
                    tmp++;
                }
            }
            if(key == "k2"){
                int tmp = 0;
                while(gsmTable1.get(key).size() > tmp){
                    if(tmp == 0){
                        Assert.assertEquals("Hiral",gsmTable1.get(key).get(tmp).getFirst_name());
                        Assert.assertEquals("Suthar",gsmTable1.get(key).get(tmp).getLast_name());
                        System.out.println("Key k2: "+gsmTable1.get(key).get(tmp).getFirst_name()+" "+gsmTable1.get(key).get(tmp).getLast_name());
                    }
                    if(tmp == 1){
                        Assert.assertEquals("Narendrasinh",gsmTable1.get(key).get(tmp).getFirst_name());
                        Assert.assertEquals("Dodia",gsmTable1.get(key).get(tmp).getLast_name());
                        System.out.println("Key k2: "+gsmTable1.get(key).get(tmp).getFirst_name()+" "+gsmTable1.get(key).get(tmp).getLast_name());
                    }
                    tmp++;
                }
            }

        }
        System.out.println();
    }
}
