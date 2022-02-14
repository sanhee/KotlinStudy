# KotlinStudy



## 4장



- val != 상수변수
  - 코틀린에서 변수는 property
- const val == 상수변수



- 함수 중첩

  - 아 내부에 함수가 있다고, 무조건 실행되는 게 아니었음..

  ```kotlin
  fun sum(a: Int, b: Int): Int{
      var sum = 0
  
      fun calSum(){
          for(i in a..b){
              sum += i
          }
      }
  
      calSum()
      return sum
  }
  ```



- 중위 표현식
  - infix 키워드로 일반적인 함수 호출외에 다른 방식으로 호출 할 수 있는데, 아직 왜쓰는진 모르겠음



- 가변인수 vararg 
  - 이건 개인적으로 자바의 가변인수 방식이 더 편한듯..



- 재귀함수 tailrec
  - 재귀함수를 자바로 변환할 때 while문으로 변경해주는 키워드
  - stackoverflow를 방지할 수 있음
  - 단, 자기자신을 다시 호출하는 구문은 함수의 맨 마지막 작업으로 작성해야 한다.
    - 그냥 나 호출하는 로직외에 다른 거 있으면 안됨



```kotlin
tailrec fun sum(n: Int):Int {
    if(n <= 0) return n
    else return n+ sum(n-1)
}

tailrec fun sum2(n: Int, result: Int = 0):Int {
    if(n <= 0) return n
    else return sum2(n-1, n+result)
}

fun main(){
    println(sum(3))
    println(sum2(3))
}

```

- 자바 변환
  - sum은 tailrec 키워드의 효과를 받지 못함

```java
  public static final int sum(int n) {
      return n <= 0 ? n : n + sum(n - 1);
   }

   public static final int sum2(int n, int result) {
      while(n > 0) {
         int var10000 = n - 1;
         result += n;
         n = var10000;
      }

      return n;
   }
```



- 자바 final != 코틀린 final

```kotlin
class Test{
    final var myVal = 10

    fun some(){
        myVal = 30
    }
}
```



```java
public final class Test {
   private int myVal = 10;

   public final int getMyVal() {
      return this.myVal;
   }

   public final void setMyVal(int var1) {
      this.myVal = var1;
   }

   public final void some() {
      this.myVal = 30;
   }
}
```



- 코틀린은 변숫값이 자동으로 초기화되지 않음





# 5장



- 코틀린은 기초 타입이 없다.
- Int, Double 클래스로 타입을 명시하여 선언한 변수는 그 자체로 객체가 된다. 
  - 따라서, 타입 클래스에 정의된 기초 함수와 프로퍼티를 사용할 수 있다.

```kotlin
fun test() {
    val intData: Int = 10
    val result = intData.minus(6)
}
```



```java
public final class Ex1Kt {
   public static final void test() {
      int intData = 10;
      int result = intData - 6;
   }
}
```



- when

```kotlin
fun case(obj : Any):String{
    return when(obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "unknown"
    }
}
```



- arrayOf()
  - 다양한 타입 넣으면 수정 안됨
  - 책에서는 된다고 돼있는데..찾아보기



- Collection
  - 코틀린에서 컬렉션 타입의 클래스들은 `mutable` 클래스와 `immutable` 클래스로 나뉜다.

    

- 코틀린에서는 모든 것이 객체

  - 기초 타입 X

- 코틀린에서는 기초 데이터 타입에 대한 자동 캐스팅을 제공하지 않는다.

- 코틀린에는 switch-case 구문이 없음 -> when

- 코틀린은 배열을 `[]` 로 선언 하지 않고, `{}`로 초기화 하지 않는다.

  ```kotlin
      var array: Array<Int> = arrayOf(1, 2, 3)
      var array2: Array<Int> = Array(3) { i -> i + 1 }
  ```

- **if expression** 

  - 코틀린의 if는 `expression`으로 사용할 수도 있다.
    - 쉽게 말해 if문이 특정 값을 반환할 수 있음
  - 주의
    - 중괄호 `{}` 를 명시하여 여러 줄로 작성할 경우, if 표현식으로 발생하는 데이터는 맨 마지막에 작성해야 함.

  

  ```kotlin
  val result = if (a > 5) {
      println(1)
      "test"
  } else {
      println(2)
      "else"
  }
  ```

  

- **expression VS statement**

  - expression (표현식)
    - 변수, 상수, 연산자, 함수로 구성되어 무언가 값을 만드는 문장
    - 대입 연산자(`=`) 오른쪽에 명시할 수 있음
    - 함수의 매개변수에 대입할 수 있음
  - statement (구문)
    - 특정 단어나 기호의 조합으로 무언가가 실행되도록 명령을 지시하는 문장
    - 값을 만들진 않음

  ```kotlin
  // expression
  
  10
  10+20
  getLength()
  
  // 대입 연산자 오른쪽에 명시
  val data = 10
  val data2 = 10+20
  val data3 = getLength()
  
  // 함수의 매개변수에 대입
  methodA(10)
  methodB(10+20)
  
  
  // statement
  
  for(i in 1..10) println("hello")
  val data = 10
  
  methodA(for(i in 1..10) println("hello")  // error
  methodA(val data = 10)  // error
  ```

  

- when 구문
  - expression으로 사용할 수도 있음
  - switch-case 업그레이드 버전이라고 생각해도 좋을 듯

```kotlin
    val data = 100

    fun some() : Int{
        return 50
    }

    when (data){
        10, 20 -> println("data is 10 or 20")
        some() -> println("data is 50")
        else -> print("data is big!!")
    }
```

```kotlin
val data = 10;

    val result = when(data){
        1 -> 1
        2 -> 2
        else -> {
            println("10")
            10
        }
    }
```



- 반복문

```kotlin
    var sum: Int = 0
    for(i in 1 .. 3){
        sum += i
    }
    println(sum) // 1+2+3 = 6

    var sum2: Int = 0
    for(i in 1 until 3){
        sum2 += i
    }
    println(sum2) // 1+2 = 3
```



- 컬렉션 타입의 인덱스 뽑기 `indices`

```kotlin
val list = listOf("Hello", "World", "!")

for(i in list.indices){
    println(list[i])
}
```



- 컬렉션 타입의 인덱스 + 값 뽑기 `withIndex`

```kotlin
val list = listOf("Hello", "World", "!") 

for((index, value) in list.withIndex()){
        println("$index, $value")
}
```



```kotlin
for(i in 1 .. 10 step 2){
    println(i)
}
```



# 9장

 

- 함수의 오버라이드와 마찬가지로 프로퍼티도 override 예약어는 open을 내장하는 개념





