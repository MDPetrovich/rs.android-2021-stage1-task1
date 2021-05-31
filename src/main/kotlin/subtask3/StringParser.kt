package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var s = emptyArray<String>()
        for (i in inputString.indices) {
            if (inputString[i] =='('){
                var st = ""
                var h = i+1
                for (j in inputString.indices){
                    if (inputString[h] !=')') {
                        st += inputString[h]
                        println(st)
                        h += 1
                    }
                }
                s += st
            }
            if (inputString[i] =='<'){
                var st = ""
                var h = i+1
                for (j in inputString.indices){
                    if (inputString[h] !='>') {
                        st += inputString[h]
                        println(st)
                        h += 1
                    }
                }
                s += st
            }
            if (inputString[i] =='['){
                var st = ""
                var h = i+1
                for (j in inputString.indices){
                    if (inputString[h] !=']') {
                        st += inputString[h]
                        println(st)
                        h += 1
                    }
                }
                s += st
            }
        }
        return s
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