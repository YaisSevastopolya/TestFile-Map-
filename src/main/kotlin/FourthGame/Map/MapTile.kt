package FourthGame.Map

interface MapTile {
    var tileSymbol: String
    fun printTileSymbol() {
        print(tileSymbol + " ")
    }
}