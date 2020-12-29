package FourthGame.Map

import FourthGame.GameData

data class SeaTile(
    override var data: GameData,
) : WaterTile() {
    override var tileSymbol: String = "≋"
}