package chapter12;

import chapter12.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();

		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1001, "�ڼ���");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();

		Member memberHong = new Member(1003, "ȫ�浿");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();

	}
}
