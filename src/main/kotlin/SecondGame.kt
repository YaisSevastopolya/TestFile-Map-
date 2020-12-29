class SecondGame(
    private var options: Data,
) {
    fun secondGame() {
        while (true) {
            println("Нарисовать картинку")
            println("1 - Панда")
            println("2 - Девушка №1")
            println("3 - Девушка №2")
            println("4 - Дракон")
            println("5 - Ленин")
            println("6 - Гомер Симпсон")
            print(">>> ")
            val playerChoice = readLine()
            val check = when (secondGameMenu.values().singleOrNull() { it.menuNumber == playerChoice }) {
                secondGameMenu.FIRST_PRINT -> {
                    println(options.panda)
                    println("Картинка сверху")
                    break
                }
                secondGameMenu.SECOND_PRINT -> {
                    println(options.firstGirl)
                    println("Картинка сверху")
                    break
                }
                secondGameMenu.THIRD_PRINT -> {
                    println(options.secondGirl)
                    println("Картинка сверху")
                    break
                }
                secondGameMenu.FOURTH_PRINT -> {
                    println(options.dragon)
                    println("Картинка сверху")
                    break
                }
                secondGameMenu.FIFTH_PRINT -> {
                    println(options.lenin)
                    println("Картинка сверху")
                    break
                }
                secondGameMenu.SIXTH_PRINT -> {
                    println(options.homer)
                    println("Картинка сверху")
                    break
                }
                null -> {
                    println("Введено неверное значение")
                    break
                }
            }
        }
    }
}