package FourthGame

class FourthGame {
    fun fourthGame() {
        val game = MainMenu()
        val runGame = Game(data = GameData())

        var menu: EnumMenu = EnumMenu.DEFAULT

        while (true) {
            menu = when (menu) {
                EnumMenu.MAIN_MENU -> game.mainMenu()
                EnumMenu.START_GAME -> game.start()
                EnumMenu.CONTINUE_GAME,
                EnumMenu.DEFAULT -> game.mainMenu()
                EnumMenu.EXIT -> break
                EnumMenu.NEW_STEP -> continue
            }
        }
    }
}