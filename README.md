# 문자열 사칙 연산 계산기

## 기능 요구사항

* 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
* 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
* 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
* 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
* 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

### STEP1 문자열계산기 기능 요구사항 정리 
* 문자열을 입력받는 View 생성
  * [x] 공백 문자열로 구분
  * [x] 숫자와 연산자로 분리해서 반환
  * [x] 나눗셈의 경우 분모로 0을 받을 수 없음
* 계산 수행 객체
  * [x] 숫자 2개와 연산자하나를 통해 계산
  * [x] 연산자별로 다른 계산방식을 가짐
* [x] 계산 결과 출력

### 문자열 계산기 리팩터링 요구사항
* [x] try-catch 대신 예외 발생 전에 오류 잡기
* [x] BinaryOperator<> 사용해보기
* [x] 문자열계산기를 무상태 객체로 리팩터링 해보기
* [x] ConverUtil 대신 SRP를 지킬 수 있는 객체로 만들어보기

# STEP 2 : 로또(자동)

## 기능 요구사항 정리

* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급한다.

* 로또 입력 (LottoInputView.java)
  * [ ] 금액을 입력받는다.
  * [ ] 

* 로또 (Lotto.java)
    * [x] 로또 도메인 객체를 만든다.
    * [x] 로또는 6개의 숫자를 가진다.
    * [x] 현재 가진 숫자들과 당첨번호를 비교해 맞춘 갯수를 반환

* 여러 로또를 가지고 있는 객체를 생성 (LottoManger.java)
  * 로또 일급컬렉션
  * 로또 1장의 가격은 1000원
  * 로또의 가격을 관리
  * [ ] 숫자는 shuffle() 메서드로 자동 생성한다.
  * [ ] 여러 로또를 가짐
  * [ ] 당첨번호로 여러 로또의 맞춘 갯수를 얻음
  * [ ] 번 금액을 이용해 수익률을 반환하는 메서드

* 당첨통계를 계산
  * 맞춘 갯수를 입력받아 (맞춘갯수, 당첨금액)을 객체를 만듬
  * (맞춘갯수, 당첨금액, 갯수) 형태로 만들어 반환
  * 번 금액 반환하는 메서드

* 출력
  * 당첨통계 출력
  * 수익률 출력

## 프로그래밍 요구사항
* 모든 기능을 TDD로 구현
* indent depth 2 넘지 않기
* 모든 로직에 단위 테스트 (UI 제외)
* else 사용 X

  