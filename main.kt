fun main(){
    var block: Boolean = false
    println("товаровед:")
    println("Напишите название продукта")
    val product1: String = readln().toString()

    println("Напишите цену продукта")
    val price1: Int = readln().toInt()

    println("Напишите информацию о продукте")
    val info1: String = readln().toString()

    val productOne = InternetShop(product1, price1, info1)

    println("Клиент:")
    productOne.Tovar()
    productOne.ProductInfo()

    println("Введите фамилию:")
    val surname1: String = readln().toString()

    println("Введите количество продукта:")
    val kol: Int = readln().toInt()
    val pokupka1 = kol * price1

    println("Введите количество денег")
    val schet1: Int = readln().toInt()

    val klient1 = Klient(surname1, pokupka1, schet1, kol, product1, price1, info1)
    if(pokupka1>schet1){
        block = true
    }
    println("Товароввед:")
    klient1.BuyInfo()
    klient1.GetInfo()

    val tovaroved1 = Tovaroved(block, surname1, product1, price1)
    tovaroved1.BlackList()
    if(block==true){
        tovaroved1.ProductAdd()
        println("Клиент:")
        klient1.BlockPerson()
    }
    else{
        println("Клиент:")
        klient1.NoBlockPerson()
    }



}