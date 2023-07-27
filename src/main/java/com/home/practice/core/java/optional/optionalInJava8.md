# Optional

* Before Java 8 optional, to avoid NullPointer exception we do null checks
* With Optional class we can neat code without using too many null checks
* With Optional, we can specify alternate values to return or alternate code to run.



1) To create an empty optional

        // to create an empty Optional
        Optional<Person> optionalPerson1 = Optional.empty();
        syso(optionalPerson1);
        // This will print Optional.empty

2) To create Optional from non-null value.
 

    Person person = new Person("Rahul", 15);
    Optional<Person> optionalPerson2 = Optional.of(person);
    System.out.println(optionalPerson2);
    // This will print Optional[Person[name=Rahul, age=15]]

3) To create optional from possible null value. Always use ofNullable.


    Person person = null;
    Optional<Person> optionalPerson2 = Optional.ofNullable(person);
    System.out.println(optionalPerson2);
    // This will print Optional.empty

