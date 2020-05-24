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


}



