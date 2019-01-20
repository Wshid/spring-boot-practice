## Chapter 3


### `@EnableAutoConfiguration`
- 앱에서 필요한 bean을 유추하여 구성하는 클래스
- 내부적으로 `getCandidateConfiguration` 메서드가 동작
    - `META-INF/spring.factories`파일에 property 형식으로 열거된 구성 클래스를 읽어들여 `List<String>` 타입으로 반환

### `@Import` Annotation
- 앞서나온 다른 Annotation 조건이 충족되면, 해당 클래스를 import

### 프로젝트 싫행
- `./mvnw spring-boot:run`


### `@SpringBootApplication`
- 여러 Annotation의 합본
    - `@ComponentScan`
    - `@Configuration`
    - `@EnableAutoConfiguration`

### SpringApplication
- main메서드에서 실행할 스프링 부트 앱의 bootstrap 역할
- 실행클래스를 인자로 넘긴다.
