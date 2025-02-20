def solution(price):
    if 10 <= price < 100000:
        answer = price
        
    elif 100000 <= price < 300000:
        answer = (price * 9.5) // 10

    elif 300000 <= price < 500000:
        answer = (price * 9) // 10

    elif 500000 <= price:
        answer = (price * 4) // 5

    return answer