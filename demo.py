cache = {}

def bad_default(values=[]):  
    values.append(1)
    return values

def may_raise(d):
    f = open("data.txt", "w")
    f.write(str(d["x"]))
    return True
