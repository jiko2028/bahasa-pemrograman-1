fun main(){
    val nilai = 70

    when (nilai) {
        100 -> println("Sempurna")
        90,91,92,93,94,95,96,97,98,99 -> print("Sangat Baik")
        in 80..90 -> print("Baik")
        !in 0..100 ->("Nilai tidak valid")
        else -> print("Cukup")
    }    
}