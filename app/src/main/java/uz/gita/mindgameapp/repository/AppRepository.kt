package uz.gita.mindgameapp.repository

import uz.gita.mindgameapp.model.QuestionData
import uz.gita.mindgameapp.R

class AppRepository private constructor() {

    val list_animals: ArrayList<QuestionData> = ArrayList()
    val list_foods: ArrayList<QuestionData> = ArrayList()

    companion object {
        private lateinit var instance: AppRepository  // ! null

        fun getInstance(): AppRepository {
            if (!(Companion::instance.isInitialized))
                instance = AppRepository()
            return instance
        }
    }

    init {
        loadData()
    }

    private fun loadData() {
        shuffleFoods()
        shuffleAnimals()
    }

    private fun shuffleFoods() {
        list_foods.add(
            QuestionData(
                R.drawable.cofe1, R.drawable.cofe2, R.drawable.cofe3,
                R.drawable.cofe4, "HFWEREFACLCO", "COFFEE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.cake1, R.drawable.cake2, R.drawable.cake3,
                R.drawable.cake4, "HHWEKOFAQLCD", "CAKE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.bread1, R.drawable.bread2, R.drawable.bread3,
                R.drawable.bread4, "BRAFGOQMNELD", "BREAD"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.pizza1, R.drawable.pizza2, R.drawable.pizza3,
                R.drawable.pizza4, "ZZFGTERAPGQI", "PIZZA"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.apple1, R.drawable.apple2, R.drawable.apple3,
                R.drawable.apple4, "LPTRIOPEAQWR", "APPLE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.fish1, R.drawable.fish2, R.drawable.fish3,
                R.drawable.fish4, "HQMRUTOAISFG", "FISH"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.milk1, R.drawable.milk2, R.drawable.milk3,
                R.drawable.milk4, "KWERIGRMLTOW", "MILK"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.cheese1, R.drawable.cheese2, R.drawable.cheese3,
                R.drawable.cheese4, "HECRUSCAIEFE", "CHEESE"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.pasta1, R.drawable.pasta2, R.drawable.pasta3,
                R.drawable.pasta4, "TRSOWVCLAPAQ", "PASTA"
            )
        )
        list_foods.add(
            QuestionData(
                R.drawable.chicken1, R.drawable.chicken2, R.drawable.chicken3,
                R.drawable.chicken4, "KCOIEQACGLHN", "CHICKEN"
            )
        )
        list_foods.shuffle()
    }

    private fun shuffleAnimals() {
        list_animals.add(QuestionData(
                R.drawable.bear1, R.drawable.bear2, R.drawable.bear3,
                R.drawable.bear4, "FOAERFKBQWLJ", "BEAR"))

        list_animals.add(QuestionData(
            R.drawable.snake1, R.drawable.snake2, R.drawable.snake3,
            R.drawable.snake4, "KEQOBSBJNLAE", "SNAKE"))

        list_animals.add(QuestionData(
            R.drawable.shark1, R.drawable.shark2, R.drawable.shark3,
            R.drawable.shark4, "KEHOBSBRNLAE", "SHARK"))

        list_animals.add(QuestionData(
            R.drawable.owl1, R.drawable.owl2, R.drawable.owl3,
            R.drawable.owl4, "KEHOBSWRNLAE", "OWL"))

        list_animals.add(QuestionData(
            R.drawable.panda1, R.drawable.panda2, R.drawable.panda3,
            R.drawable.panda4, "POILANGJNWDA", "PANDA"))

        list_animals.add(QuestionData(
            R.drawable.monkey1, R.drawable.monkey2, R.drawable.monkey3,
            R.drawable.monkey4, "KLMSWONRKEYQ", "MONKEY"))

        list_animals.add(QuestionData(
            R.drawable.goose1, R.drawable.goose2, R.drawable.goose3,
            R.drawable.goose4, "IRTUESGOVQWO", "GOOSE"))
    }
}
