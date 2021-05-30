package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray.toMutableList()

        var i = 1
        while (i < happyArray.size-1){

            if(happyArray.size < 3)
                return happyArray.toIntArray()

            var before: Int = i - 1
            var after: Int = i + 1

            if(happyArray[i]>happyArray[before] + happyArray[after]){
                happyArray.removeAt(i)
                i = 0
            }
            i++
        }

        return happyArray.toIntArray()


        throw NotImplementedError("Not implemented")
    }
}
