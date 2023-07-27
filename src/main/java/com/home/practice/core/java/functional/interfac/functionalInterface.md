Functional Interface:

1) Must have only one abstract method
2) can have default and static


    @FunctionalInterface
    public interface PersonInterface {
    
        int computeYearlySalary(int a, int b);
    }

Four type:

1) Function:
    - Takes Two argument Function<Integer, Long>
    - Integer is input and Long is output
    - Check FunctionTest class
   
    BiFunction: 
    - Takes 2 input argument and 1 output argument


2) Predicate:
    - Takes one Input Argument and return boolean
    
  BiPredicate: Takes 2 argument   

  IntPredicate: Takes integer argument
   
        // Int predicate
        IntPredicate intPredicate = x -> x > 0;
        Stream.iterate(-5, x -> x+1).limit(10).filter(x -> intPredicate.test(x)).forEach(System.out::println);
        syso(intPredicate.test(3)) // true

    - We can use and/or/negate with predicate

            IntPredicate intPredicateGreaterThan0 = x -> x > 0;
            IntPredicate intPredicateGreaterThan10 = x -> x > 10;
            System.out.println(intPredicateGreaterThan0.and(intPredicateGreaterThan10).test(3)); // false

3) Consumer:
    - Takes one input argument and doesn't return 
    - forEach accepts consumer and doesn't return any thing
   

        // Consumer
        Consumer<Integer> consumerPredicatePrintSquare = x -> System.out.println(x*x);
        Stream.iterate(1, x -> x+1).limit(5).forEach(consumerPredicatePrintSquare);

        // Bi Consumer
        BiConsumer<Integer, Integer> multiply = (x, y) -> System.out.println(x*y);
        Stream.iterate(1, x -> x+1).limit(5).forEach(x -> multiply.accept(x, x+1));

4) Supplier:
    - No input parameter, return value of type provide in supplier

            Supplier<Integer> returnRandomNInteger = () -> new Random().nextInt();
            System.out.println(returnRandomNInteger.get());
            System.out.println(returnRandomNInteger.get());