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