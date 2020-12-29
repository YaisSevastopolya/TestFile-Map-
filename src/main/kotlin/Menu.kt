enum class Menu {
    MAIN_MENU,
    CHANGE_GAME,
    START_FIRST_GAME,
    START_SECOND_GAME,
    START_THIRD_GAME,
    START_FOURTH_GAME,
    START_FIFTH_GAME,
    TITLE,
    DEFAULT,
    EXIT,
}

enum class secondGameMenu(val menuNumber: String) {
    FIRST_PRINT("1"),
    SECOND_PRINT("2"),
    THIRD_PRINT("3"),
    FOURTH_PRINT("4"),
    FIFTH_PRINT("5"),
    SIXTH_PRINT("6"),
}
