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





