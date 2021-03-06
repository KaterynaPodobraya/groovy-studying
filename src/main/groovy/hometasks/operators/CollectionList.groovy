package hometasks.operators

class CollectionList {
//http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/List.html

    public static void main(String[] args) {
        List<String> names = ["Bob", "Roy", "Mark", "Adam", "Den"]
        List<String> immutableNames = names.asImmutable() //throws UnsupportedOperationException
        names.add("Ben")
        //immutableNames.add("Ben")

    //intersect
    Set<String> names2 = ["Mark", "Adam", "Mary"]
    println(names.intersect(names2))
    println(names.toSpreadMap())
    println(names.toSorted())
    }
}
