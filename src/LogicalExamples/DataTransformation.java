package LogicalExamples;

import java.util.HashMap;

/**
 * Created by sdodia on 6/19/17.
 */
public class DataTransformation {

    public static void main(String args[]) throws Exception{
        DataTransformation dt = new DataTransformation();
        dataobj d = new dataobj();
        d.setCity("redwood city");
        d.setZipcode(94065);
        d.setYear(2013);

        System.out.println("Median of San Mateo, 94402, 2012 is: "+dt.dtrans(d));
    }

    public Integer dtrans(dataobj d1){
        HashMap<dataobj, Integer> datamp = new HashMap<dataobj, Integer>();

        dataobj da1 = new dataobj();
        da1.setCity("san mateo");
        da1.setZipcode(94402);
        da1.setYear(2012);

        dataobj da2 = new dataobj();
        da2.setCity("san mateo");
        da2.setZipcode(94402);
        da2.setYear(2013);

        dataobj da3 = new dataobj();
        da3.setCity("san mateo");
        da3.setZipcode(94402);
        da3.setYear(2014);

        dataobj da4 = new dataobj();
        da4.setCity("redwood city");
        da4.setZipcode(94065);
        da4.setYear(2012);

        dataobj da5 = new dataobj();
        da5.setCity("redwood city");
        da5.setZipcode(94065);
        da5.setYear(2013);

        dataobj da6 = new dataobj();
        da6.setCity("redwood city");
        da6.setZipcode(94065);
        da6.setYear(2014);

        datamp.put(da1, 500);
        datamp.put(da2, 520);
        datamp.put(da3, 540);
        datamp.put(da4, 400);
        datamp.put(da5, 420);
        datamp.put(da6, 440);

        if(datamp.containsKey(d1)){
            return (Integer) datamp.get(d1);
        }else {
            return 0;
        }
    }

    static class dataobj {
        String city;
        Integer zipcode;
        Integer year;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Integer getZipcode() {
            return zipcode;
        }

        public void setZipcode(Integer zipcode) {
            this.zipcode = zipcode;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }
    }
}


