fun main() {
    var car = Car("toyota","hilux","blue",14)
    car.capacity
    //number of people
    car.carry(12)
    car.carry(17)
    //identity
    car.identity()
    //
    var bus = Bus("toyota","ashokleyland","blue",4)
    var x = bus.maxTripFare(200.0)
    println(x)
    //
}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people-capacity
        if (people<=capacity){
            println("Carrying $people passengers")
    }
    else
        println("Over capacity by $x people")
        }

        fun identity(){
            println("I am a blue toyota hilux")
        }
   open fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours * 20
        return parkingFees

    }
    }
class Bus( make:String, model:String, color:String, capacity: Int): Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var calculation = capacity*fare
        return calculation
    }
    override fun calculateParkingFees(hours: Int) :Int{
        return calculateParkingFees(hours)

    }
}