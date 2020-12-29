package FourthGame

class MainMenu {
    fun mainMenu(): EnumMenu {
        println("Главное меню")
        println("1 - Начать")
        println("2 - Продолжить")
        println("0 - Выйти")
        print(">>> ")
        val playerChoice = readLine() ?: ""
        when (playerChoice) {
            "1" -> return EnumMenu.START_GAME
            "2" -> return EnumMenu.CONTINUE_GAME
            "0" -> return EnumMenu.EXIT
            else -> println("Введено неверное значение")
        }
        return EnumMenu.DEFAULT
    }

    fun start(): EnumMenu {
        val game = Game(GameData())
        game.startGame()
        return EnumMenu.MAIN_MENU
    }
}