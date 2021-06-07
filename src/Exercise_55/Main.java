/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
лира
лоза
роза
Выходные данные:
лира
лоза
лоза
*/
package Exercise_55;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("лира");
        list.add("лоза");
        list.add("роза");
        list.add("коза");
        list.add("лупа");
        list.add("зупа");
        list.add("руда");
        fix(list);
    }
    public static void fix(List<String> list) throws IOException {
        System.out.println("Содержимое списка: \n" + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                continue;
            } else if (list.get(i).contains("р")) {
                list.remove(list.get(i));
                i -= 1;
            } else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i += 1;
            }
        }
        System.out.println("Содержимое списка после выполнения операций: \n" + list);
    }
}
