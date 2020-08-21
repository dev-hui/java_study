package api;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {
	public static void main(String[] args) {
		List<MemberDTO> list = new ArrayList<>();
		
		list.add(new MemberDTO("정대만", "슈팅가드", 184.2, 18));
		list.add(new MemberDTO("채치수", "센터", 198, 18));
		list.add(new MemberDTO("서태웅", "스몰포워드", 187, 16));
		list.add(new MemberDTO("강백호", "파워포워드", 188.5, 16));
		list.add(new MemberDTO("송태섭", "포인트가드", 165, 17));
		
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
	}
}
