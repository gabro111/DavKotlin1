import java.lang.Math.floor
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.reflect.typeOf

fun main() {

        print("enter Number:");
        val stringInput = readLine();

    if (stringInput != null) {
        println(DavFunc(stringInput.toInt()))
    }



}



fun DavFunc (x: Int): Int {
    var sum =0;
    var nam=1;
    var xToChange =x;
    for(i in 1..x.toString().length){
        sum += xToChange%10;
        if(xToChange % 10>0) {
            nam *= (xToChange % 10);
        }
        xToChange /= 10;

    }
    return  nam-sum;

}


