fun main(){
    println("Masukkan bilangan : ")
    val bilangan = readln()

    //string 1,2,3,4,5,
    val bil = bilangan.split(",").toTypedArray()
    for (b in bil){
        println(b)
    }
}