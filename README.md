# 📎 Apple-Basket(팀명: 명당)
![MYUNG](https://user-images.githubusercontent.com/104994979/206966589-22cd1735-0e94-4a0a-990c-9f3b94e95d98.jpg)

## 🪪 프로젝트 소개
* 프로젝트명: 시장지표와 매출액의 상관관계를 이용한 비주거 상가 매물 정보 제공 플랫폼
* 서비스설명: 소상공인을 위한 상가의 월세, 보증금 및 AI 예측 월평균 추정 매출액 데이터를 제공하는 웹 서비스
<br>

## 📅 프로젝트 기간
2022.11.15 ~ 2022.12.14 (4주)

## 📆 WBS
![image](https://user-images.githubusercontent.com/104994979/206967245-6a805f6a-a80b-4baf-8694-684e943bae82.png)

<br>

## ⭐ 주요 기능
* 🆕 뉴스보기<br>
    ![image](https://user-images.githubusercontent.com/104994979/206967852-088bb034-dc0d-4dec-b06b-69f6bf5ac5d8.png)<br>
    homepage에서 부동산관련 최신 동향과 나라 정책을 확인할 수 있습니다.

* 📊 data center<br>
    ![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/104994979/206967894-e0dc1c00-2bd6-4d38-96db-c3ad59f9a02c.gif)<br>
    차트를 통하여 본인이 알고싶은 행정동의 업종별 점포수, 시간대별 평균 유동인구 정보와 월별 매출분석을한 통계 데이터를 확인할 수 있습니다.

* 🗺️ 카카오 지도 api를 활용 <br>
    ![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/104994979/206968561-d2ab2254-4565-4d1d-91b7-476b5c6cfd33.gif)<br>
    웹에서 사용자가 시각적으로 보여질 수 있도록 구현하였습니다.
    또한 사용자는 로드뷰를 통하여 편하게 해당 매물을 간접적으로 확인할 수 있고 
    다양한 지적정보를 제공함으로써 사용자 스스로 해당 매물이 고객의 접근이 용이한지, 유동인구는 많은지, 상권으로써 적합한지 판단할 수 있습니다.
    이때 저장되어있는 DB 단에서 위도, 경도 column을 비동기로 받아와 동적으로 화면에 뿌려주었습니다.

* 클러스터링<br>
    ![ezgif com-gif-maker](https://user-images.githubusercontent.com/104994979/206968512-0466d797-ad33-474c-a4c6-f5fd46f36640.gif)<br>
    사용자는 지도 level에 따라 매물의 개수를 한 눈에 가시적으로 확인할 수 있습니다.

* 데이터 등록
    사용자는 매물을 등록, 읽기, 업데이트, 삭제가 가능하며 이를 바로 확인가능합니다.
<br>

## 🛠️ 사용 도구 및 기술
<table>
    <tr>
        <th>구분</th>
        <th>내용</th>
    </tr>
    <tr>
        <td>사용언어</td>
        <td>
            <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/>
            <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white"/>
            <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white"/>
            <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white"/>
            <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=Python&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>라이브러리 & 프레임워크</td>
        <td>
            <img src="https://img.shields.io/badge/BootStrap-7952B3?style=for-the-badge&logo=BootStrap&logoColor=white"/>
            <img src="https://img.shields.io/badge/Chart.js-FF6384?style=for-the-badge&logo=Chart.js&logoColor=white"/>
            <img src="https://img.shields.io/badge/Kakao-FFCD00?style=for-the-badge&logo=Kakao&logoColor=white"/>
            <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"/>
            <img src="https://img.shields.io/badge/Springboot-6DB33F?style=for-the-badge&logo=Springboot&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>개발도구</td>
        <td>
            <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=Eclipse&logoColor=white"/>
            <img src="https://img.shields.io/badge/VSCode-007ACC?style=for-the-badge&logo=VisualStudioCode&logoColor=white"/>
            <img src="https://img.shields.io/badge/Anaconda-44A833?style=for-the-badge&logo=Anaconda&logoColor=white"/>
            <img src="https://img.shields.io/badge/Jupyter-F37626?style=for-the-badge&logo=Jupyter&logoColor=white"/>
            <img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=for-the-badge&logo=IntelliJ IDEA&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>서버환경</td>
        <td>
            <img src="https://img.shields.io/badge/Apache Tomcat-D22128?style=for-the-badge&logo=Apache Tomcat&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>데이터베이스</td>
        <td>
            <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white"/>
        </td>
    </tr>
    <tr>
        <td>협업도구</td>
        <td>
            <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white"/>
            <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/>
            <img src="https://img.shields.io/badge/GitLab-FC6D26?style=for-the-badge&logo=GitLab&logoColor=white"/>
            <img src="https://img.shields.io/badge/Sourcetree-0052CC?style=for-the-badge&logo=Sourcetree&logoColor=white"/>
        </td>
    </tr>
</table>

<br>

## 📌E-R Diagram
![image](https://user-images.githubusercontent.com/104994979/206968866-20b6c6c6-18ba-48a6-904a-697166e5aaa4.png)


## 💻화면 구성
### 1.메인 페이지
![image](https://user-images.githubusercontent.com/104994979/206969438-8e3ea5d7-af80-4b82-a660-a3777809372c.png)
### 2.데이터 센터 페이지
![image](https://user-images.githubusercontent.com/104994979/206969524-f8038bfd-96d6-487b-85a9-394d0bf8b80c.png)
![image](https://user-images.githubusercontent.com/104994979/206969545-94c97dc8-ec26-4fc0-a556-29ee20e8f1be.png)
### 3.부동산 검색 페이지
![image](https://user-images.githubusercontent.com/104994979/206969627-a0d4c7ff-9b87-4c25-97a5-f145dd137842.png)
### 4.부동산 관리 페이지
![image](https://user-images.githubusercontent.com/104994979/206969675-b71e6199-b84e-4cf6-a8b1-f54f153c3d3f.png)



## 👨‍👩‍👦‍👦 팀원 역할
<table>
  <tr>
    <td align="center"><img src="https://item.kakaocdn.net/do/fd49574de6581aa2a91d82ff6adb6c0115b3f4e3c2033bfd702a321ec6eda72c" width="100" height="100"/></td>
    <td align="center"><img src="https://mb.ntdtv.kr/assets/uploads/2019/01/Screen-Shot-2019-01-08-at-4.31.55-PM-e1546932545978.png" width="100" height="100"/></td>
    <td align="center"><img src="https://mblogthumb-phinf.pstatic.net/20160127_177/krazymouse_1453865104404DjQIi_PNG/%C4%AB%C4%AB%BF%C0%C7%C1%B7%BB%C1%EE_%B6%F3%C0%CC%BE%F0.png?type=w2" width="100" height="100"/></td>
    <td align="center"><img src="https://i.pinimg.com/236x/ed/bb/53/edbb53d4f6dd710431c1140551404af9.jpg" width="100" height="100"/></td>
    <td align="center"><img src="https://pbs.twimg.com/media/B-n6uPYUUAAZSUx.png" width="100" height="100"/></td>
    <td align="center"><img src="https://pbs.twimg.com/media/B-n6uPYUUAAZSUx.png" width="100" height="100"/></td>
  </tr>
  
  <tr>
    <td align="center"><strong>강정우</strong></td>
    <td align="center"><strong>설재형</strong></td>
    <td align="center"><strong>신진욱</strong></td>
    <td align="center"><strong>김경호</strong></td>
    <td align="center"><strong>신지수</strong></td>
    <td align="center"><strong>박주혜</strong></td>
  </tr>
  
  <tr>
    <td align="center"><b>Backend, Frontend, DB Managing</b></td>
    <td align="center"><b>크롤링, 데이터 전처리, Ai 모델링</b></td>
    <td align="center"><b>크롤링, Frontend</b></td>
    <td align="center"><b>PM, 문서정리</b></td>
    <td align="center"><b>크롤링</b></td>
    <td align="center"><b>도메인 지식 제공</b></td>
  </tr>
  
   <tr>
    <td align="center"><strong>웹 프로젝트 설계<br>카카오지도 이용 검색기능<br>매물 CRUD</strong></td>
    <td align="center"><strong>데이터 크롤링 총괄<br>feature engineering 기반 데이터 전처리<br>ai 모델링</strong></td>
    <td align="center"><strong>메인 홈페이지<br>data center 페이지<br>크롤링</strong></td>
    <td align="center"><strong>문서작업</strong></td>
    <td align="center"><strong>크롤링</strong></td>
    <td align="center"><strong>도메인 지식 제공</strong></td>
  </tr>
  
  <tr>
    <td align="center"><a href="https://github.com/자신의username작성해주세요" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/자신의username작성해주세요" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/자신의username작성해주세요" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/자신의username작성해주세요" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/자신의username작성해주세요" target='_blank'>github</a></td>
    <td align="center"><a href="https://github.com/자신의username작성해주세요" target='_blank'>github</a></td>
  </tr>
</table>


