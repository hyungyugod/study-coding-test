def solution(my_string):
    a = []
    for i in my_string:
        if i.isupper():
            a += i.lower()
        else:
            a += i.upper()
    return "".join(a)