import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneNumber {
    public static void main(String[] args) {

        Map<String, String> Phones = new LinkedHashMap<>();

        Phones.put("Иванов", "632544");
        upuatePhone(Phones, "Иванов", "452118");
        Phones.put("Александров", "888444");
        Phones.put("Ивлев", "777444");
        Phones.put("Великий", "323235");
        Phones.put("Мосин", "141414");
        Phones.put("Самарин", "136587");
        Phones.put("Прост", "8922456");
        upuatePhone(Phones, "Самарин", "458772");
        upuatePhone(Phones, "Самарин", "154555");

        System.out.println(Phones);
        for (Map.Entry <String, String> entry: Phones.entrySet()){
            System.out.println("Фамилия в справочнике: " + entry.getKey() + "," + " Номер телефона: " + entry.getValue());
        }
        System.out.println(Phones.get("Иванов"));
    }

    public static void upuatePhone(Map<String, String> map, String name, String Phone) {
        if (map.containsKey(name)) {
            map.put(name, map.get(name) + " другой найденный номер телефона " + Phone);
        } else map.put(name, Phone);
    }


}
