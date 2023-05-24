import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.*;

public class test {

    public static void main(String[] args) {
//        Date date = new Date();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy");
//        String year =df.format(date);
//        System.out.println(Integer.parseInt(year));
//        short y = Short.valueOf(year);
//        System.out.println(y);
//
//        int i=0;
//        for(;i<5;i++) {
//            System.out.println(i);
//        }
//        Calendar calendar = new GregorianCalendar(2021, 11, 4);
////        calendar.set(2022, 12, 21, 5 ,15,23);
//        Date d = calendar.getTime();
//        System.out.println(d);
        Map<String, List> model = new HashMap<>();
        List<String> vehicles= new ArrayList<>();
        vehicles.add("ModelCodeA");
        vehicles.add("ModelCodeB");
        vehicles.add("ModelCodeC");
        model.put("Model", new ArrayList(){{add("wagonR");}});
        model.put("ModelCode", vehicles);
        List<String> vehicles2= new ArrayList<>();
        vehicles2.add("OG_1");
        vehicles2.add("OG_2");
        vehicles2.add("OG_3");
        model.put("OptionGroup", vehicles2);
        //OptionGroup
        List<String> optionGroups = new ArrayList<>();
        //ModelCodes
        List<String> modelCodes = new ArrayList<>();
        modelCodes.addAll(model.get("ModelCode"));
        optionGroups.addAll(model.get("OptionGroup"));
        List<String> result= new ArrayList<>();
        String Model = (String) model.get("Model").get(0);
//        for(String modelCode: modelCodes ){
//            result.add(Model+" "+ modelCode);
//        }
//        //now I have three of them
//        List<String> subResult = new ArrayList<>(); //to counter concurrentModificationException
//        for(String modelResult : result){
//            for(Object og:  model.get("OptionGroup")){
//                subResult.add(modelResult+ " "+ og);
//            }
//        }
////        result.addAll(subResult);
//        for(String res: subResult){
//            System.out.println(res);
//        }
        List<String> keys = new ArrayList<>();
        keys.addAll(model.keySet());




    }
}
