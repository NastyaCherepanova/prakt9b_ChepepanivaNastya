open class Klient (var surname: String, var pokupka: Int, var schet: Int, var kol: Int, empproduct: String, empprice: Int, empinformation: String){
    open fun GetInfo(){
        println("Фамилия: $surname Чек ценой:$pokupka Баланс: $schet")
    }
    open fun BuyInfo(){
        println("Человек: $surname покупает $pokupka в количестве $kol")
    }
    open fun BlockPerson(){
        println("$surname, Вы заблокированы")
    }
    open fun NoBlockPerson(){
        println("$surname, спасибо за покупку, будем ждать вас снова")
    }
}