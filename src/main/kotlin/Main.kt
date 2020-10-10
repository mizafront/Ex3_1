fun main() {
    val previousPurchase = 400
    var discountedAmount : Int
    println(""" 
        Цена за покупку музыки 250р
        Сколько собираетесь купить?
    """.trimIndent())
    val countItem = readLine()!!.toInt()
    println("Вы постоянный клиент?")
    val vipPeople = readLine()

    val purchase = countItem * 250 * 100

    if (previousPurchase > 10_001){
        discountedAmount = (purchase - (purchase * 0.05)).toInt()
    }else if (previousPurchase > 1_001){
        discountedAmount = purchase - 100
    }else {
        discountedAmount = purchase
    }

    if (vipPeople == "Да"){
        discountedAmount = (discountedAmount - (discountedAmount * 0.01)).toInt()
    }

    println("Цена покупки ${discountedAmount / 100 } р.")
}
