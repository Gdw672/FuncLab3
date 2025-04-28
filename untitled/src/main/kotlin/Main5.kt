fun main() {
    print("Введите первое число: ")
    val a = readLine()?.toIntOrNull()

    print("Введите второе число: ")
    val b = readLine()?.toIntOrNull()

    print("Введите третье число: ")
    val c = readLine()?.toIntOrNull()

    if (a == null || b == null || c == null) {
        println("Ошибка: введено не число.")
        return
    }

    if (a == b || a == c || b == c) {
        println("Ошибка")
    } else {
        val middle = when {
            (a in b..c) || (a in c..b) -> a
            (b in a..c) || (b in c..a) -> b
            else -> c
        }
        println("Среднее число: $middle")
    }
}
