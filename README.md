# Head First Object-Oriented Analytics and Design Book

## Chapter 1
### How to make your software well-designed ?
- Make sure that the software does what the customer needs
- Apply the basic OO principles to add flexibility
- Strive for a maintainable, reusable design 

### Notes 
- `Encapsulation`
  - breaking the application into logical parts
- `Delegation`
  - giving another object responsibility to add or handle a particular task
- `Flexibility`
- `Functionality`

### OOA&D
- to make app WORK
  - `Use Cases` and `diagrams` are helpful to gather customer requirements
- to make app KEEP WORKING
  - `Class` and `sequence` diagrams can help to show the problem in our design, to make sure that the app is robust and well-designed
- to make app UPGRADED (new feature)
  - Using OO techniques like `encapsulation`, `composition` and `delegation` to make the application maintainable and extensible
- to make the app REUSED
  - Using `SOLID principles` will help to make code loosely coupled, and more reusable.
  
________________________________________________________

## Chapter 2 & Chapter 3 (Requirements, Changing Requirements)

- Use case:
  - describes what the system does to accomplish a particular customer goal.
- Each use case has 3 parts:
  - Clear value 
  - Start and stop points
  - External initiator

___________________________________________________________

## Chapter 4 (Taking your software into the real world)
- Analysis helps to make sure your system works well in real-world context
  - `first step`: in analysis is to identify and figuring out potential problems
  - `second step`: plan a solution 
- Analysis and use case let you show customers, managers, and other developers how your system works in a real world context
- Delegation shields objects from implementation changes to other objects to other objects in software
- `Textual analysis`: Looking for nouns in use case to figure out classes and methods.
- Class Diagram: provide an easy way to show the system and it's code (classes, attributes, methods)

___________________________________________________________

## Chapter 5 (Part 1) Good Design = Flexible Software
- Abstract classes are placeholders for actual implementation classes
- The abstract class defines behavior, and the subclasses implement that behavior
- Abstract class: can not have an object or instance
- Coding to an interface, rather than to an implementation makes your software easier to extend.
- By coding to an interface, your code will work with all of interface's subclasses - even ones that have not been created yet.
- Interface: has dual role of defining behavior that applies to multiple types, and also being the preferred focus of classes that use those types
- Encapsulation: responsible for preventing more maintenance problems, by localizing the changes required for the behavior of the object to vary 

### OO Principles
1- Encapsulate what varies.
2- Code to an interface rather than to an implementation.
3- Each class in your application should have only one reason to change.
