// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class DZ4
{
    private static void smartCalc(String a, String b, String r) {
        boolean flag = false;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int q = 0; q <= 9; q++) {
                    if (Integer.parseInt(a.replace("?", String.valueOf(i))) +
                            Integer.parseInt(b.replace("?", String.valueOf(j))) == Integer
                                    .parseInt(r.replace("?", String.valueOf(j)))) {
                        System.out.println(a.replace("?", String.valueOf(i)) + " + "
                                + b.replace("?", String.valueOf(j)) + " = "
                                + r.replace("?", String.valueOf(j)));
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("no results :(");
        }
    }
}
