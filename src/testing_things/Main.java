package testing_things;

public class Main {
    public static boolean willBugReturn(int m, int n) {
        int curX = 0, curY = 0;
        int prevX = 0, prevY = 0;
        int steps = 0;
        int maxSteps = m * n; // максимальное количество шагов

        while (steps < maxSteps) {
            // перемещаем жука на следующую позицию
            int nextX = (curX + 1) % n;
            int nextY = (curY + 1) % m;

            // проверяем, вернулся ли жук в начальную позицию
            if (nextX == 0 && nextY == 0 && steps > 0) {
                return true;
            }

            // сохраняем текущую и предыдущую позиции жука
            prevX = curX;
            prevY = curY;
            curX = nextX;
            curY = nextY;

            // увеличиваем счётчик шагов
            steps++;
        }

        return false; // жук не вернулся в начальную позицию
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 1000;
        boolean willReturn = willBugReturn(m, n);
        System.out.println("Жук вернётся в начальную клетку? " + willReturn);
    }
}
