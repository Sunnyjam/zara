## zara어플리케이션 
- 온라인 쇼핑어플리케이션인 올리브영(oliveyoung)을 모티브로 한 어플리케이션 입니다.
### 개발환경
1. IDE:Intellij IDEACommunity
- Java
- Spring Boot
- mySQL
- Mybatis
- Thymeleaf

---------------------------------------------------------
### 주요기능

1. 제품 (Product)
- 제품등록 (/insertProduct)
- 제품수정 (/updateProduct)
- 제품삭제 (/deleteProduct/{productId})
- 제품전체조회 (/readProduct)
- 제품상세조회(제품검색) (/searchProduct/{productId})

2. 여성복(Woman)
   - 여성복 등록 (/insertWoman)
   - 여성복 수정 (/updateWoman)
   - 여성복 삭제 (/deleteWoman/{womanId})
   -  여성리스트(여성복 전체 제품)/ (womanList)
   - 여성복 상의리스트 (womanTop)
   - 여성복 하의리스트 (womanBottom)
3. 남성복(Man)
   - 남성복 등록 (/insertMan)
   - 남성복 수정 (/updateMan)
   - 남성복 삭제 (/deleteMan/{manId})
   - 남성리스트(남성복 전체 제품)/(manList)
   - 남성복 상의리스트(남성복) (manTop)
   - 남성복 하의리스트 (manBottom)
4. 아동복(Kid)
   - 아동복 등록 (/insertKid)
   - 아동복 수정 (/updateKid)
   - 아동복 삭제 (/deleteKid/{kidId})
   - 아동복 리스트(아동복 전체 제품)/(kidList)
   - 아동복 상의 (kidTop)
   - 아동복 하의 (kidBottom)
5. 장바구니(Cart)
- 장바구니등록(/insertCart)
- 장바구니삭제(/deleteCart)
  - 장바귀수정(/updateCart)
6. 구매
- 구매등
- 구매삭제 
- 구매조회

7. 로그인
- 계정등록
- 계정수정
- 계정삭제
- 계정조회
- 자동 로그인
- 로그아웃

