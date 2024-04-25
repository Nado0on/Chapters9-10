Chapter 9 - 
Object Management in Java
- Objects reside on the garbage collection heap. When they are not in use, they are cleaned up by the garbage collector.
- The location of a variable depends on whether it is an instance variable or a local variable (also known as a stack variable).
  - The stack holds method invocations and local variables.
  - The heap is where all objects exist.

Variable Types
- Instance Variables: Declared within a class but outside any method, constructor, or code block. They:
  - Are created when an object is instantiated.
  - Are accessible by all methods in the class.
  - Provide each instance of the class with a unique copy.
  - Represent an object's properties and can hold different values for each class instance.
  - Reside on the heap within the object they belong to.

- Local Variables: Declared within a method, including method parameters. They:
  - Are temporary and only exist until the method execution is completed.

Object Declaration and Constructors
- To declare an object, the syntax is: `Duck myDuck = new Duck();`
  - The parentheses `()` indicate a call to the `Duck` constructor.
- A constructor can only be invoked with the `new` keyword externally. However, one constructor can call another constructor within the same class, subject to certain conditions.
- If you don't provide a constructor, the Java compiler creates a default constructor. If you write your own, it initializes the object.
- Constructors initialize an object's state (its fields).
- Constructors are not inherited from a superclass.
- Constructors can accept arguments, which are then used to create the object with specific attributes.
- Known parameters can be assigned within the constructor.
- The constructor's name must match the class name.
- Example of creating an object with a constructor that has parameters: `Duck duck1 = new Duck(15);`
- Overloaded Constructors: Constructors that have the same name but different parameter lists.

 Initialization and Constructors
- Object initialization typically occurs within the constructor, where initial values are assigned to the instance variables.
- A no-argument constructor provides default values for the instance variables. Avoid using a no-arg constructor when specific values are required.
- Constructors can have public, private, or package-private (default) access.
- All constructors in an object's inheritance chain are executed when a new instance is created.
- Even abstract classes have constructors, although they cannot be instantiated with `new`.

Superclasses and Inheritance
- The superclass constructor can only be called with `super()`. If not explicitly called, the compiler inserts it automatically at the beginning of each constructor.
- Order of Initialization: The superclass constructor is executed before the subclass constructor.
- Mandatory Super Calls: If a superclass does not have a no-argument constructor and the subclass does not call another constructor explicitly, this will cause a compile-time error.
- Flexibility: The `super()` call can specify which superclass constructor to invoke.
- The call to `super()` must be the first statement in a constructor.
- A constructor can include a call to either `super()` or `this()`, but not both.

Object Lifetime
- An object's lifespan is tied to the lifetime of references to it. If any reference is active, the object remains on the heap.

Chapter 10 Notes: Static and Final Keywords
- The `static` keyword allows a method to run without an instance of the class.
- A static method is called using the class name (e.g., `Math.min(88, 86);`).
- A private modifier restricts access to within the class only.
- Static methods cannot access non-static instance methods.
- Static variables are shared across all instances of a class.
- All static variables are initialized before any object of that class is created.
- A variable declared `final` cannot change its value after it has been initialized.
- The `final` keyword can modify non-static variables, including instance variables, local variables, and method parameters.
- If a class is declared as `final`, its methods do not need to be individually marked as final.

Autoboxing and Parsing
- When you need to treat a primitive as an object, you can use its wrapper class.
- Autoboxing automatically converts primitives to their corresponding wrapper objects.
- Parsing allows conversion between strings and primitive types.
- Example of formatting a number with commas: `String s = String.format("%,d", 100000000);`

Formatting and Date Handling
- Formatting instructions specify how an argument should be formatted and precede the argument in method calls.
- A format specifier can have various components and is used for formatting numbers and dates.
- The `Date` class is used for timestamps representing the current time.
- Different calendar types (Gregorian, Buddhist, Islamic, Japanese) can be used in Java.
- `getInstance()` retrieves an instance of the which is typically the default GregorianCalendar.
