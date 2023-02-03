# +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 


## Сводя количество выполняемых действий к минимуму. 



- Пример 1: а = 3, b = 2, ответ: 9 
- Пример 2: а = 2, b = -2, ответ: 0.25
- Пример 3: а = 3, b = 0, ответ: 1
- Пример 4: а = 0, b = 0, ответ: не определено
- Пример 5:
```
входные данные находятся в файле input.txt в виде:

b 3
a 10

Результат нужно сохранить в файле output.txt

1000
```

Алгоритм Ли

public class WaveAlgorithm {
 public static void main(String[] args) {
  int[][] matrix = new int[][] {
   {1, 1, 0, 0}, 
   {1, 0, 0, 1}, 
   {0, 0, 1, 1}, 
   {0, 1, 1, 0}};
  int row = matrix.length;
  int col = matrix[0].length;
  // Проходим по всем ячейкам матрицы и присваиваем каждой ячейке индекс
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = -1; // -1 - означает непосещенную ячейку
                } else {
                    matrix[i][j] = Integer.MAX_VALUE; // Посещенные ячейки присваиваем максимально возможное целочисленное значение 
                }
            }
        }
        // Задаем ячейку стартового положения (x=0, y=0)
        int x = 0;
        int y = 0;
        // Зададим стоимость шага (cost)
        int cost = 1;
        // Начинаем алгоритм с точки (x=0, y=0) и устанавливаем стоимость равную 0
        matrix[x][y] = 0;
        // Зададим стороны: left, right, up and down.
        int left = y - 1;
        int right = y + 1;
        int up = x - 1;
        int down = x + 1;
        // Создадим FIFO-очередь (Queue) с точкой (x=0, y=0) и установим visited[][] true.
        boolean[][] visited = new boolean[row][col]; // visited[][] - true/false - был/не был посещен.
        Queue<Point> queue = new LinkedList<Point>(); // FIFO-очередь.
        queue.add(new Point(x, y)); // Добавляем точку (x=0, y=0) в FIFO-очередь.
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            Point p = queue.remove(); // Удаляем точку p c FIFO-очередь.
            //checking for all 4 possible movements from current cell px, py and updating the cost value for each valid movements.  
            if (isValid(p.x + 1, p.y, row, col) && !visited[p.x + 1][p.y]) {//down movement  
                queue.add(new Point(p.x + 1, p.y)); // add in queue  
                visited[p.x + 1][p.y] = true; // mark as
