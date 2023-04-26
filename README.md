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

2. 여성복(WomanList)
   -  여성리스트(여성복 전체 제품)/ (WomanList)
   - 여성복 상세조회(여성복검색)/ (searchWomanList)
   - 여성복 상의리스트 (WomansTop)
   - 여성복 하의리스트 (WomansBottom)
3. 남성복(ManList)
   - 남성리스트(남성복 전체 제품)/(MansList)
   - 남성복 상세조회(남성복검색)/ (searchManList)
   - 남성복 상의리스트 (MansTop)
   - 남성복 하의리스트 (MansBottom)
4. 아동복(KidList)
   - 아동복 리스트(아동복 전체 제품)/(KidList)
   - 아동복 상세조회(아동복 검색)/ (searchKidList)
   - 아동복 상의 (KidsTop)
   - 아동복 하의 (KidsBottom)
5. 장바구니
- 장바구니등록
- 장바구니 갯수
- 장바구니 갯수 수정
- 장바구니 수정
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

