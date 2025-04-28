fun main() {
    print("Введите ваш возраст: ")
    val age = readLine()?.toIntOrNull()

    if (age != null) {
        when {
            age > 18 -> println("Вам уже все можно")
            age == 18 -> println("Ура, Вам 18 лет!")
            age < 18 -> println("Вы еще слишком молоды")
        }
    } else {
        println("Ошибка: введено не число.")
    }
}
