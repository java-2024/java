# JVM ( Java Virtual Machine ) ?
## JVM 정의
- application vs Java application
![image](https://github.com/java-2024/java/assets/167167891/28801055-aa7f-4979-9d6b-22d9cd096c33)
- 일반 프로그램은 운영체제 위헤서 실행됩니다.
- 자바 프로그램은 JVM위에서 실행되기때문에 운영체제가 JVM을 실행시키고 JVM이 자바 프로그램을 실행시킵니다.
- 자바 프로그램의 실행 구조 :JVM이 설치되어 있다면 운영체제에 관계하지 않고 자바 프로그램은 실행 가능합니다.(운영체제 독립적)
    ![image](https://github.com/java-2024/java/assets/167167891/3d76ddb1-9606-4445-b0bf-dd6e4d8237e5)
- JVM(자바가상머신)은 운영체제에서 구동되며, 자바 프로그램을 실행시키는 역할을 하는 소프트웨어 입니다.
  
## JVM 구조
![image](https://github.com/java-2024/java/assets/167167891/9e787c9f-bb28-48e0-a126-af4f3d287cd6)
![image](https://github.com/java-2024/java/assets/167167891/1655a0d5-b2a6-4253-a840-83dbeb17bc8f)
> 자바는 동적으로 클래스를 읽어오므로, 프로그램이 실행 중인 런타임에서야 모든 코드가 자바 가상 머신과 연결됩니다. 이렇게 동적으로 클래스를 로딩해주는 역할을 하는 것이 바로 클래스 로더(class loader)입니다. 자바에서 소스를 작성하면 .java파일이 생성되고 .java소스를 컴파일러가 컴파일하면 .class파일이 생성되는데 클래스 로더는 .class 파일을 묶어서 JVM이 운영체제로부터 할당받은 메모리 영역인 Runtime Data Area로 적재합니다.
- Execution Engine: Method Area에 배치된 bytecode를 읽어들여 프로그램 실행
  

## 자바 프로그램 실행과정
![image](https://github.com/java-2024/java/assets/167167891/fc93c81b-778b-4fcc-9251-4a9232bcd863)
1. 자바로 개발된 프로그램을 실행하면 JVM은 OS로부터 메모리를 할당합니다.
2. 자바 컴파일러(javac)가 자바 소스코드(.java)를 자바 바이트코드(.class)로 컴파일합니다.
3. Class Loader를 통해 JVM Runtime Data Area로 로딩합니다.
4. Runtime Data Area에 로딩 된 .class들은 Execution Engine을 통해 해석합니다.
5. 해석된 바이트 코드는 Runtime Data Area의 각 영역에 배치되어 수행하며 이 과정에서 Execution Engine에 의해 GC의 작동과 스레드 동기화가 이루어집니다.

## JVM 메모리 영역(Runtime Data Area)
![image](https://github.com/java-2024/java/assets/167167891/da457135-5ccf-4666-9c76-7953c9474c49)
- JVM 메모리 영역은 Thread가 공유하는 영역인지 아닌지에 따라 구분 됩니다.
  - Method, Heap : Thread가 공유하는 영역
  - Stack, PC Register, Native Method Stack : Thread가 공유 할 수 없는 독립적인 영역
### 1. Method Area( = Static Area, Class Area )
> 클래스 멤버 변수의 이름, 데이터 타입, 접근 제어자 정보와 같은 각종 필드 정보들과 메서드 정보, 데이터 Type 정보, Constant Pool, static변수, final class 등이 생성되는 영역입니다.
![image](https://github.com/java-2024/java/assets/167167891/607e4bd6-3211-4e13-a6e8-70d9c17d2502)

### 2.Heap Area 
> new 키워드로 생성된 instance와 배열이 저장되는 동적 메모리 공간으로 Garbage Collection( JVM의 Heap 영역에서 동적으로 할당했던 메모리 영역 중 필요 없게 된 메모리 영역을 주기적으로 삭제하는 프로세스를 말합니다)가 관리하는 메모리 영역으로 generation으로 나눠 객체가 저장됩니다.
> 해당 영역의 메모리가 가득차면 OutOfMemoryError가 발행하고 Method Area와 같이 Thread가 공유하는 영역이므로 Thread safe하지않아 동시성 이슈에 유의해야 합니다.
- 가비지 컬렉션의 대상이 되는 객체들
![image](https://github.com/java-2024/java/assets/167167891/905c43a9-b350-4414-9afe-2e2fbc4230f3)
> 객체들은 실질적으로 Heap영역에서 생성되고 Method Area이나 Stack Area등 Root Area에서는 Heap Area에 생성된 객체의 주소만 참조하는 형식으로 구성됩니다. 하지만 이렇게 생성된 Heap Area의 객체들이 메서드가 끝나는 등의 특정 이벤트들로 인하여 Heap Area 객체의 메모리 주소를 가지고 있는 참조 변수가 삭제되는 현상이 발생하면
위의 그림에서의 빨간색 객체와 같이 Heap영역에서 어디서든 참조하고 있지 않은 객체들이 발생하게 됩니다. 이러한 객체들을 Unreachable하다고 하며 주기적으로 가비지 컬렉터가 제거해줍니다.
> Reachable : 객체가 참조되고 있는 상태
> Unreachable  : 객체가 참조되고 있지 않은 상태 (GC의 대상이 됨) 

### 3. Stack Area
> 파라미터, 지역변수, 참조변수, 리턴 값 등이 임시로 저장되는 공간.
> 
### 4. PC register (Program Counter register)
> Thread가 생성될 때마다 생성되는 영역으로 프로그램 카운터, 즉 현재 스레드가 실행되는 부분의 주소와 명령을 저장하고 있는 영역.

### 5. Native Method Stack
> 자바 이외의 언어(C, C++, 어셈블리 등)으로 작성된 네이티브 코드(기계어)를 실행할 때 사용되는 메모리 공간. 메모리 할당과 해제를 직접 해야하는 C, C++은 메모리를 세부적으로 control 하는데 용이합니다. 이런 코드들을 자바에 import 해서 사용하는 경우가 있고 이때 Native Method Stack 영역이 사용됩니다.
  
# JDK ?, JRE ?
> JRE(Java Runtime Environment)란? JRE는 자바 실행 환경(Java Runtime Environment)의 약자로 자바로 만들어진 프로그램을 실행시키는데 필요한 라이브러리들과 각종 API, 그리고 자바 가상 머신 (JVM)이 포함되어 있습니다. JRE는 자바로 "개발(쓰기)은 안되고 실행(읽기)만 된다"라고 생각해주시면 될 것 같습니다.
> JDK는 자바 개발키트(Java Development Kit)의 약자로 이름 그대로 개발자들이 자바로 개발하는 데 사용됩니다. JDK안에는 개발 시 필요한 라이브러리들과 javac, javadoc 등의 개발 도구들을 포함되어 있고 개발을 하려면 당연히 실행도 시켜줘야 하기 때문에 JRE (Java Runtime Environment)도 함께 포함되어 있습니다.
![image](https://github.com/java-2024/java/assets/167167891/aa8f4eac-2d0b-4266-8da6-da5ff4c67ef1)
### 사용자 디렉터리 구성요소
- bin : 자바 개발, 실행에 필요한 도구와 유틸리티 명령
- conf : 여러 종류의 패치 파일
- include : 네이티브 코드 프로그래밍에 필요하는 C언어 헤더 파일
- jmods : 컴파일된 모듈 파일들
- legal : 각 모듈에 대한 저작권과 라이선스 파일
- lib : 실행 시간에 필요한 라이브러리 클래스들
- 
### bin 디렉터리에 들어 있는 개발 소프트웨어
- javac : 자바 컴파일러로 자바 소스를 바이트 코드로 변환
- java : 자바 프로그램 실행기 → 자바 가상 기계를 작동시켜 자바 프로그램 실행
- javadoc : 자바 소스로부터 HTML 형식의 API 도큐먼트 생성
- jar : 자바 클래스 파일을 압축한 자바 아카이브 파일(.jar) 생성, 관리
- javap : 클래스 파일의 바이트 코드를 소스와 함께 보여주는 디어셈블러

# JDK 설치
[JDK 17 다운로드](https://www.oracle.com/java/technologies/downloads/#jdk17-windows )
![image](https://github.com/java-2024/java/assets/167167891/684705a7-c74f-4cf0-8ab4-5fd8238732ce)

# IntelliJ 설치
[IntelliJ 최신버전 다운로드 ] (https://www.jetbrains.com/ko-kr/idea/download/?section=windows)
![image](https://github.com/java-2024/java/assets/167167891/d31b1ac2-d59c-4ea2-9eea-5cb3b45764df)
![image](https://github.com/java-2024/java/assets/167167891/cad0234f-260f-4ad6-a410-72ed9c40fb11)

## intelliJ GitHub 연동
[intelliJ GitHub 연동](https://velog.io/@zerokick/IntelliJ-IntelliJ-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-GitHub-%EC%97%B0%EB%8F%99%ED%95%98%EA%B8%B0))
  
## Plug-In 설치
- Mermaid : erDiagram, Class Diagram, Sequence Diagrm
![image](https://github.com/java-2024/java/assets/167167891/56ce9ba1-1954-493a-935c-e58440d963be)


