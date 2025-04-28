fun main() {
    print("Введите сумму экспорта: ")
    val export = readLine()?.toIntOrNull()

    print("Введите сумму импорта: ")
    val import = readLine()?.toIntOrNull()

    if (export == null || import == null) {
        println("Ошибка: введено не число.")
        return
    }

    val saldo = export - import

    if (saldo > 0) {
        println("Ваша прибыль составила: $saldo")
    } else if (saldo < 0) {
        println("Ваши убытки составили: ${-saldo}")
    } else {
        println("Баланс нулевой: ни прибыли, ни убытков.")
    }
}
