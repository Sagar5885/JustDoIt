package LogicalExamples;

import java.util.HashMap;

/**
 * Created by sdodia on 6/6/17.
 */
public class IntToEnglish2 {
    public String numberToWords(int num) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");

        StringBuilder sb = new StringBuilder();

        if(num==0){
            return map.get(0);
        }

        if(num >= 1000000000){
            int extra = num/1000000000;
            StringBuilder sb1 = new StringBuilder();
            if(extra>=100){
                int numHundred = extra/100;
                sb1.append(" " +map.get(numHundred)+ " Hundred");
                extra=extra%100;
            }
            if(extra > 0){
                if(extra>0 && extra<=20){
                    sb1.append(" "+map.get(extra));
                }else{
                    int numTen = extra/10;
                    sb1.append(" "+map.get(numTen*10));

                    int numOne=extra%10;
                    if(numOne>0){
                        sb1.append(" " + map.get(numOne));
                    }
                }
            }
            sb.append(sb1.toString() + " Billion");
            num = num%1000000000;
        }

        if(num >= 1000000){
            int extra = num/1000000;
            StringBuilder sb1 = new StringBuilder();
            if(extra>=100){
                int numHundred = extra/100;
                sb1.append(" " +map.get(numHundred)+ " Hundred");
                extra=extra%100;
            }
            if(extra > 0){
                if(extra>0 && extra<=20){
                    sb1.append(" "+map.get(extra));
                }else{
                    int numTen = extra/10;
                    sb1.append(" "+map.get(numTen*10));

                    int numOne=extra%10;
                    if(numOne>0){
                        sb1.append(" " + map.get(numOne));
                    }
                }
            }
            sb.append(sb1.toString() + " Million");
            num = num%1000000;
        }

        if(num >= 1000){
            int extra = num/1000;
            StringBuilder sb1 = new StringBuilder();
            if(extra>=100){
                int numHundred = extra/100;
                sb1.append(" " +map.get(numHundred)+ " Hundred");
                extra=extra%100;
            }
            if(extra > 0){
                if(extra>0 && extra<=20){
                    sb1.append(" "+map.get(extra));
                }else{
                    int numTen = extra/10;
                    sb1.append(" "+map.get(numTen*10));

                    int numOne=extra%10;
                    if(numOne>0){
                        sb1.append(" " + map.get(numOne));
                    }
                }
            }
            sb.append(sb1.toString() + " Thousand");
            num = num%1000;
        }

        if(num > 0){
            StringBuilder sb1 = new StringBuilder();
            if(num>=100){
                int numHundred = num/100;
                sb1.append(" " +map.get(numHundred)+ " Hundred");
                num=num%100;
            }
            if(num > 0){
                if(num>0 && num<=20){
                    sb1.append(" "+map.get(num));
                }else{
                    int numTen = num/10;
                    sb1.append(" "+map.get(numTen*10));

                    int numOne=num%10;
                    if(numOne>0){
                        sb1.append(" " + map.get(numOne));
                    }
                }
            }
            sb.append(sb1.toString());
        }

        return sb.toString().trim();
    }

    public static void main(String args[]){
        IntToEnglish2 ite = new IntToEnglish2();
        System.out.println("Number: 1234567891 - English Word: "+ite.numberToWords(1234567891));
    }
}
