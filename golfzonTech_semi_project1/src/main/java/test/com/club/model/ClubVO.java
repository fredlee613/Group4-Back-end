package test.com.club.model;

import java.sql.Date;

public class ClubVO {
	private long club_id; // 모임ID
	private String club_leader; // 모임장명
	private String club_name; // 모임이름
	private String club_desc; // 모임 설명
	private String gender; // 모임 가입 조건(성별)
	private String age; // 모입 가입 조건 (연령대)
	private Date cdate; // 모임 개설일
}
