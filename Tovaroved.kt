open class Tovaroved ( var blok: Boolean, var surname: String, empproduct: String, empprise: Int)
{
    open fun ProductAdd(){
        println("заказ на фамилию $surname принят")
    }
    open fun BlackList(){
        var x: Boolean = true

        if(blok==true){

            while (x==true){
                println("Действительно хотите заблокировать клиента $surname?")
                var answer: String = readln().toString()
                if (answer == "да"){
                    x = false
                }
                if (answer == "нет"){
                    blok = false
                    x = false
                }

            }
        }
    }
}