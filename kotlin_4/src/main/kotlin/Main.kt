fun main(args: Array<String>) {
    print("Введите числа и операцию в формате ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ: ")
    val inp = readln()
    val inpSplit = inp.split(' ');
    val num1 = inpSplit[0].toDoubleOrNull()
    val num2 = inpSplit[1].toDoubleOrNull()
    val op = inpSplit[2]

    if (num1 != null && num2 != null) {
        when (op) {
            "+" -> print(num1 + num2)
            "-" -> print(num1 - num2)
            "*" -> print(num1 * num2)
            "/" -> if (num2 != 0.0) print(num1 / num2) else print("Не делите на ноль пожалуйста я так не умею..")
            else -> print("Ошибка в операции..")
        }
    } else {
        println("Некорректный ввод чисел..")
    }
}