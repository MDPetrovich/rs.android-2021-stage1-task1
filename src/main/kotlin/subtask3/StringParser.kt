package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val firstEl1 = "("
        val secondEl1 = ")"
        val firstEl2 = "["
        val secondEl2 = "]"
        val firstEl3 = "«"
        val secondEl3 = "»"

        var resArr = mutableListOf<String>()

        if(inputString.contains(firstEl1)&&inputString.contains(secondEl1)&&inputString.indexOf(firstEl1)<inputString.lastIndexOf(secondEl1))
        {
            var substrFirst = inputString.substring(inputString.indexOf(firstEl1), inputString.lastIndexOf(secondEl1)+1)
            println(substrFirst)
            while(substrFirst.contains(firstEl1)&&substrFirst.contains(secondEl1)&&substrFirst.indexOf(firstEl1)<substrFirst.lastIndexOf(secondEl1)){
                resArr.add(substrFirst.substring(substrFirst.indexOf(firstEl1)+1, substrFirst.indexOf(secondEl1)))
                if(substrFirst.indexOf(secondEl1)==substrFirst.lastIndexOf(secondEl1))
                    break
                substrFirst = substrFirst.substring(substrFirst.indexOf(secondEl1)+1, substrFirst.lastIndexOf(secondEl1))
            }
        }
        if(inputString.contains(firstEl2)&&inputString.contains(secondEl2)&&inputString.indexOf(firstEl2)<inputString.lastIndexOf(secondEl2))
        {
            var substrFirst = inputString.substring(inputString.indexOf(firstEl2), inputString.lastIndexOf(secondEl2)+1)
            println(substrFirst)
            while(substrFirst.contains(firstEl2)&&substrFirst.contains(secondEl2)&&substrFirst.indexOf(firstEl2)<substrFirst.lastIndexOf(secondEl2)){
                resArr.add(substrFirst.substring(substrFirst.indexOf(firstEl2)+1, substrFirst.indexOf(secondEl2)))
                if(substrFirst.indexOf(secondEl2)==substrFirst.lastIndexOf(secondEl2))
                    break
                substrFirst = substrFirst.substring(substrFirst.indexOf(secondEl2)+1, substrFirst.lastIndexOf(secondEl2))
            }
        }

        if(inputString.contains(firstEl3)&&inputString.contains(secondEl3)&&inputString.indexOf(firstEl3)<inputString.lastIndexOf(secondEl3))
        {
            var substrFirst = inputString.substring(inputString.indexOf(firstEl3), inputString.lastIndexOf(secondEl3)+1)
            while(substrFirst.contains(firstEl3)&&substrFirst.contains(secondEl3)&&substrFirst.indexOf(firstEl3)<substrFirst.lastIndexOf(secondEl3)){
                resArr.add(substrFirst.substring(substrFirst.indexOf(firstEl3)+1, substrFirst.indexOf(secondEl3)))
                if(substrFirst.indexOf(secondEl3)==substrFirst.lastIndexOf(secondEl3))
                    break
                substrFirst = substrFirst.substring(substrFirst.indexOf(secondEl3)+1, substrFirst.lastIndexOf(secondEl3))
            }
        }


        return resArr.toTypedArray()
        throw NotImplementedError("Not implemented")
    }
}
/*3
) Синтаксический анализатор строк
Дана строка с открывающими-закрывающими скобками, то есть [], <> или (). Найдите все подстроки , которые встречаются в скобках.
Обратите внимание, что подстрока должна находиться между первой встреченной открытой и закрывающей скобками. Например, для «(вот) какой-то текст)» ввод будет «вот», а не «(вот) какой-то текст)» из-за второй скобки «)».
Вход: строка, которая может содержать следующие скобки: [], <>, ()
Выход: массив строк. Каждый элемент массива должен содержать подстроку между открывающей-закрывающей скобкой.
Пример ввода:
«Это <an> [пример] (строка)»
Пример вывода:
[«Ан», «пример», «строка»]
Nota Bene: Не забывайте обрабатывать ситуацию с вложенными скобками (например, «(ipsum [dolor <] amet)>»).
*/