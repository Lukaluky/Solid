Library Catalog System Documentation
Overview
This documentation covers the Library Catalog System implemented in Java. The system is designed to manage a library's catalog, including books and magazines, and can be extended to include more item types. It follows SOLID principles to ensure that the system is scalable, maintainable, and extensible.

System Requirements
Java Development Kit (JDK) 8 or above.
Installation
No specific installation steps are required beyond having Java installed. Compile the Java files using your IDE or the Java compiler (javac) from the command line, and run the main class LibraryCLI.

System Design
SOLID Principles
The system is designed around the SOLID principles:

Single Responsibility Principle: Separate classes are used for different purposes (e.g., managing the catalog, handling user input).
Open/Closed Principle: The system is open for extension but closed for modification. New item types can be added without altering existing code.
Liskov Substitution Principle: Interfaces are used to ensure that objects of derived classes can be used in place of objects of their base classes.
Interface Segregation Principle: Small, client-specific interfaces are used rather than large, general-purpose ones.
Dependency Inversion Principle: High-level modules do not depend on low-level modules but on abstractions.
Core Components
ICatalogItem Interface
Defines the structure for all catalog items. Each item must implement a display method.

Book and Magazine Classes
Concrete implementations of ICatalogItem, representing specific types of catalog items.

User, Librarian, and Patron Classes
Define different roles within the system, with Librarian and Patron inheriting from the User base class.

CatalogManager Class
Manages catalog operations such as adding items and listing all items.

CLI (Command Line Interface)
Provides a simple interface for users to interact with the system, allowing them to add items to the catalog and list all items.

Usage
Run the LibraryCLI class. The system will prompt you with options:

Add Book: Adds a new book to the catalog.
Add Magazine: Adds a new magazine to the catalog.
List Items: Displays all items in the catalog.
Exit: Exits the system.
Follow the on-screen instructions to interact with the system.

Extending the System
Adding New Item Types
Create a New Class: Implement the ICatalogItem interface.
Implement Required Methods: Provide implementations for any abstract methods inherited from ICatalogItem.
Update CLI: Add new options in LibraryCLI to handle the addition of new item types.
Adding New User Roles
Create a New Class: Inherit from the User class.
Define Role-Specific Behavior: Implement any specific behavior or permissions for the new role.
Update User Management: If necessary, adjust the system to recognize and utilize the new user role.
Troubleshooting
Compilation Errors: Ensure all files are saved and that Java is correctly installed.
Runtime Errors: Check the console for any specific error messages. Errors when adding items usually indicate a mismatch in expected input.
Conclusion
This document provides an overview of the Library Catalog System, its design, and instructions for use and extension. For further assistance or to report issues, please contact the system administrator or developer.






