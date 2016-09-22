package algorithms.implementation

int ROTATIONS = 1
int QUERIES_SIZE = 2

def scanner = new Scanner(System.in)
def parameters = scanner.nextLine().split(' ').collect { it as int }
def values = scanner.nextLine().split(' ').collect { it as int } as LinkedList

parameters[ROTATIONS].times {
    def last = values.removeLast()
    values.addFirst(last)
}

parameters[QUERIES_SIZE].times {
    int queryIndex = scanner.nextInt()
    println(values.get(queryIndex))
}