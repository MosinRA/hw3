import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> Wr = new ArrayList<>();
        Wr.addAll(Arrays.asList("Петр", "Игорь", "Олег", "Илья", "Олег", "Роман", "Александр", "Петр", "Игорь", "Олег", "Илья",
                "Олег", "Роман", "Александр", "Игорь", "Олег", "Олег", "Роман", "Александр", "Саня"));
        HashMap<String, Integer> hw = new HashMap<String, Integer>();
        Integer num;
        for (String i : Wr) {
            num = hw.get(i);
            hw.put(i, num == null ? 1 : num + 1);
        }
        System.out.println("Всего имен в списке " + Wr.size() + " каждое имя встречается: " + hw);
        List<String> gasList = Wr;
        Set<String> uniqueGas = new HashSet<String>(gasList);
        System.out.println("Удаляем дубликаты " + uniqueGas + " после очистки осталось " + uniqueGas.size() + " уникальных имен");
    }


// методы проб и ошибок
//        System.out.println(Wr);
//        Map<List<String>, Integer> W = new HashMap<>();
//        for (int i = 0; i < Wr.size(); i++) {
////           String count = W.get(Wr);
//            Set <String> set = new HashSet<>(Wr);
//            Wr.clear();
//            Wr.addAll(set);
//
//          W.put(Wr, W.getOrDefault(Wr, 0) + 1);
//
//
//
//        }
//        System.out.println(W);
//        Set<String> foundStrings = new HashSet<>();
//        Set<String> duplicates = new HashSet<>();
//        for (String str : Wr) {
//            if (foundStrings.contains(str)) {
//                duplicates.add(str);
//            } else {
//                foundStrings.add(str);
//            }
//        }
//        System.out.println("Повторяющиеся имена " + duplicates + " Количество дубликатов = " + duplicates.size());
//        System.out.println("Не повторяющиеся имена = " + foundStrings + foundStrings.size());
}



