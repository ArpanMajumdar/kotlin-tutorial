# Variables

## Read only variable: `val`

``` kotlin
    val question: String = "Life, the universe and everything"
    println("$question ?")
    question = "another question" // Throws compiler error
```

## Mutable variable `var`

``` kotlin
    var answer = 0
    println(answer)
    answer = 10
    println(answer)
```

## Local type inference

``` kotlin
    val greeting = "Hi !"
    var number = 0
```
`String` and `Int` types are inferred.
 