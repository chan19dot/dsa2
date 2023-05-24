package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class recurs {
    public static void main(String[] args) {
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
        List result = new ArrayList();
        List keys = new ArrayList();
        keys.addAll(model.keySet());
//        recursive(true, result, model, 0,keys);
        List values = model.get(keys.get(keys.size()-1));
//        for(int i =0; i<keys.size()-1; i++){
//            result.addAll()
//        }


    }

    public static List funfunction(List values, String formedString){
        List results= new ArrayList();
        for(Object value: values){
            results.add(formedString+ " "+ value);
        }
        return results;
    }
//    public static void recursive(boolean exists, List result, Map model, int index, List keys){
//        if(exists){
//            if(keys.size()<index){
//                exists=false;
//                return;
//            }
//            result.add(model.get(keys.get(index))+" "+keys.get(index));
//            recursive(exists, result, model, ++index, keys);
//        }
//        return;
//
//    }

}
