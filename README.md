<h2>프리온보딩 백엔드 인턴십 선발 과제</h2>

<h3>요구사항 분석</h3>

1. 채용공고 등록
- 채용공고 등록 example에 회사_id 가 있는 것을 보고 연관관계 매핑을 해주어야 겠다고 생각
2. 채용공고 수정
- 트랜젝션을 이용하여 수정 작업
3. 채용공고 삭제
- 트랜젝션을 이용하여 삭제 작업
4. 채용공고 목록 가져오기
- example에는 페이징 처리가 안되있었지만 페이징 처리를 해야겠다고 생각<br><br>
4-2.채용공고 검색기능 구현
- 쿼리문에 있는 like 문을 사용하여 구현을 해야겠다고 생각
5. 채용 상세 페이지 가져오기<br>
- 값이 다르기 때문에 responseDto를 따로 만들어야 겠다고 생각<br><br>
5-2. 해당 회사가 올린 다른 채용공고 불러오기
- 연관관계 및 현재 조회한 회사는 목록에 뜨면 안되겠다고 생각
6. 사용자 채용공고에 지원하기
- 연관관계 및 사용자는 채용공고 하나당 한번밖에 지원을 못하기 때문에 예외처리를 해주어야 겠다고 생각

<h3>주요 구현 과정</h3>

1. 채용공고 검색기능 구현
- 해당 검색 기능을 JPA로 시도 해보았다가 column 하나의 값만 같으면 출력 되는것이 아닌 요구사항에 맞는 컬럼 중 검색 결과가 같을 경우 출력을 해야함
- JPA는 상세 조건을 입력하기에는 불편한 구현이므로 QueryDSL을 사용하여 상세한 로직 작업을 함

2. 채용공고 수정기능 구현
- 기존 수정기능은 값이 다르지 않아도 컬럼안에 있는 값 전체를 수정을 해야하는 쿼리문이 발생
- 쿼리문을 발생시키지 않으려면 서비스 로직에 코드가 추가되야함
- @DynamicUpdate 어노테이션을 써서 기존에 있던 값과 값이 같으면 해당 값은 제외하고 달라진 값만 쿼리문을 보냄

<h3>ERD 설계</h3>
![img](https://github.com/BSB99/wanted-pre-onboarding-backend/assets/67528758/ebd96a67-ffd7-41c9-bced-ef9c179a4c02)