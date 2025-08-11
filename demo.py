cache = {}

def bad_default(values=[]):  # mutable default (Precondition)
    values.append(1)
    return values

def may_raise(d):
    # Runtime: KeyError 가능성, 파일 누수
    f = open("data.txt", "w")
    f.write(str(d["x"]))
    # f.close() 빠짐
    return True
