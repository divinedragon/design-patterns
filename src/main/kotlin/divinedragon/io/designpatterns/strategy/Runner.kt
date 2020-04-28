package divinedragon.io.designpatterns.strategy

fun main(args: Array<String>) {

    val context = Context()

    val strategy1 = Algorithm1()
    val strategy2 = Algorithm2()

    val input = "Strategy Pattern"

    context.strategy = strategy1
    println(context.operation(input))

    context.strategy = strategy2
    println(context.operation(input))
}
