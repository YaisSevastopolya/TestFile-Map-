package FourthGame.Map

import FourthGame.GameData
import java.lang.Integer.max
import kotlin.random.Random

abstract class GroundTile : MapTile {

    abstract var data: GameData

    open var population: Int = 0
    open var wealth: Int = 0
    open var development: Int = 0

    fun growthPop() {
        if (population < development) {
            population += Random.nextInt(1, 10)
        } else {
            population -= Random.nextInt(1, 4)
        }
        population = max(0, population)
    }

    fun growthW() {
        wealth += Random.nextInt(-9, 10)
        wealth = max(0, wealth)
    }

    fun growthD() {
        if (wealth >= data.wealthStab && population > 0) {
            development += Random.nextInt(1, 4)
        } else {
            development -= Random.nextInt(1, 3)
        }
        development = max(0, development)
    }
}