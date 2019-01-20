## Spring Boot Practice
- 기본 개념 정리 문서입니다.

### `static` vs `template`
- 정적 파일들과, 동적 파일을 구분하기 위함
- 실제 `template` 하위에는 `thymeleaf`와 같은 템플릿 구조의 문서가 담긴다.
- 실제 구동시 같은 **ContextRoot**에 파일이 위치한다.


### log4j, slf4j 설정하기
- [refer](http://sjh836.tistory.com/161)
    - mvn에서 `<properties>`를 사용하여 버전과 같은 내용 지정 가능
    - 로깅부터 시작하기
- [refer](https://jeong-pro.tistory.com/154)
- `%i`
    - 파일명에 변화를 줄 수 있는 패턴
    - 주로 로그 파일의 크기 제한을 둘 때 사용한다

### 배너
- [text ascii generater](http://patorjk.com/software/taag/#p=display&f=Avatar&t=Wshid%20Stat%20Project)
```
./mvnw spring-boot:run -Dbanner.location=classpath:/META-INF/banner.txt`

# application.properties
banner.location=classpath:/META-INF/banner.txt # 배너 경로 설정

spring.main.banner-mode=off # 배너 끄기

app.setBannerMode(Mode.OFF) # 코드 상으로 배너 끄기
```

### `@Component` vs `@Bean`
- [Component vs Bean](https://jojoldu.tistory.com/27)
- `@Bean`
    - 개발자가 컨트롤이 불가능한 경우
    - 외부라이브러리를 Bean으로 등록하고 싶을 때
    - `setter`나 `builder`등을 통해서 사용자가 프로퍼티를 변경해서 생성한 인스턴스를 스프링에게 관리하도록 위임
- `@Component`
    - 개발자가 컨트롤이 가능한경우
    - 직접 컨트롤이 가능한 `Class` 대상으로 함
    - 클래스를 스프링에게 스스로 인스턴스 생성한 후에 등록(bean) 위임
- 이 둘은 각자 선언할 수 있는 타입이 정해져있음


### argsComponent
- Arugment를 처리하는 방법


### Spring Boot Annotation
- [Annotations](https://jeong-pro.tistory.com/151)

### package & run
- `./mvnw package` : `mvn package`와 동일
    - 실제 같은 파일이 떨어지는 것으로 보인다.
- `java -jar target/spring-boot-practice-0.0.1-SNAPSHOT.jar`
    - 파라미터는 jar 파일 뒤에 연접하여 입력하면 된다.

