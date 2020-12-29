fun main() {
    start()
}

fun start() {
    val game = MainMenu(Data())

    var menu: Menu = Menu.DEFAULT

    while (true) {
        menu = when (menu) {
            Menu.MAIN_MENU -> game.mainMenu()
            Menu.CHANGE_GAME -> game.changeGame()
            Menu.START_FIRST_GAME -> game.firstGame()
            Menu.START_SECOND_GAME -> game.secondGame()
            Menu.START_THIRD_GAME -> game.thirdGame()
            Menu.START_FOURTH_GAME -> game.fourthGame()
            Menu.START_FIFTH_GAME -> game.fifthGame()
            Menu.TITLE -> game.title()
            Menu.DEFAULT -> game.mainMenu()
            Menu.EXIT -> break
        }
    }
}
