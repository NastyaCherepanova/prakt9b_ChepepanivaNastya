open class InternetShop(var product: String, var price: Int, var information: String) {
    open fun Tovar(){
    println("продукт:$product. цена:$price")
    }
    open fun ProductInfo(){
        println("продукт:$product. Информация:$information")
    }
}