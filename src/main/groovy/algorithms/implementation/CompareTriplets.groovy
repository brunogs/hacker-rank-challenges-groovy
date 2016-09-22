package algorithms.implementation

def scanner = new Scanner(System.in)
def pointsA = scanner.nextLine().split(' ').collect { it as int }
def pointsB = scanner.nextLine().split(' ').collect { it as int }
int resultA = 0, resultB = 0
pointsA.eachWithIndex { point, index ->
    if (point > pointsB[index]) resultA++
    if (point < pointsB[index]) resultB++
}
println "$resultA $resultB"