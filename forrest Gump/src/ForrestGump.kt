class ForrestGump {

    var chocolateBox: BoxOfChocolate = BoxOfChocolate()

        fun PickChocolate():String{
            var grab = chocolateBox.pickOne()
            if (grab == null){
                return "it could be worse"}
            return "Run Forrest"
        }
}

