package algorithms.implementation

def scanner = new Scanner(System.in)
int K = 1
def paramaters = scanner.nextLine().split(' ').collect { it as int }
def values = scanner.nextLine().split(' ').collect { it as int }
def countDivisibleSumPairs(List<Integer> array, int k, def result) {
    if (array.isEmpty())
        return result
    else {
        def divisibleByK = { (array.head() + it) % k == 0 }
        def rest = array.tail()
        countDivisibleSumPairs(rest, k, result + rest.count(divisibleByK))
    }
}
println(countDivisibleSumPairs(values, paramaters[K],  0))