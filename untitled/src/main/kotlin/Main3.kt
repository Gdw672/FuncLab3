fun main() {
    val a = 2
    val b = 6

    println("У вас есть числа: $a и $b")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    print("Выберите действие: ")

    when (readLine()) {
        "1" -> println("Результат сложения: ${a + b}")
        "2" -> println("Результат вычитания: ${a - b}")
        "0" -> println("Вы выбрали ничего не делать.")
        else -> println("Неверный выбор.")
    }
}
