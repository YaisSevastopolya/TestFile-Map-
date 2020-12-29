import FourthGame.FourthGame

class MainMenu(
    private var options: Data,
) {
    fun mainMenu(): Menu {
        println("Главное меню")
        println("1 - Начать")
        println("2 - Титры")
        println("0 - Выйти")
        print(">>> ")
        val playerChoice = readLine() ?: ""
        when (playerChoice) {
            "1" -> return Menu.CHANGE_GAME
            "2" -> return Menu.TITLE
            "0" -> return Menu.EXIT
            else -> println("Введено неверное значение")
        }
        return Menu.DEFAULT
    }

    fun changeGame(): Menu {
        println("Выбор действия")
        println("1 - Калькулятор")
        println("2 - Нарисовать картинку")
        println("3 - Калькулятор №2")
        println("4 - Интерактивная карта")
        println("5 - Вывести символы юникода")
        println("0 - Главное меню")
        print(">>> ")
        val playerChoice = readLine() ?: ""
        when (playerChoice) {
            "1" -> return Menu.START_FIRST_GAME
            "2" -> return Menu.START_SECOND_GAME
            "3" -> return Menu.START_THIRD_GAME
            "4" -> return Menu.START_FOURTH_GAME
            "5" -> return Menu.START_FIFTH_GAME
            "0" -> return Menu.MAIN_MENU
            else -> println("Введено неверное значение")
        }
        return Menu.CHANGE_GAME
    }

    fun firstGame(): Menu {
        val a = FirstGame()
        a.firstGame()
        return Menu.CHANGE_GAME
    }

    fun secondGame(): Menu {
        val a = SecondGame(Data())
        a.secondGame()
        return Menu.CHANGE_GAME
    }

    fun thirdGame(): Menu {
        val a = ThirdGame()
        a.thirdGame()
        return Menu.CHANGE_GAME
    }

    fun fourthGame(): Menu {
        val a = FourthGame()
        a.fourthGame()
        return Menu.CHANGE_GAME
    }

    fun fifthGame(): Menu { //Что бы сделать с юникодом?
        println(options.x)
        println(options.y)
        println("\uD83C\uDCD1")
        println("\u2302")
        println("\u16E5")
        println("\u2656")
        println("\u25E0")
        println("\uD83C\uDF32")
        println("\u224B")
        println("\u2248")
        println("\u007E")
        println("\u2EBE")
        println("\u2EBF")

        return Menu.CHANGE_GAME
    }

    fun title(): Menu {
        println("YaisSevastopolya")
        println(" ")
        println("0 - Главное меню")
        print(">>> ")
        val playerChoice = readLine() ?: ""
        when (playerChoice) {
            "0" -> return Menu.MAIN_MENU
            else -> println("Введено неверное значение")
        }
        return Menu.TITLE
    }
}
