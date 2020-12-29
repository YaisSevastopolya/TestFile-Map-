package FourthGame

import FourthGame.Map.GroundTile
import FourthGame.Map.MapTile
import kotlin.random.Random

class Game(
    private var data: GameData,
) {
    var step: Int = 0
    var actualMap: List<MutableList<MapTile>> = listOf()

    fun startGame(): EnumMenu {
        println("Выбор карты:")
        println("1 - тестовая карта 2х2")
        println("2 - тестовая карта 5х5")
        println("3 - карта Крыма 28х68")
        print(">>> ")
        val playerChoice = readLine() ?: ""
        when (playerChoice) {
            "1" -> actualMap = data.mapTileTest
            "2" -> actualMap = data.mapA
            "3" -> actualMap = data.mapCr
            else -> println("Введено неверное значение")
        }
        while (true) {
            step += 1
            println("Текущий ход №" + step)
            for ((rowIndex, row) in actualMap.withIndex()) {
                for ((columnIndex, tile) in row.withIndex()) {
                    tile.printTileSymbol()
                    when (tile) {
                        is GroundTile -> {
                            tile.growthPop()
                            tile.growthW()
                            tile.growthD()
                            val popM = Random.nextInt(1, 10)
                            val a = actualMap.size - 1
                            val b = actualMap[0].size - 1
                            if (tile.population > tile.development) {
                                when (Random.nextInt(1, 5)) {
                                    1 -> if (columnIndex > 0) {
                                        popMigration(tile, columnIndex - 1, rowIndex, popM)
                                    }
                                    2 -> if (rowIndex > 0) {
                                        popMigration(tile, columnIndex, rowIndex - 1, popM)
                                    }
                                    3 -> if (columnIndex < b) {
                                        popMigration(tile, columnIndex + 1, rowIndex, popM)
                                    }
                                    4 -> if (rowIndex < a) {
                                        popMigration(tile, columnIndex, rowIndex + 1, popM)
                                    }
                                }
                            }
                        }
                    }
                }
                println()
            }
            println("1 - следующий ход")
            println("2 - запросить данные")
            println("0 - выйти в меню")
            print(">>> ")
            val playerChoiceQ = readLine() ?: ""
            when (playerChoiceQ) {
                "1" -> continue
                "2" -> {
                    tileQuestion()
                    continue
                }
                "0" -> return EnumMenu.EXIT
                else -> println("Введено неверное значение")
            }
            return EnumMenu.DEFAULT
        }
    }
    fun tileQuestion() {
        while (true) {
            println("1 - запрос данных по координатам")
            println("2 - следующий ход")
            print(">>> ")
            val playerChoice = readLine() ?: ""
            when (playerChoice) {
                "1" -> {
                    println("Введите координату по горизонтали")
                    val x = (readLine() ?: "0").toInt()
                    println("Введите координату по вертикали")
                    val y = (readLine() ?: "0").toInt()
                    println (actualMap[x-1][y-1])
                }
                "2" -> break
                else -> println("Введено неверное значение")
            }
        }
    }

    fun popMigration(current: GroundTile, x: Int, y: Int, popM: Int) {
        val tile = actualMap[y][x]
        if (tile is GroundTile) {
            current.population -= popM
            tile.population += popM
        }
    }
}