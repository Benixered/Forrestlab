
import java.util.*
import kotlin.collections.ArrayList

class BoxOfChocolate {


    var chocolates ArrayList<Chocolate> = ArrayList()


    fun pickOne(): Chocolate?{
        if(chocolates.size > 0){
            var randomizer: Int = Random().nextInt(chocolates.size)
            return chocolates.removeAt(randomizer)
        }


}
}