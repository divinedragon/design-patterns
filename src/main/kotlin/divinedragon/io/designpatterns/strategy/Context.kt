package divinedragon.io.designpatterns.strategy

class Context {

    var strategy: Strategy = Algorithm1()

    fun operation(input: String): String = strategy.algorithm(input)
}
