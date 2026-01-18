## Secondary Constructors

### Kotlin
- Primary constructor is preferred
- Secondary constructors must delegate to primary
- init block always executes

### Java
- Constructor overloading is common
- Constructor chaining done using this()

### Best Practice
- Prefer default parameter values over secondary constructors


## Default Values and Named Arguments

### Kotlin
- Constructor parameters can have default values
- Named arguments improve readability (no order dependency)
- Reduces need for secondary constructors

### Java
- Requires constructor overloading
- Parameter order must be remembered
- More boilerplate

### Best Practice
- Prefer default values over multiple constructors