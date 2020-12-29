package FourthGame.Map

import FourthGame.GameData

data class HillTile(
    override var data: GameData,
    private var pop: Int = 0,
    private var weal: Int = 0,
    private var dev: Int = 0,
) : GroundTile() {
    override var tileSymbol: String = "◠"
    override var population: Int
        get() = pop
        set(value) {
            pop = value
            if (pop >= 100) {
                tileSymbol = "⌂"
            }
        }
    override var wealth: Int
        get() = weal
        set(value) {
            weal = value - 2
        }
    override var development: Int
        get() = dev
        set(value) {
            dev = value
        }
    init {
        growthPop()
        growthW()
        growthD()
    }
}