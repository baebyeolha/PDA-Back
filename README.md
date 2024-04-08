## Day2 (클래스 구성요소 및 다형성)
  - 파일경로 './src/day2/Submit.java'
  - 과제: 객체 Store, Person, Phone(부모), SamsungPhone(자식), ApplePhone(자식)
  
    #### 기능
    쏘니와 베컴(사람) 핸드폰 구매 (쏘니는 삼성, 베컴은 애플)
    SamsungPhone, ApplePhone 클래스 분리 + 오버라이드(덮어쓰기) + 부모(Phone) 상속
    쏘니가 " 야 내 핸드폰 켜볼게"
    쏘니 핸드폰 전원 켜지는 소리 "삐비빅"
     베컴 핸드폰 전원 켜지는 소리 "turn on" "bbeep"

    Person 객체에서 phone 객체 사용

 ## Day04 유저
 - 파일 경로 './src/day4/EX01.java'
[해당 코드 링크](https://github.com/heeeesoo/JAVA_PDA/blob/main/src/day0408/MiniProj.java) 👈🏻
#### 구현 과제
1. 회원가입
2. 로그인
3. 회원정보 수정
4. 탈퇴

#### 클래스
1. User <br/>
   a. 필드 : name, email, password <br/>
   b. 메소드 : 
      - boolean equals(Object o) : 같으면 true, 다르면 false
      - String toString() : User 객체 값 출력
   <br/>
2. UserRepository <br/>
   a. 필드 -number : map에 넣을 key 값
     <br/>
   b. 메소드 : <br/>
     - void setUserLogin(User user) : user login true로 바꾸기
     - void getAllUser() : user 정보 다 출력하기
     - void postUser(User user) : userRepository에 user 추가하기
     - void getUser(User user) : 해당 user 있으면 true 출력, 없으면 false 출력
     - void deleteUser(User user) : 해당 user userRepository에 삭제
     - void putUser(User user, String name, String email, String password) : 해당 user의 email, password 수정
     - boolean isLogin(User user) : 해당 user 로그인했으면 true 반환, 아니면 false 반환


![img.png](img.png)

#### 출력 결과
```
기능을 입력해주세요: 1
입력한 기능: 1
회원가입
이름을 입력해주세요: 
test
이메일을 입력해주세요: 
email
비밀번호를 입력해주세요: 
pwd
0: Name: test, Email: email, Password: pwd, Login:false
기능을 입력해주세요: 2
입력한 기능: 2
로그인
이메일을 입력해주세요: 
email
비밀번호를 입력해주세요: 
pwd
로그인 성공
0: Name: test, Email: email, Password: pwd, Login:true
기능을 입력해주세요: 3
입력한 기능: 3
회원정보 수정
수정하고 싶은 회원의 이메일을 입력해주세요: 
email
수정하고 싶은 회원의 비밀번호를 입력해주세요: 
pwd
새로운 이름을 입력해주세요: 
test2
새로운 이메일을 입력해주세요: 
email2
새로운 비밀번호를 입력해주세요: 
pwd2
put:0
0: Name: test2, Email: email2, Password: pwd2, Login:false
수정 완료 다시 로그인해주세요.
기능을 입력해주세요: 2
입력한 기능: 2
로그인
이메일을 입력해주세요: 
email2
비밀번호를 입력해주세요: 
pwd2
로그인 성공
0: Name: test2, Email: email2, Password: pwd2, Login:true
기능을 입력해주세요: 4
입력한 기능: 4
회원 탈퇴
이메일을 입력해주세요: 
email2
비밀번호를 입력해주세요: 
pwd2
탈퇴 성공
기능을 입력해주세요: 0
입력한 기능: 0
```








