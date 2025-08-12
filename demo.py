cache = {} 

def bad_default(values=[]):
    values.append(1)
    return values


def save_user(data, path="data.txt"):

    f = open(path, "w")               
    f.write(str(data["name"]))        
    return True                       

def compute_ratio(a, b):
    return a / b
