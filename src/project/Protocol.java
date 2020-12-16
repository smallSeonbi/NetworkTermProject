package project;

public class Protocol {
   public static final String REGISTER = "100"; // 회원가입(request)

   public static final String IDSEARCH = "110"; // ID찾기 Join (request)

   public static final String IDSEARCH_OK = "111"; // ID찾기 (기존에 있는거) (ACK)

   public static final String IDSEARCH_NO = "112"; // ID찾기 (기존에 없음) (NACK)

   public static final String IDSEARCHCHECK = "113"; // (using 회원가입)ID찾기 중복확인(request)

   public static final String IDSEARCHCHECK_OK = "114"; // (using 회원가입)ID 중복확인 (사용가능) (ACK)

   public static final String IDSEARCHCHECK_NO = "115"; // (using 회원가입)ID 중복확인 (사용 불가능) (NACK)
   
   public static final String NSEARCHCHECK = "116"; // (using 회원가입)닉네임 찾기 중복확인(request)

   public static final String NSEARCHCHECK_OK = "117"; // (using 회원가입)닉네임 중복확인 (사용가능) (ACK)

   public static final String NSEARCHCHECK_NO = "118"; // (using 회원가입)닉네임 중복확인 (사용 불가능) (NACK)

   public static final String ENTERLOGIN = "120"; // 로그인(request)

   public static final String ENTERLOGIN_OK = "121"; // 로그인 성공(ACK)

   public static final String ENTERLOGIN_NO = "122"; // 로그인 실패(NACK)

   public static final String EXITWAITROOM = "220"; // 대기방 나가기(= logout)

   public static final String EXITCHATTINGROOM = "310"; // 방나가기 (채팅방 나가기)

   public static final String SENDMESSAGE = "400"; // 메세지 보내기

   public static final String SENDMESSAGE_ACK = "410"; // 메세지 보내기(답장)

   public static final String CHATTINGSENDMESSAGE = "420"; // 채팅방에서 메세지 보내기 (Request)

   public static final String CHATTINGSENDMESSAGE_OK = "430"; // 채팅방에서 메세지 보내기 (Request)
   
   public static final String EXIT = "565"; // 로그아웃
   
   public static final String CHATEXIT = "566"; // 방나가기 (채팅방 나가기)
   
   public static final String ADDFRIEND = "7979";//친구추가
   
   public static final String SEARCHFRIEND = "7917";//친구찾기
   
   public static final String TODAYMSG = "570";// 오늘의 한 마디 추가
   
   public static final String FRIENDLOGIN = "580";
   
   public static final String SEARCHFRIEND_NO = "7920";
   
   public static final String VIEWFRIENDPROFILE = "7930";//친구찾기
   
   public static final String CHATREQUEST = "200";
   
   public static final String CHATREQUEST_OK = "201";
   
   public static final String CHATREQUEST_NO = "202";
   
   public static final String DELETEMEMBER = "8000"; // 회원 탈퇴

}
