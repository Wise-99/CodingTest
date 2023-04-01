def solution(phone_book):
    
    phone_book.sort() # 숫자 순서로 정렬
    
    # zip으로 p1과 p1의 다음 값(p2) 매칭
    for p1, p2 in zip(phone_book, phone_book[1:]):

        if p2.startswith(p1): # p2가 p1으로 시작하면 False 반환
            return False
        
    return True
    