class FirstGame {

    fun firstGame(): Double {
        println("Введите первое число")
        val num1: Double = getNumber()
        println("Выберите действие")
        println("+ - * /")
        val op: Char = getOperation()
        println("Введите второе число")
        val num2: Double = getNumber()

        val result: Double = calc(num1, num2, op)
        println(result)
        return result
    }

    fun getNumber(): Double {
        print(">>> ")
        val num = readLine()?.toDoubleOrNull()
        if (num == null) {
            println("Ошибка ввода")
            return firstGame()
        } else return num
    }

    fun getOperation(): Char {
        print(">>> ")
        val op = readLine()
        when (op) {
            "+" -> return '+'
            "-" -> return '-'
            "*" -> return '*'
            "/" -> return '/'
            null -> {
                println("Ошибка ввода")
                return '0'
            }
            else -> {
                println("Ошибка ввода")
                return '0'
            }
        }
    }

    fun calc(num1: Double, num2: Double, op: Char): Double {
        val x: Double
        when (op) {
            '+' -> {
                x = num1 + num2
                return x
            }
            '-' -> {
                x = num1 - num2
                return x
            }
            '*' -> {
                x = num1 * num2
                return x
            }
            '/' -> {
                x = num1 / num2
                return x
            }
            else -> {
                println("Ошибка ввода")
                return 0.0
            }
        }
    }
}