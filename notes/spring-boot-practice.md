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
    