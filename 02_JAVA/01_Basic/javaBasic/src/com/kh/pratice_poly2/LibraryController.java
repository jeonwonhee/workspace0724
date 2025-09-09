package com.kh.pratice_poly2;

public class LibraryController {

    private Member mem = null;
    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList; // view에서 출력 처리
    }

    public Book[] searchBook(String keyword) {
        Book[] searchBook = new Book[bList.length];
        int count = 0;
        for (Book b : bList) {
            if (b != null && b.getTitle() != null && b.getTitle().contains(keyword)) {
                searchBook[count++] = b;
            }
        }
        return searchBook;
    }

    public int rentBook(int index) {
        // 멤버 정보 없으면 대여 불가
        if (mem == null) {
            return 3; // 회원 없음
        }

        // 잘못된 인덱스 방지
        if (index < 0 || index >= bList.length || bList[index] == null) {
            return 3; // 책 없음
        }

        Book book = bList[index];

        // 애니북 : 나이 제한 체크
        if (book instanceof AniBook) {
            AniBook ab = (AniBook) book;
            if (mem.getAge() < ab.getAccessAge()) {
                return 1; // 나이 제한
            }
        }

        // 요리책 : 쿠폰 여부 체크
        if (book instanceof CookBook) {
            CookBook cb = (CookBook) book;
            if (cb.isCoupon()) {
            	mem.setCouponCount(mem.getCouponCount() + 1); // 쿠폰 1장 추가
                return 2; // 대여 성공 + 쿠폰 발급
            }
        }

        return 0; // 단순 대여 성공
    }
}
