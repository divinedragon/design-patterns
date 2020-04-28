# design-patterns

Design Patterns are classified into three broad categories.

* [Behavioural](#behavioural-design-patterns)
* [Creational](#creational-design-patterns)
* [Structural](#structural-design-patterns)

## Behavioural Design Patterns
### [Strategy Pattern](https://en.wikipedia.org/wiki/Strategy_pattern)

This pattern allows a client/program to switch between various algorithms available at runtime. It is probably the most
used pattern in software development.

Examples of Strategy Pattern

- Adding Fly behaviour to Animal class hierarchy
- Dragon Slayer that can use one of the many strategies to kill a dragon
- Similar to above - A player can use various weapons
- Encrypting a file based on the file size - InMemory vs Paged
- Sorting values using various algorithms - BubbleSort, QuickSort, MergeSort
- Storing information in a database - Today we store data in Postgres, tomorrow we save to Cassandra(Dao classes)
- Outputting records - to JSON, XML, CSV, RDF
- Appenders, Layouts and Filters - Log4j, LogBack, etc
- Transportation to Airport - You can take a Bus, Personal Car, Taxi, Hitch a Ride
- Validation of Input based on its type - NumberValidator, EmailValidator, PhoneValidator, etc
- 

## Creational Design Patterns

## Structural Design Patterns
