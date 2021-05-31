package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var trueRest = (bill.sum()-bill[k])/2
        if(b == trueRest)
            return "Bon Appetit"
        if(trueRest-b>0)
        return (trueRest-b).toString()
        return (b-trueRest).toString()
        throw NotImplementedError("Not implemented")
    }
}
/*
**Input:**
 - *bill*: An array of integers representing the cost of each item ordered
 - *k*: An integer representing the zero-based index of the item Anna doesn't eat
 - *b*: The amount of money that Anna contributed to the bill

**Output:**
If Brian did not overcharge Anna, return *"Bon Appetit"*; otherwise, return
the difference (i.e., *b_charged - b_actual*) that Brian must refund to Anna. This will
always be a String (e.g. *"10"*).
*/