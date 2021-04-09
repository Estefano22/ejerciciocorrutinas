import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {

        this.launch {
            for (i in 1 .. 10) {
                println(i)
                delay(1000)
            }

        }

        this.launch {
            repeat(2){
                delay(5000)
                println("Sigo Vivo")
            }
        }
        
    }

    println("He terminado")
    Thread.sleep(15000)

}