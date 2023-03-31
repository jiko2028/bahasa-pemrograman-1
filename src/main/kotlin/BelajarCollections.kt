fun main(){
    val hari = listOf("Senin", "Selasa", "Rabu", "Kamis",null, null, "Senin")

    println(hari)
    println(hari[0])
    println(hari.get(2))

    val hariMutable = mutableListOf("Senin", "Selasa", "Rabu", "Kamis",null, null, "Senin")
    println(hariMutable)
    hariMutable[4] = "Jumat"
    hariMutable.set(5, "Sabtu")
    println(hariMutable)

    hariMutable.forEach{
        print("$it, ")
    }
//    hariMutable.removeAt(6)
//    println(hariMutable)
//    hariMutable.add("Minggu")
//    println("Hari mutable = $hariMutable")
}